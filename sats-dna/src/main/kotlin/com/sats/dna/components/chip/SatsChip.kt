package com.sats.dna.components.chip

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsChip(label: String, modifier: Modifier = Modifier) {
    SatsSurface(
        modifier = modifier,
        color = SatsTheme.colors.graphicalElements.chips.selected.default.bg,
        shape = SatsTheme.shapes.roundedCorners.extraSmall,
    ) {
        Text(
            text = label,
            modifier = Modifier.padding(SatsTheme.spacing.xs, SatsTheme.spacing.xxs),
            color = SatsTheme.colors.graphicalElements.chips.selected.default.fg,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@PreviewLightDark
@Composable
private fun SatsChipPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsChip("Chip Text", Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

@Preview
@Composable
private fun SatsChipTruncatedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsChip(
                "A very long chip text",
                Modifier
                    .padding(SatsTheme.spacing.m)
                    .width(100.dp),
            )
        }
    }
}
