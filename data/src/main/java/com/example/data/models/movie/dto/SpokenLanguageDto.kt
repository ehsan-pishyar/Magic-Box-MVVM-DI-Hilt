package com.example.data.models.movie.dto


import com.google.gson.annotations.SerializedName

data class SpokenLanguageDto(
    @SerializedName("iso_639_1")
    val iso6391: String?,
    val name: String?
)