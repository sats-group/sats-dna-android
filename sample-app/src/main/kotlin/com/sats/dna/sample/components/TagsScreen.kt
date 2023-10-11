package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.components.SatsLabel
import com.sats.dna.components.SatsLabelColor
import com.sats.dna.components.SatsRewardsLabel
import com.sats.dna.components.SatsRewardsLevel
import com.sats.dna.theme.SatsTheme

@Composable
internal fun TagsScreen(navigateUp: () -> Unit) {
    ComponentScreen("Labels", navigateUp) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(vertical = SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxl),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Section("Filter Labels") {
                SatsLabelColor.entries.forEach { color ->
                    SatsLabel("$color", color = color)
                }
            }

            Section("Rewards Labels") {
                SatsRewardsLevel.entries.forEach { level ->
                    SatsRewardsLabel(level)
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
        Text(title, style = SatsTheme.typography.medium.heading3)

        Column(
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            content()
        }
    }
}

@Preview
@Composable
private fun Preview() {
    SatsTheme {
        TagsScreen(navigateUp = {})
    }
}
