package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import com.sats.dna.SatsIcons
import com.sats.dna.components.appbar.SatsTopAppBar
import com.sats.dna.components.button.SatsTopAppBarIconButton
import com.sats.dna.icons.Back
import com.sats.dna.sample.internal.SatsScreen
import com.sats.dna.sample.internal.trySharedBounds

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun SampleScreen(
    title: String,
    navigateUp: (() -> Unit)?,
    modifier: Modifier = Modifier,
    bottomBar: @Composable () -> Unit = { Box(Modifier.navigationBarsPadding()) },
    content: @Composable (innerPadding: PaddingValues) -> Unit,
) {
    val topAppBarScrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    SatsScreen(
        modifier = modifier.nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
        topBar = {
            SatsTopAppBar(
                navigationIcon = {
                    if (navigateUp != null) {
                        SatsTopAppBarIconButton(
                            onClick = navigateUp,
                            icon = SatsIcons.Back,
                            onClickLabel = null,
                        )
                    }
                },
                title = title,
                scrollBehavior = topAppBarScrollBehavior,
                modifier = Modifier.trySharedBounds("top-bar"),
            )
        },
        bottomBar = bottomBar,
        content = content,
    )
}
