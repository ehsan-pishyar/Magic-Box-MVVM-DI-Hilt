package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "tvshow_videos")
data class TVShowVideosResultEntity(
    val id: Int?,
    val result: List<ResultEntity>?
)