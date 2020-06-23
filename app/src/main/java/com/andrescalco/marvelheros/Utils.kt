package com.andrescalco.marvelheros

fun getData(): ArrayList<Characters> {
    val charactersCategoryList = arrayOf("Heróis", "Vilões", "Anti-Heróis", "Aliens", "Humanos")
    val characters = arrayListOf<Characters>()

    for (a in charactersCategoryList) {
        val characterList = arrayListOf<Character>()
        for (b in 1..5) {
            val character = Character("$b", "Homem \nAranha", "Peter Park", R.drawable.deadpool)
            characterList += character
        }
        characters += Characters("$a", a, characterList)
    }

    return characters

}

fun getMovies(): ArrayList<Movie> {
    val movies = arrayListOf<Movie>()
    for (a in 1..5) {
        val movie = Movie("$a", R.drawable.hulk)
        movies += movie
    }
    return movies
}