package com.example.data.cache.daos.tvshow

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.models.tvshow.entity.TVShowDetailsResultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TvShowDetailsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvShowDetailsToDB(tvShowDetailsResultEntity: TVShowDetailsResultEntity)

    @Query("SELECT * FROM tvshow_details")
    fun getTvShowDetailsFromDB(): Flow<TVShowDetailsResultEntity>

    @Query("DELETE FROM tvshow_details")
    suspend fun deleteTvShowDetailsFromDB()

    @Query("SELECT COUNT(*) FROM tvshow_details")
    suspend fun isTvShowDetailsCacheAvailable(): Int
}