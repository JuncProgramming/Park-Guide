package com.junclabs.parkguide.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.runtime.Immutable

@Immutable
data class State(@StringRes val title: Int, val places: List<Park>, @DrawableRes val flag: Int)
