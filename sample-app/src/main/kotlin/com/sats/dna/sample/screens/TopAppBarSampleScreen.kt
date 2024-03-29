package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.LocalUseMaterial3
import com.sats.dna.SatsIcons
import com.sats.dna.components.appbar.SatsLargeTopAppBar
import com.sats.dna.components.appbar.SatsTopAppBar
import com.sats.dna.components.button.SatsTopAppBarIconButton
import com.sats.dna.icons.AddPerson
import com.sats.dna.icons.Back
import com.sats.dna.icons.Barbell
import com.sats.dna.theme.SatsTheme

data object TopAppBarSampleScreen : SampleScreen(
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
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.Absolute.spacedBy(SatsTheme.spacing.l),
        ) {
            Section("Material 2") {
                CompositionLocalProvider(LocalUseMaterial3 provides false) {
                    SatsTopAppBar(
                        title = { Text("M2 Top App Bar") },
                        navigationIcon = { UpIconButton() },
                        actions = { Actions() },
                    )
                }
            }

            Section("Material 3 Regular") {
                SatsTopAppBar(
                    title = "M3 Top App Bar",
                    navigationIcon = { UpIconButton() },
                    actions = { Actions() },
                    windowInsets = WindowInsets(0.dp),
                )
            }

            Section("Material 3 Large") {
                SatsLargeTopAppBar(
                    title = "M3 Large Top App Bar",
                    scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(),
                    navigationIcon = { UpIconButton() },
                    actions = { Actions() },
                    windowInsets = WindowInsets(0.dp),
                )
            }
        }
    }
}

@Composable
private fun Section(label: String, content: @Composable () -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s)) {
        Text(label, style = SatsTheme.typography.medium.headline3)

        content()
    }
}

@Composable
private fun UpIconButton() {
    SatsTopAppBarIconButton(onClick = {}, SatsIcons.Back, onClickLabel = null)
}

@Composable
private fun Actions() {
    listOf(SatsIcons.Barbell, SatsIcons.AddPerson).forEach { icon ->
        SatsTopAppBarIconButton(onClick = {}, icon, onClickLabel = null)
    }
}

@PreviewLightDark
@Composable
private fun TopAppBarScreenPreview() {
    SatsTheme {
        TopAppBarScreen(navigateUp = {})
    }
}
