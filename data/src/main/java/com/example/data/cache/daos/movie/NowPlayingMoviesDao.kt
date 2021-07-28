package com.example.data.cache.daos.movie

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.models.movie.entity.NowPlayingMoviesResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface NowPlayingMoviesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveNowPlayingMoviesToDB(nowPlayingMoviesResultEntity: NowPlayingMoviesResultEntity)

    @Query("SELECT * FROM now_playing_movies")
    fun getNowPlayingMoviesFromDB(): Flow<NowPlayingMoviesResultEntity>

    @Query("DELETE FROM now_playing_movies")
    suspend fun deleteNowPlayingMoviesFromDB()

    @Query("SELECT COUNT(*) FROM now_playing_movies")
    suspend fun isNowPlayingMoviesCacheAvailable(): Int
}