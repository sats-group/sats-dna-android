package com.sats.dna.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.SatsIcons
import com.sats.dna.icons.ArrowRight
import com.sats.dna.icons.Info
import com.sats.dna.icons.Question
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.internal.MaterialText
import com.sats.dna.internal.materialIconTint
import com.sats.dna.theme.SatsTheme

/**
 * @param trailingContent trailing content of list item. Consider using [TrailingContent].
 */
@Composable
fun SatsGeneralListItem(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String? = null,
    icon: ImageVector? = null,
    trailingContent: @Composable (() -> Unit)? = null,
    colors: SatsGeneralListItemColors = SatsGeneralListItemDefaults.generalListItemColors(),
    isEnabled: Boolean = true,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        modifier = modifier
            .clickable(onClick = onClick, enabled = isEnabled)
            .padding(
                vertical = SatsTheme.spacing.s,
                horizontal = SatsTheme.spacing.m,
            ),
    ) {
        icon?.let {
            MaterialIcon(
                it,
                null,
                tint = colors.iconColor,
                modifier = Modifier.size(18.dp),
            )
        }
        Column(Modifier.weight(1f)) {
            MaterialText(title, color = colors.titleColor)
            subtitle?.let {
                MaterialText(it, color = colors.subtitleColor)
            }
        }
        trailingContent?.let {
            it()
        }
    }
}

object TrailingContent {
    @Composable
    fun Icon(
        icon: ImageVector,
        tint: Color = materialIconTint(),
    ) {
        MaterialIcon(icon, null, tint = tint, modifier = Modifier.size(18.dp))
    }

    @Composable
    fun TextAndIcon(
        text: String,
        icon: ImageVector,
        tint: Color = materialIconTint(),
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            MaterialText(text, color = tint)
            MaterialIcon(icon, null, tint = tint, modifier = Modifier.size(18.dp))
        }
    }

    @Composable
    fun Loading() {
        SatsCircularProgressIndicator(Modifier.size(18.dp), strokeWidth = 2.dp)
    }
}

interface SatsGeneralListItemColors {
    val titleColor: Color
    val subtitleColor: Color
    val iconColor: Color
}

object SatsGeneralListItemDefaults {
    @Composable
    fun generalListItemColors(
        titleColor: Color = SatsTheme.colors2.surfaces.primary.default.fg,
        subtitleColor: Color = SatsTheme.colors2.surfaces.primary.default.fgAlternate,
        iconColor: Color = SatsTheme.colors2.surfaces.primary.default.fg,
    ): SatsGeneralListItemColors = DefaultSatsGeneralListItem(
        titleColor = titleColor,
        subtitleColor = subtitleColor,
        iconColor = iconColor,
    )
}

@Immutable
private class DefaultSatsGeneralListItem(
    override val titleColor: Color,
    override val subtitleColor: Color,
    override val iconColor: Color,
) : SatsGeneralListItemColors

@PreviewLightDark
@Composable
private fun GeneralListItemPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                icon = SatsIcons.Question,
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun GeneralListItemWithSubtitlePreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                subtitle = "Subtitle",
                icon = SatsIcons.Question,
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun WithTrailingContentPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                icon = SatsIcons.Question,
                trailingContent = { SimpleTrailingContent() },
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun WithAdvancedTrailingContentPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                icon = SatsIcons.Question,
                trailingContent = { AdvancedTrailingContent() },
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun WithNonDefaultColorsPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                icon = SatsIcons.Info,
                colors = SatsGeneralListItemDefaults.generalListItemColors(
                    iconColor = SatsTheme.colors2.graphicalElements.icons.attention,
                ),
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun WithoutIconPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.default.bg) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                subtitle = "Subtitle",
                trailingContent = { SimpleTrailingContent() },
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsGeneralListItemLoadingPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsTheme {
                SatsSurface(color = SatsTheme.colors2.backgrounds.primary.default.bg) {
                    SatsGeneralListItem(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = {},
                        title = "Title",
                        subtitle = "Subtitle",
                        trailingContent = { TrailingContent.Loading() },
                    )
                }
            }
        }
    }
}

@Composable
fun SimpleTrailingContent() {
    TrailingContent.Icon(SatsIcons.ArrowRight)
}

@Composable
fun AdvancedTrailingContent() {
    TrailingContent.TextAndIcon(text = "Label", icon = SatsIcons.ArrowRight)
}
