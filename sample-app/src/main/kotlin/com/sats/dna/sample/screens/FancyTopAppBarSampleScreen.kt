package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ListItem
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import coil.compose.AsyncImage
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsFancyTopAppBar
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.SatsTag
import com.sats.dna.components.SatsTagColor
import com.sats.dna.components.button.SatsTopAppBarIconButton
import com.sats.dna.components.rememberSatsFancyTopAppBarNestedScrollConnection
import com.sats.dna.components.screen.SatsScreen
import com.sats.dna.icons.ArrowDown
import com.sats.dna.icons.ArrowUp
import com.sats.dna.icons.Back
import com.sats.dna.theme.SatsTheme
import kotlinx.coroutines.launch

@Composable
fun FancyTopAppBarSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    val scrollConnection = rememberSatsFancyTopAppBarNestedScrollConnection()

    SatsScreen(
        modifier = modifier.nestedScroll(scrollConnection),
        topBar = {
            val coroutineScope = rememberCoroutineScope()

            SatsFancyTopAppBar(
                image = { shade ->
                    Box {
                        AsyncImage(
                            modifier = Modifier.fillMaxSize(),
                            model = "https://picsum.photos/1920/1080",
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                        )

                        shade()

                        SatsTag(
                            text = "New release",
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .padding(SatsTheme.spacing.m)
                                .graphicsLayer {
                                    alpha = scrollConnection.expandFraction
                                },
                            color = SatsTagColor.Featured,
                        )
                    }
                },
                title = "GX Class That Has a Very Long Name",
                scrollConnection = scrollConnection,
                navigationIcon = {
                    SatsTopAppBarIconButton(
                        onClick = navigateUp,
                        icon = SatsIcons.Back,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )
                },
                actions = {
                    SatsTopAppBarIconButton(
                        onClick = { coroutineScope.launch { scrollConnection.collapse() } },
                        icon = SatsIcons.ArrowUp,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )

                    SatsTopAppBarIconButton(
                        onClick = { coroutineScope.launch { scrollConnection.expand() } },
                        icon = SatsIcons.ArrowDown,
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
private fun FancyTopAppBarSampleScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            FancyTopAppBarSampleScreen(navigateUp = {})
        }
    }
}
