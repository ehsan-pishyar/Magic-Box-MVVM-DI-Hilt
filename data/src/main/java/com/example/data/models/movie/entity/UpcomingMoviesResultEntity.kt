package com.example.data.models.movie.entity

import androidx.room.Entity


@Entity(tableName = "upcoming_movies")
data class UpcomingMoviesResultEntity(
    val dates: DatesEntity?,
    val page: Int?,
    val result: List<ResultEntity>?,
    val total_pages: Int?,
    val total_results: Int?
)