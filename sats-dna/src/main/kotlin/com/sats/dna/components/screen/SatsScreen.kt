package com.sats.dna.components.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import com.sats.dna.components.proteinbar.ProteinBarHostState
import com.sats.dna.components.proteinbar.SatsProteinBar
import com.sats.dna.components.proteinbar.SatsProteinBarAction
import com.sats.dna.components.proteinbar.SatsProteinBarVisuals
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsScreen(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = { Spacer(Modifier.navigationBarsPadding()) },
    proteinBarHostState: ProteinBarHostState = remember { ProteinBarHostState() },
    proteinBarPadding: PaddingValues = PaddingValues(SatsTheme.spacing.m),
    floatingActionButton: @Composable () -> Unit = {},
    contentPadding: PaddingValues = PaddingValues(0.dp),
    content: @Composable (contentPadding: PaddingValues) -> Unit,
) {
    Scaffold(
        modifier = modifier,
        topBar = topBar,
        bottomBar = bottomBar,
        containerColor = SatsTheme.colors.backgrounds.primary.default.bg,
        contentColor = SatsTheme.colors.backgrounds.primary.default.fg,
        snackbarHost = {
            SatsProteinBarHost(
                proteinBarHostState,
                Modifier.padding(proteinBarPadding),
            )
        },
        floatingActionButton = floatingActionButton,
    ) { scaffoldContentPadding ->
        val layoutDirection = LocalLayoutDirection.current

        val screenContentPadding = PaddingValues(
            start = scaffoldContentPadding.calculateStartPadding(layoutDirection) +
                contentPadding.calculateStartPadding(layoutDirection) +
                LocalSatsScreenContentPadding.current.calculateStartPadding(layoutDirection),
            top = scaffoldContentPadding.calculateTopPadding() +
                contentPadding.calculateTopPadding() +
                LocalSatsScreenContentPadding.current.calculateTopPadding(),
            end = scaffoldContentPadding.calculateEndPadding(layoutDirection) +
                contentPadding.calculateEndPadding(layoutDirection) +
                LocalSatsScreenContentPadding.current.calculateEndPadding(layoutDirection),
            bottom = scaffoldContentPadding.calculateBottomPadding() +
                contentPadding.calculateBottomPadding() +
                LocalSatsScreenContentPadding.current.calculateBottomPadding(),
        )

        content(screenContentPadding)
    }
}

val LocalSatsScreenContentPadding = compositionLocalOf { PaddingValues(0.dp) }

@Composable
private fun SatsProteinBarHost(proteinBarHostState: ProteinBarHostState, modifier: Modifier = Modifier) {
    SnackbarHost(proteinBarHostState, modifier) { snackbarData ->
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
