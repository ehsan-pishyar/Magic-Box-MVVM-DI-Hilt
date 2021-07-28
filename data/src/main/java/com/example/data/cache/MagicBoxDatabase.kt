package com.example.data.cache

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.cache.daos.movie.*
import com.example.data.cache.daos.tvshow.*
import com.example.data.models.movie.entity.*
import com.example.data.models.tvshow.entity.*

@Database(
    entities = [

        LatestMoviesResultEntity::class,
               NowPlayingMoviesResultEntity::class,
               PopularMoviesResultEntity::class,
               SimilarMoviesResultEntity::class,
               TopRatedMoviesResultEntity::class,
               UpcomingMoviesResultEntity::class,
               MovieDetailsResultEntity::class,

               AiringTodayTVShowsResultEntity::class,
               LatestTVShowsResultEntity::class,
               OnTheAirTVShowsResultEntity::class,
               PopularTVShowsResultEntity::class,
               SimilarTVShowsResultEntity::class,
               TopRatedTVShowsResultEntity::class,
               TVShowDetailsResultEntity::class],
    version = 2,
    exportSchema = false
)

abstract class MagicBoxDatabase: RoomDatabase() {

    abstract fun latestMoviesDao(): LatestMoviesDao
    abstract fun nowPlayingMoviesDao(): NowPlayingMoviesDao
    abstract fun popularMoviesDao(): PopularMoviesDao
    abstract fun similarMoviesDao(): SimilarMoviesDao
    abstract fun topRatedMoviesDao(): TopRatedMoviesDao
    abstract fun upcomingMoviesDao(): UpcomingMoviesDao

    abstract fun airingTodayTvShowsDao(): AiringTodayTvShowsDao
    abstract fun latestTvShowsDao(): LatestTvShowsDao
    abstract fun onTheAirTvShowsDao(): OnTheAirTvShowsDao
    abstract fun popularTvShowsDao(): PopularTvShowsDao
    abstract fun similarTvShowsDao(): SimilarTvShowsDao
    abstract fun topRatedTvShowsDao(): TopRatedTvShowsDao

}