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
import com.junclabs.parkguide.data.Park
import com.junclabs.parkguide.util.AppBar

@Composable
fun ParksScreen(
    modifier: Modifier = Modifier,
    onPlaceClick: (Park) -> Unit,
    onNavigateBack: () -> Unit,
    viewModel: ParkGuideViewModel,
    uiState: UiState
) {
    Scaffold(topBar = {
        uiState.currentState?.title?.let { stringResource(id = it) }?.let {
            AppBar(
                title = if (it == stringResource(id = R.string.Virgin_Islands)) {
                    "$it' national parks"
                } else {
                    "$it's national parks"
                },
                onNavigationIconClick = onNavigateBack,
                navigateBack = true
            )
        }
    }) { innerPadding ->

        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 150.dp),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = modifier.padding(innerPadding)
        ) {
            uiState.currentState?.let {
                items(it.places) { park ->
                    ParkListItem(park = park,
                        onClick = { onPlaceClick(park); viewModel.updateCurrentPark(park) })
                }
            }

        }
    }
}

