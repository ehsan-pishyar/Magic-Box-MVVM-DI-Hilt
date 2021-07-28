package com.example.data.models.movie.entity

import androidx.room.Entity


@Entity(tableName = "popular_movies")
data class PopularMoviesResultEntity(
    val page: Int?,
    val result: List<ResultEntity>?,
    val total_pages: Int?,
    val total_results: Int?
)