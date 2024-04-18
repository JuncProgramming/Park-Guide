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
    onCategoryClick: (State) -> Unit,
    viewModel: CityViewModel,
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
            columns = GridCells.Fixed(3),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = modifier.padding(innerPadding),
        ) {
            items(uiState.states) { state ->
                StateListItem(state = state,
                    onClick = { onCategoryClick(state); viewModel.updateCurrentState(it) })
            }

        }
    }

}