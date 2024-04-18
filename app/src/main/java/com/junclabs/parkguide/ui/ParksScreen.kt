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
import com.junclabs.parkguide.data.Park
import com.junclabs.parkguide.util.AppBar

@Composable
fun ParksScreen(
    modifier: Modifier = Modifier,
    onPlaceClick: (Park) -> Unit,
    onNavigateBack: () -> Unit,
    viewModel: CityViewModel,
    uiState: UiState
) {
    Scaffold(topBar = {
        uiState.currentState?.title?.let { stringResource(id = it) }?.let {
            AppBar(
                title = it, onNavigationIconClick = onNavigateBack, navigateBack = true
            )
        }
    }) { innerPadding ->

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
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

