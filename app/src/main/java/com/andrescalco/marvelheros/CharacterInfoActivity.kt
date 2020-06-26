package com.andrescalco.marvelheros

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.andrescalco.marvelheros.databinding.ActivityCharacterInfoBinding
import com.andrescalco.marvelheros.Character

class CharacterInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityCharacterInfoBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_character_info)

        binding.character = intent.getParcelableExtra("character")

    }
}