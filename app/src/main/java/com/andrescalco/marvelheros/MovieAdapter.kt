package com.andrescalco.marvelheros

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.andrescalco.marvelheros.databinding.ItemMovieViewBinding

class MovieAdapter : ListAdapter<Movie, CustomViewHolder>(Companion) {
    companion object : DiffUtil.ItemCallback<Movie>() {
        override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemMovieViewBinding.inflate(inflater, parent, false)

        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val currentMovie =  getItem(position)
        val itemBinding = holder.binding as ItemMovieViewBinding
        itemBinding.apply {
            movie = currentMovie
            movieImage.clipToOutline = true
            executePendingBindings()
        }
    }
}
