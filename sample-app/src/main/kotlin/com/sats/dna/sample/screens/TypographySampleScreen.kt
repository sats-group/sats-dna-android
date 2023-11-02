package com.sats.dna.sample.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object TypographySampleScreen : SampleScreen(
    name = "Typography",
    route = "/typography",
    screen = { TypographyScreen(it::navigateUp) },
)

@Composable
private fun TypographyScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen(
        title = "Typography",
        navigateUp = navigateUp,
        modifier = modifier,
    ) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.l),
        ) {
            Section("NORMAL") {
                TextSample2("Headline 1", SatsTheme.typography.normal.headline1)
                TextSample2("Headline 2", SatsTheme.typography.normal.headline2)
                TextSample2("Headline 3", SatsTheme.typography.normal.headline3)
                TextSample2("Large", SatsTheme.typography.normal.large)
                TextSample2("Basic", SatsTheme.typography.normal.basic)
                TextSample2("Small", SatsTheme.typography.normal.small)
                TextSample2("Button", SatsTheme.typography.normal.button)
                TextSample2("Section", SatsTheme.typography.normal.section)
            }

            Divider()

            Section("MEDIUM") {
                TextSample2("Headline 1", SatsTheme.typography.medium.headline1)
                TextSample2("Headline 2", SatsTheme.typography.medium.headline2)
                TextSample2("Headline 3", SatsTheme.typography.medium.headline3)
                TextSample2("Large", SatsTheme.typography.medium.large)
                TextSample2("Basic", SatsTheme.typography.medium.basic)
                TextSample2("Small", SatsTheme.typography.medium.small)
            }

            Divider()

            Section("EMPHASIS") {
                TextSample2("Headline 1", SatsTheme.typography.emphasis.headline1)
                TextSample2("Headline 2", SatsTheme.typography.emphasis.headline2)
                TextSample2("Headline 3", SatsTheme.typography.emphasis.headline3)
                TextSample2("Large", SatsTheme.typography.emphasis.large)
                TextSample2("Basic", SatsTheme.typography.emphasis.basic)
                TextSample2("Small", SatsTheme.typography.emphasis.small)
            }

            Divider()

            Section("SATS HEADLINE – NORMAL") {
                TextSample2("Headline 1", SatsTheme.typography.satsHeadlineNormal.headline1)
                TextSample2("Headline 2", SatsTheme.typography.satsHeadlineNormal.headline2)
                TextSample2("Headline 3", SatsTheme.typography.satsHeadlineNormal.headline3)
                TextSample2("Large", SatsTheme.typography.satsHeadlineNormal.large)
                TextSample2("Basic", SatsTheme.typography.satsHeadlineNormal.basic)
                TextSample2("Small", SatsTheme.typography.satsHeadlineNormal.small)
            }

            Divider()

            Section("SATS HEADLINE – EMPHASIS") {
                TextSample2("Headline 1", SatsTheme.typography.satsHeadlineEmphasis.headline1)
                TextSample2("Headline 2", SatsTheme.typography.satsHeadlineEmphasis.headline2)
                TextSample2("Headline 3", SatsTheme.typography.satsHeadlineEmphasis.headline3)
                TextSample2("Large", SatsTheme.typography.satsHeadlineEmphasis.large)
                TextSample2("Basic", SatsTheme.typography.satsHeadlineEmphasis.basic)
                TextSample2("Small", SatsTheme.typography.satsHeadlineEmphasis.small)
            }
        }
    }
}

@Composable
private fun Section(title: String, content: @Composable ColumnScope.() -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m)) {
        Text(title, style = SatsTheme.typography.emphasis.basic)

        Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s)) {
            content()
        }
    }
}

@Composable
private fun TextSample2(text: String, style: TextStyle) {
    Column {
        var isExpanded by rememberSaveable { mutableStateOf(false) }

        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(text, style = style)

            IconToggleButton(checked = isExpanded, onCheckedChange = { isExpanded = it }) {
                if (isExpanded) {
                    Icon(SatsTheme.icons.arrowUp, contentDescription = null)
                } else {
                    Icon(SatsTheme.icons.arrowDown, contentDescription = null)
                }
            }
        }

        AnimatedVisibility(isExpanded) {
            Row(Modifier.height(IntrinsicSize.Min), horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s)) {
                Box(
                    Modifier
                        .fillMaxHeight()
                        .width(DividerDefaults.Thickness)
                        .background(DividerDefaults.color),
                )

                Column {
                    Text("Weight: ${style.fontWeight?.weight}")
                    Text("Style: ${style.fontStyle}")
                    Text("Size: ${style.fontSize}")
                }
            }
        }
    }
}

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        TypographyScreen(navigateUp = {})
    }
}
