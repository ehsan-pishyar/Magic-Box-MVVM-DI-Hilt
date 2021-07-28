package com.example.data.models.movie.entity

import androidx.room.Entity


@Entity( tableName = "movie_production_companies")
data class ProductionCompanyEntity(
    val id: Int?,
    val logo_path: String?,
    val name: String?,
    val origin_country: String?
)