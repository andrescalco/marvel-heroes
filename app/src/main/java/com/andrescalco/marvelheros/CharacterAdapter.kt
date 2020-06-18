package com.andrescalco.marvelheros

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.andrescalco.marvelheros.databinding.CharacterCardViewBinding

// ViewHolder
class CustomViewHolder(val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root)

class CharacterAdapter : ListAdapter<Character, CustomViewHolder>(Companion) {
    companion object : DiffUtil.ItemCallback<Character>() {
        override fun areItemsTheSame(oldItem: Character, newItem: Character): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Character, newItem: Character): Boolean {
            return oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CharacterCardViewBinding.inflate(inflater, parent, false)

        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val currentCharacter = getItem(position)
        val itemBinding = holder.binding as CharacterCardViewBinding
        itemBinding.character = currentCharacter
        itemBinding.characterImage.clipToOutline = true
        itemBinding.executePendingBindings()
    }
}