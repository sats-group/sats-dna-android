package com.sats.dna.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.internal.GxSessionCard
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun JoinYourFriendsCard(
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

@LightDarkPreview
@Composable
private fun JoinYourFriendsCardPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            JoinYourFriendsCard(
                pill = { Pill(label = "Susanne", image = { ProfileAvatarImage(imageUrl = null) }) },
                imageUrl = null,
                title = "Indoor Running",
                subtitle = "Today – 20:30",
                onClick = {},
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
