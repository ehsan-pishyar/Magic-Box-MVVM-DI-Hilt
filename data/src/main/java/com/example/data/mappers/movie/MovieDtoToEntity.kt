package com.example.data.mappers.movie

import com.example.data.models.movie.dto.*
import com.example.data.models.movie.entity.*
import com.example.domain.models.movie.PopularMoviesResult

internal fun BackdropDto.toEntity(): BackdropEntity {
    return BackdropEntity(
        this.aspectRatio,
        this.filePath,
        this.height,
        this.iso6391,
        this.voteAverage,
        this.voteCount,
        this.width
    )
}

internal fun DatesDto.toEntity(): DatesEntity {
    return DatesEntity(
        this.maximum,
        this.minimum
    )
}

internal fun GenreDto.toEntity(): GenreEntity {
    return GenreEntity(
        this.id,
        this.name
    )
}

internal fun ProductionCompanyDto.toEntity(): ProductionCompanyEntity {
    return ProductionCompanyEntity(
        this.id,
        this.logoPath,
        this.name,
        this.originCountry
    )
}

internal fun ProductionCountryDto.toEntity(): ProductionCountryEntity {
    return ProductionCountryEntity(
        this.iso31661,
        this.name
    )
}

internal fun SpokenLanguageDto.toEntity(): SpokenLanguageEntity {
    return SpokenLanguageEntity(
        this.iso6391,
        this.name
    )
}

// latest - detail
internal fun LatestMoviesResultDto.toEntity(): LatestMoviesResultEntity {
    return LatestMoviesResultEntity(
        this.adult,
        this.backdropPath,
        this.belongsToCollection,
        this.budget,
        this.genres?.map { it.toEntity() },
        this.homepage,
        this.id,
        this.imdbId,
        this.originalLanguage,
        this.originalTitle,
        this.overview,
        this.popularity,
        this.posterPath,
        this.productionCompanies?.map { it.toEntity() },
        this.productionCountries?.map { it.toEntity() },
        this.releaseDate,
        this.revenue,
        this.runtime,
        this.spokenLanguages?.map { it.toEntity() },
        this.status,
        this.tagline,
        this.title,
        this.video,
        this.voteAverage,
        this.voteCount,
    )
}

internal fun ResultDto.toEntity(): ResultEntity {
    return ResultEntity(
        this.adult,
        this.backdropPath,
        this.genreIds,
        this.id,
        this.originalLanguage,
        this.originalTitle,
        this.overview,
        this.popularity,
        this.posterPath,
        this.releaseDate,
        this.originalTitle,
        this.video,
        this.voteAverage,
        this.voteCount
    )
}

// now playing - popular - similar - top rated - upcoming
internal fun PopularMoviesResultDto.toEntity(): PopularMoviesResultEntity {
    return PopularMoviesResultEntity(
        this.page,
        this.result?.map { it.toEntity() },
        this.totalPages,
        this.totalResults
    )
}

