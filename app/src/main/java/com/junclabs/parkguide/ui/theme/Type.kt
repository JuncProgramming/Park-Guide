package com.junclabs.parkguide.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

val Typography = Typography(
    titleMedium = TextStyle(
        textAlign = TextAlign.Center,
        fontSize = 24.sp,
        fontWeight = FontWeight.W700,
        lineHeight = 28.sp,
    ),
    bodyMedium = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.W500,
        lineHeight = 28.sp,
    ),
    labelSmall = TextStyle(
        fontWeight = FontWeight.W600,
        textAlign = TextAlign.Center
    ),
)