package com.example.data.datasource.movie

import com.example.data.cache.MagicBoxDatabase
import com.example.data.network.ApiService
import com.example.data.util.SafeApiRequest
import com.example.domain.models.movie.LatestMoviesResult
import com.example.domain.repositories.movie.LatestMoviesRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LatestMoviesRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val magicBoxDatabase: MagicBoxDatabase
):
    SafeApiRequest(), LatestMoviesRepository {

    init {

    }

    override suspend fun saveLatestMovies(latestMoviesResult: LatestMoviesResult) {
        TODO()
    }

    override suspend fun fetchLatestMovies(): Flow<LatestMoviesResult> {
        TODO()
    }
}