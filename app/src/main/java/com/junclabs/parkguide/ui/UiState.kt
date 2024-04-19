package com.junclabs.parkguide.ui

import com.junclabs.parkguide.data.DataSource
import com.junclabs.parkguide.data.Park
import com.junclabs.parkguide.data.State

data class UiState(
    val states: List<State> = DataSource.states,
    val currentState: State? = null,
    val currentPark: Park? = null
)
