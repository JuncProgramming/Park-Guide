package com.junclabs.parkguide.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.junclabs.parkguide.R
import com.junclabs.parkguide.data.Park
import com.junclabs.parkguide.ui.theme.ParkGuideTheme
import com.junclabs.parkguide.util.AppBar
import com.junclabs.parkguide.util.UiEvent
import kotlinx.coroutines.flow.collectLatest

@Composable
fun DetailParkScreen(
    modifier: Modifier = Modifier,
    onNavigateUp: (UiEvent.NavigateUp) -> Unit,
    viewModel: ParkGuideViewModel,
    uiState: UiState,
) {
    LaunchedEffect(Unit) {
        viewModel.uiEvent.collectLatest { event ->
            when (event) {
                is UiEvent.NavigateUp -> {
                    onNavigateUp(event)
                }

                else -> Unit
            }
        }
    }
    val scrollState = rememberScrollState()
    Scaffold(topBar = {
        AppBar(
            title = stringResource(id = R.string.learnMore),
            onNavigationIconClick = { viewModel.onEvent(ParkEvent.OnNavigateUp) },
            navigateBack = true
        )
    }) { innerPadding ->
        Card(
            colors = if (!isSystemInDarkTheme()) {
                CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant
                )
            } else {
                CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            }, modifier = modifier.fillMaxSize()
        ) {
            Column(
                modifier = modifier
                    .verticalScroll(scrollState)
                    .padding(20.dp)
                    .padding(innerPadding),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(
                    space = 20.dp, alignment = Alignment.CenterVertically
                )
            ) {
                Text(text = uiState.currentPark?.let { stringResource(id = it.title) }
                    ?: stringResource(
                        id = R.string.defaultParkTitle
                    ),
                    style = MaterialTheme.typography.titleMedium,
                    modifier = modifier.padding(horizontal = 6.dp))
                uiState.currentPark?.image?.let { painterResource(id = it) }?.let {
                    Image(
                        painter = it,
                        contentDescription = stringResource(id = R.string.parkContentDescription),
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .clip(MaterialTheme.shapes.medium)
                            .fillMaxWidth()
                    )
                }
                Text(text = uiState.currentPark?.let { stringResource(id = it.description) }
                    ?: stringResource(
                        id = R.string.defaultParkDescription
                    ),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = modifier.padding(horizontal = 6.dp))
            }
        }
    }
}

@Composable
@PreviewLightDark
fun DetailParkScreenPreview() {
    val viewModel: ParkGuideViewModel = viewModel()
    ParkGuideTheme {
        DetailParkScreen(
            onNavigateUp = { }, viewModel = viewModel, uiState = UiState(
                currentPark = Park(
                    title = R.string.Arches_National_Park,
                    description = R.string.Arches_National_Park_Description,
                    image = R.drawable.archesnationalpark
                ),
            )
        )
    }
}