package com.sats.dna.components.button

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.SatsVerticalDivider
import com.sats.dna.components.card.SatsCard
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.theme.SatsTheme

@Composable
fun CardButton(
    onClick: () -> Unit,
    text: String,
    icon: Painter,
    modifier: Modifier = Modifier,
    shape: Shape,
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
            MaterialIcon(icon, null, tint = SatsTheme.colors2.buttons.action.default)
            Text(text, color = SatsTheme.colors2.buttons.action.default)
        }
    }
}

@Composable
fun NavigationCardButton(
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
            Text(text, color = SatsTheme.colors2.buttons.action.default)
            MaterialIcon(SatsTheme.icons.arrowRight, null, tint = SatsTheme.colors2.buttons.action.default)
        }
    }
}

@Composable
fun StandAloneCardButton(
    onClick: () -> Unit,
    text: String,
    icon: Painter,
    modifier: Modifier = Modifier,
    alignment: Alignment.Horizontal = Alignment.Start,
) {
    SatsCard(
        modifier = modifier,
    ) {
        CardButton(
            onClick = onClick,
            text = text,
            icon = icon,
            shape = SatsTheme.shapes.roundedCorners.extraSmall,
            alignment = alignment,
        )
    }
}

@Composable
fun TwoOptionsStandAloneCardButton(
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
        StandAloneCardButton(
            modifier = Modifier.weight(1f),
            onClick = firstOptionOnClick,
            text = firstOptionText,
            icon = firstOptionIcon,
            alignment = Alignment.CenterHorizontally,
        )
        StandAloneCardButton(
            modifier = Modifier.weight(1f),
            onClick = secondOptionOnClick,
            text = secondOptionText,
            icon = secondOptionIcon,
            alignment = Alignment.CenterHorizontally,
        )
    }
}

@Composable
fun InCardCardButton(
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
            CardButton(
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
fun TwoOptionsInCardCardButton(
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
            Row(horizontalArrangement = Arrangement.SpaceAround) {
                CardButton(
                    modifier = Modifier.weight(1f),
                    onClick = firstOptionOnClick,
                    text = firstOptionText,
                    icon = firstOptionIcon,
                    shape = SatsTheme.shapes.rectangle,
                    alignment = Alignment.CenterHorizontally,
                )
                SatsVerticalDivider()
                CardButton(
                    modifier = Modifier.weight(1f),
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
private fun NavigationCardButtonPreview() {
    SatsTheme {
        NavigationCardButton(modifier = Modifier.fillMaxWidth(), onClick = {}, text = "Give us feedback on the app")
    }
}

@PreviewLightDark
@Composable
private fun OneOptionStandAloneCardButtonPreview() {
    SatsTheme {
        StandAloneCardButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = {},
            text = "Schedule",
            icon = SatsTheme.icons.calendar,
        )
    }
}

@PreviewLightDark
@Composable
private fun TwoOptionsStandAloneCardButtonPreview() {
    SatsTheme {
        TwoOptionsStandAloneCardButton(
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
private fun OneOptionInCardCardButtonPreview() {
    SatsTheme {
        InCardCardButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = {},
            text = "Schedule",
            icon = SatsTheme.icons.calendar,
        )
    }
}

@PreviewLightDark
@Composable
private fun TwoOptionInCardCardButtonPreview() {
    SatsTheme {
        TwoOptionsInCardCardButton(
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
