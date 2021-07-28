package com.example.data.cache.daos.movie

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.models.movie.entity.MovieDetailsResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDetailsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovieDetailsToDB(movieDetailsResultEntity: MovieDetailsResultEntity)

    @Query("SELECT * FROM movie_details")
    fun getMovieDetailsFromDB(): Flow<MovieDetailsResultEntity>

    @Query("DELETE FROM movie_details")
    suspend fun deleteMovieDetailsFromDB()

    @Query("SELECT COUNT(*) FROM movie_details")
    suspend fun isMovieDetailsCacheAvailable(): Int
}