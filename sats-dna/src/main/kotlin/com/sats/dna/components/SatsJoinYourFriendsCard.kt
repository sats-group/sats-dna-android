package com.sats.dna.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.internal.GxSessionCard
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsJoinYourFriendsCard(
    pill: @Composable () -> Unit,
    imageUrl: String?,
    title: String,
    subtitle: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(modifier, propagateMinConstraints = true) {
        GxSessionCard(
            imageUrl = imageUrl,
            title = title,
            subtitle = subtitle,
            onClick = onClick,
        )

        Box(Modifier.padding(SatsTheme.spacing.xs)) {
            pill()
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsJoinYourFriendsCardPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds2.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsJoinYourFriendsCard(
                pill = {
                    SatsPill(
                        label = "Susanne",
                        image = { SatsProfileAvatarImage(imageUrl = null) },
                    )
                },
                imageUrl = null,
                title = "Indoor Running",
                subtitle = "Today – 20:30",
                onClick = {},
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
