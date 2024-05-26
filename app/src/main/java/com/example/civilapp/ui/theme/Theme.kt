// Theme.kt
package com.example.civilapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.example.civilengineeringapp.ui.theme.AppTypography

private val DarkColorPalette = darkColorScheme(
    primary = Blue,
    secondary = Orange,
    background = White,
    surface = White,
    onPrimary = White,
    onSecondary = White,
    onBackground = Blue,
    onSurface = Blue
)

private val LightColorPalette = lightColorScheme(
    primary = Blue,
    secondary = Orange,
    background = White,
    surface = White,
    onPrimary = White,
    onSecondary = White,
    onBackground = Blue,
    onSurface = Blue
)

@Composable
fun CivilAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colorScheme = colors,
        typography = AppTypography,
        shapes = Shapes,
        content = content
    )
}
