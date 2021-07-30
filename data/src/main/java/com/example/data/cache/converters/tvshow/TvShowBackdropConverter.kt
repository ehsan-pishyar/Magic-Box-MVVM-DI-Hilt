package com.example.data.cache.converters.tvshow

import androidx.room.TypeConverter
import com.example.data.models.tvshow.entity.BackdropEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TvShowBackdropConverter {

    private val gson = Gson()

    @TypeConverter
    fun from(backdropEntity: List<BackdropEntity>): String? {
        if (backdropEntity.isEmpty()) return null

        val type = object : TypeToken<List<BackdropEntity>>() {}.type
        return gson.toJson(backdropEntity, type)
    }

    @TypeConverter
    fun to(backdropEntityString: String?): List<BackdropEntity>?{
        if (backdropEntityString.isNullOrEmpty()) return null

        val type = object : TypeToken<List<BackdropEntity>>() {}.type
        return gson.fromJson(backdropEntityString, type)
    }
}