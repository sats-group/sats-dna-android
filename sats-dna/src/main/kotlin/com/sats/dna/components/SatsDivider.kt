package com.sats.dna.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsHorizontalDivider(
    modifier: Modifier = Modifier,
    thickness: Dp = 1.dp,
    color: SatsDividerColor = SatsDividerColor.Default,
) {
    val targetThickness = if (thickness == Dp.Hairline) {
        (1f / LocalDensity.current.density).dp
    } else {
        thickness
    }

    Box(
        modifier
            .fillMaxWidth()
            .height(targetThickness)
            .background(color.composeColor),
    )
}

@Composable
fun SatsVerticalDivider(
    modifier: Modifier = Modifier,
    thickness: Dp = 1.dp,
    color: SatsDividerColor = SatsDividerColor.Default,
) {
    val targetThickness = if (thickness == Dp.Hairline) {
        (1f / LocalDensity.current.density).dp
    } else {
        thickness
    }

    Box(
        modifier
            .fillMaxHeight()
            .width(targetThickness)
            .background(color.composeColor),
    )
}

enum class SatsDividerColor {
    Default, Alternate
}

private val SatsDividerColor.composeColor: Color
    @Composable get() = when (this) {
        SatsDividerColor.Default -> SatsTheme.colors.graphicalElements.divider.default
        SatsDividerColor.Alternate -> SatsTheme.colors.graphicalElements.divider.alternate
    }

@PreviewLightDark
@Composable
private fun SatsHorizontalDividerPreview() {
    SatsTheme {
        SatsSurface(Modifier.size(200.dp), color = SatsTheme.colors.backgrounds.primary.default.bg) {
            Column(
                modifier = Modifier.padding(vertical = SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(
                    SatsTheme.spacing.m,
                    Alignment.CenterVertically,
                ),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                SatsHorizontalDivider()
                SatsHorizontalDivider(Modifier.fillMaxWidth(.75f))
                SatsHorizontalDivider(Modifier.fillMaxWidth(.50f))
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsVerticalDividerPreview() {
    SatsTheme {
        SatsSurface(Modifier.size(200.dp), color = SatsTheme.colors.backgrounds.primary.default.bg) {
            Row(
                modifier = Modifier.padding(horizontal = SatsTheme.spacing.m),
                horizontalArrangement = Arrangement.spacedBy(
                    SatsTheme.spacing.m,
                    Alignment.CenterHorizontally,
                ),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                SatsVerticalDivider()
                SatsVerticalDivider(Modifier.fillMaxHeight(.75f))
                SatsVerticalDivider(Modifier.fillMaxHeight(.50f))
            }
        }
    }
}
