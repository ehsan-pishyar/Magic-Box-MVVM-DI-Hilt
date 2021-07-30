package com.example.data.cache.converters.movie

import androidx.room.TypeConverter
import com.example.data.models.movie.entity.PosterEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MoviePosterConverter {

    private val gson = Gson()

    @TypeConverter
    fun from(posterEntity: List<PosterEntity>): String? {
        if (posterEntity.isEmpty()) return null

        val type = object : TypeToken<List<PosterEntity>>() {}.type
        return gson.toJson(posterEntity, type)
    }

    @TypeConverter
    fun to(posterEntityString: String?): List<PosterEntity>?{
        if (posterEntityString.isNullOrEmpty()) return null

        val type = object : TypeToken<List<PosterEntity>>() {}.type
        return gson.fromJson(posterEntityString, type)
    }
}