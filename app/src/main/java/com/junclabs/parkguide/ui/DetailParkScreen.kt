package com.junclabs.parkguide.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.junclabs.parkguide.R
import com.junclabs.parkguide.data.Park
import com.junclabs.parkguide.ui.theme.ParkGuideTheme
import com.junclabs.parkguide.util.AppBar

@Composable
fun DetailParkScreen(
    modifier: Modifier = Modifier,
    onNavigateBack: () -> Unit,
    uiState: UiState,
) {
    val scrollState = rememberScrollState()
    Scaffold(topBar = {
        AppBar(
            title = stringResource(id = R.string.learnMore),
            onNavigationIconClick = onNavigateBack,
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
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.W700,
                    lineHeight = 28.sp,
                    modifier = modifier.padding(horizontal = 6.dp))
                uiState.currentPark?.image?.let { painterResource(id = it) }?.let {
                    Image(
                        painter = it,
                        contentDescription = stringResource(id = R.string.parkContentDescription),
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .fillMaxWidth()
                    )
                }
                Text(text = uiState.currentPark?.let { stringResource(id = it.description) }
                    ?: stringResource(
                        id = R.string.defaultParkDescription
                    ),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.W500,
                    lineHeight = 28.sp,
                    modifier = modifier.padding(horizontal = 6.dp))
            }
        }
    }
}

@Composable
@PreviewLightDark
@Preview
fun DetailParkScreenPreview() {
    ParkGuideTheme {
        DetailParkScreen(
            onNavigateBack = { }, uiState = UiState(
                currentPark = Park(
                    title = R.string.Arches_National_Park,
                    description = R.string.Arches_National_Park_Description,
                    image = R.drawable.archesnationalpark
                ),
            )
        )
    }
}