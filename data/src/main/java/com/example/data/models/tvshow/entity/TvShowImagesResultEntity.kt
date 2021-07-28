package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "tvshow_images")
data class TvShowImagesResultEntity(
    val backdrop: List<BackdropEntity>?,
    val id: Int?,
    val poster: List<PosterEntity>?
)