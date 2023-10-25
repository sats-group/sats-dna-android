package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsFilterChip
import com.sats.dna.components.SatsInputChip
import com.sats.dna.components.SatsInputChipClearButton
import com.sats.dna.components.chip.SatsChip
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object ChipsSampleScreen : SampleScreen(
    name = "Chips",
    route = "/components/chips",
    screen = { ChipsScreen(it::navigateUp) },
)

@Composable
private fun ChipsScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Chips", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(vertical = SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxl),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Section("Filter Chips") {
                var isSelected by rememberSaveable { mutableStateOf(false) }

                SatsFilterChip(
                    text = "05-09",
                    isSelected = isSelected,
                    isEnabled = true,
                    onClick = { isSelected = !isSelected },
                )

                SatsFilterChip(
                    text = "05-09 (disabled)",
                    isSelected = isSelected,
                    isEnabled = false,
                    onClick = { isSelected = !isSelected },
                )
            }

            Section("Input Chips") {
                SatsInputChip(
                    text = "Oslo",
                    action = { SatsInputChipClearButton(onClick = {}, onClickLabel = "Clear") },
                )

                SatsInputChip(
                    text = "(4) Akersgata, Bislett, Storo, Nydalen",
                    action = { SatsInputChipClearButton(onClick = {}, onClickLabel = "Clear") },
                    Modifier.widthIn(max = 200.dp),
                )
            }

            Section("Old – deprecated") {
                SatsChip("Chip")

                SatsChip("A very long chip text", Modifier.width(100.dp))
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

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        ChipsScreen(navigateUp = {})
    }
}
