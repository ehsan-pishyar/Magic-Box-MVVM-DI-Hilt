package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "tvshow_production_companies")
data class ProductionCompanyEntity(
    val id: Int?,
    val logo_path: String?,
    val name: String?,
    val origin_country: String?
)