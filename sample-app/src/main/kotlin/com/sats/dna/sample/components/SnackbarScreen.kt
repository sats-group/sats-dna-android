package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import com.sats.dna.components.SatsSnackbar
import com.sats.dna.components.SatsSnackbarAction
import com.sats.dna.theme.SatsTheme

@Composable
internal fun SnackbarScreen(navigateUp: () -> Unit) {
    ComponentScreen("Snackbar", navigateUp) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize()
                .wrapContentSize(),
            spacedBy(SatsTheme.spacing.m, CenterVertically),
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
