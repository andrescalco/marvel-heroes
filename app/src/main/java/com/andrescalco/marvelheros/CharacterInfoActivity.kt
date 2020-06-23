package com.andrescalco.marvelheros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_character_info.*

class CharacterInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_info)

        val moviesAdapter = MovieAdapter().apply {
            submitList(getMovies())
        }
        moviesList.adapter = moviesAdapter
    }
}