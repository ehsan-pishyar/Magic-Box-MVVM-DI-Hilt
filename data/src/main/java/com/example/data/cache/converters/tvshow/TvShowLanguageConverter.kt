package com.example.data.cache.converters.tvshow

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TvShowLanguageConverter {

    private val gson = Gson()

    @TypeConverter
    fun from(languageEntity: List<String>): String?{
        if (languageEntity.isEmpty()) return null

        val type = object : TypeToken<List<String>>() {}.type
        return gson.toJson(languageEntity, type)
    }

    @TypeConverter
    fun to(languageEntityString: String): List<String>? {
        if (languageEntityString.isEmpty()) return null

        val type = object : TypeToken<List<String>>() {}.type
        return gson.fromJson(languageEntityString, type)
    }
}