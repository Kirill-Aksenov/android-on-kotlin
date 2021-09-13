package ru.geekbrains.lesson04.viewmodel

import ru.geekbrains.lesson04.model.Weather

sealed class AppState {
    data class Success(val weatherData: List<Weather>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
