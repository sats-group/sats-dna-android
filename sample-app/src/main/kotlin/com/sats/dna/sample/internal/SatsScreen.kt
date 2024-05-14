package com.sats.dna.sample.internal

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

@Composable
internal fun SatsScreen(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = { Spacer(Modifier.navigationBarsPadding()) },
    contentPadding: PaddingValues = PaddingValues(0.dp),
    content: @Composable (contentPadding: PaddingValues) -> Unit,
) {
    Scaffold(
        modifier = modifier,
        topBar = topBar,
        bottomBar = bottomBar,
        containerColor = SatsTheme.colors.backgrounds.primary.default.bg,
        contentColor = SatsTheme.colors.backgrounds.primary.default.fg,
    ) { scaffoldContentPadding ->
        val layoutDirection = LocalLayoutDirection.current

        val screenContentPadding = PaddingValues(
            start = scaffoldContentPadding.calculateStartPadding(layoutDirection) +
                contentPadding.calculateStartPadding(layoutDirection),
            top = scaffoldContentPadding.calculateTopPadding() +
                contentPadding.calculateTopPadding(),
            end = scaffoldContentPadding.calculateEndPadding(layoutDirection) +
                contentPadding.calculateEndPadding(layoutDirection),
            bottom = scaffoldContentPadding.calculateBottomPadding() +
                contentPadding.calculateBottomPadding(),
        )

        content(screenContentPadding)
    }
}
