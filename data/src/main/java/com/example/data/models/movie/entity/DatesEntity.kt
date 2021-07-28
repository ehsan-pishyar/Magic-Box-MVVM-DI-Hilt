package com.example.data.models.movie.entity

import androidx.room.Entity

@Entity(tableName = "movie_dates")
data class DatesEntity(
    val maximum: String?,
    val minimum: String?
)