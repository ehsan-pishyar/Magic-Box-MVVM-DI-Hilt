package com.example.data.models.tvshow.dto


import com.google.gson.annotations.SerializedName

data class AiringTodayTVShowsResultDto(
    val page: Int?,
    val result: List<ResultDto>?,
    @SerializedName("total_pages")
    val totalPages: Int?,
    @SerializedName("total_results")
    val totalResults: Int?
)