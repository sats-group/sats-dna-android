package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsChallengeBadge
import com.sats.dna.theme.SatsTheme

@Composable
internal fun ChallengeBadgeScreen(navigateUp: () -> Unit) {
    ComponentScreen(
        "Challenge Badge",
        navigateUp,
        bottomBar = { Spacer(Modifier.navigationBarsPadding()) },
    ) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize(),
            verticalArrangement = spacedBy(SatsTheme.spacing.xl, CenterVertically),
            horizontalAlignment = CenterHorizontally,
        ) {
            BadgeSample("https://picsum.photos/512")

            BadgeSample(imageUrl = null, "No image URL provided")
        }
    }
}

@Composable
private fun BadgeSample(imageUrl: String?, label: String? = imageUrl) {
    Column(verticalArrangement = spacedBy(SatsTheme.spacing.xs), horizontalAlignment = CenterHorizontally) {
        SatsChallengeBadge(
            imageUrl = imageUrl,
            contentDescription = null,
            Modifier.size(128.dp),
        )

        Text(label.orEmpty(), style = SatsTheme.typography.emphasis.small)
    }
}

@Preview
@Composable
private fun ChallengeBadgeScreenPreview() {
    ChallengeBadgeScreen(navigateUp = {})
}
