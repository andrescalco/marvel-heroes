package com.andrescalco.marvelheros

fun getData(): ArrayList<Characters> {
    val charactersCategoryList = arrayListOf<String>()
    val characters = arrayListOf<Characters>()

    charactersCategoryList.add("Heróis")
    charactersCategoryList.add("Vilões")
    charactersCategoryList.add("Anti-Heróis")
    charactersCategoryList.add("Aliens")
    charactersCategoryList.add("Humanos")

    for(a in charactersCategoryList){
        val characterList = arrayListOf<Character>()
        for(b in 1..5) {
            val character = Character("$b", "Homem \nAranha", "Peter Park", R.drawable.deadpool)
            characterList += character
        }
        characters += Characters("$a",a, characterList)
    }

    return characters;

}