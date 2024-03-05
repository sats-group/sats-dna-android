package com.sats.dna.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.DrawModifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.R
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsChallengeBackground(modifier: Modifier = Modifier, isEnabled: Boolean = true, content: @Composable () -> Unit) {
    SatsSurface(
        modifier = if (!isEnabled) {
            modifier.greyScale()
        } else {
            modifier
        },
        color = SatsTheme.colors2.backgrounds.fixed.primary.bg.default,
        useMaterial3 = true,
    ) {
        Box {
            Image(
                painter = painterResource(R.drawable.challenge_background_top),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillBounds,
                colorFilter = if (!isEnabled) {
                    ColorFilter.colorMatrix(ColorMatrix().apply { setToSaturation(0f) })
                } else {
                    null
                },
            )

            content()
        }
    }
}

class GreyScaleModifier : DrawModifier {
    override fun ContentDrawScope.draw() {
        val saturationMatrix = ColorMatrix().apply { setToSaturation(0f) }
        val paint = Paint().apply {
            colorFilter = ColorFilter.colorMatrix(saturationMatrix)
        }

        drawIntoCanvas {
            it.saveLayer(Rect(0f, 0f, size.width, size.height), paint)
            drawContent()
            it.restore()
        }
    }
}

fun Modifier.greyScale() = this.then(GreyScaleModifier())

@Preview
@Preview(device = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=240")
@Composable
private fun SatsChallengeBackgroundPreview() {
    SatsTheme {
        SatsChallengeBackground(Modifier.fillMaxSize()) {
        }
    }
}
