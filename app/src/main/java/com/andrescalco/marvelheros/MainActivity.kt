package com.andrescalco.marvelheros

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getHeroesData()

    }

    private fun getHeroesData() {

        val call = RestClient.instance.getAll()

        call.enqueue(object : Callback<List<Characters>> {
            override fun onFailure(call: Call<List<Characters>>, t: Throwable) {
                Toast.makeText(this@MainActivity, "${t.message}", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(
                call: Call<List<Characters>>,
                response: Response<List<Characters>>
            ) {
                if (response.isSuccessful) {

                    val charactersAdapter = CharactersAdapter().apply {
                        submitList(response.body())
                    }
                    characterList.adapter = charactersAdapter

                }
            }
        })
    }
}