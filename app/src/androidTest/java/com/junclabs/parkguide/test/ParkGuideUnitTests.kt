package com.junclabs.parkguide.test

import android.content.Context
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.test.platform.app.InstrumentationRegistry
import com.junclabs.parkguide.R
import com.junclabs.parkguide.data.Category
import com.junclabs.parkguide.data.Place
import com.junclabs.parkguide.ui.PlaceScreen
import com.junclabs.parkguide.ui.UiState
import com.junclabs.parkguide.ui.theme.CityTheme
import org.junit.Rule
import org.junit.Test

class ParkGuideUnitTests {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun placeScreenContentAppearsCorrectly() {
        val context: Context = InstrumentationRegistry.getInstrumentation().targetContext
        val zionTitleString = context.resources.getString(R.string.zion_national_park)
        val zionDescriptionString = context.resources.getString(R.string.zion_national_parkD)
        val zionImageContentDescriptionString =
            context.resources.getString(R.string.imageContentDescription)
        val places = listOf(
            Place(
                title = R.string.zion_national_park,
                description = R.string.zion_national_parkD,
                image = R.drawable.zion
            ), Place(
                title = R.string.sequoia_national_park,
                description = R.string.sequoia_national_parkD,
                image = R.drawable.sequoia
            ), Place(
                title = R.string.yosemite_national_park,
                description = R.string.yosemite_national_parkD,
                image = R.drawable.yosemite
            ), Place(
                title = R.string.grand_canyon_national_park,
                description = R.string.grand_canyon_national_parkD,
                image = R.drawable.grandcanyon
            )
        )
        val categories = listOf(
            Category(title = R.string.parks, places = places)
        )
        composeTestRule.setContent {
            CityTheme {
                PlaceScreen(
                    onNavigateBack = {}, uiState = UiState(
                        categories = categories, currentPlace = Place(
                            title = R.string.zion_national_park,
                            description = R.string.zion_national_parkD,
                            image = R.drawable.zion
                        )
                    )
                )
            }
        }
        composeTestRule.onNodeWithText(zionTitleString).assertExists()
        composeTestRule.onNodeWithText(zionDescriptionString).assertExists()
        composeTestRule.onNodeWithContentDescription(zionImageContentDescriptionString)
            .assertExists()
    }
}