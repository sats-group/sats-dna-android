package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.SatsIcons
import com.sats.dna.icons.Check
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsSwitch(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    val checkIcon = @Composable {
        Icon(SatsIcons.Check, contentDescription = null, Modifier.padding(SatsTheme.spacing.xxs))
    }

    Switch(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
        colors = colors,
        thumbContent = checkIcon.takeIf { checked },
    )
}

private val colors
    @Composable get() = SwitchDefaults.colors(
        checkedThumbColor = SatsTheme.colors.graphicalElements.toggle.handle,
        checkedTrackColor = SatsTheme.colors.graphicalElements.toggle.selected.default,
        checkedBorderColor = Color.Transparent,
        checkedIconColor = SatsTheme.colors.graphicalElements.toggle.selected.default,
        uncheckedThumbColor = SatsTheme.colors.graphicalElements.toggle.handle,
        uncheckedTrackColor = SatsTheme.colors.graphicalElements.toggle.unselected.default,
        uncheckedBorderColor = Color.Transparent,
        uncheckedIconColor = SatsTheme.colors.graphicalElements.toggle.unselected.default,
        disabledCheckedThumbColor = SatsTheme.colors.graphicalElements.toggle.handle,
        disabledCheckedTrackColor = SatsTheme.colors.graphicalElements.toggle.selected.disabled,
        disabledCheckedBorderColor = Color.Transparent,
        disabledCheckedIconColor = SatsTheme.colors.graphicalElements.toggle.selected.disabled,
        disabledUncheckedThumbColor = SatsTheme.colors.graphicalElements.toggle.handle,
        disabledUncheckedTrackColor = SatsTheme.colors.graphicalElements.toggle.unselected.disabled,
        disabledUncheckedBorderColor = Color.Transparent,
        disabledUncheckedIconColor = SatsTheme.colors.graphicalElements.toggle.unselected.disabled,
    )

@PreviewLightDark
@Composable
private fun EnabledSelectedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsSwitch(checked = true, onCheckedChange = {}, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@PreviewLightDark
@Composable
private fun EnabledUnselectedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsSwitch(checked = false, onCheckedChange = {}, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@PreviewLightDark
@Composable
private fun DisabledSelectedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsSwitch(
                checked = true,
                onCheckedChange = {},
                Modifier.padding(SatsTheme.spacing.m),
                enabled = false,
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun DisabledUnselectedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsSwitch(
                checked = false,
                onCheckedChange = {},
                Modifier.padding(SatsTheme.spacing.m),
                enabled = false,
            )
        }
    }
}
