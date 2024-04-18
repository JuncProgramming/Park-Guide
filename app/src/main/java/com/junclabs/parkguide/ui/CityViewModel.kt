package com.junclabs.parkguide.ui

import androidx.lifecycle.ViewModel
import com.junclabs.parkguide.data.State
import com.junclabs.parkguide.data.DataSource
import com.junclabs.parkguide.data.Park
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
            states = DataSource.states
        )
    }

    fun updateCurrentState(state: State) {
        _uiState.update {
            it.copy(
                currentState = state
            )
        }
    }

    fun updateCurrentPark(park: Park?) {
        _uiState.update {
            it.copy(
                currentPark = park
            )
        }
    }
}