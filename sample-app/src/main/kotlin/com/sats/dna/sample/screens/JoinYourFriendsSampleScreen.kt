package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.JoinYourFriendsCard
import com.sats.dna.components.Pill
import com.sats.dna.components.SatsSurface
import com.sats.dna.sample.internal.SampleProfilePicture
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object JoinYourFriendsSampleScreen : SampleScreen(
    name = "Join Your Friends",
    route = "/join-your-friends",
    screen = { JoinYourFriendsSampleScreen(it::navigateUp) },
)

@Composable
private fun JoinYourFriendsSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Join Your Friends", navigateUp, modifier) { innerPadding ->
        JoinYourFriendsCard(
            pill = { Pill(label = "Susanne", image = { SampleProfilePicture() }) },
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

@LightDarkPreview
@Composable
private fun JoinYourFriendsSampleScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            JoinYourFriendsSampleScreen(navigateUp = {})
        }
    }
}
