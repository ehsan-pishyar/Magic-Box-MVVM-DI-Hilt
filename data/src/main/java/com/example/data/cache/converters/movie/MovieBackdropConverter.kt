package com.example.data.cache.converters.movie

import androidx.room.TypeConverter
import com.example.data.models.movie.entity.BackdropEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MovieBackdropConverter {

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