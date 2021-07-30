package com.example.data.cache.converters.tvshow

import androidx.room.TypeConverter
import com.example.data.models.tvshow.entity.GenreEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TvShowGenresIdConverter {

    private val gson = Gson()

    @TypeConverter
    fun from(genresIdEntity: List<Int>): String?{
        if (genresIdEntity.isEmpty()) return null

        val type = object : TypeToken<List<Int>>() {}.type
        return gson.toJson(genresIdEntity, type)
    }

    @TypeConverter
    fun to(genresIdEntityString: String): List<Int>? {
        if (genresIdEntityString.isEmpty()) return null

        val type = object : TypeToken<List<Int>>() {}.type
        return gson.fromJson(genresIdEntityString, type)
    }
}