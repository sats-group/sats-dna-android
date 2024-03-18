package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.internal.GxSessionCard
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsYourMostBookedCard(
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

@PreviewLightDark
@Composable
private fun SatsYourMostBookedCardPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsYourMostBookedCard(
                imageUrl = null,
                title = "Indoor Running",
                subtitle = "Today – 20:30",
                onClick = {},
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
