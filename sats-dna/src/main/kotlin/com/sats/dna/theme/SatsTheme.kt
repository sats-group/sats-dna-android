package com.sats.dna.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import com.sats.dna.colors.SatsColors
import com.sats.dna.colors.SatsDarkColors
import com.sats.dna.colors.SatsLightColors
import com.sats.dna.shapes.SatsShapes
import com.sats.dna.spacing.SatsSpacing
import com.sats.dna.typography.SatsTypography
import androidx.compose.material3.MaterialTheme as Material3Theme
import androidx.compose.material3.ProvideTextStyle as ProvideMaterial3TextStyle
import androidx.compose.material3.Typography as Material3Typography

@Composable
fun SatsTheme(content: @Composable () -> Unit) {
    val colors = if (isSystemInDarkTheme()) SatsDarkColors else SatsLightColors

    CompositionLocalProvider(LocalSatsColors provides colors) {
        Material3Theme(
            colorScheme = LocalSatsColors.current.toMaterial3(),
            typography = LocalSatsTypography.current.toMaterial3(),
        ) {
            ProvideMaterial3TextStyle(SatsTheme.typography.normal.basic) {
                content()
            }
        }
    }
}

object SatsTheme {
    val colors: SatsColors
        @Composable get() = LocalSatsColors.current

    val typography: SatsTypography
        @Composable get() = LocalSatsTypography.current

    val spacing: SatsSpacing
        @Composable get() = LocalSatsSpacing.current

    val shapes: SatsShapes
        @Composable get() = LocalSatsShapes.current
}

internal val LocalSatsColors = staticCompositionLocalOf { SatsLightColors }
internal val LocalSatsTypography = staticCompositionLocalOf { SatsTypography }
internal val LocalSatsSpacing = staticCompositionLocalOf { SatsSpacing }
internal val LocalSatsShapes = staticCompositionLocalOf { SatsShapes }

private fun SatsColors.toMaterial3() = if (isLightMode) lightColorScheme() else darkColorScheme()

private fun SatsTypography.toMaterial3() = Material3Typography()
