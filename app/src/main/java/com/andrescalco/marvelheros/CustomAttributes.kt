package com.andrescalco.marvelheros

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

@BindingAdapter("setCharacters")
fun RecyclerView.setCharacters(characters: List<Character>?) {
    characters?.let{
        val characterAdapter = CharacterAdapter()
        characterAdapter.submitList(characters)
        adapter = characterAdapter
    }
}

@BindingAdapter("setMovies")
fun RecyclerView.setMovies(movies: List<String>?) {
    movies?.let{
        val movieAdapter = MovieAdapter()
        movieAdapter.submitList(movies)
        adapter = movieAdapter
    }
}

@BindingAdapter("imageFromUrl")
fun bindImageFromUrl(view: ImageView, imageUrl: String?){
    if(!imageUrl.isNullOrEmpty()) {
        Glide.with(view.context)
            .load("https://marvel-heroes-api.vercel.app/$imageUrl")
            .into(view)
    }
}

@BindingAdapter("breakCharacterName")
fun bindBreakCharacterName(view: TextView, characterName: String?){
    if(!characterName.isNullOrEmpty()) {
        view.text = characterName.replace(" ", "\n")
    }
}
