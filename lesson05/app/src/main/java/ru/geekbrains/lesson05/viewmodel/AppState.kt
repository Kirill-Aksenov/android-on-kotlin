package ru.geekbrains.lesson05.viewmodel

import ru.geekbrains.lesson05.model.Weather

sealed class AppState {
    data class Success(val weatherData: List<Weather>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
