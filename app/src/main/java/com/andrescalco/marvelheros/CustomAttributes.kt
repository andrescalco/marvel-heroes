package com.andrescalco.marvelheros

import android.widget.ImageView
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

@BindingAdapter("imageFromUrl")
fun bindImageFromUrl(view: ImageView, imageUrl: String?){
    if(!imageUrl.isNullOrEmpty()) {
        Glide.with(view.context)
            .load(imageUrl)
            .into(view)
    }
}
