package com.sats.dna.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.LocalUseMaterial3
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsTabRow(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(LocalUseMaterial3 provides true) {
        TabRow(
            selectedTabIndex = selectedTabIndex,
            containerColor = Color.Transparent,
            indicator = { tabPositions ->
                if (selectedTabIndex < tabPositions.size) {
                    TabRowDefaults.SecondaryIndicator(
                        modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                        height = 4.dp,
                        color = SatsTheme.colors.graphicalElements.selector.secondary.selected.default.bg,
                    )
                }
            },
            divider = {
                HorizontalDivider(
                    color = SatsTheme.colors.graphicalElements.selector.secondary.unselected.default.outline,
                    thickness = 2.dp,
                )
            },
            modifier = modifier,
        ) {
            content()
        }
    }
}

@Composable
fun SatsTab(
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    text: @Composable (() -> Unit)? = null,
    icon: @Composable (() -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    Tab(
        selected = selected,
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        text = text,
        icon = icon,
        selectedContentColor = SatsTheme.colors.backgrounds.primary.default.fg,
        unselectedContentColor = SatsTheme.colors.backgrounds.primary.default.fgAlternate,
        interactionSource = interactionSource,
    )
}

@PreviewLightDark
@Composable
private fun SatsTabRowPreview() {
    SatsTheme {
        SatsSurface(useMaterial3 = true) {
            SatsTabRow(selectedTabIndex = 1) {
                SatsTab(
                    selected = false,
                    text = {
                        Text("Tab 1")
                    },
                    onClick = {},
                )
                SatsTab(
                    selected = true,
                    text = {
                        Text("Tab 2")
                    },
                    onClick = {},
                )
            }
        }
    }
}
