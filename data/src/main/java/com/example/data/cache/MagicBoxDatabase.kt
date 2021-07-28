package com.example.data.cache

import androidx.room.RoomDatabase

/*
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
 */

abstract class MagicBoxDatabase: RoomDatabase() {

}