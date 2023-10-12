package com.sats.dna.components.card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sats.dna.colors.satsContentColorFor
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsCard(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    val containerColor = SatsTheme.colors.surface.primary
    val colors = CardDefaults.elevatedCardColors(
        containerColor = containerColor,
        contentColor = satsContentColorFor(containerColor),
    )

    ElevatedCard(modifier, SatsTheme.shapes.roundedCorners.small, colors) {
        content()
    }
}

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsCard(Modifier.padding(SatsTheme.spacing.m)) {
                Column {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .aspectRatio(16f / 9)
                            .background(SatsTheme.colors.waitingList.primary),
                    ) {
                        Text(
                            text = "Image",
                            modifier = Modifier.align(Alignment.Center),
                            color = SatsTheme.colors.onWaitingList.primary,
                            style = SatsTheme.typography.default.heading1,
                        )
                    }

                    Column(Modifier.padding(SatsTheme.spacing.m), Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
                        Text("Some title", style = SatsTheme.typography.medium.large)

                        Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis facilisis turpis maximus.")
                    }
                }
            }
        }
    }
}
