package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "latest_tvshows")
data class LatestTVShowsResultEntity(
    val backdrop_path: String?,
    val created_by: List<CreatedByEntity>?,
    val episode_run_time: List<Int>?,
    val first_air_date: String?,
    val genre: List<GenreEntity>?,
    val homepage: String?,
    val id: Int?,
    val in_production: Boolean?,
    val languages: List<String>?,
    val last_air_date: String?,
    val name: String?,
    val network: List<NetworkEntity>?,
    val number_of_episodes: Int?,
    val number_of_seasons: Int?,
    val origin_country: List<String>?,
    val original_language: String?,
    val original_name: String?,
    val overview: String?,
    val popularity: Int?,
    val poster_path: String?,
    val production_companies: List<ProductionCompanyEntity>?,
    val season: List<SeasonEntity>?,
    val status: String?,
    val type: String?,
    val vote_average: Int?,
    val vote_count: Int?
)