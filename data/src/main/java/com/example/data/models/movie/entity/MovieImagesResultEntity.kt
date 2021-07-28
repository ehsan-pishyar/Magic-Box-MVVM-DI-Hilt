package com.example.data.models.movie.entity

import androidx.room.Entity


@Entity(tableName = "movie_images")
data class MovieImagesResultEntity(
    val backdrop: List<BackdropEntity>?,
    val id: Int?,
    val poster: List<PosterEntity>?
)