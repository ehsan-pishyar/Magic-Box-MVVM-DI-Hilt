package com.example.domain.models.movie

data class TopRatedMoviesResult(
    val page: Int?,
    val results: List<Result>?,
    val total_pages: Int?,
    val total_results: Int?
)