package com.example.domain.usecases.movie.latest

import com.example.domain.repositories.movie.ILatestMoviesRepository

class FetchLatestMoviesUseCase(private val latestMoviesRepository: ILatestMoviesRepository) {
}