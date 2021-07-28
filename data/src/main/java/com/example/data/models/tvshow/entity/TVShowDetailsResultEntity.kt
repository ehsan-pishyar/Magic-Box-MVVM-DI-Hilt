package com.example.data.models.tvshow.entity

import androidx.room.Entity


@Entity(tableName = "tvshow_details")
data class TVShowDetailsResultEntity(
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
    val last_episode_to_air: LastEpisodeToAirEntity?,
    val name: String?,
    val network: List<NetworkEntity>?,
    val next_episode_to_air: Any?,
    val number_of_episodes: Int?,
    val number_of_seasons: Int?,
    val origin_country: List<String>?,
    val original_language: String?,
    val original_name: String?,
    val overview: String?,
    val popularity: Double?,
    val poster_path: String?,
    val production_companies: List<ProductionCompanyEntity>?,
    val production_countries: List<ProductionCountryEntity>?,
    val season: List<SeasonEntity>?,
    val spoken_languages: List<SpokenLanguageEntity>?,
    val status: String?,
    val tagline: String?,
    val type: String?,
    val vote_average: Double?,
    val vote_count: Int?
)