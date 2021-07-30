package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "tvshow_seasons")
data class SeasonEntity(
    val air_date: String?,
    val episode_count: Int?,
    val id: Int?,
    val poster_path: String?,
    val season_number: Int?
)