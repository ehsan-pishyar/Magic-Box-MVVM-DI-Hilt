package com.example.data.cache.converters.tvshow

import androidx.room.TypeConverter
import com.example.data.models.tvshow.entity.NetworkEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TvShowNetworkConverter {

    private val gson = Gson()

    @TypeConverter
    fun from(networkEntity: List<NetworkEntity>): String? {
        if (networkEntity.isEmpty()) return null

        val type = object : TypeToken<List<NetworkEntity>>() {}.type
        return gson.toJson(networkEntity, type)
    }

    @TypeConverter
    fun to(networkEntityString: String?): List<NetworkEntity>?{
        if (networkEntityString.isNullOrEmpty()) return null

        val type = object : TypeToken<List<NetworkEntity>>() {}.type
        return gson.fromJson(networkEntityString, type)
    }
}