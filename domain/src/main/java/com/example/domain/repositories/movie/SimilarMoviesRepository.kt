package com.example.domain.repositories.movie

import com.example.domain.models.movie.SimilarMoviesResult
import kotlinx.coroutines.flow.Flow

interface SimilarMoviesRepository {

    suspend fun saveSimilarMovies(similarMoviesResult: SimilarMoviesResult)

    suspend fun fetchSimilarMovies(): Flow<SimilarMoviesResult>
}