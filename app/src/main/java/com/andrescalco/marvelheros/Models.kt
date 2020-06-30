package com.andrescalco.marvelheros

import android.graphics.drawable.Drawable
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Character(
    val id: String,
    val name: String,
    val alterEgo: String,
    val imagePath: String,
    val biography: String,
    val caracteristics: Caracteristics,
    val abilities: Abilities,
    val movies: List<String>
) : Parcelable

@Parcelize
data class Caracteristics(
    val birth: String,
    val weight: String,
    val height: String,
    val universe: String
) : Parcelable

@Parcelize
data class Abilities(
    val force: Int,
    val intelligence: Int,
    val agility: Int,
    val endurance: Int,
    val velocity: Int
) : Parcelable

@Parcelize
data class Characters(
    val id: String,
    val title: String,
    val characters: List<Character>
) : Parcelable

data class CaracteristicIcon(
    val name: String,
    val iconRes: Drawable
)