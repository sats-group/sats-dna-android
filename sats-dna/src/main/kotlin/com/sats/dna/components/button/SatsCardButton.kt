package com.sats.dna.components.button

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.SatsVerticalDivider
import com.sats.dna.components.card.SatsCard
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsCardButton(
    onClick: () -> Unit,
    text: String,
    icon: Painter,
    shape: Shape,
    modifier: Modifier = Modifier,
    alignment: Alignment.Horizontal,
) {
    SatsSurface(modifier = modifier, shape = shape) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs, alignment),
            modifier = Modifier
                .clickable(onClick = onClick)
                .padding(
                    vertical = SatsTheme.spacing.s,
                    horizontal = SatsTheme.spacing.m,
                ),
        ) {
            MaterialIcon(icon, null, tint = SatsTheme.colors2.buttons.action.default.fg)
            Text(text, color = SatsTheme.colors2.buttons.action.default.fg)
        }
    }
}

@Composable
fun SatsNavigationCardButton(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
) {
    SatsSurface(modifier = modifier, shape = SatsTheme.shapes.roundedCorners.small) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .clickable(onClick = onClick)
                .padding(
                    vertical = SatsTheme.spacing.s,
                    horizontal = SatsTheme.spacing.m,
                ),
        ) {
            Text(text, color = SatsTheme.colors2.buttons.action.default.fg)
            MaterialIcon(SatsTheme.icons.arrowRight, null, tint = SatsTheme.colors2.buttons.action.default.fg)
        }
    }
}

@Composable
fun SatsStandAloneCardButton(
    onClick: () -> Unit,
    text: String,
    icon: Painter,
    modifier: Modifier = Modifier,
    alignment: Alignment.Horizontal = Alignment.Start,
) {
    SatsCard(
        modifier = modifier,
    ) {
        SatsCardButton(
            onClick = onClick,
            text = text,
            icon = icon,
            shape = SatsTheme.shapes.roundedCorners.extraSmall,
            alignment = alignment,
        )
    }
}

@Composable
fun SatsTwoOptionsStandAloneCardButton(
    firstOptionOnClick: () -> Unit,
    firstOptionText: String,
    firstOptionIcon: Painter,
    secondOptionOnClick: () -> Unit,
    secondOptionText: String,
    secondOptionIcon: Painter,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxs),
    ) {
        SatsStandAloneCardButton(
            modifier = Modifier.weight(1f),
            onClick = firstOptionOnClick,
            text = firstOptionText,
            icon = firstOptionIcon,
            alignment = Alignment.CenterHorizontally,
        )
        SatsStandAloneCardButton(
            modifier = Modifier.weight(1f),
            onClick = secondOptionOnClick,
            text = secondOptionText,
            icon = secondOptionIcon,
            alignment = Alignment.CenterHorizontally,
        )
    }
}

@Composable
fun SatsInCardCardButton(
    onClick: () -> Unit,
    text: String,
    icon: Painter,
    modifier: Modifier = Modifier,
    alignment: Alignment.Horizontal = Alignment.Start,
) {
    SatsSurface(
        modifier = modifier,
    ) {
        Column {
            SatsHorizontalDivider()
            SatsCardButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = onClick,
                text = text,
                icon = icon,
                shape = SatsTheme.shapes.rectangle,
                alignment = alignment,
            )
        }
    }
}

@Composable
fun SatsTwoOptionsInCardCardButton(
    firstOptionOnClick: () -> Unit,
    firstOptionText: String,
    firstOptionIcon: Painter,
    secondOptionOnClick: () -> Unit,
    secondOptionText: String,
    secondOptionIcon: Painter,
    modifier: Modifier = Modifier,
) {
    SatsSurface(modifier) {
        Column(Modifier.height(IntrinsicSize.Min)) {
            SatsHorizontalDivider()
            Row(
                Modifier.height(IntrinsicSize.Min),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
            ) {
                SatsCardButton(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    onClick = firstOptionOnClick,
                    text = firstOptionText,
                    icon = firstOptionIcon,
                    shape = SatsTheme.shapes.rectangle,
                    alignment = Alignment.CenterHorizontally,
                )
                SatsVerticalDivider()
                SatsCardButton(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    onClick = secondOptionOnClick,
                    text = secondOptionText,
                    icon = secondOptionIcon,
                    shape = SatsTheme.shapes.rectangle,
                    alignment = Alignment.CenterHorizontally,
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsNavigationCardButtonPreview() {
    SatsTheme {
        SatsNavigationCardButton(modifier = Modifier.fillMaxWidth(), onClick = {}, text = "Give us feedback on the app")
    }
}

@PreviewLightDark
@Composable
private fun SatsStandAloneCardButtonPreview() {
    SatsTheme {
        SatsStandAloneCardButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = {},
            text = "Schedule",
            icon = SatsTheme.icons.calendar,
        )
    }
}

@PreviewLightDark
@Composable
private fun SatsTwoOptionsStandAloneCardButtonPreview() {
    SatsTheme {
        SatsTwoOptionsStandAloneCardButton(
            modifier = Modifier.fillMaxWidth(),
            firstOptionOnClick = {},
            firstOptionText = "Add workout",
            firstOptionIcon = SatsTheme.icons.add,
            secondOptionOnClick = {},
            secondOptionText = "Schedule",
            secondOptionIcon = SatsTheme.icons.calendar,
        )
    }
}

@PreviewLightDark
@Composable
private fun SatsInCardCardButtonPreview() {
    SatsTheme {
        SatsInCardCardButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = {},
            text = "Schedule",
            icon = SatsTheme.icons.calendar,
        )
    }
}

@PreviewFontScale
@PreviewLightDark
@Composable
private fun SatsTwoOptionsInCardCardButtonPreview() {
    SatsTheme {
        SatsTwoOptionsInCardCardButton(
            modifier = Modifier.fillMaxWidth(),
            firstOptionOnClick = {},
            firstOptionText = "Book",
            firstOptionIcon = SatsTheme.icons.time,
            secondOptionOnClick = {},
            secondOptionText = "Schedule",
            secondOptionIcon = SatsTheme.icons.calendar,
        )
    }
}
