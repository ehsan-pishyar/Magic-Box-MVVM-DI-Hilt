package com.example.domain.repositories.tvshow

import com.example.domain.models.tvshow.PopularTVShowsResult
import kotlinx.coroutines.flow.Flow

interface PopularTvShowsRepository {

    suspend fun savePopularTvShows(popularTVShowsResult: PopularTVShowsResult)

    suspend fun fetchPopularTvShows(): Flow<PopularTVShowsResult>
}