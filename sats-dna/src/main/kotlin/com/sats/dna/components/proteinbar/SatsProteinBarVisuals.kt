package com.sats.dna.components.proteinbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.sats.dna.SatsIcons
import com.sats.dna.components.screen.ProteinBarDuration
import com.sats.dna.components.screen.ProteinBarVisuals
import com.sats.dna.icons.Error
import com.sats.dna.icons.Info
import com.sats.dna.icons.WarningSign
import com.sats.dna.theme.SatsTheme

sealed interface SatsProteinBarLeadingIcon {
    data object None : SatsProteinBarLeadingIcon
    data class Icon(val painter: ImageVector) : SatsProteinBarLeadingIcon
    data class Emoji(val text: String) : SatsProteinBarLeadingIcon
}

class SatsProteinBarVisuals internal constructor(
    val leadingIcon: SatsProteinBarLeadingIcon,
    val title: String?,
    override val message: String,
    val action: SatsProteinBarAction?,
    val dismissAction: SatsProteinBarAction?,
    override val duration: ProteinBarDuration,
    val colors: SatsProteinBarColors,
) : ProteinBarVisuals {
    override val actionLabel: String? = action?.label
    override val withDismissAction: Boolean = dismissAction != null
}

enum class SatsProteinBarTheme {
    Neutral,
    Info,
    Success,
    Warning,
    Error,
}

class SatsProteinBarAction(val action: () -> Unit, val label: String)

class SatsProteinBarColors internal constructor(
    val containerColor: Color,
    val contentColor: Color,
    val titleColor: Color,
)

object SatsProteinBarDefaults {
    /**
     * Creates [SatsProteinBarVisuals] for a [SatsProteinBar].
     *
     * @param message The message to be displayed in the protein bar.
     * @param action Optional action to be shown as a button in the protein bar.
     * @param title Optional title of the protein bar.
     * @param dismissAction Optional dismiss action, note that the label passed for this action
     * will become the content description for the dismiss icon.
     * @param duration How long the protein bar will be shown.
     * @param theme The protein bar theme, this will determine the protein bar colors and icon.
     */
    @Composable
    fun visuals(
        message: String,
        action: SatsProteinBarAction? = null,
        title: String? = null,
        dismissAction: SatsProteinBarAction? = null,
        duration: ProteinBarDuration = ProteinBarDuration.Short,
        theme: SatsProteinBarTheme = SatsProteinBarTheme.Info,
    ): SatsProteinBarVisuals =
        SatsProteinBarVisuals(
            action = action,
            duration = duration,
            message = message,
            dismissAction = dismissAction,
            leadingIcon = theme.leadingIcon(),
            title = title,
            colors = theme.proteinBarColors(),
        )

    @Composable
    private fun SatsProteinBarTheme.proteinBarColors(): SatsProteinBarColors = when (this) {
        SatsProteinBarTheme.Neutral -> SatsProteinBarColors(
            containerColor = SatsTheme.colors.surfaces.primary.default.bg,
            contentColor = SatsTheme.colors.surfaces.primary.default.fg,
            titleColor = SatsTheme.colors.surfaces.primary.default.fgAlternate,
        )

        SatsProteinBarTheme.Info -> SatsProteinBarColors(
            containerColor = SatsTheme.colors.signalSurfaces.information.default.bg,
            contentColor = SatsTheme.colors.signalSurfaces.information.default.fg,
            titleColor = SatsTheme.colors.signalSurfaces.information.alternate.fg,
        )

        SatsProteinBarTheme.Success -> SatsProteinBarColors(
            containerColor = SatsTheme.colors.signalSurfaces.success.default.bg,
            contentColor = SatsTheme.colors.signalSurfaces.success.default.fg,
            titleColor = SatsTheme.colors.signalSurfaces.success.alternate.fg,
        )

        SatsProteinBarTheme.Warning -> SatsProteinBarColors(
            containerColor = SatsTheme.colors.signalSurfaces.warning.default.bg,
            contentColor = SatsTheme.colors.signalSurfaces.warning.default.fg,
            titleColor = SatsTheme.colors.signalSurfaces.warning.alternate.fg,
        )

        SatsProteinBarTheme.Error -> SatsProteinBarColors(
            containerColor = SatsTheme.colors.signalSurfaces.error.default.bg,
            contentColor = SatsTheme.colors.signalSurfaces.error.default.fg,
            titleColor = SatsTheme.colors.signalSurfaces.error.alternate.fg,
        )
    }

    @Composable
    private fun SatsProteinBarTheme.leadingIcon(): SatsProteinBarLeadingIcon = when (this) {
        SatsProteinBarTheme.Neutral -> SatsProteinBarLeadingIcon.None
        SatsProteinBarTheme.Info -> SatsProteinBarLeadingIcon.Icon(SatsIcons.Info)
        SatsProteinBarTheme.Success -> SatsProteinBarLeadingIcon.Emoji("🎉")
        SatsProteinBarTheme.Warning -> SatsProteinBarLeadingIcon.Icon(SatsIcons.WarningSign)
        SatsProteinBarTheme.Error -> SatsProteinBarLeadingIcon.Icon(SatsIcons.Error)
    }
}
