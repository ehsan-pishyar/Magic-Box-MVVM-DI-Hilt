package com.example.data.models.movie.entity

import androidx.room.Entity


@Entity(tableName = "movie_genres")
data class GenreEntity(
    val id: Int?,
    val name: String?
)