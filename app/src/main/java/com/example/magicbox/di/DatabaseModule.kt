package com.example.magicbox.di

import android.content.Context
import androidx.room.Room
import com.example.data.cache.MagicBoxDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun databaseProvider(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, MagicBoxDatabase::class.java, "magicbox_db").build()

    @Provides
    @Singleton
    fun latestMoviesDaoProvider(db: MagicBoxDatabase) = db.latestMoviesDao()

    @Provides
    @Singleton
    fun nowPlayingMoviesDaoProvider(db: MagicBoxDatabase) = db.nowPlayingMoviesDao()

    @Provides
    @Singleton
    fun popularMoviesDaoProvider(db: MagicBoxDatabase) = db.popularMoviesDao()

    @Provides
    @Singleton
    fun similarMoviesDaoProvider(db: MagicBoxDatabase) = db.similarMoviesDao()

    @Provides
    @Singleton
    fun topRatedMoviesDaoProvider(db: MagicBoxDatabase) = db.topRatedMoviesDao()

    @Provides
    @Singleton
    fun upcomingMoviesDaoProvider(db: MagicBoxDatabase) = db.upcomingMoviesDao()

// -------------------------------- Tv Shows --------------------------------------
    @Provides
    @Singleton
    fun airingTodayTvShowsDaoProvider(db: MagicBoxDatabase) = db.airingTodayTvShowsDao()

    @Provides
    @Singleton
    fun latestTvShowsDaoProvider(db: MagicBoxDatabase) = db.latestTvShowsDao()

    @Provides
    @Singleton
    fun onTheAirTvShowsDaoProvider(db: MagicBoxDatabase) = db.onTheAirTvShowsDao()

    @Provides
    @Singleton
    fun popularTvShowsDaoProvider(db: MagicBoxDatabase) = db.popularTvShowsDao()

    @Provides
    @Singleton
    fun similarTvShowsDaoProvider(db: MagicBoxDatabase) = db.similarTvShowsDao()

    @Provides
    @Singleton
    fun topRatedTvShowsDaoProvider(db: MagicBoxDatabase) = db.topRatedTvShowsDao()
}