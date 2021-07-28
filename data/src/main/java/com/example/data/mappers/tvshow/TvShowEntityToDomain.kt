package com.example.data.mappers.tvshow

import com.example.data.models.tvshow.dto.*
import com.example.data.models.tvshow.entity.*
import com.example.domain.models.tvshow.*

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

internal fun CreatedByEntity.toDomain(): CreatedBy {
    return CreatedBy(
        this.credit_id,
        this.gender,
        this.id,
        this.name,
        this.profile_path
    )
}

internal fun GenreEntity.toDomain(): Genre {
    return Genre(
        this.id,
        this.name
    )
}

internal fun NetworkEntity.toDomain(): Network {
    return Network(
        this.id,
        this.name
    )
}

internal fun PosterEntity.toDomain(): Poster {
    return Poster(
        this.aspect_ratio,
        this.file_path,
        this.height,
        this.iso_639_1,
        this.vote_average,
        this.vote_count,
        this.width
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

internal fun SeasonEntity.toDomain(): Season {
    return Season(
        this.air_date,
        this.episode_count,
        this.id,
        this.poster_path,
        this.season_number
    )
}

internal fun SpokenLanguageEntity.toDomain(): SpokenLanguage {
    return SpokenLanguage(
        this.english_name,
        this.iso_639_1,
        this.name
    )
}

internal fun LastEpisodeToAirEntity.toDomain(): LastEpisodeToAir {
    return LastEpisodeToAir(
        this.air_date,
        this.episode_number,
        this.id,
        this.name,
        this.overview,
        this.production_code,
        this.season_number,
        this.still_path,
        this.vote_average,
        this.vote_count
    )
}

// latest
internal fun LatestTVShowsResultEntity.toDomain(): LatestTVShowsResult {
    return LatestTVShowsResult(
        this.backdrop_path,
        this.created_by?.map { it.toDomain() },
        this.episode_run_time,
        this.first_air_date,
        this.genre?.map { it.toDomain() },
        this.homepage,
        this.id,
        this.in_production,
        this.languages,
        this.last_air_date,
        this.name,
        this.network?.map { it.toDomain() },
        this.number_of_episodes,
        this.number_of_seasons,
        this.origin_country,
        this.original_language,
        this.original_name,
        this.overview,
        this.popularity,
        this.poster_path,
        this.production_companies?.map { it.toDomain() },
        this.season?.map { it.toDomain() },
        this.status,
        this.type,
        this.vote_average,
        this.vote_count
    )
}

internal fun ResultEntity.toDomain(): Result {
    return Result(
        this.backdrop_path,
        this.first_air_date,
        this.genre_ids,
        this.movieId,
        this.name,
        this.original_language,
        this.original_name,
        this.overview,
        this.popularity,
        this.poster_path,
        this.vote_average,
        this.vote_count
    )
}

// airing today - on the air - popular - similar - top rated
internal fun PopularTVShowsResultEntity.toDomain(): PopularTVShowsResult {
    return PopularTVShowsResult(
        this.page,
        this.result?.map { it.toDomain() },
        this.total_pages,
        this.total_results
    )
}