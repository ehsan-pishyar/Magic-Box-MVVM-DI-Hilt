package com.example.data.cache.converters.tvshow

import androidx.room.TypeConverter
import com.example.data.models.tvshow.entity.ProductionCompanyEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TvShowProductionCompanyConverter {

    private val gson = Gson()

    @TypeConverter
    fun from(productionCompanyEntity: List<ProductionCompanyEntity>): String? {
        if (productionCompanyEntity.isEmpty()) return null

        val type = object : TypeToken<List<ProductionCompanyEntity>>() {}.type
        return gson.toJson(productionCompanyEntity, type)
    }

    @TypeConverter
    fun to(productionCompanyEntityString: String?): List<ProductionCompanyEntity>?{
        if (productionCompanyEntityString.isNullOrEmpty()) return null

        val type = object : TypeToken<List<ProductionCompanyEntity>>() {}.type
        return gson.fromJson(productionCompanyEntityString, type)
    }
}