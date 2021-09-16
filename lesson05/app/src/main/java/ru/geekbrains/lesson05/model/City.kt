package ru.geekbrains.lesson05.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class City(
    val cityName: String,
    val lat: Double,
    val lon: Double
) : Parcelable