package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sats.dna.components.snackbar.SatsSnackbar
import com.sats.dna.components.snackbar.SatsSnackbarAction
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
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize()
                .wrapContentSize(),
            Arrangement.spacedBy(SatsTheme.spacing.m, Alignment.CenterVertically),
        ) {
            val action = SatsSnackbarAction(action = {}, "Try again")

            SatsSnackbar("That didn't work!", action = null)

            SatsSnackbar("Oops, that didn't work at all! You should probably talk to the manager.", action = null)

            SatsSnackbar("Oops, that didn't work at all! You should probably talk to the manager.", action)

            SatsSnackbar(
                "Oops, that didn't work at all! And this message is way too long for the entire text to be seen. " +
                    "We might want to reconsider those texts.",
                action,
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
