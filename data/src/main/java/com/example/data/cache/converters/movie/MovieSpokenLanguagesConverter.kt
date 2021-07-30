package com.example.data.cache.converters.movie

import androidx.room.TypeConverter
import com.example.data.models.movie.entity.SpokenLanguageEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MovieSpokenLanguagesConverter {

    private val gson = Gson()

    @TypeConverter
    fun from(spokenLanguageEntity: List<SpokenLanguageEntity>): String? {
        if (spokenLanguageEntity.isEmpty()) return null

        val type = object : TypeToken<List<SpokenLanguageEntity>>() {}.type
        return gson.toJson(spokenLanguageEntity, type)
    }

    @TypeConverter
    fun to(spokenLanguageEntityString: String?): List<SpokenLanguageEntity>?{
        if (spokenLanguageEntityString.isNullOrEmpty()) return null

        val type = object : TypeToken<List<SpokenLanguageEntity>>() {}.type
        return gson.fromJson(spokenLanguageEntityString, type)
    }
}