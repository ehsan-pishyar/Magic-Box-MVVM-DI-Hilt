package com.example.domain.repositories.movie

import com.example.domain.models.movie.NowPlayingMoviesResult
import kotlinx.coroutines.flow.Flow

interface NowPlayingMoviesRepository {

    suspend fun saveNowPlayingMovies(nowPlayingMoviesResult: NowPlayingMoviesResult)

    suspend fun fetchNowPlayingMovies(): Flow<NowPlayingMoviesResult>
}