package com.junclabs.city.ui

import androidx.lifecycle.ViewModel
import com.junclabs.city.data.Category
import com.junclabs.city.data.DataSource
import com.junclabs.city.data.Place
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class CityViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState

    init {
        initializeUiState()
    }

    private fun initializeUiState() {
        _uiState.value = UiState(
            categories = DataSource.categories
        )
    }

    fun updateCurrentCategory(category: Category) {
        _uiState.update {
            it.copy(
                currentCategory = category
            )
        }
    }

    fun updateCurrentPlace(place: Place?) {
        _uiState.update {
            it.copy(
                currentPlace = place
            )
        }
    }
}