package com.sats.dna.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsCircularProgressIndicator(
    modifier: Modifier = Modifier,
    strokeWidth: Dp = 4.dp,
) {
    CircularProgressIndicator(
        modifier = modifier,
        color = SatsTheme.colors.graphicalElements.progressBar.default.fg,
        strokeWidth = strokeWidth,
        trackColor = Color.Transparent,
        strokeCap = StrokeCap.Round,
    )
}

@Composable
fun SatsCircularProgressIndicator(
    progress: Float,
    modifier: Modifier = Modifier,
    color: Color = SatsTheme.colors.graphicalElements.progressBar.default.fg,
    strokeWidth: Dp = 4.dp,
) {
    CircularProgressIndicator(
        progress = { progress },
        modifier = modifier,
        color = color,
        strokeWidth = strokeWidth,
        trackColor = Color.Transparent,
        strokeCap = StrokeCap.Round,
    )
}

@PreviewLightDark
@Composable
private fun SatsCircularProgressIndicatorPreview(@PreviewParameter(ProgressPreviewProvider::class) progress: Float) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsCircularProgressIndicator(progress, Modifier.padding(SatsTheme.spacing.m))
        }
    }
}

private class ProgressPreviewProvider : PreviewParameterProvider<Float> {
    override val values = sequenceOf(.2f, .4f, .6f, .8f)
}
