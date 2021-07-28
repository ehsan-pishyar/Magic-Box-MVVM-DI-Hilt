package com.example.data.models.tvshow.dto


import com.google.gson.annotations.SerializedName

data class SeasonDto(
    @SerializedName("air_date")
    val airDate: String?,
    @SerializedName("episode_count")
    val episodeCount: Int?,
    val id: Int?,
    @SerializedName("poster_path")
    val posterPath: Any?,
    @SerializedName("season_number")
    val seasonNumber: Int?
)