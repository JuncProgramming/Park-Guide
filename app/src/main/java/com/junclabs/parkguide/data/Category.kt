package com.junclabs.parkguide.data

import androidx.annotation.StringRes

data class Category(@StringRes val title: Int, val places: List<Place>)
