package com.sats.dna.components.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import com.sats.dna.LocalUseMaterial3
import com.sats.dna.components.proteinbar.SatsProteinBar
import com.sats.dna.components.proteinbar.SatsProteinBarAction
import com.sats.dna.components.proteinbar.SatsProteinBarVisuals
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsScreen(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = { Spacer(Modifier.navigationBarsPadding()) },
    proteinBarHostState: SnackbarHostState = remember { SnackbarHostState() },
    proteinBarPadding: PaddingValues = PaddingValues(SatsTheme.spacing.m),
    floatingActionButton: @Composable () -> Unit = {},
    contentPadding: PaddingValues = PaddingValues(0.dp),
    content: @Composable (contentPadding: PaddingValues) -> Unit,
) {
    CompositionLocalProvider(LocalUseMaterial3 provides true) {
        Scaffold(
            modifier = modifier,
            topBar = topBar,
            bottomBar = bottomBar,
            containerColor = SatsTheme.colors2.backgrounds.primary.bg.default,
            contentColor = SatsTheme.colors2.backgrounds.primary.fg.default,
            snackbarHost = { SatsProteinBarHost(proteinBarHostState, Modifier.padding(proteinBarPadding)) },
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
private fun SatsProteinBarHost(snackbarHostState: SnackbarHostState, modifier: Modifier = Modifier) {
    SnackbarHost(snackbarHostState, modifier) { snackbarData ->
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
