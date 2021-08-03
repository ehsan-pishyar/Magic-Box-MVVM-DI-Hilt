package com.example.magicbox.ui.fragments.movie.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.util.StateListener
import com.example.domain.models.movie.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.*
import com.example.domain.repositories.movie.*
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class MovieMainViewModel @Inject constructor(
    private val popularMoviesRepository: PopularMoviesRepository,
    private val latestMoviesRepository: LatestMoviesRepository,
    private val nowPlayingMoviesRepository: NowPlayingMoviesRepository,
    private val topRatedMoviesRepository: TopRatedMoviesRepository,
    private val upcomingMoviesRepository: UpcomingMoviesRepository,
): ViewModel() {

    init {
        fetchPopularMovies()
        //fetchLatestMovies()
        //fetchNowPlayingMovies()
        //fetchTopRatedMovies()
        //fetchUpcomingMovies()
    }

    private val stateListener: StateListener? = null

    private val _popularMovies = MutableLiveData<PopularMoviesResult>()
    val popularMovies: LiveData<PopularMoviesResult> get() = _popularMovies

    private val _latestMovies = MutableLiveData<LatestMoviesResult>()
    val latestMovies: LiveData<LatestMoviesResult> get() = _latestMovies

    private val _nowPlayingMovies = MutableLiveData<NowPlayingMoviesResult>()
    val nowPlayingMovies: LiveData<NowPlayingMoviesResult> get() = _nowPlayingMovies

    private val _topRatedMovies = MutableLiveData<TopRatedMoviesResult>()
    val topRatedMovies: LiveData<TopRatedMoviesResult> get() = _topRatedMovies

    private val _upcomingMovies = MutableLiveData<UpcomingMoviesResult>()
    val upcomingMovies: LiveData<UpcomingMoviesResult> get() = _upcomingMovies

    private fun fetchPopularMovies(){
        viewModelScope.launch {
            stateListener?.onLoading()

            try {
                val popularMoviesResponse = popularMoviesRepository.fetchPopularMovies()
                popularMoviesResponse.collect {
                    _popularMovies.value = it
                    stateListener?.onSuccess("Popular Movies Fetched Successfully")
                    Log.d("RESPONSE SUCCESSFUL: ", "Popular Movies Fetched Successfully")
                }
                return@launch
            }catch (e: Exception){
                stateListener?.onError(e.message)
                Log.e("RESPONSE ERROR: ", "Popular Movies Fetched Was Failed!")
                return@launch
            }
        }
    }

    private fun fetchLatestMovies(){
        viewModelScope.launch {
            stateListener?.onLoading()

            try {
                val latestMoviesResponse = latestMoviesRepository.fetchLatestMovies()
                latestMoviesResponse.collect {
                    _latestMovies.value = it
                    stateListener?.onSuccess("Latest Movies Fetched Successfully")
                    Log.d("RESPONSE SUCCESSFUL: ", "Latest Movies Fetched Successfully")
                }
                return@launch
            }catch (e: Exception){
                stateListener?.onError(e.message)
                Log.e("RESPONSE ERROR: ", "Latest Movies Fetched Was Failed!")
                return@launch
            }
        }
    }

    private fun fetchNowPlayingMovies(){
        viewModelScope.launch {
            stateListener?.onLoading()

            try {
                val nowPlayingMoviesResponse = nowPlayingMoviesRepository.fetchNowPlayingMovies()
                nowPlayingMoviesResponse.collect {
                    _nowPlayingMovies.value = it
                    stateListener?.onSuccess("Now Playing Movies Fetched Successfully")
                    Log.d("RESPONSE SUCCESSFUL: ", "Now Playing Movies Fetched Successfully")
                }
                return@launch
            }catch (e: Exception){
                stateListener?.onError(e.message)
                Log.e("RESPONSE ERROR: ", "Now Playing Movies Fetched Was Failed!")
                return@launch
            }
        }
    }

    private fun fetchTopRatedMovies(){
        viewModelScope.launch {
            stateListener?.onLoading()

            try {
                val topRatedMoviesResponse = topRatedMoviesRepository.fetchTopRatedMovies()
                topRatedMoviesResponse.collect {
                    _topRatedMovies.value = it
                    stateListener?.onSuccess("Top Rated Movies Fetched Successfully")
                    Log.d("RESPONSE SUCCESSFUL: ", "Top Rated Movies Fetched Successfully")
                }
                return@launch
            }catch (e: Exception){
                stateListener?.onError(e.message)
                Log.e("RESPONSE ERROR: ", "Top Rated Movies Fetched Was Failed!")
                return@launch
            }
        }
    }

    private fun fetchUpcomingMovies(){
        viewModelScope.launch {
            stateListener?.onLoading()

            try {
                val upcomingMoviesResponse = upcomingMoviesRepository.fetchUpcomingMovies()
                upcomingMoviesResponse.collect {
                    _upcomingMovies.value = it
                    stateListener?.onSuccess("Upcoming Movies Fetched Successfully")
                    Log.d("RESPONSE SUCCESSFUL: ", "Upcoming Movies Fetched Successfully")
                }
                return@launch
            }catch (e: Exception){
                stateListener?.onError(e.message)
                Log.e("RESPONSE ERROR: ", "Upcoming Movies Fetched Was Failed!")
                return@launch
            }
        }
    }
}