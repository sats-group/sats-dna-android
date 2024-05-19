package com.sats.dna.sample.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsTag
import com.sats.dna.components.SatsTagColor
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.SatsButtonSize
import com.sats.dna.components.button.SatsDismissButton
import com.sats.dna.components.card.SatsArticleCard
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun ArticleCardSampleScreen(navigateUp: (() -> Unit)?, modifier: Modifier = Modifier) {
    SampleScreen("Article Card", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            SatsArticleCard(
                imageUrl = "https://picsum.photos/id/10/1920/1080.webp",
                title = "Happy Training Day",
                subtitle = "Today is a day to learn, grow, and challenge yourself. " +
                    "It's a day to step outside of your comfort zone and try new things. " +
                    "It's a day to invest in yourself and your future.",
                onClick = {},
            )

            SatsArticleCard(
                imageUrl = "https://picsum.photos/1920/1080",
                title = "Plan your workout ",
                subtitle = "Now you can plan workouts ahead of time. " +
                    "Try it out and schedule your first workout today. " +
                    "There is a maximum number of char...",
                onClick = {},
                tag = { SatsTag(text = "New feature", color = SatsTagColor.Featured) },
                dismissButton = {
                    SatsDismissButton(
                        dismissLabel = "Dismiss",
                        onDismissClicked = { },
                        color = SatsButtonColor.Clean,
                        size = SatsButtonSize.Small,
                    )
                },
            )

            SatsArticleCard(
                imageUrl = "https://picsum.photos/1920/1080",
                title = "Plan your workout ",
                subtitle = "Now you can plan workouts ahead of time. " +
                    "Try it out and schedule your first workout today. " +
                    "There is a maximum number of char...",
                onClick = {},
                tag = { SatsTag(text = "New feature", color = SatsTagColor.Featured) },
            )

            SatsArticleCard(
                imageUrl = "https://picsum.photos/id/30/1920/1080.webp",
                title = "Happy Training Day",
                subtitle = null,
                onClick = {},
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun ArticleCardSampleScreenPreview() {
    SatsTheme {
        ArticleCardSampleScreen(navigateUp = {})
    }
}
