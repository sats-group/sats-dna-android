package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsBadge
import com.sats.dna.components.SatsBadgeHierarchy
import com.sats.dna.components.SatsFixedBadge
import com.sats.dna.theme.SatsTheme

data object BadgeSampleScreen : SampleScreen(
    screen = { BadgeScreen(it::navigateUp) },
)

@Composable
private fun BadgeScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Badge", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(vertical = SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxl, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Section("Regular") {
                Row(horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m)) {
                    SatsBadgeHierarchy.entries.forEach { hierarchy ->
                        SatsBadge("5", hierarchy = hierarchy)
                    }
                }

                Row(horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m)) {
                    SatsBadgeHierarchy.entries.forEach { hierarchy ->
                        SatsBadge("999+", hierarchy = hierarchy)
                    }
                }
            }

            Section("Fixed") {
                Row(horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m)) {
                    SatsBadgeHierarchy.entries.forEach { hierarchy ->
                        SatsFixedBadge("5", hierarchy = hierarchy)
                    }
                }

                Row(horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m)) {
                    SatsBadgeHierarchy.entries.forEach { hierarchy ->
                        SatsFixedBadge("999+", hierarchy = hierarchy)
                    }
                }
            }
        }
    }
}

@Composable
private fun Section(title: String, content: @Composable ColumnScope.() -> Unit) {
    Column(
        verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(title, style = SatsTheme.typography.medium.headline3)

        Column(
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            content()
        }
    }
}

@PreviewLightDark
@Composable
private fun BadgeScreenPreview() {
    SatsTheme {
        BadgeScreen(navigateUp = {})
    }
}
