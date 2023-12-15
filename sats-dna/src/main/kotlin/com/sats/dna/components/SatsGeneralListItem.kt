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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.internal.MaterialText
import com.sats.dna.internal.materialIconTint
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

/**
 * @param trailingContent trailing content of list item. Consider using [TrailingContent].
 */
@Composable
fun SatsGeneralListItem(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String? = null,
    icon: Painter? = null,
    trailingContent: @Composable (() -> Unit)? = null,
    colors: SatsGeneralListItemColors = SatsGeneralListItemDefaults.generalListItemColors(),
    isEnabled: Boolean = true,
) {
    SatsSurface(modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
            modifier = Modifier
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
}

object TrailingContent {
    @Composable
    fun Icon(
        icon: Painter,
        tint: Color = materialIconTint(),
    ) {
        MaterialIcon(icon, null, tint = tint, modifier = Modifier.size(18.dp))
    }

    @Composable
    fun TextAndIcon(
        text: String,
        icon: Painter,
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
}

interface SatsGeneralListItemColors {
    val titleColor: Color
    val subtitleColor: Color
    val iconColor: Color
}

object SatsGeneralListItemDefaults {
    @Composable
    fun generalListItemColors(
        titleColor: Color = SatsTheme.colors2.surfaces.primary.fg.default,
        subtitleColor: Color = SatsTheme.colors2.surfaces.primary.fg.alternate,
        iconColor: Color = SatsTheme.colors2.surfaces.primary.fg.default,
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

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                icon = SatsTheme.icons.questionMark,
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun WithSubtitle() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                subtitle = "Subtitle",
                icon = SatsTheme.icons.questionMark,
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun WithTrailingContentPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                icon = SatsTheme.icons.questionMark,
                trailingContent = { SimpleTrailingContent() },
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun WithAdvancedTrailingContentPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                icon = SatsTheme.icons.questionMark,
                trailingContent = { AdvancedTrailingContent() },
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun WithNonDefaultColorsPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                icon = SatsTheme.icons.info,
                colors = SatsGeneralListItemDefaults.generalListItemColors(
                    iconColor = SatsTheme.colors2.graphicalElements.icons.attention,
                ),
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun WithoutIconPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default) {
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

@Composable
fun SimpleTrailingContent() {
    TrailingContent.Icon(SatsTheme.icons.arrowRight)
}

@Composable
fun AdvancedTrailingContent() {
    TrailingContent.TextAndIcon(text = "Label", icon = SatsTheme.icons.arrowRight)
}
