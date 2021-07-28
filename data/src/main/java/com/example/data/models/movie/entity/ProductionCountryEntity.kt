package com.example.data.models.movie.entity

import androidx.room.Entity


@Entity(tableName = "movie_production_countries")
data class ProductionCountryEntity(
    val iso_3166_1: String?,
    val name: String?
)