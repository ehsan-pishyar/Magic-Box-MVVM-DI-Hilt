package com.example.data.network

import com.example.data.models.movie.dto.*
import com.example.data.models.tvshow.dto.*
import com.example.data.util.Constants
import com.example.magicbox.BuildConfig
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    // Movies ----------------------------------------------------------

    @GET("/movie/latest")
    suspend fun getLatestMovies(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language
    ): Response<LatestMoviesResultDto>

    @GET("/movie/now_playing")
    suspend fun getNowPlayingMovies(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
        @Query("page") page: Int = 1,
    ): Response<NowPlayingMoviesResultDto>

    @GET("/movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
        @Query("page") page: Int = 1,
    ): Response<PopularMoviesResultDto>

    @GET("/movie/top_rated")
    suspend fun getTopRatedMovies(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
        @Query("page") page: Int = 1,
    ): Response<TopRatedMoviesResultDto>

    @GET("/movie/upcoming")
    suspend fun getUpcomingMovies(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
        @Query("page") page: Int = 1,
    ): Response<UpcomingMoviesResultDto>

    @GET("/movie/{movie_id}/similar")
    suspend fun getSimilarMovies(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
        @Query("page") page: Int = 1,
    ): Response<SimilarMoviesResultDto>

    @GET("/movie/{movie_id}")
    suspend fun getMovieDetails(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
    ): Response<MovieDetailsResultDto>

    @GET("/movie/{movie_id}/images")
    suspend fun getMovieImages(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
    ): Response<MovieImagesResultDto>

    @GET("/movie/{movie_id}/videos")
    suspend fun getMovieVideos(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
    ): Response<MovieVideosResultDto>

    // TV Shows ----------------------------------------------------------

    @GET("/tv/latest")
    suspend fun getLatestTVShows(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language
    ): Response<LatestTVShowsResultDto>

    @GET("/tv/airing_today")
    suspend fun getAiringTodayTVShows(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
        @Query("page") page: Int = 1,
    ): Response<AiringTodayTVShowsResultDto>

    @GET("/tv/popular")
    suspend fun getPopularTVShows(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
        @Query("page") page: Int = 1,
    ): Response<PopularTVShowsResultDto>

    @GET("/tv/top_rated")
    suspend fun getTopRatedTVShows(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
        @Query("page") page: Int = 1,
    ): Response<TopRatedTVShowsResultDto>

    @GET("/tv/on_the_air")
    suspend fun getOnTheAirTVShows(
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
        @Query("page") page: Int = 1,
    ): Response<OnTheAirTVShowsResultDto>

    @GET("/tv/{tv_id}/similar")
    suspend fun getSimilarTVShows(
        @Path("tv_id") tvId: Int,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
        @Query("page") page: Int = 1,
    ): Response<SimilarTVShowsResultDto>

    @GET("/tv/{tv_id}")
    suspend fun getTVShowDetails(
        @Path("tv_id") tvId: Int,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
    ): Response<TVShowDetailsResultDto>

    @GET("/tv/{tv_id}/images")
    suspend fun getTVShowImages(
        @Path("tv_id") tvId: Int,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
    ): Response<TvShowImagesResultDto>

    @GET("/tv/{tv_id}/videos")
    suspend fun getTVShowVideos(
        @Path("tv_id") tvId: Int,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
        @Query("language") language: String = Constants.language,
    ): Response<TVShowVideosResultDto>
}