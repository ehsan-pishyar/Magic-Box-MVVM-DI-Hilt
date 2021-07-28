package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "tvshow_results")
data class ResultEntity(
    val movieId: Int?,
    val backdrop_path: String?,
    val first_air_date: String?,
    val genre_ids: List<Int>?,
    val id: Int?,
    val name: String?,
    val original_language: String?,
    val original_name: String?,
    val overview: String?,
    val popularity: Double?,
    val poster_path: String?,
    val vote_average: Double?,
    val vote_count: Int?
)