package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.appbar.M3SatsTopAppBar
import com.sats.dna.components.appbar.SatsTopAppBar
import com.sats.dna.components.screen.M3SatsScreen
import com.sats.dna.components.screen.SatsScreen
import com.sats.dna.theme.SatsTheme
import androidx.compose.material3.Icon as M3Icon
import androidx.compose.material3.IconButton as M3IconButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun ComponentScreen(
    title: String,
    navigateUp: () -> Unit,
    useMaterial3: Boolean = false,
    bottomBar: @Composable () -> Unit = { Box(Modifier.navigationBarsPadding()) },
    content: @Composable (innerPadding: PaddingValues) -> Unit,
) {
    if (useMaterial3) {
        M3SatsScreen(
            topBar = {
                M3SatsTopAppBar(
                    navigationIcon = {
                        M3IconButton(navigateUp) {
                            M3Icon(SatsTheme.icons.back, contentDescription = null)
                        }
                    },
                    title = title,
                )
            },
            bottomBar = bottomBar,
            content = content,
        )
    } else {
        SatsScreen(
            topBar = {
                SatsTopAppBar(
                    contentPadding = WindowInsets.statusBars.asPaddingValues(),
                    navigationIcon = {
                        IconButton(navigateUp) {
                            Icon(SatsTheme.icons.back, contentDescription = null)
                        }
                    },
                    title = { Text(title) },
                )
            },
            bottomBar = bottomBar,
            content = content,
        )
    }
}
