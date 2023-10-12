package com.sats.dna.components.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ScaffoldState
import androidx.compose.material.SnackbarHost
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.ui.Scaffold
import com.sats.dna.components.SatsSnackbar
import com.sats.dna.components.SatsSnackbarAction
import com.sats.dna.theme.SatsTheme
import androidx.compose.material3.Scaffold as M3Scaffold
import androidx.compose.material3.SnackbarHost as M3SnackbarHost
import androidx.compose.material3.SnackbarHostState as M3SnackbarHostState

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
fun M3SatsScreen(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    snackbarHostState: M3SnackbarHostState = remember { M3SnackbarHostState() },
    snackbarHost: @Composable (M3SnackbarHostState) -> Unit = {
        M3SatsSnackbarHost(it, Modifier.padding(SatsTheme.spacing.m))
    },
    floatingActionButton: @Composable () -> Unit = {},
    contentPadding: PaddingValues = PaddingValues(0.dp),
    content: @Composable (contentPadding: PaddingValues) -> Unit,
) {
    M3Scaffold(
        modifier = modifier,
        topBar = topBar,
        bottomBar = bottomBar,
        snackbarHost = { snackbarHost(snackbarHostState) },
        floatingActionButton = floatingActionButton,
    ) { scaffoldContentPadding ->
        val screenContentPadding = PaddingValues(
            start = scaffoldContentPadding.calculateStartPadding(LocalLayoutDirection.current) +
                contentPadding.calculateStartPadding(LocalLayoutDirection.current),
            top = scaffoldContentPadding.calculateTopPadding() + contentPadding.calculateTopPadding(),
            end = scaffoldContentPadding.calculateEndPadding(LocalLayoutDirection.current) +
                contentPadding.calculateEndPadding(LocalLayoutDirection.current),
            bottom = scaffoldContentPadding.calculateBottomPadding() + contentPadding.calculateBottomPadding(),
        )

        content(screenContentPadding)
    }
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

@Composable
private fun M3SatsSnackbarHost(snackbarHostState: M3SnackbarHostState, modifier: Modifier = Modifier) {
    M3SnackbarHost(snackbarHostState, modifier) { snackbarData ->
        val action = snackbarData.visuals.actionLabel?.let { label ->
            SatsSnackbarAction(snackbarData::performAction, label)
        }

        SatsSnackbar(snackbarData.visuals.message, action)
    }
}
