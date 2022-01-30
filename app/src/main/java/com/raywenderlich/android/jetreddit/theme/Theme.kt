package com.raywenderlich.android.jetreddit.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

private val DarkThemeColors = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightThemeColors = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)


@Composable
fun JetRedditTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (JetRedditThemeSettings.isInDarkTheme.value) DarkThemeColors else LightThemeColors,
        content = content
    )
}


object JetRedditThemeSettings {
    var isInDarkTheme: MutableState<Boolean> = mutableStateOf(false)
}