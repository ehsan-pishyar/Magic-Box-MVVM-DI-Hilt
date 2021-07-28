package com.example.data.mappers.movie

import com.example.data.models.movie.entity.*
import com.example.domain.models.movie.*

internal fun BackdropEntity.toDomain(): Backdrop {
    return Backdrop(
        this.aspect_ratio,
        this.file_path,
        this.height,
        this.iso_639_1,
        this.vote_average,
        this.vote_count,
        this.width
    )
}

internal fun DatesEntity.toDomain(): Dates {
    return Dates(
        this.maximum,
        this.minimum
    )
}

internal fun GenreEntity.toDomain(): Genre {
    return Genre(
        this.id,
        this.name
    )
}

internal fun ProductionCompanyEntity.toDomain(): ProductionCompany {
    return ProductionCompany(
        this.id,
        this.logo_path,
        this.name,
        this.origin_country
    )
}

internal fun ProductionCountryEntity.toDomain(): ProductionCountry {
    return ProductionCountry(
        this.iso_3166_1,
        this.name
    )
}

internal fun SpokenLanguageEntity.toDomain(): SpokenLanguage {
    return SpokenLanguage(
        this.iso_639_1,
        this.name
    )
}

// latest - detail
internal fun LatestMoviesResultEntity.toDomain(): LatestMoviesResult {
    return LatestMoviesResult(
        this.adult,
        this.backdrop_path,
        this.belongs_to_collection,
        this.budget,
        this.genre?.map { it.toDomain() },
        this.homepage,
        this.id,
        this.imdb_id,
        this.original_language,
        this.original_title,
        this.overview,
        this.popularity,
        this.poster_path,
        this.production_companies?.map { it.toDomain() },
        this.production_countries?.map { it.toDomain() },
        this.release_date,
        this.revenue,
        this.runtime,
        this.spoken_languages?.map { it.toDomain() },
        this.status,
        this.tagline,
        this.title,
        this.video,
        this.vote_average,
        this.vote_count,
    )
}

internal fun ResultEntity.toDomain(): Result {
    return Result(
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
internal fun NowPlayingMoviesResultEntity.toDomain(): NowPlayingMoviesResult {
    return NowPlayingMoviesResult(
        this.dates?.toDomain(),
        this.page,
        this.result?.map { it.toDomain() },
        this.total_pages,
        this.total_results
    )
}


