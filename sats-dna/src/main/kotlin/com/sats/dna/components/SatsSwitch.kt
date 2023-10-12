package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsSwitch(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    val checkIcon = @Composable {
        Icon(SatsTheme.icons.check, contentDescription = null, Modifier.padding(SatsTheme.spacing.xxs))
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
        checkedThumbColor = SatsTheme.colors.background.primary,
        checkedTrackColor = SatsTheme.colors.onBackground.controls.enabledOn,
        checkedBorderColor = Color.Transparent,
        checkedIconColor = SatsTheme.colors.onBackground.controls.enabledOn,
        uncheckedThumbColor = SatsTheme.colors.background.primary,
        uncheckedTrackColor = SatsTheme.colors.onBackground.controls.enabledOff,
        uncheckedBorderColor = Color.Transparent,
        uncheckedIconColor = SatsTheme.colors.onBackground.controls.enabledOff,
        disabledCheckedThumbColor = SatsTheme.colors.background.primary,
        disabledCheckedTrackColor = SatsTheme.colors.onBackground.controls.disabledOn,
        disabledCheckedBorderColor = Color.Transparent,
        disabledCheckedIconColor = SatsTheme.colors.onBackground.controls.disabledOn,
        disabledUncheckedThumbColor = SatsTheme.colors.background.primary,
        disabledUncheckedTrackColor = SatsTheme.colors.onBackground.controls.disabledOff,
        disabledUncheckedBorderColor = Color.Transparent,
        disabledUncheckedIconColor = SatsTheme.colors.onBackground.controls.disabledOff,
    )

@LightDarkPreview
@Composable
private fun EnabledSelectedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsSwitch(checked = true, onCheckedChange = {}, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@LightDarkPreview
@Composable
private fun EnabledUnselectedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsSwitch(checked = false, onCheckedChange = {}, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledSelectedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsSwitch(checked = true, onCheckedChange = {}, Modifier.padding(SatsTheme.spacing.m), enabled = false)
        }
    }
}

@LightDarkPreview
@Composable
private fun DisabledUnselectedPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsSwitch(checked = false, onCheckedChange = {}, Modifier.padding(SatsTheme.spacing.m), enabled = false)
        }
    }
}
