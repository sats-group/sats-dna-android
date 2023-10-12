package com.sats.dna.components.chip

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsChip(label: String, modifier: Modifier = Modifier) {
    Surface(modifier, SatsTheme.shapes.roundedCorners.extraSmall, SatsTheme.colors.primary.default) {
        Text(
            label,
            Modifier.padding(SatsTheme.spacing.xs, SatsTheme.spacing.xxs),
            SatsTheme.colors.onPrimary.default,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        Surface {
            SatsChip("Chip Text", Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@Preview
@Composable
private fun TruncatedTextPreview() {
    SatsTheme {
        SatsChip("A very long chip text", Modifier.width(100.dp))
    }
}
