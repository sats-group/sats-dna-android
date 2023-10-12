package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.components.appbar.SatsTopAppBar
import com.sats.dna.components.screen.SatsScreen
import com.sats.dna.theme.SatsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun ComponentScreen(
    title: String,
    navigateUp: () -> Unit,
    bottomBar: @Composable () -> Unit = { Box(Modifier.navigationBarsPadding()) },
    contentPadding: PaddingValues = PaddingValues(0.dp),
    content: @Composable (innerPadding: PaddingValues) -> Unit,
) {
    SatsScreen(
        topBar = {
            SatsTopAppBar(
                navigationIcon = {
                    IconButton(navigateUp) {
                        Icon(SatsTheme.icons.back, contentDescription = null)
                    }
                },
                title = title,
            )
        },
        bottomBar = bottomBar,
        contentPadding = contentPadding,
        content = content,
    )
}
