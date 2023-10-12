package com.sats.dna.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import com.sats.dna.colors.SatsColors
import com.sats.dna.colors.SatsDarkColors
import com.sats.dna.colors.SatsLightColors
import com.sats.dna.icons.SatsIcons
import com.sats.dna.shapes.SatsShapes
import com.sats.dna.spacing.SatsSpacing
import com.sats.dna.typography.FontInter
import com.sats.dna.typography.SatsTypography
import com.sats.dna.typography.SatsTypographyImpl
import androidx.compose.material.MaterialTheme as Material2Theme
import androidx.compose.material.ProvideTextStyle as ProvideMaterial2TextStyle
import androidx.compose.material.Typography as Material2Typography
import androidx.compose.material3.MaterialTheme as Material3Theme
import androidx.compose.material3.ProvideTextStyle as ProvideMaterial3TextStyle
import androidx.compose.material3.Typography as Material3Typography

@Composable
fun SatsTheme(content: @Composable () -> Unit) {
    val colors = if (isSystemInDarkTheme()) SatsDarkColors else SatsLightColors

    CompositionLocalProvider(
        LocalSatsColors provides colors,
        LocalSatsTypography provides SatsTypographyImpl,
    ) {
        Material2Theme(
            colors = LocalSatsColors.current.toMaterial2(),
            typography = LocalSatsTypography.current.toMaterial2(),
        ) {
            ProvideMaterial2TextStyle(SatsTheme.typography.default.basic) {
                Material3Theme(
                    colorScheme = LocalSatsColors.current.toMaterial3(),
                    typography = LocalSatsTypography.current.toMaterial3(),
                ) {
                    ProvideMaterial3TextStyle(SatsTheme.typography.default.basic) {
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
internal val LocalSatsTypography = staticCompositionLocalOf { SatsTypographyImpl }
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
    h1 = default.heading1,
    h2 = default.heading2,
    h3 = default.heading3,
    body1 = default.basic,
    body2 = default.small,
    button = default.button,
    caption = default.small,
    overline = default.small,
    subtitle1 = default.large,
    subtitle2 = default.basic,
    defaultFontFamily = FontInter,
)

private fun SatsColors.toMaterial3(): ColorScheme = if (isLightMode) {
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
    displayLarge = default.heading1,
    displayMedium = default.heading1,
    displaySmall = default.heading1,
    headlineLarge = default.heading2,
    headlineMedium = default.heading2,
    headlineSmall = default.heading2,
    titleLarge = default.large,
    titleMedium = default.heading3,
    titleSmall = default.heading3,
    bodyLarge = default.large,
    bodyMedium = default.basic,
    bodySmall = default.small,
    labelLarge = default.section,
    labelMedium = default.section,
    labelSmall = default.section,
)
