package com.sats.dna.components.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sats.dna.R
import com.sats.dna.components.LocalUseMaterial3
import com.sats.dna.components.SatsSurface
import com.sats.dna.internal.MaterialText
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview
import androidx.compose.material.Card as M2Card

@Composable
fun SatsCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    if (LocalUseMaterial3.current) {
        ElevatedCard(
            modifier = modifier,
            shape = SatsTheme.shapes.roundedCorners.small,
            colors = CardDefaults.elevatedCardColors(
                containerColor = SatsTheme.colors2.surfaces.primary.bg.default,
                contentColor = SatsTheme.colors2.surfaces.primary.fg.default,
            ),
            elevation = CardDefaults.elevatedCardElevation(1.dp),
        ) {
            content()
        }
    } else {
        M2Card(
            modifier = modifier,
            shape = SatsTheme.shapes.roundedCorners.small,
            backgroundColor = SatsTheme.colors2.surfaces.primary.bg.default,
            contentColor = SatsTheme.colors2.surfaces.primary.fg.default,
            content = content,
        )
    }
}

@LightDarkPreview
@Composable
private fun Material3Preview() {
    SatsTheme {
        CompositionLocalProvider(LocalUseMaterial3 provides true) {
            SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default) {
                SatsCard(Modifier.padding(SatsTheme.spacing.m)) {
                    Column {
                        Image(
                            painterResource(R.drawable.debug_img_placeholder),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(16f / 9),
                            contentScale = ContentScale.Crop,
                        )

                        Column(Modifier.padding(SatsTheme.spacing.m), Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
                            MaterialText(
                                text = "Material 3",
                                style = SatsTheme.typography.medium.large,
                            )

                            MaterialText(
                                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                            )
                        }
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
        CompositionLocalProvider(LocalUseMaterial3 provides false) {
            SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default) {
                SatsCard(Modifier.padding(SatsTheme.spacing.m)) {
                    Column {
                        Image(
                            painterResource(R.drawable.debug_img_placeholder),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .aspectRatio(16f / 9),
                            contentScale = ContentScale.Crop,
                        )

                        Column(Modifier.padding(SatsTheme.spacing.m), Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
                            MaterialText(
                                text = "Material 2",
                                style = SatsTheme.typography.medium.large,
                            )

                            MaterialText(
                                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                            )
                        }
                    }
                }
            }
        }
    }
}
