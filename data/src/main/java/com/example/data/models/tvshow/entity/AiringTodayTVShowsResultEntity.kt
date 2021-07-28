package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "airing_today_tvshows")
data class AiringTodayTVShowsResultEntity(
    val page: Int?,
    val result: List<ResultEntity>?,
    val total_pages: Int?,
    val total_results: Int?
)