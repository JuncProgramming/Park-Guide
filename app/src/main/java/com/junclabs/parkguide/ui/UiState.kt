package com.junclabs.parkguide.ui

import com.junclabs.parkguide.data.Category
import com.junclabs.parkguide.data.DataSource
import com.junclabs.parkguide.data.Place

data class UiState(
    val categories: List<Category> = DataSource.categories,
    val currentCategory: Category? = null,
    val currentPlace: Place? = null
)
