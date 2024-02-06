package com.sats.dna.components.proteinbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import com.sats.dna.theme.SatsTheme
import androidx.compose.material3.SnackbarDuration as M3SnackbarDuration
import androidx.compose.material3.SnackbarVisuals as M3SnackbarVisuals

sealed interface SatsProteinBarLeadingIcon {
    data object None : SatsProteinBarLeadingIcon
    data class Icon(val painter: Painter) : SatsProteinBarLeadingIcon
    data class Emoji(val text: String) : SatsProteinBarLeadingIcon
}

class SatsProteinBarVisuals internal constructor(
    val leadingIcon: SatsProteinBarLeadingIcon,
    val title: String?,
    override val message: String,
    val action: SatsProteinBarAction?,
    val dismissAction: SatsProteinBarAction?,
    override val duration: M3SnackbarDuration,
    val colors: SatsProteinBarColors,
) : M3SnackbarVisuals {
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
        duration: M3SnackbarDuration = M3SnackbarDuration.Short,
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
            containerColor = SatsTheme.colors2.surfaces.primary.bg.default,
            contentColor = SatsTheme.colors2.surfaces.primary.fg.default,
            titleColor = SatsTheme.colors2.surfaces.primary.fg.alternate,
        )

        SatsProteinBarTheme.Info -> SatsProteinBarColors(
            containerColor = SatsTheme.colors2.signalSurfaces.information.bg,
            contentColor = SatsTheme.colors2.signalSurfaces.information.fg.default,
            titleColor = SatsTheme.colors2.signalSurfaces.information.fg.alternate,
        )

        SatsProteinBarTheme.Success -> SatsProteinBarColors(
            containerColor = SatsTheme.colors2.signalSurfaces.success.bg,
            contentColor = SatsTheme.colors2.signalSurfaces.success.fg.default,
            titleColor = SatsTheme.colors2.signalSurfaces.success.fg.alternate,
        )

        SatsProteinBarTheme.Warning -> SatsProteinBarColors(
            containerColor = SatsTheme.colors2.signalSurfaces.warning.bg,
            contentColor = SatsTheme.colors2.signalSurfaces.warning.fg.default,
            titleColor = SatsTheme.colors2.signalSurfaces.warning.fg.alternate,
        )

        SatsProteinBarTheme.Error -> SatsProteinBarColors(
            containerColor = SatsTheme.colors2.signalSurfaces.error.bg,
            contentColor = SatsTheme.colors2.signalSurfaces.error.fg.default,
            titleColor = SatsTheme.colors2.signalSurfaces.error.fg.alternate,
        )
    }

    @Composable
    private fun SatsProteinBarTheme.leadingIcon(): SatsProteinBarLeadingIcon = when (this) {
        SatsProteinBarTheme.Neutral -> SatsProteinBarLeadingIcon.None
        SatsProteinBarTheme.Info -> SatsProteinBarLeadingIcon.Icon(SatsTheme.icons.info)
        SatsProteinBarTheme.Success -> SatsProteinBarLeadingIcon.Emoji("🎉")
        SatsProteinBarTheme.Warning -> SatsProteinBarLeadingIcon.Icon(SatsTheme.icons.warningSign)
        SatsProteinBarTheme.Error -> SatsProteinBarLeadingIcon.Icon(SatsTheme.icons.error)
    }
}
