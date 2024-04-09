package com.junclabs.city.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.junclabs.city.util.AppBar

@Composable
fun PlaceScreen(
    modifier: Modifier = Modifier,
    onNavigateBack: () -> Unit,
    uiState: UiState,
) {
    Scaffold(topBar = {
        uiState.currentPlace?.title?.let { stringResource(id = it) }?.let {
            AppBar(
                title = it, onNavigationIconClick = onNavigateBack, navigateBack = true
            )
        }
    }) { innerPadding ->

        Column(
            modifier = modifier
                .padding(12.dp)
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(
                space = 12.dp, alignment = Alignment.CenterVertically
            ),

            ) {
            uiState.currentPlace?.image?.let { painterResource(id = it) }?.let {
                Image(
                    painter = it,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f)
                )
            }
            Text(text = stringResource(id = uiState.currentPlace!!.description), fontSize = 24.sp)
        }
    }
}