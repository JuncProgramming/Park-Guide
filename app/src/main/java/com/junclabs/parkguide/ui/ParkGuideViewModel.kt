package com.junclabs.parkguide.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.junclabs.parkguide.ParkEvent
import com.junclabs.parkguide.Screen
import com.junclabs.parkguide.data.DataSource
import com.junclabs.parkguide.util.UiEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ParkGuideViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState

    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    init {
        initializeUiState()
    }

    fun onEvent(event: ParkEvent) {
        when (event) {
            is ParkEvent.OnCurrentParkUpdate -> {
                _uiState.update {
                    it.copy(
                        currentPark = event.park
                    )
                }
                Log.d("ParkGuideViewModel", "OnCurrentParkUpdate: ${event.park}")
            }

            is ParkEvent.OnCurrentStateUpdate -> {
                _uiState.update {
                    it.copy(
                        currentState = event.state
                    )
                }
                Log.d("ParkGuideViewModel", "OnCurrentStateUpdate: ${event.state}")
            }

            is ParkEvent.OnCurrentParkClick -> {
                sendUiEvent(UiEvent.Navigate(Screen.DetailPark.name))
            }

            is ParkEvent.OnCurrentStateClick -> {
                sendUiEvent(UiEvent.Navigate(Screen.Parks.name))
            }

            is ParkEvent.OnNavigateBack -> {
                sendUiEvent(UiEvent.PopBackStack(event.route, event.inclusive))
            }
        }
    }

    private fun initializeUiState() {
        _uiState.value = UiState(
            states = DataSource.states
        )
    }

    private fun sendUiEvent(event: UiEvent) {
        viewModelScope.launch(Dispatchers.IO) {
            _uiEvent.send(event)
        }
    }
}