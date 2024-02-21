package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsRewardsLevel
import com.sats.dna.components.SatsRewardsTag
import com.sats.dna.components.SatsTag
import com.sats.dna.components.SatsTagColor
import com.sats.dna.components.SatsTagPlaceholder
import com.sats.dna.components.SatsWorkoutTag
import com.sats.dna.components.SatsWorkoutTagColor
import com.sats.dna.theme.SatsTheme

data object TagsSampleScreen : SampleScreen(
    name = "Tags",
    route = "/components/tags",
    screen = { TagsScreen(it::navigateUp) },
)

@Composable
private fun TagsScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Tags", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(vertical = SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxl),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Section("Filter Tags") {
                SatsTagColor.entries.forEach { color ->
                    SatsTag("$color", color = color)
                }
            }

            Section("Rewards Tags") {
                SatsRewardsLevel.entries.forEach { level ->
                    SatsRewardsTag(level)
                }
            }

            Section("Workout Tags") {
                SatsWorkoutTagColor.entries.forEach { color ->
                    SatsWorkoutTag("$color", color = color)
                }
            }

            Section("Tag Placeholder") {
                SatsTagPlaceholder("Placeholder")
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
private fun Preview() {
    SatsTheme {
        TagsScreen(navigateUp = {})
    }
}
