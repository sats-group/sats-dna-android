package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.card.SatsChallengeCard
import com.sats.dna.components.card.SatsChallengeCardState
import com.sats.dna.theme.SatsTheme

@Composable
fun ChallengeCardSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Challenge Card Screen", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            SatsChallengeCard(
                SatsChallengeCardState.Available(
                    imageUrl = null,
                    title = "STREAK WEEK",
                    subtitle = "Workout for 7 consecutive days",
                    buttonText = "Join",
                    tagText = "NEW",
                    isNew = true,
                    onCardClick = {},
                    onJoinClick = {},
                    isJoinButtonLoading = false,
                ),
                modifier = Modifier
                    .height(255.dp)
                    .width(176.dp),
            )

            SatsChallengeCard(
                SatsChallengeCardState.Joined(
                    imageUrl = null,
                    title = "STREAK WEEK",
                    tagText = "23 days left!",
                    progress = 0.14f,
                    statusText = "1 out of 7 workouts",
                    onCardClick = {},
                ),
                modifier = Modifier
                    .height(255.dp)
                    .width(176.dp),
            )

            SatsChallengeCard(
                SatsChallengeCardState.Disabled(
                    imageUrl = null,
                    title = "STREAK WEEK",
                    statusText = "Not completed",
                    dismissLabel = "Dismiss",
                    onCardClick = {},
                    onDismissClicked = {},
                    isDismissButtonLoading = false,
                ),
                modifier = Modifier
                    .height(255.dp)
                    .width(176.dp),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun ChallengeCardSampleScreenPreview() {
    SatsTheme {
        ChallengeCardSampleScreen(navigateUp = {})
    }
}
