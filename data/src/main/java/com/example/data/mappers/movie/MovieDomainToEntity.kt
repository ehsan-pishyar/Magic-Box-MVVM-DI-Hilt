package com.example.data.mappers.movie

import com.example.data.models.movie.dto.*
import com.example.data.models.movie.entity.*
import com.example.domain.models.movie.*

internal fun Backdrop.toEntity(): BackdropEntity {
    return BackdropEntity(
        this.aspect_ratio,
        this.file_path,
        this.height,
        this.iso_639_1,
        this.vote_average,
        this.vote_count,
        this.width
    )
}

internal fun Dates.toEntity(): DatesEntity {
    return DatesEntity(
        this.maximum,
        this.minimum
    )
}

internal fun Genre.toEntity(): GenreEntity {
    return GenreEntity(
        this.id,
        this.name
    )
}

internal fun ProductionCompany.toEntity(): ProductionCompanyEntity {
    return ProductionCompanyEntity(
        this.id,
        this.logo_path,
        this.name,
        this.origin_country
    )
}

internal fun ProductionCountry.toEntity(): ProductionCountryEntity {
    return ProductionCountryEntity(
        this.iso_3166_1,
        this.name
    )
}

internal fun SpokenLanguage.toEntity(): SpokenLanguageEntity {
    return SpokenLanguageEntity(
        this.iso_639_1,
        this.name
    )
}

// latest - detail
internal fun LatestMoviesResult.toEntity(): LatestMoviesResultEntity {
    return LatestMoviesResultEntity(
        this.adult,
        this.backdrop_path,
        this.belongs_to_collection,
        this.budget,
        this.genres?.map { it.toEntity() },
        this.homepage,
        this.id,
        this.imdb_id,
        this.original_language,
        this.original_title,
        this.overview,
        this.popularity,
        this.poster_path,
        this.production_companies?.map { it.toEntity() },
        this.production_countries?.map { it.toEntity() },
        this.release_date,
        this.revenue,
        this.runtime,
        this.spoken_languages?.map { it.toEntity() },
        this.status,
        this.tagline,
        this.title,
        this.video,
        this.vote_average,
        this.vote_count,
    )
}

internal fun Result.toEntity(): ResultEntity {
    return ResultEntity(
        this.adult,
        this.backdrop_path,
        this.genre_ids,
        this.id,
        this.original_language,
        this.original_title,
        this.overview,
        this.popularity,
        this.poster_path,
        this.release_date,
        this.original_title,
        this.video,
        this.vote_average,
        this.vote_count
    )
}

// now playing - popular - similar - top rated - upcoming
internal fun PopularMoviesResult.toEntity(): PopularMoviesResultEntity {
    return PopularMoviesResultEntity(
        this.page,
        this.results?.map { it.toEntity() },
        this.total_pages,
        this.total_results
    )
}

