package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "tvshow_genres")
data class GenreEntity(
    val id: Int?,
    val name: String?
)