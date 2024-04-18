package com.junclabs.parkguide.data

import androidx.annotation.StringRes

data class State(@StringRes val title: Int, val places: List<Park>)
