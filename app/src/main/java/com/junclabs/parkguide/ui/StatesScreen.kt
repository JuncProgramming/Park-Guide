package com.junclabs.parkguide.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.junclabs.parkguide.R
import com.junclabs.parkguide.data.State
import com.junclabs.parkguide.util.AppBar

@Composable
fun StatesScreen(
    modifier: Modifier = Modifier,
    onStateClick: (State) -> Unit,
    viewModel: ParkGuideViewModel,
    uiState: UiState,
) {
    Scaffold(topBar = {
        AppBar(
            title = stringResource(id = R.string.app_name),
            onNavigationIconClick = { },
            navigateBack = false
        )
    }) { innerPadding ->
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 150.dp),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = modifier.padding(innerPadding),
        ) {
            items(uiState.states) { state ->
                StateListItem(state = state,
                    onClick = { onStateClick(state); viewModel.updateCurrentState(it) })
            }

        }
    }

}