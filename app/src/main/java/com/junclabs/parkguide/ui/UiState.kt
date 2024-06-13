package com.junclabs.parkguide.ui

import androidx.compose.runtime.Immutable
import com.junclabs.parkguide.data.DataSource
import com.junclabs.parkguide.data.Park
import com.junclabs.parkguide.data.State

@Immutable
data class UiState(
    val states: List<State> = DataSource.states,
    val currentState: State? = null,
    val currentPark: Park? = null
)
