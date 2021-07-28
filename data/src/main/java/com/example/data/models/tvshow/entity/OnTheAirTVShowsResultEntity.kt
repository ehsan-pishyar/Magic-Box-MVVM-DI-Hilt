package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "on_the_air_tvshows")
data class OnTheAirTVShowsResultEntity(
    val page: Int?,
    val result: List<ResultEntity>?,
    val total_pages: Int?,
    val total_results: Int?
)