package com.example.domain.repositories.movie

import com.example.domain.models.movie.UpcomingMoviesResult
import kotlinx.coroutines.flow.Flow

interface UpcomingMoviesRepository {

    suspend fun saveUpcomingMovies(upcomingMoviesResult: UpcomingMoviesResult)

    suspend fun fetchUpcomingMovies(): Flow<UpcomingMoviesResult>
}