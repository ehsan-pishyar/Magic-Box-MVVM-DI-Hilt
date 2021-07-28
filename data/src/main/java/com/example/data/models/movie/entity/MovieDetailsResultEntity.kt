package com.example.data.models.movie.entity

import androidx.room.Entity


@Entity(tableName = "movie_details")
data class MovieDetailsResultEntity(
    val adult: Boolean?,
    val backdrop_path: String?,
    val belongs_to_collection: Any?,
    val budget: Int?,
    val genre: List<GenreEntity>?,
    val homepage: String?,
    val id: Int?,
    val imdb_id: String?,
    val original_language: String?,
    val original_title: String?,
    val overview: String?,
    val popularity: Double?,
    val poster_path: Any?,
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
    val vote_average: Double?,
    val vote_count: Int?
)