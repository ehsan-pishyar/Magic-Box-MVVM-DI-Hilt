package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "tvshow_created_by")
data class CreatedByEntity(
    val credit_id: String?,
    val gender: Int?,
    val id: Int?,
    val name: String?,
    val profile_path: String?
)