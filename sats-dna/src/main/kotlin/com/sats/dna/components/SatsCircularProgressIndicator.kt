package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsCircularProgressIndicator(
    modifier: Modifier = Modifier,
    color: Color = SatsTheme.colors.primary.default,
    strokeWidth: Dp = 4.dp,
    backgroundColor: Color = Color.Transparent,
    strokeCap: StrokeCap = StrokeCap.Round,
) {
    CircularProgressIndicator(
        modifier = modifier,
        color = color,
        strokeWidth = strokeWidth,
        backgroundColor = backgroundColor,
        strokeCap = strokeCap,
    )
}

@Composable
fun SatsCircularProgressIndicator(
    progress: Float,
    modifier: Modifier = Modifier,
    color: Color = SatsTheme.colors.primary.default,
    strokeWidth: Dp = 4.dp,
    backgroundColor: Color = Color.Transparent,
    strokeCap: StrokeCap = StrokeCap.Round,
) {
    CircularProgressIndicator(
        progress = progress,
        modifier = modifier,
        color = color,
        strokeWidth = strokeWidth,
        backgroundColor = backgroundColor,
        strokeCap = strokeCap,
    )
}

@LightDarkPreview
@Composable
private fun Preview(@PreviewParameter(ProgressPreviewProvider::class) progress: Float) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            SatsCircularProgressIndicator(progress, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

private class ProgressPreviewProvider : PreviewParameterProvider<Float> {
    override val values = sequenceOf(.2f, .4f, .6f, .8f)
}
