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

    @Singleton
    @Provides
    fun databaseProvider(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, MagicBoxDatabase::class.java, "magicbox_db").build()

    @Singleton
    @Provides
    fun latestMoviesDaoProvider(db: MagicBoxDatabase) = db.latestMoviesDao()

    @Singleton
    @Provides
    fun nowPlayingMoviesDaoProvider(db: MagicBoxDatabase) = db.nowPlayingMoviesDao()

    @Singleton
    @Provides
    fun popularMoviesDaoProvider(db: MagicBoxDatabase) = db.popularMoviesDao()

    @Singleton
    @Provides
    fun similarMoviesDaoProvider(db: MagicBoxDatabase) = db.similarMoviesDao()

    @Singleton
    @Provides
    fun topRatedMoviesDaoProvider(db: MagicBoxDatabase) = db.topRatedMoviesDao()

    @Singleton
    @Provides
    fun upcomingMoviesDaoProvider(db: MagicBoxDatabase) = db.upcomingMoviesDao()


    @Singleton
    @Provides
    fun airingTodayTvShowsDaoProvider(db: MagicBoxDatabase) = db.airingTodayTvShowsDao()

    @Singleton
    @Provides
    fun latestTvShowsDaoProvider(db: MagicBoxDatabase) = db.latestTvShowsDao()

    @Singleton
    @Provides
    fun onTheAirTvShowsDaoProvider(db: MagicBoxDatabase) = db.onTheAirTvShowsDao()

    @Singleton
    @Provides
    fun popularTvShowsDaoProvider(db: MagicBoxDatabase) = db.popularTvShowsDao()

    @Singleton
    @Provides
    fun similarTvShowsDaoProvider(db: MagicBoxDatabase) = db.similarTvShowsDao()

    @Singleton
    @Provides
    fun topRatedTvShowsDaoProvider(db: MagicBoxDatabase) = db.topRatedTvShowsDao()
}