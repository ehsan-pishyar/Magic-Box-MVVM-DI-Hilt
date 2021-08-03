package com.example.magicbox.adapters.movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.data.util.DataFormatter
import com.example.domain.models.movie.Result
import com.example.magicbox.R
import kotlinx.android.synthetic.main.popular_movies_list_row.view.*

class PopularMoviesAdapter: RecyclerView.Adapter<PopularMoviesAdapter.ViewHolder>() {

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view)

    private val diffUtilsCallback = object : DiffUtil.ItemCallback<Result>(){
        override fun areItemsTheSame(
            oldItem: Result,
            newItem: Result
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: Result,
            newItem: Result
        ): Boolean {
            return oldItem == oldItem
        }

    }

    val diffUtil = AsyncListDiffer(this, diffUtilsCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.popular_movies_list_row, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val result = diffUtil.currentList[position]

        holder.itemView.apply {
            val imageUrl = DataFormatter.loadImage(result.poster_path.toString())
            Glide.with(this).load(imageUrl).error(R.mipmap.ic_launcher).into(img_popular_movies_image)
            txt_popular_movies_title.text = result.title
        }
    }

    override fun getItemCount(): Int {
        return diffUtil.currentList.size
    }
}