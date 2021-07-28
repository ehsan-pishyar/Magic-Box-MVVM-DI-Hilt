package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "tvshow_latest_episode_to_air")
data class LastEpisodeToAirEntity(
    val air_date: String?,
    val episode_number: Int?,
    val id: Int?,
    val name: String?,
    val overview: String?,
    val production_code: String?,
    val season_number: Int?,
    val still_path: String?,
    val vote_average: Double?,
    val vote_count: Int?
)