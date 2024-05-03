package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsChallengeBadge
import com.sats.dna.theme.SatsTheme

data object ChallengeBadgeSampleScreen : SampleScreen(
    screen = { ChallengeBadgeScreen(it::navigateUp) },
)

@Composable
private fun ChallengeBadgeScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen(
        title = "Challenge Badge",
        navigateUp = navigateUp,
        modifier = modifier,
        bottomBar = { Spacer(Modifier.navigationBarsPadding()) },
    ) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xl),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            BadgeSample("https://picsum.photos/512")

            BadgeSample(imageUrl = null, label = "No image URL provided")

            BadgeSample("https://picsum.photos/512", progress = .75f, label = "75% complete")
        }
    }
}

@Composable
private fun BadgeSample(imageUrl: String?, progress: Float? = null, label: String? = imageUrl) {
    Column(
        verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SatsChallengeBadge(
            imageUrl = imageUrl,
            contentDescription = null,
            Modifier.size(128.dp),
            progress = progress,
        )

        Text(label.orEmpty(), style = SatsTheme.typography.emphasis.small)
    }
}

@PreviewLightDark
@Composable
private fun ChallengeBadgeScreenPreview() {
    SatsTheme {
        ChallengeBadgeScreen(navigateUp = {})
    }
}
