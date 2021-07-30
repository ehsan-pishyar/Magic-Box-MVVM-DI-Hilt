package com.example.data.cache.converters.movie

import androidx.room.TypeConverter
import com.example.data.models.movie.entity.ResultEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MovieResultConverter {

    private val gson = Gson()

    @TypeConverter
    fun from(resultEntity: List<ResultEntity>): String? {
        if (resultEntity.isEmpty()) return null

        val type = object : TypeToken<List<ResultEntity>>() {}.type
        return gson.toJson(resultEntity, type)
    }

    @TypeConverter
    fun to(resultEntityString: String?): List<ResultEntity>?{
        if (resultEntityString.isNullOrEmpty()) return null

        val type = object : TypeToken<List<ResultEntity>>() {}.type
        return gson.fromJson(resultEntityString, type)
    }
}