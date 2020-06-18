package com.andrescalco.marvelheros

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.andrescalco.marvelheros.databinding.CharacterCategoryViewBinding

class CharactersAdapter : ListAdapter<Characters, CustomViewHolder>(Companion) {

    private val viewPool = RecyclerView.RecycledViewPool()

    companion object : DiffUtil.ItemCallback<Characters>() {
        override fun areItemsTheSame(oldItem: Characters, newItem: Characters): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Characters, newItem: Characters): Boolean {
            return oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CharacterCategoryViewBinding.inflate(inflater, parent, false)

        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val currentCharacterCategory = getItem(position)
        val itemBinding = holder.binding as CharacterCategoryViewBinding

        itemBinding.apply {
            characters = currentCharacterCategory
            characterList.isNestedScrollingEnabled = false
            characterList.setRecycledViewPool(viewPool)
            executePendingBindings()
        }
    }

}
