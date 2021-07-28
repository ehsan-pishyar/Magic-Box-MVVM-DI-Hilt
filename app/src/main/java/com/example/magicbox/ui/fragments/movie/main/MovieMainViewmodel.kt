package com.example.magicbox.ui.fragments.movie.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.magicbox.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieMainViewmodel @Inject constructor(): ViewModel() {

    /*
    private val _latestMovies = MutableLiveData<Resource<LatestMoviesResponse>>()
    private val _nowPlayingMovies = MutableLiveData<Resource<NowPlayingMoviesResponse>>()
    private val _popularMovies = MutableLiveData<Resource<PopularMoviesResponse>>()
    private val _topRatedMovies = MutableLiveData<Resource<TopRatedMoviesResponse>>()
    private val _upcomingMovies = MutableLiveData<Resource<UpcomingMoviesResponse>>()
    private val _similarMovies = MutableLiveData<Resource<SimilarMoviesResponse>>()
    private val _movieDetails = MutableLiveData<Resource<MovieDetailsResponse>>()
    private val _movieImages = MutableLiveData<Resource<MovieImagesResponse>>()
    private val _movieVideos = MutableLiveData<Resource<MovieVideosResponse>>()

    val latestMovies: LiveData<Resource<LatestMoviesResponse>> get() = _latestMovies
    val nowPlayingMovies: LiveData<Resource<NowPlayingMoviesResponse>> get() = _nowPlayingMovies
    val popularMovies: LiveData<Resource<PopularMoviesResponse>> get() = _popularMovies
    val topRatedMovies: LiveData<Resource<TopRatedMoviesResponse>> get() = _topRatedMovies
    val upcomingMovies: LiveData<Resource<UpcomingMoviesResponse>> get() = _upcomingMovies
    val similarMovies: LiveData<Resource<SimilarMoviesResponse>> get() = _similarMovies
    val movieDetails: LiveData<Resource<MovieDetailsResponse>> get() = _movieDetails
    val movieImages: LiveData<Resource<MovieImagesResponse>> get() = _movieImages
    val movieVideos: LiveData<Resource<MovieVideosResponse>> get() = _movieVideos

    fun getPopularMovies() = viewModelScope.launch {
        _popularMovies.value = Resource.loading(null)
        movieRepository.getPopularMovies().let { response ->
            if (response.isSuccessful){
                _popularMovies.value = Resource.success(response.body()!!)
            }else _popularMovies.value = Resource.error(null, "${response.code()}")
        }
    }

     */
}