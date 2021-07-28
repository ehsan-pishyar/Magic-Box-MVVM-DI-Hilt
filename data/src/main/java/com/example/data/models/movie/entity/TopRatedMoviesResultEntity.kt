package com.example.data.models.movie.entity

import androidx.room.Entity


@Entity(tableName = "top_rated_movies")
data class TopRatedMoviesResultEntity(
    val page: Int?,
    val result: List<ResultEntity>?,
    val total_pages: Int?,
    val total_results: Int?
)