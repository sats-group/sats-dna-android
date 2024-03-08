package com.sats.dna.sample.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ListItem
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsFancyTopAppBar
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.SatsTopAppBarIconButton
import com.sats.dna.components.rememberSatsFancyTopAppBarNestedScrollConnection
import com.sats.dna.components.screen.SatsScreen
import com.sats.dna.theme.SatsTheme
import kotlinx.coroutines.launch

data object FancyTopAppBarSampleScreen : SampleScreen(
    name = "Fancy Top App Bar",
    route = "/components/fancy-top-app-bar",
    screen = { FancyTopAppBarScreen(it::navigateUp) },
)

@Composable
fun FancyTopAppBarScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    val scrollConnection = rememberSatsFancyTopAppBarNestedScrollConnection()

    SatsScreen(
        modifier = modifier.nestedScroll(scrollConnection),
        topBar = {
            val coroutineScope = rememberCoroutineScope()

            SatsFancyTopAppBar(
                imageUrl = "https://picsum.photos/1920/1080",
                title = "GX Class That Has a Very Long Name",
                scrollConnection = scrollConnection,
                navigationIcon = {
                    SatsTopAppBarIconButton(
                        onClick = navigateUp,
                        icon = SatsTheme.icons.back,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )
                },
                actions = {
                    SatsTopAppBarIconButton(
                        onClick = { coroutineScope.launch { scrollConnection.collapse() } },
                        icon = SatsTheme.icons.arrowUp,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )

                    SatsTopAppBarIconButton(
                        onClick = { coroutineScope.launch { scrollConnection.expand() } },
                        icon = SatsTheme.icons.arrowDown,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )
                },
            )
        },
    ) { innerPadding ->
        LazyColumn(contentPadding = innerPadding) {
            items(100) {
                ListItem(headlineContent = { Text("List Item #$it") })
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun FancyTopAppBarScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            FancyTopAppBarScreen(navigateUp = {})
        }
    }
}
