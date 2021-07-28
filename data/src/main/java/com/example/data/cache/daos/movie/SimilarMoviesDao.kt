package com.example.data.cache.daos.movie

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.models.movie.entity.SimilarMoviesResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SimilarMoviesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveSimilarMoviesToDB(similarMoviesResultEntity: SimilarMoviesResultEntity)

    @Query("SELECT * FROM similar_movies")
    fun getSimilarMoviesFromDB(): Flow<SimilarMoviesResultEntity>

    @Query("DELETE FROM similar_movies")
    suspend fun deleteSimilarMoviesFromDB()

    @Query("SELECT COUNT(*) FROM similar_movies")
    suspend fun isSimilarMoviesCacheAvailable(): Int
}