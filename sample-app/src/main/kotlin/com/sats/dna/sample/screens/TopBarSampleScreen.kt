package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.components.appbar.M3SatsTopAppBar
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object TopBarSampleScreen : SampleScreen(
    name = "Top App Bar",
    route = "/components/top-app-bar",
    screen = { TopAppBarScreen(it::navigateUp) },
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopAppBarScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Top App Bar", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.Absolute.spacedBy(SatsTheme.spacing.m),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            M3SatsTopAppBar(
                title = { Text("Top App Bar") },
                windowInsets = WindowInsets(0.dp),
            )

            M3SatsTopAppBar(
                title = { Text("Top App Bar") },
                actions = { Actions() },
                windowInsets = WindowInsets(0.dp),
            )

            M3SatsTopAppBar(
                title = { Text("Top App Bar") },
                navigationIcon = { UpIconButton() },
                windowInsets = WindowInsets(0.dp),
            )

            M3SatsTopAppBar(
                title = { Text("Top App Bar") },
                navigationIcon = { UpIconButton() },
                actions = { Actions() },
                windowInsets = WindowInsets(0.dp),
            )
        }
    }
}

@Composable
private fun UpIconButton() {
    IconButton(onClick = {}) {
        Icon(SatsTheme.icons.back, contentDescription = null)
    }
}

@Composable
private fun Actions() {
    listOf(SatsTheme.icons.barbell, SatsTheme.icons.addPerson).forEach { icon ->
        IconButton(onClick = {}) {
            Icon(icon, contentDescription = null)
        }
    }
}

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        TopAppBarScreen(navigateUp = {})
    }
}
