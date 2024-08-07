package com.sats.dna.components.internal

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsGxSessionImage
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.card.SatsCard
import com.sats.dna.theme.SatsTheme

@Composable
internal fun GxSessionCard(
    imageUrl: String?,
    title: String,
    subtitle: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    SatsCard(modifier.height(IntrinsicSize.Min)) {
        Column(
            Modifier
                .fillMaxSize()
                .clickable(onClick = onClick),
        ) {
            SatsGxSessionImage(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f),
                imageUrl = imageUrl,
                contentDescription = null,
            )

            Text(
                text = title,
                modifier = Modifier
                    .padding(horizontal = SatsTheme.spacing.m)
                    .padding(top = SatsTheme.spacing.m, bottom = SatsTheme.spacing.xs),
                style = SatsTheme.typography.medium.basic,
            )

            Text(
                text = subtitle,
                modifier = Modifier
                    .padding(horizontal = SatsTheme.spacing.m)
                    .padding(bottom = SatsTheme.spacing.m),
                style = SatsTheme.typography.normal.small,
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun GxSessionCardPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            GxSessionCard(
                imageUrl = null,
                title = "Indoor Running",
                subtitle = "Today – 20:30",
                onClick = {},
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
