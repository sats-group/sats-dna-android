package com.sats.dna.sample.screens.components

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsJoinYourFriendsCard
import com.sats.dna.components.SatsPill
import com.sats.dna.components.SatsSurface
import com.sats.dna.sample.internal.SampleProfilePicture
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun JoinYourFriendsSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    SampleScreen("Join Your Friends", navigateUp, modifier) { innerPadding ->
        SatsJoinYourFriendsCard(
            pill = { SatsPill(label = "Susanne", image = { SampleProfilePicture() }) },
            imageUrl = null,
            title = "Indoor Running",
            subtitle = "Today – 20:30",
            onClick = { },
            modifier = Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
        )
    }
}

@PreviewLightDark
@Composable
private fun JoinYourFriendsSampleScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            JoinYourFriendsSampleScreen(navigateUp = {})
        }
    }
}
