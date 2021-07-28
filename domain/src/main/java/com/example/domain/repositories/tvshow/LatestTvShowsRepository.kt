package com.example.domain.repositories.tvshow

import com.example.domain.models.tvshow.LatestTVShowsResult
import kotlinx.coroutines.flow.Flow

interface LatestTvShowsRepository {

    suspend fun saveLatestTvShows(latestTVShowsResult: LatestTVShowsResult)

    suspend fun fetchLatestTvShows(): Flow<LatestTVShowsResult>
}