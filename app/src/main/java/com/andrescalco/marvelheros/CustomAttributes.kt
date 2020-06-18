package com.andrescalco.marvelheros

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter(value = ["setCharacters"])
fun RecyclerView.setCharacters(characters: List<Character>?) {
    if (characters != null) {
        val characterAdapter = CharacterAdapter()
        characterAdapter.submitList(characters)

        adapter = characterAdapter
    }
}