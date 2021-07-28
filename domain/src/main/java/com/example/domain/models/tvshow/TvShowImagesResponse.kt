package com.example.domain.models.tvshow


data class TvShowImagesResponse(
    val backdrops: List<Backdrop>?,
    val id: Int?,
    val posters: List<Poster>?
)