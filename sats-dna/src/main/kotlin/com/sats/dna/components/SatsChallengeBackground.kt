package com.sats.dna.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.GreyScaleModifier
import com.sats.dna.R
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsChallengeBackground(modifier: Modifier = Modifier, isEnabled: Boolean = true, content: @Composable () -> Unit) {
    SatsSurface(
        modifier = if (!isEnabled) {
            modifier.then(GreyScaleModifier())
        } else {
            modifier
        },
        color = SatsTheme.colors.backgrounds.fixed.primary.default.bg,
        useMaterial3 = true,
    ) {
        Box(
            Modifier.paint(
                painter = painterResource(R.drawable.challenge_background_top),
                sizeToIntrinsics = false,
                contentScale = ContentScale.FillBounds,
            ),
        ) {
            content()
        }
    }
}

@Preview
@Preview(device = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=240")
@Composable
private fun SatsChallengeBackgroundPreview() {
    SatsTheme {
        SatsChallengeBackground(Modifier.fillMaxSize()) {
        }
    }
}
