package com.sats.dna.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow.Companion.Ellipsis
import androidx.compose.ui.unit.dp
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsSnackbar(message: String, action: SatsSnackbarAction?, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = SatsTheme.shapes.roundedCorners.small,
        elevation = 6.dp,
        color = SatsTheme.colors.surface.primary,
        contentColor = SatsTheme.colors.onSurface.primary,
    ) {
        Row(Modifier.padding(SatsTheme.spacing.m), Arrangement.spacedBy(SatsTheme.spacing.s), CenterVertically) {
            Icon(SatsTheme.icons.info, contentDescription = null)

            Text(message, Modifier.weight(1f), maxLines = 3, overflow = Ellipsis)

            if (action != null) {
                SatsButton(action.action, action.label, colors = SatsButtonColor.Transparent)
            }
        }
    }
}

class SatsSnackbarAction(val action: () -> Unit, val label: String)

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        Surface {
            val message = "Something went wrong. You should probably try that one more time."
            val action = SatsSnackbarAction(action = {}, "Try again")

            SatsSnackbar(message, action, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}
