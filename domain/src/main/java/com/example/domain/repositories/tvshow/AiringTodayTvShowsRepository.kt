package com.example.domain.repositories.tvshow

import com.example.domain.models.tvshow.AiringTodayTVShowsResult
import kotlinx.coroutines.flow.Flow

interface AiringTodayTvShowsRepository {

    suspend fun saveAiringTodayTvShows(airingTodayTVShowsResult: AiringTodayTVShowsResult)

    suspend fun fetchAiringTodayTvShows(): Flow<AiringTodayTVShowsResult>
}