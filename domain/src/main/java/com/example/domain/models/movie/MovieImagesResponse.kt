package com.example.domain.models.movie


data class MovieImagesResponse(
    val backdrops: List<Backdrop>?,
    val id: Int?,
    val posters: List<Poster>?
)