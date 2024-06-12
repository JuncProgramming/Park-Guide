package com.junclabs.parkguide.ui

import com.junclabs.parkguide.data.Park
import com.junclabs.parkguide.data.State

sealed interface ParkEvent {
    data class OnCurrentStateUpdate(val state: State) : ParkEvent
    data class OnCurrentParkUpdate(val park: Park) : ParkEvent
    data object OnCurrentStateClick : ParkEvent
    data object OnCurrentParkClick : ParkEvent
    data object OnNavigateUp : ParkEvent
}