package com.sats.dna.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
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

@Composable
fun SatsTheme(content: @Composable () -> Unit) {
    val colors = if (isSystemInDarkTheme()) SatsDarkColors else SatsLightColors

    CompositionLocalProvider(
        LocalSatsColors provides colors,
        LocalSatsTypography provides SatsTypographyImpl,
    ) {
        MaterialTheme(
            colors = LocalSatsColors.current.toMaterial(),
            typography = LocalSatsTypography.current.toMaterial(),
            content = content,
        )
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

private fun SatsColors.toMaterial() = Colors(
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

private fun SatsTypography.toMaterial() = Typography(
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
