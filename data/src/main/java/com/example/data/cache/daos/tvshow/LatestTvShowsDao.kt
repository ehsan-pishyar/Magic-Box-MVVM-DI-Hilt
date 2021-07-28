package com.example.data.cache.daos.tvshow

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.models.tvshow.entity.LatestTVShowsResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LatestTvShowsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveLatestTvShowsToDB(latestTVShowsResultEntity: LatestTVShowsResultEntity)

    @Query("SELECT * FROM latest_tvshows")
    fun getLatestTvShowsFromDB(): Flow<LatestTVShowsResultEntity>

    @Query("DELETE FROM latest_tvshows")
    suspend fun deleteLatestTvShowsFromDB()

    @Query("SELECT COUNT(*) FROM latest_tvshows")
    suspend fun isLatestTvShowsCacheAvailable(): Int
}