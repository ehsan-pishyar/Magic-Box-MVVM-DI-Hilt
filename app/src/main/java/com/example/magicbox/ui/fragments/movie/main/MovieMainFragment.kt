package com.example.magicbox.ui.fragments.movie.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.magicbox.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_movie_main.*

@AndroidEntryPoint
class MovieMainFragment : Fragment(R.layout.fragment_movie_main) {

    private val movieViewModel by viewModels<MovieMainViewmodel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}