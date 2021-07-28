package com.example.data.cache.daos.movie

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.models.movie.entity.TopRatedMoviesResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TopRatedMoviesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTopRatedMoviesToDB(topRatedMoviesResultEntity: TopRatedMoviesResultEntity)

    @Query("SELECT * FROM top_rated_movies")
    fun getTopRatedMoviesFromDB(): Flow<TopRatedMoviesResultEntity>

    @Query("DELETE FROM top_rated_movies")
    suspend fun deleteTopRatedMoviesFromDB()

    @Query("SELECT COUNT(*) FROM top_rated_movies")
    suspend fun isTopRatedMoviesCacheAvailable(): Int
}