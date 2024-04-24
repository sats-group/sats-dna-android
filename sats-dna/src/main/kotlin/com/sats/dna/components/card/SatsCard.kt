package com.sats.dna.components.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.R
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    SatsSurface(
        modifier = modifier,
        color = SatsTheme.colors.surfaces.primary.default.bg,
        shape = SatsTheme.shapes.roundedCorners.small,
        elevation = 1.dp,
        content = content,
    )
}

@PreviewLightDark
@Composable
private fun Material3Preview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsCard(Modifier.padding(SatsTheme.spacing.m)) {
                Column {
                    Image(
                        painter = painterResource(R.drawable.debug_img_placeholder),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(16f / 9),
                        contentScale = ContentScale.Crop,
                    )

                    Column(Modifier.padding(SatsTheme.spacing.m), Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
                        Text(
                            text = "Material 3",
                            style = SatsTheme.typography.medium.large,
                        )

                        Text(
                            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                        )
                    }
                }
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun Material2Preview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            SatsCard(Modifier.padding(SatsTheme.spacing.m)) {
                Column {
                    Image(
                        painter = painterResource(R.drawable.debug_img_placeholder),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(16f / 9),
                        contentScale = ContentScale.Crop,
                    )

                    Column(Modifier.padding(SatsTheme.spacing.m), Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
                        Text(
                            text = "Material 2",
                            style = SatsTheme.typography.medium.large,
                        )

                        Text(
                            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                        )
                    }
                }
            }
        }
    }
}
