package com.sats.dna.sample.components.progressbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.progressbar.LinearProgressBar
import com.sats.dna.sample.components.ComponentScreen
import com.sats.dna.theme.SatsTheme

@Composable
internal fun ProgressBarsScreen(navigateUp: () -> Unit) {
    ComponentScreen("Progress Bars", navigateUp) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            LinearProgressBar(0.00f, Modifier.fillMaxWidth())
            LinearProgressBar(0.25f, Modifier.fillMaxWidth())
            LinearProgressBar(0.50f, Modifier.fillMaxWidth())
            LinearProgressBar(0.75f, Modifier.fillMaxWidth())
            LinearProgressBar(1.00f, Modifier.fillMaxWidth())
        }
    }
}
