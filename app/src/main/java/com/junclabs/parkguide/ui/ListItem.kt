package com.junclabs.parkguide.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.junclabs.parkguide.R
import com.junclabs.parkguide.data.Park
import com.junclabs.parkguide.data.State
import com.junclabs.parkguide.ui.theme.ParkGuideTheme

@Composable
fun StateListItem(
    state: State, onClick: (State) -> Unit, modifier: Modifier = Modifier
) {
    Card {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier.clickable { onClick(state) }) {
            Image(
                painter = painterResource(id = state.flag),
                contentDescription = stringResource(id = R.string.stateFlagContentDescription),
                modifier = modifier
                    .fillMaxWidth()
                    .aspectRatio(1.5f),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(id = state.title),
                style = MaterialTheme.typography.labelSmall,
                modifier = modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun ParkListItem(
    park: Park, onClick: (Park) -> Unit, modifier: Modifier = Modifier
) {
    Card(
        modifier
            .fillMaxWidth()
            .aspectRatio(1.5f)
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
                .clickable { onClick(park) },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(id = park.title),
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.W600,
                textAlign = TextAlign.Center,
                modifier = modifier.padding(8.dp)
            )
        }
    }
}

@Composable
@PreviewLightDark
fun StateListItemPreview() {
    ParkGuideTheme {
        StateListItem(
            state = State(
                title = R.string.New_River_Gorge_National_Park_and_Preserve,
                flag = R.drawable.northdakota,
                places = emptyList()
            ),
            onClick = { },
        )
    }
}

@Composable
@PreviewLightDark
fun ParkListItemPreview() {
    ParkGuideTheme {
        ParkListItem(
            park = Park(
                title = R.string.Olympic_National_Park,
                description = R.string.Olympic_National_Park_Description,
                image = R.drawable.olympicnationalpark
            ),
            onClick = { },
        )
    }
}

