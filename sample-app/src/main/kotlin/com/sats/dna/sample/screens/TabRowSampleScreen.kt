package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.SatsTab
import com.sats.dna.components.SatsTabRow
import com.sats.dna.sample.internal.ComponentScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun TabRowSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen(title = "TabRow", navigateUp = navigateUp, modifier) { innerPadding ->
        var selectedTab by remember { mutableStateOf(SampleTabs.SampleTab1) }

        Column(modifier = Modifier.padding(innerPadding)) {
            SatsTabRow(selectedTabIndex = selectedTab.ordinal) {
                SatsTab(
                    selected = selectedTab == SampleTabs.SampleTab1,
                    text = {
                        Text("Tab 1")
                    },
                    onClick = { selectedTab = SampleTabs.SampleTab1 },
                )
                SatsTab(
                    selected = selectedTab == SampleTabs.SampleTab2,
                    text = {
                        Text("Tab 2")
                    },
                    onClick = { selectedTab = SampleTabs.SampleTab2 },
                )
            }
            when (selectedTab) {
                SampleTabs.SampleTab1 -> {
                    Text(
                        modifier = Modifier
                            .fillMaxSize()
                            .wrapContentSize(),
                        text = "This is the content of the first tab 🎉",
                    )
                }

                SampleTabs.SampleTab2 -> {
                    Text(
                        modifier = Modifier
                            .fillMaxSize()
                            .wrapContentSize(),
                        text = "This is the content of the second tab 😎",
                    )
                }
            }
        }
    }
}

private enum class SampleTabs {
    SampleTab1,
    SampleTab2,
}

@PreviewLightDark
@Composable
private fun TabRowSampleScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            TabRowSampleScreen(navigateUp = {})
        }
    }
}
