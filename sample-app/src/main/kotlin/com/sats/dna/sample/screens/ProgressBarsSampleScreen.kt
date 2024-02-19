package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsCircularProgressIndicator
import com.sats.dna.components.progressbar.LinearProgressBar
import com.sats.dna.components.progressbar.SatsCircularSteppedProgressIndicator
import com.sats.dna.components.progressbar.SteppingProgress
import com.sats.dna.components.progressbar.SteppingProgressGroup
import com.sats.dna.theme.SatsTheme

data object ProgressBarsSampleScreen : SampleScreen(
    name = "Progress Bars",
    route = "/components/progress-bars",
    screen = { ProgressBarsScreen(it::navigateUp) },
)

@Composable
private fun ProgressBarsScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Progress Bars", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxl),
        ) {
            Section("Linear Progress Bar") {
                Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m)) {
                    LinearProgressBar(0.00f, Modifier.fillMaxWidth())
                    LinearProgressBar(0.25f, Modifier.fillMaxWidth())
                    LinearProgressBar(0.50f, Modifier.fillMaxWidth())
                    LinearProgressBar(0.75f, Modifier.fillMaxWidth())
                    LinearProgressBar(1.00f, Modifier.fillMaxWidth())
                    LinearProgressBar(1.00f, Modifier.fillMaxWidth())
                }
            }

            Section("Circular Progress Indicator") {
                Row(Modifier.fillMaxWidth(), Arrangement.SpaceBetween) {
                    SatsCircularProgressIndicator()
                    SatsCircularProgressIndicator(0.33f)
                    SatsCircularProgressIndicator(0.67f)
                    SatsCircularProgressIndicator(1.00f)
                }
            }

            Section("Circular Stepped Progress Indicator") {
                Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.l)) {
                    SatsCircularSteppedProgressIndicator(
                        progress = SteppingProgress(
                            groups = listOf(
                                SteppingProgressGroup(4, 4),
                                SteppingProgressGroup(4, 4),
                                SteppingProgressGroup(3, 4),
                                SteppingProgressGroup(0, 4),
                                SteppingProgressGroup(0, 4),
                            ),
                        ),
                        modifier = Modifier.fillMaxWidth(),
                        arrangement = Arrangement.SpaceBetween,
                    )

                    SatsCircularSteppedProgressIndicator(
                        progress = SteppingProgress(
                            groups = listOf(
                                SteppingProgressGroup(1, 1),
                                SteppingProgressGroup(0, 1),
                                SteppingProgressGroup(0, 1),
                                SteppingProgressGroup(0, 1),
                            ),
                        ),
                        modifier = Modifier.fillMaxWidth(),
                        arrangement = Arrangement.SpaceBetween,
                    )
                }
            }
        }
    }
}

@Composable
private fun Section(title: String, content: @Composable () -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.l)) {
        Text(title, style = SatsTheme.typography.satsHeadlineEmphasis.large)

        content()
    }
}

@PreviewLightDark
@Composable
private fun ProgressBarsScreenPreview() {
    SatsTheme {
        ProgressBarsScreen(navigateUp = {})
    }
}
