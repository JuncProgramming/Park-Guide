package com.junclabs.parkguide.test

import android.content.Context
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.test.platform.app.InstrumentationRegistry
import com.junclabs.parkguide.R
import com.junclabs.parkguide.data.Park
import com.junclabs.parkguide.data.State
import com.junclabs.parkguide.ui.DetailParkScreen
import com.junclabs.parkguide.ui.ParkGuideViewModel
import com.junclabs.parkguide.ui.UiState
import com.junclabs.parkguide.ui.theme.ParkGuideTheme
import org.junit.Rule
import org.junit.Test

class ParkGuideUnitTests {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun detailParkScreenContentAppearsCorrectly() {
        val context: Context = InstrumentationRegistry.getInstrumentation().targetContext
        val olympicTitleString = context.resources.getString(R.string.Olympic_National_Park)
        val olympicDescriptionString =
            context.resources.getString(R.string.Olympic_National_Park_Description)
        val olympicImageContentDescriptionString =
            context.resources.getString(R.string.parkContentDescription)
        val parks = listOf(
            Park(
                title = R.string.Olympic_National_Park,
                description = R.string.Olympic_National_Park_Description,
                image = R.drawable.olympicnationalpark
            ), Park(
                title = R.string.Sequoia_National_Park,
                description = R.string.Sequoia_National_Park_Description,
                image = R.drawable.sequoianationalpark
            ), Park(
                title = R.string.Redwood_National_and_State_Parks,
                description = R.string.Redwood_National_and_State_Parks_Description,
                image = R.drawable.redwoodnationalandstateparks
            ), Park(
                title = R.string.Grand_Teton_National_Park,
                description = R.string.Grand_Teton_National_Park_Description,
                image = R.drawable.grandtetonnationalpark
            )
        )
        val states = listOf(
            State(
                title = R.string.Olympic_National_Park, places = parks, flag = R.drawable.washington
            )
        )
        composeTestRule.setContent {
            val viewModel: ParkGuideViewModel = viewModel()
            ParkGuideTheme {
                DetailParkScreen(
                    onNavigateUp = {}, viewModel = viewModel, uiState = UiState(
                        states = states, currentPark = Park(
                            title = R.string.Olympic_National_Park,
                            description = R.string.Olympic_National_Park_Description,
                            image = R.drawable.olympicnationalpark
                        )
                    )
                )
            }
        }
        composeTestRule.onNodeWithText(olympicTitleString).assertExists()
        composeTestRule.onNodeWithText(olympicDescriptionString).assertExists()
        composeTestRule.onNodeWithContentDescription(olympicImageContentDescriptionString)
            .assertExists()
    }
}