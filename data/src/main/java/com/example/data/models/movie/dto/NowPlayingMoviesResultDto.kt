package com.example.data.models.movie.dto


import com.google.gson.annotations.SerializedName

data class NowPlayingMoviesResultDto(
    val dates: DatesDto?,
    val page: Int?,
    val result: List<ResultDto>?,
    @SerializedName("total_pages")
    val totalPages: Int?,
    @SerializedName("total_results")
    val totalResults: Int?
)