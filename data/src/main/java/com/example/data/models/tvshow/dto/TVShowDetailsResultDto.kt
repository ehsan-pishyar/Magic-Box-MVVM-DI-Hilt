package com.example.data.models.tvshow.dto


import com.google.gson.annotations.SerializedName

data class TVShowDetailsResultDto(
    @SerializedName("backdrop_path")
    val backdropPath: String?,
    @SerializedName("created_by")
    val createdBy: List<CreatedByDto>?,
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
    @SerializedName("last_episode_to_air")
    val lastEpisodeToAirDto: LastEpisodeToAirDto?,
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
    val overview: String?,
    val popularity: Double?,
    @SerializedName("poster_path")
    val posterPath: String?,
    @SerializedName("production_companies")
    val productionCompanies: List<ProductionCompanyDto>?,
    @SerializedName("production_countries")
    val productionCountries: List<ProductionCountryDto>?,
    val season: List<SeasonDto>?,
    @SerializedName("spoken_languages")
    val spokenLanguages: List<SpokenLanguageDto>?,
    val status: String?,
    val tagline: String?,
    val type: String?,
    @SerializedName("vote_average")
    val voteAverage: Double?,
    @SerializedName("vote_count")
    val voteCount: Int?
)