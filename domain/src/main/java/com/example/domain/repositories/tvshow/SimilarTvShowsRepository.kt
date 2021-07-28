package com.example.domain.repositories.tvshow

import com.example.domain.models.tvshow.SimilarTVShowsResult
import kotlinx.coroutines.flow.Flow

interface SimilarTvShowsRepository {

    suspend fun saveSimilarTvShows(similarTVShowsResult: SimilarTVShowsResult)

    suspend fun fetchSimilarTvShows(): Flow<SimilarTVShowsResult>
}