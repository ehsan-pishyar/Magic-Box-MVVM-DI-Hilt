package com.example.domain.repositories.tvshow

import com.example.domain.models.tvshow.OnTheAirTVShowsResult
import kotlinx.coroutines.flow.Flow

interface OnTheAirTvShowsRepository {

    suspend fun saveOnTheAirTvShows(onTheAirTVShowsResult: OnTheAirTVShowsResult)

    suspend fun fetchOnTheAirTvShows(): Flow<OnTheAirTVShowsResult>
}