package com.sats.dna.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.colors.SatsColorPrimitives
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.SatsIconButton
import com.sats.dna.components.card.SatsCard
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsTitledCard(
    title: String,
    modifier: Modifier = Modifier,
    action: SatsTitledCardAction? = null,
    content: @Composable (PaddingValues) -> Unit,
) {
    SatsCard(modifier) {
        val innerPadding = PaddingValues(
            top = CardHeaderHeight,
            start = SatsTheme.spacing.m,
            end = SatsTheme.spacing.m,
            bottom = SatsTheme.spacing.m,
        )

        Box {
            content(innerPadding)

            CardHeader(title, action, modifier = Modifier.fillMaxWidth())
        }
    }
}

sealed interface SatsTitledCardAction {
    val action: () -> Unit

    class Chevron(
        override val action: () -> Unit,
        val contentDescription: String?,
    ) : SatsTitledCardAction
}

@Composable
private fun CardHeader(title: String, action: SatsTitledCardAction?, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .height(CardHeaderHeight)
            .padding(start = SatsTheme.spacing.m, end = SatsTheme.spacing.xxs),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        MaterialText(
            text = title,
            style = SatsTheme.typography.satsHeadlineEmphasis.large,
            color = SatsColorPrimitives.SatsCoral100,
        )

        if (action != null) {
            when (action) {
                is SatsTitledCardAction.Chevron -> {
                    SatsIconButton(
                        onClick = action.action,
                        icon = SatsTheme.icons.arrowRight,
                        onClickLabel = action.contentDescription,
                        colors = SatsButtonColor.Action,
                    )
                }
            }
        }
    }
}

private val CardHeaderHeight = 48.dp

@PreviewLightDark
@Composable
private fun SatsTitledCardWithoutActionPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsTitledCard(
                title = "Lorem ipsum",
                modifier = Modifier.padding(SatsTheme.spacing.m),
            ) {
                SatsPlaceholderParagraph(
                    modifier = Modifier.padding(it),
                    lines = 5,
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsTitledCardWithChevronActionPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsTitledCard(
                title = "Lorem ipsum",
                action = SatsTitledCardAction.Chevron(action = {}, contentDescription = null),
                modifier = Modifier.padding(SatsTheme.spacing.m),
            ) {
                SatsPlaceholderParagraph(
                    modifier = Modifier.padding(it),
                    lines = 5,
                )
            }
        }
    }
}
