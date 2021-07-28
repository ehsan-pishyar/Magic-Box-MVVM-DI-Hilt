package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "top_rated_tvshows")
data class TopRatedTVShowsResultEntity(
    val page: Int?,
    val result: List<ResultEntity>?,
    val total_pages: Int?,
    val total_results: Int?
)