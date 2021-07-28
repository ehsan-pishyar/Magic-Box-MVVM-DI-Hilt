package com.example.data.models.movie.entity

import androidx.room.Entity


@Entity(tableName = "now_playing_movies")
data class NowPlayingMoviesResultEntity(
    val dates: DatesEntity?,
    val page: Int?,
    val result: List<ResultEntity>?,
    val total_pages: Int?,
    val total_results: Int?
)