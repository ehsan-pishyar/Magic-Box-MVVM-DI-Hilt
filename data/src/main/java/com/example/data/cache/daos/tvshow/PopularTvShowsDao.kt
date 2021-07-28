package com.example.data.cache.daos.tvshow

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.models.tvshow.entity.PopularTVShowsResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PopularTvShowsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun savePopularTvShowsToDB(popularTVShowsResultEntity: PopularTVShowsResultEntity)

    @Query("SELECT * FROM popular_tvshows")
    fun getPopularTvShowsFromDB(): Flow<PopularTVShowsResultEntity>

    @Query("DELETE FROM popular_tvshows")
    suspend fun deletePopularTvShowsFromDB()

    @Query("SELECT COUNT(*) FROM popular_tvshows")
    suspend fun isPopularTvShowsCacheAvailable(): Int
}