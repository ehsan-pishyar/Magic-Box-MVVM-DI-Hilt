package com.example.domain.repositories.movie

import com.example.domain.models.movie.LatestMoviesResult
import kotlinx.coroutines.flow.Flow

interface LatestMoviesRepository {

    suspend fun saveLatestMovies(latestMoviesResult: LatestMoviesResult)

    suspend fun fetchLatestMovies(): Flow<LatestMoviesResult>
}