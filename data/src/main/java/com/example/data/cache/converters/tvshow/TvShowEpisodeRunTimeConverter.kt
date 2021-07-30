package com.example.data.cache.converters.tvshow

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TvShowEpisodeRunTimeConverter {

    private val gson = Gson()

    @TypeConverter
    fun from(episodeRunTimeEntity: List<Int>): String?{
        if (episodeRunTimeEntity.isEmpty()) return null

        val type = object : TypeToken<List<Int>>() {}.type
        return gson.toJson(episodeRunTimeEntity, type)
    }

    @TypeConverter
    fun to(episodeRunTimeEntityString: String): List<Int>? {
        if (episodeRunTimeEntityString.isEmpty()) return null

        val type = object : TypeToken<List<Int>>() {}.type
        return gson.fromJson(episodeRunTimeEntityString, type)
    }
}