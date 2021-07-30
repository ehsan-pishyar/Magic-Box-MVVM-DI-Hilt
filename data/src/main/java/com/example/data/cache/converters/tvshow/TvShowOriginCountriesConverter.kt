package com.example.data.cache.converters.tvshow

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TvShowOriginCountriesConverter {

    private val gson = Gson()

    @TypeConverter
    fun from(originCountryEntity: List<String>): String?{
        if (originCountryEntity.isEmpty()) return null

        val type = object : TypeToken<List<String>>() {}.type
        return gson.toJson(originCountryEntity, type)
    }

    @TypeConverter
    fun to(originCountryEntityString: String): List<String>? {
        if (originCountryEntityString.isEmpty()) return null

        val type = object : TypeToken<List<String>>() {}.type
        return gson.fromJson(originCountryEntityString, type)
    }
}