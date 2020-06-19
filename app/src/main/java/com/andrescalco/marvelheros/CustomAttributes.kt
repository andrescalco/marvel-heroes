package com.andrescalco.marvelheros

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("setCharacters")
fun RecyclerView.setCharacters(characters: List<Character>?) {
    characters?.let{
        val characterAdapter = CharacterAdapter()
        characterAdapter.submitList(characters)
        adapter = characterAdapter
    }
}