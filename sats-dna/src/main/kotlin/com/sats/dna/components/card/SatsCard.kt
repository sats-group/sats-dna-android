package com.sats.dna.components.card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview
import androidx.compose.material.Card as M2Card

@Composable
fun SatsCard(modifier: Modifier = Modifier, useMaterial3: Boolean = false, content: @Composable () -> Unit) {
    if (useMaterial3) {
        ElevatedCard(
            modifier = modifier,
            shape = SatsTheme.shapes.roundedCorners.small,
            colors = CardDefaults.elevatedCardColors(
                containerColor = SatsTheme.colors.surface.primary,
                contentColor = SatsTheme.colors.onSurface.primary,
            ),
            elevation = CardDefaults.elevatedCardElevation(1.dp),
        ) {
            content()
        }
    } else {
        M2Card(
            modifier = modifier,
            shape = SatsTheme.shapes.roundedCorners.small,
            backgroundColor = SatsTheme.colors.surface.primary,
            contentColor = SatsTheme.colors.onSurface.primary,
            content = content,
        )
    }
}

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            SatsCard(Modifier.padding(SatsTheme.spacing.m), useMaterial3 = true) {
                Column {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .aspectRatio(16f / 9)
                            .background(SatsTheme.colors.waitingList.primary),
                    ) {
                        Text("Image", Modifier.align(Alignment.Center), color = SatsTheme.colors.onWaitingList.primary)
                    }

                    Column(Modifier.padding(SatsTheme.spacing.m), Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
                        Text("Material 3", style = SatsTheme.typography.medium.large)

                        Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
                    }
                }
            }
        }
    }
}

@LightDarkPreview
@Composable
private fun Material2Preview() {
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
                        Text("Image", Modifier.align(Alignment.Center), color = SatsTheme.colors.onWaitingList.primary)
                    }

                    Column(Modifier.padding(SatsTheme.spacing.m), Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
                        Text("Material 2", style = SatsTheme.typography.medium.large)

                        Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
                    }
                }
            }
        }
    }
}
