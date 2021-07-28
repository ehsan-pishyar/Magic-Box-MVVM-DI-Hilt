package com.example.data.models.movie.entity

import androidx.room.Entity


@Entity(tableName = "movie_spoken_languages")
data class SpokenLanguageEntity(
    val iso_639_1: String?,
    val name: String?
)