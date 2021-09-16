package ru.geekbrains.lesson02.viewmodel

import ru.geekbrains.lesson02.model.Weather

sealed class AppState {
    data class Success(val weatherData: Weather) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
