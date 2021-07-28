package com.example.data.models.movie.dto


data class MovieImagesResultDto(
    val backdrop: List<BackdropDto>?,
    val id: Int?,
    val poster: List<PosterDto>?
)