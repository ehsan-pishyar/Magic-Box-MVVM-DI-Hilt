package com.example.domain.repositories.movie

import com.example.domain.models.movie.TopRatedMoviesResult
import kotlinx.coroutines.flow.Flow

interface TopRatedMoviesRepository {

    suspend fun saveTopRatedMovies(topRatedMoviesResult: TopRatedMoviesResult)

    suspend fun fetchTopRatedMovies(): Flow<TopRatedMoviesResult>
}