package com.example.data.cache.converters.movie

import androidx.room.TypeConverter
import com.example.data.models.movie.entity.ProductionCountryEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MovieProductionCountryConverter {

    private val gson = Gson()

    @TypeConverter
    fun from(productionCountryEntity: List<ProductionCountryEntity>): String? {
        if (productionCountryEntity.isEmpty()) return null

        val type = object : TypeToken<List<ProductionCountryEntity>>() {}.type
        return gson.toJson(productionCountryEntity, type)
    }

    @TypeConverter
    fun to(productionCountryEntityString: String?): List<ProductionCountryEntity>?{
        if (productionCountryEntityString.isNullOrEmpty()) return null

        val type = object : TypeToken<List<ProductionCountryEntity>>() {}.type
        return gson.fromJson(productionCountryEntityString, type)
    }
}