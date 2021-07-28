package com.example.data.models.movie.entity

import androidx.room.Entity


@Entity(tableName = "latest_movies")
data class LatestMoviesResultEntity(
    val adult: Boolean?,
    val backdrop_path: Any?,
    val belongs_to_collection: Any?,
    val budget: Int?,
    val genre: List<GenreEntity>?,
    val homepage: String?,
    val id: Int?,
    val imdb_id: String?,
    val original_language: String?,
    val original_title: String?,
    val overview: String?,
    val popularity: Int?,
    val poster_path: String?,
    val production_companies: List<ProductionCompanyEntity>?,
    val production_countries: List<ProductionCountryEntity>?,
    val release_date: String?,
    val revenue: Int?,
    val runtime: Int?,
    val spoken_languages: List<SpokenLanguageEntity>?,
    val status: String?,
    val tagline: String?,
    val title: String?,
    val video: Boolean?,
    val vote_average: Int?,
    val vote_count: Int?
)