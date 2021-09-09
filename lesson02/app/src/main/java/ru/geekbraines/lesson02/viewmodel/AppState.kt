package ru.geekbraines.lesson02.viewmodel

import ru.geekbraines.lesson02.model.Weather

sealed class AppState {
    data class Success(val weatherData: Weather) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}