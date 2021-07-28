package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "similar_tvshows")
data class SimilarTVShowsResultEntity(
    val page: Int?,
    val result: List<ResultEntity>?,
    val total_pages: Int?,
    val total_results: Int?
)