package com.andrescalco.marvelheros

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Character(
    val id: String,
    val title: String,
    val subtitle: String,
    val imageRes: Int
) : Parcelable

@Parcelize
data class Characters(
    val id: String,
    val title: String,
    val characters: List<Character>
) : Parcelable

@Parcelize
data class Movie(
    val id: String,
    val imageRes: Int
) : Parcelable

@Parcelize
data class Movies(
    val movies: List<Movie>
) : Parcelable