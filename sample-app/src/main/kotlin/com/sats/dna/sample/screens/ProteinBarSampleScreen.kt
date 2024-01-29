package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.proteinbar.SatsProteinBar
import com.sats.dna.components.proteinbar.SatsProteinBarAction
import com.sats.dna.components.proteinbar.SatsProteinBarDefaults
import com.sats.dna.components.proteinbar.SatsProteinBarTheme
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object ProteinBarSampleScreen : SampleScreen(
    name = "Protein Bar",
    route = "/components/protein-bar",
    screen = { ProteinBarScreen(it::navigateUp) },
)

@Composable
private fun ProteinBarScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Protein Bar", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize()
                .wrapContentSize(),
            Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            SatsProteinBar(
                message = "This text exists so that you can read it.",
                action = null,
            )

            SatsProteinBar(
                message = "This text is yours to read. There's also an action that you can perform.",
                action = SatsProteinBarAction(action = {}, "Try again"),
            )

            SatsProteinBar(
                message = "Texts should not be too long, as they might not fit inside the protein bar. We cap all " +
                    "texts at three lines, so if the text is longer than that, you won't be able to read it all.",
                action = null,
            )

            SatsProteinBar(
                visuals = SatsProteinBarDefaults.visuals(
                    title = "The operation was a success!",
                    message = "You did something good, and so did we. We were also able to complete the thing.",
                    action = null,
                    theme = SatsProteinBarTheme.Success,
                    dismissAction = SatsProteinBarAction({}, "close"),
                ),
            )

            SatsProteinBar(
                visuals = SatsProteinBarDefaults.visuals(
                    title = "Oh no, that's not great!",
                    message = "It looks like whatever you were trying to do didn't happen according to plan. You may " +
                        "want to try that again.",
                    action = SatsProteinBarAction(action = {}, label = "Try again"),
                    theme = SatsProteinBarTheme.Error,
                    dismissAction = SatsProteinBarAction({}, "close"),
                ),
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun ProteinBarScreenPreview() {
    SatsTheme {
        ProteinBarScreen(navigateUp = {})
    }
}
