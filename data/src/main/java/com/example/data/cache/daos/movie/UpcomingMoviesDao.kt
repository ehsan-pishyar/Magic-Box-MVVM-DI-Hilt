package com.example.data.cache.daos.movie

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.models.movie.entity.TopRatedMoviesResultEntity
import com.example.data.models.movie.entity.UpcomingMoviesResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface UpcomingMoviesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveUpcomingMoviesToDB(upcomingMoviesResultEntity: UpcomingMoviesResultEntity)

    @Query("SELECT * FROM upcoming_movies")
    fun getUpcomingMoviesFromDB(): Flow<UpcomingMoviesResultEntity>

    @Query("DELETE FROM upcoming_movies")
    suspend fun deleteUpcomingMoviesFromDB()

    @Query("SELECT COUNT(*) FROM upcoming_movies")
    suspend fun isUpcomingMoviesCacheAvailable(): Int
}