package com.example.data.mappers.tvshow

import com.example.data.models.tvshow.dto.*
import com.example.data.models.tvshow.entity.*

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

internal fun CreatedByDto.toEntity(): CreatedByEntity {
    return CreatedByEntity(
        this.creditId,
        this.gender,
        this.id,
        this.name,
        this.profilePath
    )
}

internal fun GenreDto.toEntity(): GenreEntity {
    return GenreEntity(
        this.id,
        this.name
    )
}

internal fun NetworkDto.toEntity(): NetworkEntity {
    return NetworkEntity(
        this.id,
        this.name
    )
}

internal fun PosterDto.toEntity(): PosterEntity {
    return PosterEntity(
        this.aspectRatio,
        this.filePath,
        this.height,
        this.iso6391,
        this.voteAverage,
        this.voteCount,
        this.width
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

internal fun SeasonDto.toEntity(): SeasonEntity {
    return SeasonEntity(
        this.airDate,
        this.episodeCount,
        this.id,
        this.posterPath,
        this.seasonNumber
    )
}

internal fun SpokenLanguageDto.toEntity(): SpokenLanguageEntity {
    return SpokenLanguageEntity(
        this.englishName,
        this.iso6391,
        this.name
    )
}

internal fun LastEpisodeToAirDto.toEntity(): LastEpisodeToAirEntity {
    return LastEpisodeToAirEntity(
        this.airDate,
        this.episodeNumber,
        this.id,
        this.name,
        this.overview,
        this.productionCode,
        this.seasonNumber,
        this.stillPath,
        this.voteAverage,
        this.voteCount
    )
}

// latest
internal fun LatestTVShowsResultDto.toEntity(): LatestTVShowsResultEntity {
    return LatestTVShowsResultEntity(
        this.backdropPath,
        this.createdBy?.map { it.toEntity() },
        this.episodeRunTimes,
        this.firstAirDate,
        this.genre?.map { it.toEntity() },
        this.homepage,
        this.id,
        this.inProduction,
        this.languages,
        this.lastAirDate,
        this.name,
        this.network?.map { it.toEntity() },
        this.numberOfEpisodes,
        this.numberOfSeasons,
        this.originCountries,
        this.originalLanguage,
        this.originalName,
        this.overview,
        this.popularity,
        this.posterPath,
        this.productionCompanies?.map { it.toEntity() },
        this.season?.map { it.toEntity() },
        this.status,
        this.type,
        this.voteAverage,
        this.voteCount
    )
}

internal fun ResultDto.toEntity(): ResultEntity {
    return ResultEntity(
        this.movieId,
        this.backdropPath,
        this.firstAirDate,
        this.genreIds,
        this.movieId,
        this.name,
        this.originalLanguage,
        this.originalName,
        this.overview,
        this.popularity,
        this.posterPath,
        this.voteAverage,
        this.voteCount
    )
}

// airing today - on the air - popular - similar - top rated
internal fun PopularTVShowsResultDto.toEntity(): PopularTVShowsResultEntity {
    return PopularTVShowsResultEntity(
        this.page,
        this.result?.map { it.toEntity() },
        this.totalPages,
        this.totalResults
    )
}