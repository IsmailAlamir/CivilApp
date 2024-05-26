// Type.kt
package com.example.civilengineeringapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.civilapp.R

val SchibstedGrotesk = FontFamily(
    Font(R.font.schibstedgrotesk_regular, FontWeight.Normal),
    Font(R.font.schibstedgrotesk_medium, FontWeight.Medium),
    Font(R.font.schibstedgrotesk_bold, FontWeight.Bold)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = SchibstedGrotesk,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = SchibstedGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),
    labelLarge = TextStyle(
        fontFamily = SchibstedGrotesk,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    )
)
