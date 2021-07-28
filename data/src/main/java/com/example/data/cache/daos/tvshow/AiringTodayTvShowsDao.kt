package com.example.data.cache.daos.tvshow

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.models.tvshow.entity.AiringTodayTVShowsResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface AiringTodayTvShowsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveAiringTodayTvShowsToDB(airingTodayTVShowsResultEntity: AiringTodayTVShowsResultEntity)

    @Query("SELECT * FROM airing_today_tvshows")
    fun getAiringTodayTvShowsFromDB(): Flow<AiringTodayTVShowsResultEntity>

    @Query("DELETE FROM airing_today_tvshows")
    suspend fun deleteAiringTodayTvShowsFromDB()

    @Query("SELECT COUNT(*) FROM airing_today_tvshows")
    suspend fun isAiringTodayTvShowsCacheAvailable(): Int
}