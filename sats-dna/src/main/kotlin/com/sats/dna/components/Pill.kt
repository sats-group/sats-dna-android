package com.sats.dna.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun Pill(
    label: String,
    image: @Composable BoxScope.() -> Unit,
    modifier: Modifier = Modifier,
) {
    SatsSurface(
        modifier = modifier,
        color = SatsTheme.colors2.surfaces.primary.bg.default,
        shape = SatsTheme.shapes.circle,
        useMaterial3 = true,
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                Modifier
                    .padding(SatsTheme.spacing.xxs)
                    .size(24.dp)
                    .clip(SatsTheme.shapes.circle),
                content = image,
            )

            Text(
                modifier = Modifier.padding(start = SatsTheme.spacing.xs, end = SatsTheme.spacing.s),
                text = label,
                style = SatsTheme.typography.normal.small,
                color = SatsTheme.colors2.surfaces.primary.fg.alternate,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun PillPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            Pill("Susanne", image = { ProfileAvatarImage(imageUrl = null) }, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}
