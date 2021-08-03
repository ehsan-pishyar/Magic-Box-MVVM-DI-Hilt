package com.example.magicbox.ui.fragments.movie.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.magicbox.R
import com.example.magicbox.adapters.movie.PopularMoviesAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_movie_main.*

@AndroidEntryPoint
class MovieMainFragment : Fragment(R.layout.fragment_movie_main) {

    private val movieViewModel by viewModels<MovieMainViewModel>()
    private lateinit var popularMoviesAdapter: PopularMoviesAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
        initUi()
    }

    private fun initUi(){
        movieViewModel.popularMovies.observe(viewLifecycleOwner, { result ->
            result.results?.let { popularMoviesAdapter.diffUtil.submitList(it) }
        })
    }

    private fun initRecyclerView(){
        val popularAdapter = PopularMoviesAdapter()
        recycler_main.apply {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = popularAdapter
        }
    }

}