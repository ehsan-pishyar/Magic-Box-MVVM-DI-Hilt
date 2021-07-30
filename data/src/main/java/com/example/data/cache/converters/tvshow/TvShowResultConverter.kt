package com.example.data.cache.converters.tvshow

import androidx.room.TypeConverter
import com.example.data.models.tvshow.entity.ResultEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TvShowResultConverter {

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