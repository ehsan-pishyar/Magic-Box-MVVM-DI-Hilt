package com.example.data.models.tvshow.dto

import com.google.gson.annotations.SerializedName

data class LatestTVShowsResultDto(
    @SerializedName("backdrop_path")
    val backdropPath: Any?,
    @SerializedName("created_by")
    val createdBy: List<Any>?,
    @SerializedName("episode_run_time")
    val episodeRunTimes: List<Int>?,
    @SerializedName("first_air_date")
    val firstAirDate: String?,
    val genre: List<GenreDto>?,
    val homepage: String?,
    val id: Int?,
    @SerializedName("in_production")
    val inProduction: Boolean?,
    val languages: List<String>?,
    @SerializedName("last_air_date")
    val lastAirDate: String?,
    val name: String?,
    val network: List<NetworkDto>?,
    @SerializedName("number_of_episodes")
    val numberOfEpisodes: Int?,
    @SerializedName("number_of_seasons")
    val numberOfSeasons: Int?,
    @SerializedName("origin_country")
    val originCountries: List<String>?,
    @SerializedName("original_language")
    val originalLanguage: String?,
    @SerializedName("original_name")
    val originalName: String?,
    val overview: Any?,
    val popularity: Int?,
    @SerializedName("poster_path")
    val posterPath: Any?,
    @SerializedName("production_companies")
    val productionCompanies: List<Any>?,
    val season: List<SeasonDto>?,
    val status: String?,
    val type: String?,
    @SerializedName("vote_average")
    val voteAverage: Int?,
    @SerializedName("vote_count")
    val voteCount: Int?
)