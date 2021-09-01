package ru.geekbraines.lesson02.model

data class Weather(
    val city: City = getDefaultCity(),
    val temperature: Int = 0,
    val feelsLike: Int = 0
)

fun getDefaultCity() = City(cityName = "Russia, Bryansk", lat = 53.2520900, lon = 34.3716700)