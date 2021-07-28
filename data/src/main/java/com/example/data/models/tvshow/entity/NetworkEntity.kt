package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "tvshow_networks")
data class NetworkEntity(
    val id: Int?,
    val name: String?
)