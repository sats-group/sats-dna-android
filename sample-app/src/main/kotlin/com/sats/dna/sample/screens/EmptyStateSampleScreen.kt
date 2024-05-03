package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsEmptyStateAction
import com.sats.dna.components.SatsEmptyStateCard
import com.sats.dna.icons.Barbell
import com.sats.dna.theme.SatsTheme

data object EmptyStateSampleScreen : SampleScreen(
    screen = { EmptyStateScreen(it::navigateUp) },
)

@Composable
private fun EmptyStateScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Empty State", navigateUp, modifier) { innerPadding ->
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            SatsEmptyStateCard(
                icon = SatsIcons.Barbell,
                title = "You don't have friends",
                body = "If you make friends, you can follow in their working out and stuff. " +
                    "And they can follow whatever you're doing, as well!",
                action = SatsEmptyStateAction(action = {}, label = "Make friends"),
                modifier = Modifier,
            )

            SatsEmptyStateCard(
                icon = SatsIcons.Barbell,
                title = "You don't have friends",
                body = null,
                action = SatsEmptyStateAction(action = {}, label = "Make friends"),
                modifier = Modifier.fillMaxWidth(),
            )

            SatsEmptyStateCard(
                icon = SatsIcons.Barbell,
                title = "You don't have friends",
                body = "If you make friends, you can follow in their working out and stuff. " +
                    "And they can follow whatever you're doing, as well!",
                action = null,
                modifier = Modifier,
            )

            SatsEmptyStateCard(
                icon = SatsIcons.Barbell,
                title = "You don't have friends",
                body = null,
                action = null,
                modifier = Modifier,
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun EmptyStateScreenPreview() {
    SatsTheme {
        EmptyStateScreen(navigateUp = {})
    }
}
