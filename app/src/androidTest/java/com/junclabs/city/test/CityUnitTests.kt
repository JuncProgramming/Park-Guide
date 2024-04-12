package com.junclabs.city.test

import android.content.Context
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.platform.app.InstrumentationRegistry
import com.junclabs.city.data.Category
import com.junclabs.city.data.Place
import com.junclabs.city.ui.PlaceScreen
import com.junclabs.city.ui.UiState
import com.junclabs.city.ui.theme.CityTheme
import org.junit.Rule
import org.junit.Test

class CityUnitTests {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun placeScreenContentAppearsCorrectly() {
        val context: Context = InstrumentationRegistry.getInstrumentation().targetContext
        val string2 = context.resources.getString(androidx.compose.ui.R.string.close_drawer)
        val places = listOf(
            Place(
                androidx.compose.ui.R.string.close_drawer,
                androidx.compose.ui.R.string.close_drawer,
                androidx.core.R.drawable.ic_call_answer
            )
        )
        val categories = listOf(
            Category(androidx.compose.ui.R.string.close_drawer, places = places)
        )

        composeTestRule.setContent {
            CityTheme {
                PlaceScreen(
                    onNavigateBack = {},
                    uiState = UiState(
                        categories = categories,
                        currentPlace = Place(
                            title = androidx.compose.ui.R.string.close_sheet,
                            description = androidx.compose.ui.R.string.close_drawer,
                            image = androidx.core.R.drawable.ic_call_answer
                        )
                    )
                )
            }
        }
        composeTestRule.onNodeWithText(string2).assertExists()
    }
}