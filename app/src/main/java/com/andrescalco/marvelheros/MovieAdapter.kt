package com.andrescalco.marvelheros

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.andrescalco.marvelheros.databinding.ItemMovieViewBinding

class MovieAdapter : ListAdapter<String, CustomViewHolder>(Companion) {
    companion object : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
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
