package com.sats.dna.components.snackbar

import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarVisuals
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import com.sats.dna.theme.SatsTheme

sealed interface SatsSnackbarLeadingIcon {
    class Icon(val painter: Painter) : SatsSnackbarLeadingIcon
    class Emoji(val text: String) : SatsSnackbarLeadingIcon
}

class SatsSnackbarVisuals internal constructor(
    val leadingIcon: SatsSnackbarLeadingIcon,
    val title: String?,
    override val message: String,
    val action: SatsSnackbarAction?,
    val dismissAction: SatsSnackbarAction?,
    override val duration: SnackbarDuration,
    val colors: SatsSnackbarColors,
) : SnackbarVisuals {
    override val actionLabel: String? = action?.label
    override val withDismissAction: Boolean = dismissAction != null
}

enum class SatsSnackbarTheme {
    Info,
    Success,
}

class SatsSnackbarAction(val action: () -> Unit, val label: String)

class SatsSnackbarColors internal constructor(
    val containerColor: Color,
    val contentColor: Color,
    val titleColor: Color,
)

object SatsSnackbarDefaults {
    /**
     * Creates snackbar visuals for a sats snackbar.
     *
     * @param message The message to be displayed in the snackbar.
     * @param action Optional action to be shown as a button in the snackbar.
     * @param title Optional title of the snackbar.
     * @param dismissAction Optional dismiss action, note that the label passed for this action
     * will become the content description for the dismiss icon.
     * @param duration How long the snackbar will be shown.
     * @param theme The snackbar theme, this will determine the snackbar colors and icon.
     */
    @Composable
    fun snackbarVisuals(
        message: String,
        action: SatsSnackbarAction? = null,
        title: String? = null,
        dismissAction: SatsSnackbarAction? = null,
        duration: SnackbarDuration = SnackbarDuration.Short,
        theme: SatsSnackbarTheme = SatsSnackbarTheme.Info,
    ): SatsSnackbarVisuals =
        SatsSnackbarVisuals(
            action = action,
            duration = duration,
            message = message,
            dismissAction = dismissAction,
            leadingIcon = theme.leadingIcon(),
            title = title,
            colors = theme.getSnackBarColors(),
        )

    @Composable
    fun SatsSnackbarTheme.getSnackBarColors(): SatsSnackbarColors = when (this) {
        SatsSnackbarTheme.Info -> SatsSnackbarColors(
            containerColor = SatsTheme.colors2.surfaces.primary.bg.default,
            contentColor = SatsTheme.colors2.surfaces.primary.fg.default,
            titleColor = SatsTheme.colors2.surfaces.primary.fg.alternate,
        )

        SatsSnackbarTheme.Success -> SatsSnackbarColors(
            containerColor = SatsTheme.colors2.signalSurfaces.success.bg,
            contentColor = SatsTheme.colors2.signalSurfaces.success.fg.default,
            titleColor = SatsTheme.colors2.signalSurfaces.success.fg.alternate,
        )
    }

    @Composable
    private fun SatsSnackbarTheme.leadingIcon(): SatsSnackbarLeadingIcon = when (this) {
        SatsSnackbarTheme.Info -> SatsSnackbarLeadingIcon.Icon(SatsTheme.icons.info)
        SatsSnackbarTheme.Success -> SatsSnackbarLeadingIcon.Emoji("🎉")
    }
}
