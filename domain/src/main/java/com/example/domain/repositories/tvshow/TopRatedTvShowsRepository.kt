package com.example.domain.repositories.tvshow

import com.example.domain.models.tvshow.TopRatedTVShowsResult
import kotlinx.coroutines.flow.Flow

interface TopRatedTvShowsRepository {

    suspend fun saveTopRatedTvShows(topRatedTVShowsResult: TopRatedTVShowsResult)

    suspend fun fetchTopRatedTvShows(): Flow<TopRatedTVShowsResult>
}