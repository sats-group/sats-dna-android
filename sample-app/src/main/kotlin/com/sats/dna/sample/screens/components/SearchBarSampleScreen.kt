package com.sats.dna.sample.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsSearchBar
import com.sats.dna.components.SatsSurface
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun SearchBarSampleScreen(navigateUp: (() -> Unit)?, modifier: Modifier = Modifier) {
    var emptyQuery by remember { mutableStateOf("") }
    var query by remember { mutableStateOf("SATS Carl Berner") }

    SampleScreen("Search Bar", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxWidth(),
            Arrangement.spacedBy(SatsTheme.spacing.l),
            Alignment.CenterHorizontally,
        ) {
            SatsSearchBar(
                query = emptyQuery,
                onQueryChange = { emptyQuery = it },
                onClearClicked = {},
                placeholder = "Search …",
            )

            SatsSearchBar(
                query = emptyQuery,
                onQueryChange = { emptyQuery = it },
                onClearClicked = {},
                placeholder = "Search …",
                onUpClicked = {},
            )

            SatsSearchBar(
                query = query,
                onQueryChange = { query = it },
                onClearClicked = { query = "" },
                placeholder = "Search …",
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SearchBarSampleScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SearchBarSampleScreen(navigateUp = {})
        }
    }
}
