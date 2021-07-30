package com.example.data.cache.converters.movie

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MovieGenresIdConverter {

    private val gson = Gson()

    @TypeConverter
    fun from(genreEntity: List<Int>): String? {
        if (genreEntity.isEmpty()) return null

        val type = object : TypeToken<List<Int>>() {}.type
        return gson.toJson(genreEntity, type)
    }

    @TypeConverter
    fun to(genreEntityString: String?): List<Int>?{
        if (genreEntityString.isNullOrEmpty()) return null

        val type = object : TypeToken<List<Int>>() {}.type
        return gson.fromJson(genreEntityString, type)
    }
}