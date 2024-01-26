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
import com.sats.dna.components.snackbar.SatsSnackbar
import com.sats.dna.components.snackbar.SatsSnackbarAction
import com.sats.dna.components.snackbar.SatsSnackbarDefaults
import com.sats.dna.components.snackbar.SatsSnackbarTheme
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object SnackbarSampleScreen : SampleScreen(
    name = "Snackbar",
    route = "/components/snackbar",
    screen = { SnackbarScreen(it::navigateUp) },
)

@Composable
private fun SnackbarScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Snackbar", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize()
                .wrapContentSize(),
            Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            SatsSnackbar(
                message = "This text exists so that you can read it.",
                action = null,
            )

            SatsSnackbar(
                message = "This text is yours to read. There's also an action that you can perform.",
                action = SatsSnackbarAction(action = {}, "Try again"),
            )

            SatsSnackbar(
                message = "Texts should not be too long, as they might not fit inside the snackbar. We cap all texts " +
                    "at three lines, so if the text is longer than that, you won't be able to read it all.",
                action = null,
            )

            SatsSnackbar(
                visuals = SatsSnackbarDefaults.snackbarVisuals(
                    title = "The operation was a success!",
                    message = "You did something good, and so did we. We were also able to complete the thing.",
                    action = null,
                    theme = SatsSnackbarTheme.Success,
                    dismissAction = SatsSnackbarAction({}, "close"),
                ),
            )

            SatsSnackbar(
                visuals = SatsSnackbarDefaults.snackbarVisuals(
                    title = "Oh no, that's not great!",
                    message = "It looks like whatever you were trying to do didn't happen according to plan. You may " +
                        "want to try that again.",
                    action = SatsSnackbarAction(action = {}, label = "Try again"),
                    theme = SatsSnackbarTheme.Error,
                    dismissAction = SatsSnackbarAction({}, "close"),
                ),
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        SnackbarScreen(navigateUp = {})
    }
}
