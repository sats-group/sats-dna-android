package com.sats.dna.components.snackbar

import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarVisuals
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.clearAndSetSemantics
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.theme.SatsTheme

class SatsSnackbarVisuals internal constructor(
    val leadingIcon: @Composable () -> Unit,
    val title: String?,
    override val message: String,
    val action: SatsSnackbarAction?,
    val dismissAction: SatsSnackbarAction?,
    override val duration: SnackbarDuration,
    val backgroundColor: Color,
    val contentColor: Color,
    val titleColor: Color,
) : SnackbarVisuals {

    override val actionLabel: String? = action?.label
    override val withDismissAction: Boolean = dismissAction != null
}

enum class SatsSnackbarTheme {
    Info,
    Success,
}

class SatsSnackbarAction(val action: () -> Unit, val label: String)

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
     * **/
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
            leadingIcon = { theme.LeadingIcon() },
            title = title,
            backgroundColor = theme.getBackgroundColor(),
            contentColor = theme.getForegroundColorForTheme(),
            titleColor = theme.getTitleColorForTheme(),
        )

    @Composable
    private fun SatsSnackbarTheme.getBackgroundColor(): Color = when (this) {
        SatsSnackbarTheme.Info -> SatsTheme.colors2.surfaces.primary.bg.default
        SatsSnackbarTheme.Success -> SatsTheme.colors2.signalSurfaces.success.bg
    }

    @Composable
    private fun SatsSnackbarTheme.getForegroundColorForTheme(): Color = when (this) {
        SatsSnackbarTheme.Info -> SatsTheme.colors2.surfaces.primary.fg.default
        SatsSnackbarTheme.Success -> SatsTheme.colors2.signalSurfaces.success.fg.default
    }

    @Composable
    private fun SatsSnackbarTheme.getTitleColorForTheme(): Color = when (this) {
        SatsSnackbarTheme.Info -> SatsTheme.colors2.surfaces.primary.fg.alternate
        SatsSnackbarTheme.Success -> SatsTheme.colors2.signalSurfaces.success.fg.alternate
    }

    @Composable
    private fun SatsSnackbarTheme.LeadingIcon() = when (this) {
        SatsSnackbarTheme.Info -> {
            MaterialIcon(SatsTheme.icons.info, contentDescription = null)
        }

        SatsSnackbarTheme.Success -> {
            Text(
                text = "\uD83C\uDF89",
                modifier = Modifier.clearAndSetSemantics {},
            )
        }
    }
}
