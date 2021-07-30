package com.example.data.datasource.movie

import androidx.lifecycle.MutableLiveData
import com.example.data.cache.MagicBoxDatabase
import com.example.data.datastore.TimeDatastore
import com.example.data.models.movie.entity.PopularMoviesResultEntity
import com.example.data.network.ApiService
import com.example.data.util.Constants
import com.example.data.util.Coroutines
import com.example.data.util.SafeApiRequest
import com.example.data.util.TimeUtil
import com.example.domain.models.movie.PopularMoviesResult
import com.example.domain.repositories.movie.PopularMoviesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import com.example.data.mappers.movie.toDomain
import com.example.data.mappers.movie.toEntity

class PopularMoviesRepositoryImpl constructor(
    private val apiService: ApiService,
    private val magicBoxDatabase: MagicBoxDatabase,
    private val timeDatastore: TimeDatastore
): SafeApiRequest(), PopularMoviesRepository {

    private val popularMoviesLiveData = MutableLiveData<PopularMoviesResultEntity>()

    init {
        popularMoviesLiveData.observeForever{
            Coroutines.io { savePopularMovies(it.toDomain()) }
        }
    }

    override suspend fun savePopularMovies(popularMoviesResult: PopularMoviesResult) {
        Coroutines.io {
            magicBoxDatabase.popularMoviesDao().savePopularMoviesToDB(popularMoviesResult.toEntity())
        }
    }

    override suspend fun fetchPopularMovies(): Flow<PopularMoviesResult> {
        val popularMoviesDao = magicBoxDatabase.popularMoviesDao()
        val isPopularMoviesCacheAvailable = popularMoviesDao.isPopularMoviesCacheAvailable() > 0
        val lastSyncTime = timeDatastore.getSyncTime()

        val isTimeSurpassed = TimeUtil.isTimeSurpassed(
            Constants.TIME_INTERVAL,
            lastSyncTime,
            System.currentTimeMillis()
        )

        if (isPopularMoviesCacheAvailable && !isTimeSurpassed){
            return popularMoviesDao.getPopularMoviesFromDB().map { it.toDomain() }
        } else {
            deletePopularMoviesFromDb()

            val movieDto = safeApiRequest { apiService.getPopularMovies() }
            popularMoviesLiveData.value = movieDto.toEntity()

            timeDatastore.saveSyncTime(System.currentTimeMillis())

            return popularMoviesDao.getPopularMoviesFromDB().map { it.toDomain() }
        }

    }

    private suspend fun deletePopularMoviesFromDb() =
        magicBoxDatabase.popularMoviesDao().deletePopularMoviesFromDB()
}