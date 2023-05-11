package com.sats.dna.sample.components.appbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.google.accompanist.insets.ui.Scaffold
import com.sats.dna.components.appbar.SatsTopAppBar
import com.sats.dna.theme.SatsTheme

@Composable
internal fun SatsTopAppBarScreen(navigateUp: () -> Unit) {
    Scaffold(
        topBar = {
            SatsTopAppBar(
                contentPadding = WindowInsets.statusBars.asPaddingValues(),
                navigationIcon = {
                    IconButton(onClick = navigateUp) {
                        Icon(SatsTheme.icons.back, contentDescription = null)
                    }
                },
                title = { Text("Top App Bar") },
            )
        },
        bottomBar = { Spacer(Modifier.navigationBarsPadding()) },
    ) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.Absolute.spacedBy(SatsTheme.spacing.m),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            SatsTopAppBar(
                title = { Text("Top App Bar") },
            )

            SatsTopAppBar(
                title = { Text("Top App Bar") },
                actions = { Actions() },
            )

            SatsTopAppBar(
                navigationIcon = { UpIconButton() },
                title = { Text("Top App Bar") },
            )

            SatsTopAppBar(
                navigationIcon = { UpIconButton() },
                title = { Text("Top App Bar") },
                actions = { Actions() },
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
