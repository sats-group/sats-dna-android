package com.sats.dna.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsGeneralListItem(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String? = null,
    icon: Painter,
    trailingContent: @Composable (() -> Unit)? = null,
    colors: SatsGeneralListItemColors = SatsGeneralListItemDefaults.generalListItemColors(),
) {
    SatsSurface(modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
            modifier = Modifier
                .clickable(onClick = onClick)
                .padding(
                    vertical = SatsTheme.spacing.s,
                    horizontal = SatsTheme.spacing.m
                ),
        ) {
            Icon(icon, null, tint = colors.iconColor)
            Column(Modifier.weight(1f)) {
                Text(title, color = colors.titleColor)
                subtitle?.let {
                    Text(it, color = colors.subtitleColor)
                }
            }
            trailingContent?.let {
                it()
            }
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
        titleColor: Color = SatsTheme.colors.onSurface.primary,
        subtitleColor: Color = SatsTheme.colors.onSurface.secondary,
        iconColor: Color = SatsTheme.colors.onSurface.primary,
    ): SatsGeneralListItemColors = DefaultSatsGeneralListItem(
        titleColor = titleColor,
        subtitleColor = subtitleColor,
        iconColor = iconColor,
    )
}

@Immutable
class DefaultSatsGeneralListItem(
    override val titleColor: Color,
    override val subtitleColor: Color,
    override val iconColor: Color,
) : SatsGeneralListItemColors

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                icon = SatsTheme.icons.info,
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun WithSubtitle() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                subtitle = "Subtitle",
                icon = SatsTheme.icons.info,
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun WithTrailingContentPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                icon = SatsTheme.icons.info,
                trailingContent = { SimpleTrailingContent() },
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun WithAdvancedTrailingContentPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                icon = SatsTheme.icons.info,
                trailingContent = { AdvancedTrailingContent() },
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun WithNonDefaultColorsPreview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                icon = SatsTheme.icons.info,
                colors = DefaultSatsGeneralListItem(
                    titleColor = SatsTheme.colors.cta.default,
                    subtitleColor = SatsTheme.colors.cta.default,
                    iconColor = SatsTheme.colors.cta.default
                ),
            )
        }
    }
}

@Composable
fun SimpleTrailingContent() {
    Icon(SatsTheme.icons.arrowRight, contentDescription = null)
}

@Composable
fun AdvancedTrailingContent() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
    ) {
        Text("Label")
        Icon(SatsTheme.icons.arrowRight, contentDescription = null)
    }
}
