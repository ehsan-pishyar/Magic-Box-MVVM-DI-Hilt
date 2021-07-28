package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "tvshow_backdrops")
data class BackdropEntity(
    val aspect_ratio: Double?,
    val file_path: String?,
    val height: Int?,
    val iso_639_1: Any?,
    val vote_average: Double?,
    val vote_count: Int?,
    val width: Int?
)