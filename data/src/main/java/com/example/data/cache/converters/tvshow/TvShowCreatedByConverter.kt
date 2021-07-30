package com.example.data.cache.converters.tvshow

import androidx.room.TypeConverter
import com.example.data.models.tvshow.entity.CreatedByEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TvShowCreatedByConverter {

    private val gson = Gson()

    @TypeConverter
    fun from(createdByEntity: List<CreatedByEntity>): String? {
        if (createdByEntity.isEmpty()) return null

        val type = object : TypeToken<List<CreatedByEntity>>() {}.type
        return gson.toJson(createdByEntity, type)
    }

    @TypeConverter
    fun to(createdByEntityString: String?): List<CreatedByEntity>?{
        if (createdByEntityString.isNullOrEmpty()) return null

        val type = object : TypeToken<List<CreatedByEntity>>() {}.type
        return gson.fromJson(createdByEntityString, type)
    }
}