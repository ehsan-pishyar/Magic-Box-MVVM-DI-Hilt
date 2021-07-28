package com.example.data.cache.daos.tvshow

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.models.tvshow.entity.TopRatedTVShowsResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TopRatedTvShowsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTopRatedTvShowsToDB(topRatedTVShowsResultEntity: TopRatedTVShowsResultEntity)

    @Query("SELECT * FROM top_rated_tvshows")
    fun getTopRatedTvShowsFromDB(): Flow<TopRatedTVShowsResultEntity>

    @Query("DELETE FROM top_rated_tvshows")
    suspend fun deleteTopRatedTvShowsFromDB()

    @Query("SELECT COUNT(*) FROM top_rated_tvshows")
    suspend fun isTopRatedTvShowsCacheAvailable(): Int
}