package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.internal.GxSessionCard
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun YourMostBookedCard(
    imageUrl: String?,
    title: String,
    subtitle: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    GxSessionCard(
        imageUrl = imageUrl,
        title = title,
        subtitle = subtitle,
        onClick = onClick,
        modifier = modifier,
    )
}

@LightDarkPreview
@Composable
private fun YourMostBookedCardPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            YourMostBookedCard(
                imageUrl = null,
                title = "Indoor Running",
                subtitle = "Today – 20:30",
                onClick = {},
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
