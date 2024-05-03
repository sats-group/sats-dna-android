package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.SatsVerticalDivider
import com.sats.dna.theme.SatsTheme

data object DividersSampleScreen : SampleScreen(
    screen = { DividersScreen(it::navigateUp) },
)

@Composable
private fun DividersScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Dividers", navigateUp, modifier) { contentPadding ->
        Column(
            Modifier
                .padding(contentPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = spacedBy(SatsTheme.spacing.l),
        ) {
            Section("Horizontal Dividers") {
                Column(
                    verticalArrangement = spacedBy(SatsTheme.spacing.m, CenterVertically),
                    horizontalAlignment = CenterHorizontally,
                ) {
                    SatsHorizontalDivider()
                    SatsHorizontalDivider(Modifier.fillMaxWidth(.75f))
                    SatsHorizontalDivider(Modifier.fillMaxWidth(.50f))
                }
            }

            Section("Vertical Dividers") {
                Row(
                    horizontalArrangement = spacedBy(SatsTheme.spacing.m, CenterHorizontally),
                    verticalAlignment = CenterVertically,
                ) {
                    SatsVerticalDivider()
                    SatsVerticalDivider(Modifier.fillMaxHeight(.75f))
                    SatsVerticalDivider(Modifier.fillMaxHeight(.50f))
                }
            }
        }
    }
}

@Composable
private fun Section(label: String, modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Column(modifier, verticalArrangement = spacedBy(SatsTheme.spacing.m)) {
        Text(label, style = SatsTheme.typography.satsHeadlineEmphasis.headline2)

        SatsSurface(
            Modifier
                .fillMaxWidth()
                .height(200.dp),
        ) {
            content()
        }
    }
}

@PreviewLightDark
@Composable
private fun DividersScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            DividersScreen(navigateUp = {})
        }
    }
}
