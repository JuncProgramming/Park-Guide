package com.junclabs.parkguide.util

sealed class UiEvent {
    data class Navigate(val route: String) : UiEvent()
    data class PopBackStack(
        val route: String, val inclusive: Boolean
    ) : UiEvent()
}