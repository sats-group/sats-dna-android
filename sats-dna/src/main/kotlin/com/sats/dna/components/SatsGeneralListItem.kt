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
    useMaterial3: Boolean = false,
) {
    SatsSurface(modifier, useMaterial3 = useMaterial3) {
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
                    useMaterial3,
                    it,
                    null,
                    tint = colors.iconColor,
                    modifier = Modifier.size(18.dp),
                )
            }
            Column(Modifier.weight(1f)) {
                MaterialText(useMaterial3, title, color = colors.titleColor)
                subtitle?.let {
                    MaterialText(useMaterial3, it, color = colors.subtitleColor)
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
        useMaterial3: Boolean = false,
        tint: Color = materialIconTint(useMaterial3),
    ) {
        MaterialIcon(useMaterial3, icon, null, tint = tint, modifier = Modifier.size(18.dp))
    }

    @Composable
    fun TextAndIcon(
        text: String,
        icon: Painter,
        useMaterial3: Boolean = false,
        tint: Color = materialIconTint(useMaterial3),
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            MaterialText(useMaterial3, text, color = tint)
            MaterialIcon(useMaterial3, icon, null, tint = tint, modifier = Modifier.size(18.dp))
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
        SatsSurface(color = SatsTheme.colors.background.primary, useMaterial3 = true) {
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
        SatsSurface(color = SatsTheme.colors.background.primary, useMaterial3 = true) {
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
        SatsSurface(color = SatsTheme.colors.background.primary, useMaterial3 = true) {
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
        SatsSurface(color = SatsTheme.colors.background.primary, useMaterial3 = true) {
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
        SatsSurface(color = SatsTheme.colors.background.primary, useMaterial3 = true) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "Title",
                icon = SatsTheme.icons.questionMark,
                colors = DefaultSatsGeneralListItem(
                    titleColor = SatsTheme.colors.cta.default,
                    subtitleColor = SatsTheme.colors.cta.default,
                    iconColor = SatsTheme.colors.cta.default,
                ),
            )
        }
    }
}

@LightDarkPreview
@Composable
private fun WithoutIconPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
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
