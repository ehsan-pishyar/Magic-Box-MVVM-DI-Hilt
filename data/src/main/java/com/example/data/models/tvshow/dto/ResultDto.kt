package com.example.data.models.tvshow.dto

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "tvshow_result")
data class ResultDto(
    @PrimaryKey(autoGenerate = true)
    val movieId: Int?,
    @SerializedName("backdrop_path")
    val backdropPath: String?,
    @SerializedName("first_air_date")
    val firstAirDate: String?,
    @SerializedName("genre_ids")
    val genreIds: List<Int>?,
    val id: Int?,
    val name: String?,
    @SerializedName("original_language")
    val originalLanguage: String?,
    @SerializedName("original_name")
    val originalName: String?,
    val overview: String?,
    val popularity: Double?,
    @SerializedName("poster_path")
    val posterPath: String?,
    @SerializedName("vote_average")
    val voteAverage: Double?,
    @SerializedName("vote_count")
    val voteCount: Int?
)