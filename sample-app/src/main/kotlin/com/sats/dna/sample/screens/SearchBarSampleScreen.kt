package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sats.dna.components.M3SatsSearchBar
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object SearchBarSampleScreen : SampleScreen(
    name = "Search Bar",
    route = "/search-bar",
    screen = { SearchBarSampleScreen(it::navigateUp) },
)

@Composable
private fun SearchBarSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    var emptyQuery by remember { mutableStateOf("") }
    var query by remember { mutableStateOf("SATS Carl Berner") }

    ComponentScreen("Search Bar", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxWidth(),
            Arrangement.spacedBy(SatsTheme.spacing.l),
            Alignment.CenterHorizontally,
        ) {
            M3SatsSearchBar(
                query = emptyQuery,
                onQueryChange = { emptyQuery = it },
                onClearClicked = {},
                placeholder = { Text("Search …", color = SatsTheme.colors2.surfaces.primary.fg.alternate) },
            )

            M3SatsSearchBar(
                query = emptyQuery,
                onQueryChange = { emptyQuery = it },
                onClearClicked = {},
                placeholder = { Text("Search …", color = SatsTheme.colors2.surfaces.primary.fg.alternate) },
                onUpClicked = {},
            )

            M3SatsSearchBar(
                query = query,
                onQueryChange = { query = it },
                onClearClicked = { query = "" },
                placeholder = { Text("Search …", color = SatsTheme.colors2.surfaces.primary.fg.alternate) },
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun SearchBarSampleScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SearchBarSampleScreen(navigateUp = {})
        }
    }
}
