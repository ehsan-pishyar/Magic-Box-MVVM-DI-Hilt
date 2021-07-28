package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "tvshows_production_companies")
data class ProductionCountryEntity(
    val iso_3166_1: String?,
    val name: String?
)