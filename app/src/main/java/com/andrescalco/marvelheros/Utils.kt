package com.andrescalco.marvelheros

import android.content.res.Resources

//fun getData(): ArrayList<Characters> {
//    val charactersCategoryList = arrayOf("Heróis", "Vilões", "Anti-Heróis", "Aliens", "Humanos")
//    val characters = arrayListOf<Characters>()
//
//    for (a in charactersCategoryList) {
//        val characterList = arrayListOf<Character>()
//        for (b in 1..5) {
//            val character = Character("$b", "Homem \nAranha", "Peter Park", R.drawable.deadpool)
//            characterList += character
//        }
//        characters += Characters("$a", a, characterList)
//    }
//
//    return characters
//
//}

fun getMovies(): ArrayList<String> {
    val movies = arrayListOf<String>()
    for (a in 1..5) {
        movies += "assets/images/captain-america-3.jpg"
    }
    return movies
}

val Int.dp: Int
    get() = (this / Resources.getSystem().displayMetrics.density).toInt()

val Int.px: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()