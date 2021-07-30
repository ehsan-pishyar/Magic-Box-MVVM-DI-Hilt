package com.example.domain.models.tvshow


data class LatestTVShowsResult(
    val backdrop_path: String?,
    val created_by: List<CreatedBy>?,
    val episode_run_time: List<Int>?,
    val first_air_date: String?,
    val genres: List<Genre>?,
    val homepage: String?,
    val id: Int?,
    val in_production: Boolean?,
    val languages: List<String>?,
    val last_air_date: String?,
    val name: String?,
    val networks: List<Network>?,
    val number_of_episodes: Int?,
    val number_of_seasons: Int?,
    val origin_country: List<String>?,
    val original_language: String?,
    val original_name: String?,
    val overview: String?,
    val popularity: Int?,
    val poster_path: String?,
    val production_companies: List<ProductionCompany>?,
    val seasons: List<Season>?,
    val status: String?,
    val type: String?,
    val vote_average: Int?,
    val vote_count: Int?
)