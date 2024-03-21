package com.sats.dna.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.SatsIconButton
import com.sats.dna.components.card.SatsCard
import com.sats.dna.icons.SatsIcons
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsTitledSection(
    title: String,
    modifier: Modifier = Modifier,
    action: SatsTitledSectionAction? = null,
    content: @Composable (contentPadding: PaddingValues) -> Unit,
) {
    Column(modifier) {
        val contentPadding = PaddingValues(horizontal = SatsTheme.spacing.m)

        SectionHeader(title, action, Modifier.padding(contentPadding))

        content(contentPadding)
    }
}

@Immutable
sealed interface SatsTitledSectionAction {
    class Chevron(
        val onClick: () -> Unit,
        val onClickLabel: String?,
    ) : SatsTitledSectionAction
}

@Composable
private fun SectionHeader(
    title: String,
    action: SatsTitledSectionAction?,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 48.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        MaterialText(title, style = SatsTheme.typography.medium.large)

        when (action) {
            is SatsTitledSectionAction.Chevron -> ChevronAction(action)
            null -> Unit
        }
    }
}

@Composable
private fun ChevronAction(action: SatsTitledSectionAction.Chevron) {
    SatsIconButton(
        onClick = action.onClick,
        icon = SatsIcons.arrowRight,
        onClickLabel = action.onClickLabel,
        colors = SatsButtonColor.Action,
    )
}

@PreviewLightDark
@Composable
private fun SatsTitledSectionPreview() {
    SatsTheme {
        SatsSurface(
            modifier = Modifier.fillMaxWidth(),
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsTitledSection("Section Title") { contentPadding ->
                SatsCard(
                    Modifier
                        .padding(contentPadding)
                        .fillMaxWidth(),
                ) {
                    SatsPlaceholderParagraph(Modifier.padding(SatsTheme.spacing.m))
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsTitledSectionWithChevronActionPreview() {
    SatsTheme {
        SatsSurface(
            modifier = Modifier.fillMaxWidth(),
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsTitledSection(
                title = "Section Title",
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
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsTitledSectionScrollableRowPreview() {
    SatsTheme {
        SatsSurface(
            modifier = Modifier.fillMaxWidth(),
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsTitledSection("Section Title") { contentPadding ->
                Row(
                    Modifier
                        .horizontalScroll(rememberScrollState())
                        .padding(contentPadding),
                    horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
                ) {
                    repeat(10) {
                        Box(
                            Modifier
                                .size(56.dp)
                                .clip(SatsTheme.shapes.circle)
                                .background(LocalContentColor.current),
                        )
                    }
                }
            }
        }
    }
}
