package com.AndroidArena.nyaa.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)
    val frame1 = Typography(
        body1 = TextStyle(
            color = primaryColor,
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            fontSize = 30.sp
        ),
        button = TextStyle(
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Medium,
            fontSize=24.sp,
            textAlign = TextAlign.Center
        ),
        body2 = TextStyle(
        fontFamily = robotoFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        textAlign = TextAlign.Center
        ),
        h1 =TextStyle(
            fontFamily = robotoFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 55.sp,
            textAlign = TextAlign.Center
        ),
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)