package com.example.data.cache.daos.tvshow

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.models.tvshow.entity.OnTheAirTVShowsResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface OnTheAirTvShowsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveOnTheAirTvShowsToDB(onTheAirTVShowsResultEntity: OnTheAirTVShowsResultEntity)

    @Query("SELECT * FROM on_the_air_tvshows")
    fun getOnTheAirTvShowsFromDB(): Flow<OnTheAirTVShowsResultEntity>

    @Query("DELETE FROM on_the_air_tvshows")
    suspend fun deleteOnTheAirTvShowsFromDB()

    @Query("SELECT COUNT(*) FROM on_the_air_tvshows")
    suspend fun isOnTheAirTvShowsCacheAvailable(): Int
}