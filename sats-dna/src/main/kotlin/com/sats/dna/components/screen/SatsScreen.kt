package com.sats.dna.components.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ScaffoldState
import androidx.compose.material.SnackbarHost
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.ui.Scaffold
import com.sats.dna.components.SatsSnackbar
import com.sats.dna.components.SatsSnackbarAction
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsScreen(
    modifier: Modifier = Modifier,
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    snackbarHost: @Composable (SnackbarHostState) -> Unit = {
        SatsSnackbarHost(it, Modifier.padding(SatsTheme.spacing.m))
    },
    floatingActionButton: @Composable () -> Unit = {},
    contentPadding: PaddingValues = PaddingValues(0.dp),
    content: @Composable (contentPadding: PaddingValues) -> Unit,
) {
    Scaffold(
        modifier = modifier,
        scaffoldState = scaffoldState,
        topBar = topBar,
        bottomBar = bottomBar,
        snackbarHost = snackbarHost,
        floatingActionButton = floatingActionButton,
        contentPadding = contentPadding,
        content = content,
    )
}

@Composable
private fun SatsSnackbarHost(snackbarHostState: SnackbarHostState, modifier: Modifier = Modifier) {
    SnackbarHost(snackbarHostState, modifier) { snackbarData ->
        val action = snackbarData.actionLabel?.let { label ->
            SatsSnackbarAction(snackbarData::performAction, label)
        }

        SatsSnackbar(snackbarData.message, action)
    }
}
