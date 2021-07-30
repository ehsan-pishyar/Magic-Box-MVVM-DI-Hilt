package com.example.data.cache.converters.tvshow

import androidx.room.TypeConverter
import com.example.data.models.tvshow.entity.SeasonEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TvShowSeasonConverter {

    private val gson = Gson()

    @TypeConverter
    fun from(seasonEntity: List<SeasonEntity>): String? {
        if (seasonEntity.isEmpty()) return null

        val type = object : TypeToken<List<SeasonEntity>>() {}.type
        return gson.toJson(seasonEntity, type)
    }

    @TypeConverter
    fun to(seasonEntityString: String?): List<SeasonEntity>?{
        if (seasonEntityString.isNullOrEmpty()) return null

        val type = object : TypeToken<List<SeasonEntity>>() {}.type
        return gson.fromJson(seasonEntityString, type)
    }
}