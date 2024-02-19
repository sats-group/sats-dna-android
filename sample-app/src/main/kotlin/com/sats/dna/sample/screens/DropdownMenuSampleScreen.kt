package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsDropdownMenu
import com.sats.dna.components.SatsDropdownMenuItem
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.SatsIconButton
import com.sats.dna.components.card.SatsCard
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object DropdownMenuSampleScreen : SampleScreen(
    name = "Dropdown Menu",
    route = "/components/dropdown-menu",
    screen = { DropdownMenuScreen(it::navigateUp) },
)

@Composable
private fun DropdownMenuScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Dropdown Menu", navigateUp, modifier) { innerPadding ->
        SatsCard(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .widthIn(max = 512.dp)
                .fillMaxWidth()
                .aspectRatio(1920 / 1080f),
        ) {
            Box {
                val (selectedItem, selectItem) = remember { mutableIntStateOf(1) }
                var isDropdownMenuOpen by remember { mutableStateOf(false) }

                val items = (1..3).map { index ->
                    SatsDropdownMenuItem.selectable(
                        text = "Menu item #$index",
                        onClick = {
                            selectItem(index)
                            isDropdownMenuOpen = false
                        },
                        isSelected = selectedItem == index,
                    )
                }

                Column(
                    Modifier.align(Alignment.Center),
                    verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text("Menu item #$selectedItem", style = SatsTheme.typography.normal.headline2)
                    Text("Selected item", color = SatsTheme.colors2.surfaces.primary.fg.alternate)
                }

                Box(Modifier.align(Alignment.TopEnd)) {
                    SatsIconButton(
                        onClick = { isDropdownMenuOpen = true },
                        icon = SatsTheme.icons.moreVertical,
                        onClickLabel = null,
                        colors = SatsButtonColor.Transparent,
                    )

                    SatsDropdownMenu(isDropdownMenuOpen, {}, items, Modifier)
                }
            }
        }
    }
}

@LightDarkPreview
@Composable
private fun DropdownMenuScreenPreview() {
    SatsTheme {
        DropdownMenuScreen(navigateUp = {})
    }
}
