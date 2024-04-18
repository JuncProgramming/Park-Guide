package com.junclabs.parkguide.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Park(
    @StringRes val title: Int, @StringRes val description: Int, @DrawableRes val image: Int
)
