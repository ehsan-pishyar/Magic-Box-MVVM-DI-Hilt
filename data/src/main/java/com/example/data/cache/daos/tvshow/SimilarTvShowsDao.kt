package com.example.data.cache.daos.tvshow

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.models.tvshow.entity.SimilarTVShowsResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SimilarTvShowsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveSimilarTvShowsToDB(similarTVShowsResultEntity: SimilarTVShowsResultEntity)

    @Query("SELECT * FROM similar_tvshows")
    fun getSimilarTvShowsFromDB(): Flow<SimilarTVShowsResultEntity>

    @Query("DELETE FROM similar_tvshows")
    suspend fun deleteSimilarTvShowsFromDB()

    @Query("SELECT COUNT(*) FROM similar_tvshows")
    suspend fun isSimilarTvShowsCacheAvailable(): Int
}