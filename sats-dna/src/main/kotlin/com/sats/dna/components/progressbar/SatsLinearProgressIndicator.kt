package com.sats.dna.components.progressbar

import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsLinearProgressIndicator(
    modifier: Modifier = Modifier,
    strokeCap: StrokeCap = StrokeCap.Round,
) {
    LinearProgressIndicator(
        color = SatsTheme.colors.graphicalElements.progressBar.default.fg,
        trackColor = SatsTheme.colors.graphicalElements.progressBar.default.bg,
        strokeCap = strokeCap,
        modifier = modifier,
    )
}

@PreviewLightDark
@Composable
private fun SatsLinearProgressIndicatorPreview() {
    SatsLinearProgressIndicator()
}
