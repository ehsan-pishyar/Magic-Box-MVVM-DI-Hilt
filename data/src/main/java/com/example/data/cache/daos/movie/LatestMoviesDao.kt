package com.example.data.cache.daos.movie

import androidx.room.*
import com.example.data.models.movie.entity.LatestMoviesResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LatestMoviesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveLatestMoviesToDB(latestMoviesResultEntity: LatestMoviesResultEntity)

    @Query("SELECT * FROM latest_movies")
    fun getLatestMoviesFromDB(): Flow<LatestMoviesResultEntity>

    @Query("DELETE FROM latest_movies")
    suspend fun deleteLatestMoviesFromDB()

    @Query("SELECT COUNT(*) FROM latest_movies")
    suspend fun isLatestMoviesCacheAvailable(): Int
}