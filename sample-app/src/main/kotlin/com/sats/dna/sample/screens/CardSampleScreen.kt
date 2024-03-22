package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsTitledCard
import com.sats.dna.components.SatsTitledCardAction
import com.sats.dna.components.button.SatsTwoOptionsInCardCardButton
import com.sats.dna.components.card.SatsCard
import com.sats.dna.icons.SatsIcons
import com.sats.dna.theme.SatsTheme

data object CardSampleScreen : SampleScreen(
    name = "Card",
    route = "/components/card",
    screen = { SatsCardScreen(it::navigateUp) },
)

@Composable
private fun SatsCardScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("Cards", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            SatsCard(
                Modifier
                    .widthIn(max = 512.dp)
                    .fillMaxWidth()
                    .aspectRatio(16f / 9),
            ) {
                Text(
                    text = "This is a basic SATS Card",
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(),
                )
            }

            SatsTitledCard(
                title = "Titled Card",
                modifier = Modifier
                    .widthIn(max = 512.dp)
                    .fillMaxWidth()
                    .aspectRatio(16f / 9),
                action = SatsTitledCardAction.Chevron(
                    action = {},
                    contentDescription = "See more",
                ),
            ) {
                Text(
                    text = "This is the content of a SATS Titled Card",
                    modifier = Modifier
                        .padding(it)
                        .fillMaxSize()
                        .wrapContentSize(),
                )
            }

            Column {
                SatsCard(
                    Modifier
                        .widthIn(max = 512.dp)
                        .fillMaxWidth()
                        .aspectRatio(16f / 9),
                ) {
                    Text(
                        text = "This is a basic SATS Card with a Card Button",
                        modifier = Modifier
                            .fillMaxSize()
                            .wrapContentSize(),
                    )

                    SatsTwoOptionsInCardCardButton(
                        modifier = Modifier
                            .fillMaxHeight()
                            .wrapContentHeight(Alignment.Bottom),
                        firstOptionOnClick = { },
                        firstOptionText = "Add workout",
                        firstOptionIcon = SatsIcons.add,
                        secondOptionOnClick = { },
                        secondOptionText = "Schedule",
                        secondOptionIcon = SatsIcons.calendar,
                    )
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsCardScreenPreview() {
    SatsTheme {
        SatsCardScreen(navigateUp = {})
    }
}
