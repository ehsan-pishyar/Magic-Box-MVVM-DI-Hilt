package com.example.domain.repositories.movie

import com.example.domain.models.movie.PopularMoviesResult
import kotlinx.coroutines.flow.Flow

interface PopularMoviesRepository {

    suspend fun savePopularMovies(popularMoviesResult: PopularMoviesResult)

    suspend fun fetchPopularMovies(): Flow<PopularMoviesResult>
}