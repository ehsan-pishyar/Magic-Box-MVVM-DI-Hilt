package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "tvshow_spoken_languages")
data class SpokenLanguageEntity(
    val english_name: String?,
    val iso_639_1: String?,
    val name: String?
)