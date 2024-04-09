package com.junclabs.city.ui

import com.junclabs.city.data.Category
import com.junclabs.city.data.DataSource
import com.junclabs.city.data.Place

data class UiState(
    val categories: List<Category> = DataSource.categories,
    val currentCategory: Category? = null,
    val currentPlace: Place? = null
)
