package com.example.data.models.movie.entity

import androidx.room.Entity


@Entity(tableName = "movie_videos")
data class MovieVideosResultEntity(
    val id: Int?,
    val result: List<ResultEntity>?
)