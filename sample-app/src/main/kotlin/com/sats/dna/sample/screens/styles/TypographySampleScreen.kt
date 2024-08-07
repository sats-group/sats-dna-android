package com.sats.dna.sample.screens.styles

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.SatsVerticalDivider
import com.sats.dna.icons.ArrowDown
import com.sats.dna.icons.ArrowUp
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.theme.SatsTheme

@Composable
fun TypographySampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    SampleScreen(
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
                TextSample("Headline 1", SatsTheme.typography.normal.headline1)
                TextSample("Headline 2", SatsTheme.typography.normal.headline2)
                TextSample("Headline 3", SatsTheme.typography.normal.headline3)
                TextSample("Large", SatsTheme.typography.normal.large)
                TextSample("Basic", SatsTheme.typography.normal.basic)
                TextSample("Small", SatsTheme.typography.normal.small)
                TextSample("Button Large", SatsTheme.typography.normal.buttonLarge)
                TextSample("Button Basicn", SatsTheme.typography.normal.buttonBasic)
                TextSample("Button Small", SatsTheme.typography.normal.buttonSmall)
                TextSample("Section", SatsTheme.typography.normal.section)
            }

            SatsHorizontalDivider()

            Section("MEDIUM") {
                TextSample("Headline 1", SatsTheme.typography.medium.headline1)
                TextSample("Headline 2", SatsTheme.typography.medium.headline2)
                TextSample("Headline 3", SatsTheme.typography.medium.headline3)
                TextSample("Large", SatsTheme.typography.medium.large)
                TextSample("Basic", SatsTheme.typography.medium.basic)
                TextSample("Small", SatsTheme.typography.medium.small)
            }

            SatsHorizontalDivider()

            Section("EMPHASIS") {
                TextSample("Headline 1", SatsTheme.typography.emphasis.headline1)
                TextSample("Headline 2", SatsTheme.typography.emphasis.headline2)
                TextSample("Headline 3", SatsTheme.typography.emphasis.headline3)
                TextSample("Large", SatsTheme.typography.emphasis.large)
                TextSample("Basic", SatsTheme.typography.emphasis.basic)
                TextSample("Small", SatsTheme.typography.emphasis.small)
            }

            SatsHorizontalDivider()

            Section("SATS HEADLINE – NORMAL") {
                TextSample("Headline 1", SatsTheme.typography.satsHeadlineNormal.headline1)
                TextSample("Headline 2", SatsTheme.typography.satsHeadlineNormal.headline2)
                TextSample("Headline 3", SatsTheme.typography.satsHeadlineNormal.headline3)
                TextSample("Large", SatsTheme.typography.satsHeadlineNormal.large)
                TextSample("Basic", SatsTheme.typography.satsHeadlineNormal.basic)
                TextSample("Small", SatsTheme.typography.satsHeadlineNormal.small)
            }

            SatsHorizontalDivider()

            Section("SATS HEADLINE – EMPHASIS") {
                TextSample("Headline 1", SatsTheme.typography.satsHeadlineEmphasis.headline1)
                TextSample("Headline 2", SatsTheme.typography.satsHeadlineEmphasis.headline2)
                TextSample("Headline 3", SatsTheme.typography.satsHeadlineEmphasis.headline3)
                TextSample("Large", SatsTheme.typography.satsHeadlineEmphasis.large)
                TextSample("Basic", SatsTheme.typography.satsHeadlineEmphasis.basic)
                TextSample("Small", SatsTheme.typography.satsHeadlineEmphasis.small)
            }
        }
    }
}

@Composable
private fun Section(title: String, content: @Composable ColumnScope.() -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m)) {
        Text(title, style = SatsTheme.typography.satsHeadlineEmphasis.basic)

        Column(verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s)) {
            content()
        }
    }
}

@Composable
private fun TextSample(text: String, style: TextStyle) {
    Column {
        var isExpanded by rememberSaveable { mutableStateOf(false) }

        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(text, Modifier.weight(1f), style = style)

            IconToggleButton(checked = isExpanded, onCheckedChange = { isExpanded = it }) {
                AnimatedContent(isExpanded, label = "expand-icon") {
                    if (it) {
                        Icon(SatsIcons.ArrowUp, contentDescription = null)
                    } else {
                        Icon(SatsIcons.ArrowDown, contentDescription = null)
                    }
                }
            }
        }

        AnimatedVisibility(isExpanded) {
            Row(Modifier.height(IntrinsicSize.Min), horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s)) {
                SatsVerticalDivider()

                Column {
                    Text("Weight: ${style.fontWeight?.weight}")
                    Text("Style: ${style.fontStyle}")
                    Text("Size: ${style.fontSize}")
                    Text("Line height: ${style.lineHeight}")

                    SatsHorizontalDivider(Modifier.padding(vertical = SatsTheme.spacing.m))

                    ParagraphSample(style)
                }
            }
        }
    }
}

@Composable
private fun ParagraphSample(style: TextStyle, modifier: Modifier = Modifier) {
    Text("Lorem ipsum\ndolor sit amet.", modifier, style = style)
}

@PreviewLightDark
@Composable
private fun TypographySampleScreenPreview() {
    SatsTheme {
        TypographySampleScreen(navigateUp = {})
    }
}
