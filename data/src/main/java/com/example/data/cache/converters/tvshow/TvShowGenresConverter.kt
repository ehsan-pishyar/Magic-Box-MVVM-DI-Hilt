package com.example.data.cache.converters.tvshow

import androidx.room.TypeConverter
import com.example.data.models.tvshow.entity.GenreEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TvShowGenresConverter {

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