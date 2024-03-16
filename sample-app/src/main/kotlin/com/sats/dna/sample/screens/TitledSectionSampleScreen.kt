package com.sats.dna.sample.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.SatsTitledSection
import com.sats.dna.components.SatsTitledSectionAction
import com.sats.dna.components.card.SatsCard
import com.sats.dna.theme.SatsTheme

data object TitledSectionSampleScreen : SampleScreen(
    name = "Titled Section",
    route = "/components/titled-section",
    screen = { TitledSectionScreen(it::navigateUp) },
)

@Composable
fun TitledSectionScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Titled Section", navigateUp, modifier) { innerPadding ->
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.l),
        ) {
            SatsTitledSection("Section Title with one item") { contentPadding ->
                SatsCard(
                    Modifier
                        .padding(contentPadding)
                        .fillMaxWidth(),
                ) {
                    Column(
                        modifier = Modifier.padding(SatsTheme.spacing.m),
                        verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
                    ) {
                        Text(
                            text = "A titled section is used for sections of a screen that has a title and an " +
                                "optional action in its header. They are opinionated in what type of action is " +
                                "allowed, and also on horizontal padding for the heading and action.",
                        )

                        Text(
                            text = "Any type of content is allowed underneath the section header, however, and " +
                                "that content is given knowledge about the horizontal padding that it should " +
                                "consume and can decide when and where it should consume it. This is particularly " +
                                "useful for when the content contains something that is able to go off-screen, such " +
                                "as a carousel.",
                        )
                    }
                }
            }

            SatsTitledSection(
                title = "Section Title with chevron",
                action = SatsTitledSectionAction.Chevron(onClick = {}, onClickLabel = null),
            ) { contentPadding ->
                Row(
                    modifier = Modifier.padding(contentPadding),
                    horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
                ) {
                    repeat(3) {
                        Box(
                            Modifier
                                .weight(1f)
                                .aspectRatio(1f)
                                .clip(SatsTheme.shapes.circle)
                                .background(LocalContentColor.current),
                        )
                    }
                }
            }

            SatsTitledSection("Section Title with carousel") { contentPadding ->
                Row(
                    Modifier
                        .horizontalScroll(rememberScrollState())
                        .padding(contentPadding),
                    horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
                ) {
                    repeat(10) {
                        Box(
                            Modifier
                                .size(64.dp)
                                .clip(SatsTheme.shapes.circle)
                                .background(LocalContentColor.current),
                        )
                    }
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun TitledSectionScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds2.primary.default.bg, useMaterial3 = true) {
            TitledSectionScreen(navigateUp = {})
        }
    }
}
