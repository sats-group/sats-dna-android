package com.sats.dna.components.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import com.sats.dna.components.LocalUseMaterial3
import com.sats.dna.components.proteinbar.SatsProteinBar
import com.sats.dna.components.proteinbar.SatsProteinBarAction
import com.sats.dna.components.proteinbar.SatsProteinBarVisuals
import com.sats.dna.theme.SatsTheme
import androidx.compose.material.ScaffoldState as M2ScaffoldState
import androidx.compose.material.SnackbarHost as M2SnackbarHost
import androidx.compose.material.SnackbarHostState as M2SnackbarHostState
import androidx.compose.material3.Scaffold as M3Scaffold
import androidx.compose.material3.SnackbarHost as M3SnackbarHost
import androidx.compose.material3.SnackbarHostState as M3SnackbarHostState
import com.google.accompanist.insets.ui.Scaffold as M2Scaffold

@Composable
fun SatsScreen(
    modifier: Modifier = Modifier,
    scaffoldState: M2ScaffoldState = rememberScaffoldState(),
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    snackbarHost: @Composable (M2SnackbarHostState) -> Unit = {
        SatsProteinBarHost(it, Modifier.padding(SatsTheme.spacing.m))
    },
    floatingActionButton: @Composable () -> Unit = {},
    contentPadding: PaddingValues = PaddingValues(0.dp),
    content: @Composable (contentPadding: PaddingValues) -> Unit,
) {
    CompositionLocalProvider(LocalUseMaterial3 provides false) {
        M2Scaffold(
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
}

@Composable
fun M3SatsScreen(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = { Spacer(Modifier.navigationBarsPadding()) },
    proteinBarHostState: M3SnackbarHostState = remember { M3SnackbarHostState() },
    proteinBarPadding: PaddingValues = PaddingValues(SatsTheme.spacing.m),
    floatingActionButton: @Composable () -> Unit = {},
    contentPadding: PaddingValues = PaddingValues(0.dp),
    content: @Composable (contentPadding: PaddingValues) -> Unit,
) {
    CompositionLocalProvider(LocalUseMaterial3 provides true) {
        M3Scaffold(
            modifier = modifier,
            topBar = topBar,
            bottomBar = bottomBar,
            containerColor = SatsTheme.colors2.backgrounds.primary.bg.default,
            contentColor = SatsTheme.colors2.backgrounds.primary.fg.default,
            snackbarHost = { M3SatsProteinBarHost(proteinBarHostState, Modifier.padding(proteinBarPadding)) },
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
}

@Composable
private fun SatsProteinBarHost(hostState: M2SnackbarHostState, modifier: Modifier = Modifier) {
    M2SnackbarHost(hostState, modifier) { data ->
        val action = data.actionLabel?.let { label ->
            SatsProteinBarAction(data::performAction, label)
        }

        SatsProteinBar(data.message, action)
    }
}

@Composable
private fun M3SatsProteinBarHost(snackbarHostState: M3SnackbarHostState, modifier: Modifier = Modifier) {
    M3SnackbarHost(snackbarHostState, modifier) { snackbarData ->
        when (val visuals = snackbarData.visuals) {
            is SatsProteinBarVisuals -> {
                SatsProteinBar(visuals)
            }

            else -> {
                val action = visuals.actionLabel?.let { label ->
                    SatsProteinBarAction(snackbarData::performAction, label)
                }

                SatsProteinBar(visuals.message, action)
            }
        }
    }
}
