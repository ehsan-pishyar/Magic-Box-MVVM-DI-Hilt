package com.example.domain.usecases.movie.latest

import com.example.domain.repositories.movie.LatestMoviesRepository

class FetchLatestMoviesUseCase(private val latestMoviesRepository: LatestMoviesRepository) {
}