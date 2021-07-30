package com.example.data.cache.converters.movie

import androidx.room.TypeConverter
import com.example.data.models.movie.entity.GenreEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MovieGenresConverter {

    private val gson = Gson()

    @TypeConverter
    fun from(genreEntity: List<GenreEntity>): String?{
        if (genreEntity.isEmpty()) return null

        val type = object : TypeToken<List<GenreEntity>>() {}.type
        return gson.toJson(genreEntity, type)
    }

    @TypeConverter
    fun to(genreEntityString: String): List<GenreEntity>? {
        if (genreEntityString.isEmpty()) return null

        val type = object : TypeToken<List<GenreEntity>>() {}.type
        return gson.fromJson(genreEntityString, type)
    }
}