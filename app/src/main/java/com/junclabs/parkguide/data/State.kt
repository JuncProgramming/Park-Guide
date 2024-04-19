package com.junclabs.parkguide.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class State(@StringRes val title: Int, val places: List<Park>, @DrawableRes val flag: Int)
