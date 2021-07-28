package com.example.data.cache.daos.movie

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.models.movie.entity.PopularMoviesResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PopularMoviesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun savePopularMoviesToDB(popularMoviesResultEntity: PopularMoviesResultEntity)

    @Query("SELECT * FROM popular_movies")
    fun getPopularMoviesFromDB(): Flow<PopularMoviesResultEntity>

    @Query("DELETE FROM popular_movies")
    suspend fun deletePopularMoviesFromDB()

    @Query("SELECT COUNT(*) FROM popular_movies")
    suspend fun isPopularMoviesCacheAvailable(): Int
}