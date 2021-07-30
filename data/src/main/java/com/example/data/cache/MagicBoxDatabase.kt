package com.example.data.cache

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.data.cache.converters.movie.*
import com.example.data.cache.converters.tvshow.*
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

@TypeConverters(
    // -------------- movie ---------------
    TvShowBackdropConverter::class,
    MovieGenresConverter::class,
    MovieGenresIdConverter::class,
    MoviePosterConverter::class,
    MovieProductionCompanyConverter::class,
    MovieProductionCountryConverter::class,
    MovieResultConverter::class,
    MovieSpokenLanguagesConverter::class,

    // ------------- tv show ---------------
    TvShowBackdropConverter::class,
    TvShowCreatedByConverter::class,
    TvShowEpisodeRunTimeConverter::class,
    TvShowGenresConverter::class,
    TvShowGenresIdConverter::class,
    TvShowLanguageConverter::class,
    TvShowNetworkConverter::class,
    TvShowOriginCountriesConverter::class,
    TvShowPosterConverter::class,
    TvShowProductionCompanyConverter::class,
    TvShowProductionCountryConverter::class,
    TvShowResultConverter::class,
    TvShowSeasonConverter::class
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