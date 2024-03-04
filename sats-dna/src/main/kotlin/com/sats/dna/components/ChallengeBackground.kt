package com.sats.dna.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.R
import com.sats.dna.theme.SatsTheme

@Composable
fun ChallengeBackground(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    SatsSurface(modifier, color = SatsTheme.colors2.backgrounds.fixed.primary.bg.default, useMaterial3 = true) {
        Box {
            Image(
                painter = painterResource(R.drawable.challenge_background_top),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillBounds,
            )

            content()
        }
    }
}

@Preview
@Preview(device = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=240")
@Composable
private fun ChallengeBackgroundPreview() {
    SatsTheme {
        ChallengeBackground(Modifier.fillMaxSize()) {
        }
    }
}
