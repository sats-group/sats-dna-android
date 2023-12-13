package com.sats.dna.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import com.sats.dna.colors.SatsColors
import com.sats.dna.colors.SatsColors2
import com.sats.dna.colors.SatsDarkColors
import com.sats.dna.colors.SatsDarkColors2
import com.sats.dna.colors.SatsLightColors
import com.sats.dna.colors.SatsLightColors2
import com.sats.dna.icons.SatsIcons
import com.sats.dna.shapes.SatsShapes
import com.sats.dna.spacing.SatsSpacing
import com.sats.dna.typography.InterFont
import com.sats.dna.typography.SatsTypography
import androidx.compose.material.MaterialTheme as Material2Theme
import androidx.compose.material.ProvideTextStyle as ProvideMaterial2TextStyle
import androidx.compose.material.Typography as Material2Typography
import androidx.compose.material3.MaterialTheme as Material3Theme
import androidx.compose.material3.ProvideTextStyle as ProvideMaterial3TextStyle
import androidx.compose.material3.Typography as Material3Typography

@Composable
fun SatsTheme(content: @Composable () -> Unit) {
    val colors = if (isSystemInDarkTheme()) SatsDarkColors else SatsLightColors
    val colors2 = if (isSystemInDarkTheme()) SatsDarkColors2 else SatsLightColors2

    CompositionLocalProvider(
        LocalSatsColors provides colors,
        LocalSatsColors2 provides colors2,
    ) {
        Material2Theme(
            colors = LocalSatsColors.current.toMaterial2(),
            typography = LocalSatsTypography.current.toMaterial2(),
        ) {
            ProvideMaterial2TextStyle(SatsTheme.typography.normal.basic) {
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
    }
}

object SatsTheme {
    val colors: SatsColors
        @Composable get() = LocalSatsColors.current

    val colors2: SatsColors2
        @Composable get() = LocalSatsColors2.current

    val typography: SatsTypography
        @Composable get() = LocalSatsTypography.current

    val spacing: SatsSpacing
        @Composable get() = LocalSatsSpacing.current

    val shapes: SatsShapes
        @Composable get() = LocalSatsShapes.current

    val icons: SatsIcons
        @Composable get() = LocalSatsIcons.current
}

internal val LocalSatsColors = staticCompositionLocalOf { SatsLightColors }
internal val LocalSatsColors2 = staticCompositionLocalOf { SatsLightColors2 }
internal val LocalSatsTypography = staticCompositionLocalOf { SatsTypography }
internal val LocalSatsSpacing = staticCompositionLocalOf { SatsSpacing }
internal val LocalSatsShapes = staticCompositionLocalOf { SatsShapes }
internal val LocalSatsIcons = staticCompositionLocalOf { SatsIcons }

private fun SatsColors.toMaterial2() = Colors(
    background = background.primary,
    onBackground = onBackground.primary,
    surface = surface.primary,
    onSurface = onSurface.primary,
    primary = primary.default,
    primaryVariant = primary.default,
    onPrimary = onPrimary.default,
    secondary = secondary.default,
    secondaryVariant = clean.default,
    onSecondary = onSecondary.default,
    error = signal.error,
    onError = onSignal,
    isLight = isLightMode,
)

private fun SatsTypography.toMaterial2() = Material2Typography(
    h1 = normal.headline1,
    h2 = normal.headline2,
    h3 = normal.headline3,
    body1 = normal.basic,
    body2 = normal.small,
    button = normal.button,
    caption = normal.small,
    overline = normal.small,
    subtitle1 = normal.large,
    subtitle2 = normal.basic,
    defaultFontFamily = InterFont,
)

private fun SatsColors.toMaterial3() = if (isLightMode) {
    lightColorScheme(
        primary = primary.default,
        onPrimary = onPrimary.default,
        secondary = secondary.default,
        onSecondary = onSecondary.default,
        tertiary = secondary.default,
        onTertiary = onSecondary.default,
        background = background.primary,
        onBackground = onBackground.primary,
        surface = surface.primary,
        onSurface = onSurface.primary,
        surfaceTint = primary.default,
        error = signal.error,
        onError = onSignal,
        errorContainer = signalBackground.error,
        onErrorContainer = onBackground.primary,
        outline = ui.border,
    )
} else {
    darkColorScheme(
        primary = primary.default,
        onPrimary = onPrimary.default,
        secondary = secondary.default,
        onSecondary = onSecondary.default,
        tertiary = secondary.default,
        onTertiary = onSecondary.default,
        background = background.primary,
        onBackground = onBackground.primary,
        surface = surface.primary,
        onSurface = onSurface.primary,
        surfaceTint = primary.default,
        error = signal.error,
        onError = onSignal,
        errorContainer = signalBackground.error,
        onErrorContainer = onBackground.primary,
        outline = ui.border,
    )
}

private fun SatsTypography.toMaterial3() = Material3Typography(
    displayLarge = normal.headline1,
    displayMedium = normal.headline1,
    displaySmall = normal.headline1,
    headlineLarge = normal.headline2,
    headlineMedium = normal.headline2,
    headlineSmall = normal.headline2,
    titleLarge = normal.headline3,
    titleMedium = normal.headline3,
    titleSmall = normal.headline3,
    bodyLarge = normal.large,
    bodyMedium = normal.basic,
    bodySmall = normal.small,
    labelLarge = normal.section,
    labelMedium = normal.section,
    labelSmall = normal.section,
)
