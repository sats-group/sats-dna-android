package com.sats.dna.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Spotify: ImageVector
    get() {
        if (_spotify != null) {
            return _spotify!!
        }

        _spotify = materialIcon(name = "Spotify") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12.32f, 6f)
                curveToRelative(-3.44f, 0f, -6.26f, 2.82f, -6.26f, 6.26f)
                curveToRelative(0f, 3.45f, 2.82f, 6.27f, 6.26f, 6.27f)
                curveToRelative(3.45f, 0f, 6.27f, -2.82f, 6.27f, -6.27f)
                curveTo(18.59f, 8.82f, 15.8f, 6f, 12.32f, 6f)
                close()
                moveToRelative(2.9f, 9.04f)
                curveToRelative(-0.12f, 0.2f, -0.35f, 0.24f, -0.55f, 0.12f)
                curveToRelative(-1.49f, -0.9f, -3.32f, -1.1f, -5.52f, -0.59f)
                curveToRelative(-0.23f, 0.08f, -0.39f, -0.08f, -0.47f, -0.27f)
                curveToRelative(-0.07f, -0.24f, 0.08f, -0.4f, 0.28f, -0.47f)
                curveToRelative(2.39f, -0.55f, 4.46f, -0.31f, 6.06f, 0.7f)
                curveToRelative(0.24f, 0.08f, 0.28f, 0.32f, 0.2f, 0.51f)
                close()
                moveToRelative(0.74f, -1.72f)
                curveToRelative(-0.15f, 0.24f, -0.43f, 0.31f, -0.66f, 0.16f)
                curveToRelative(-1.68f, -1.02f, -4.27f, -1.33f, -6.22f, -0.7f)
                curveToRelative(-0.24f, 0.07f, -0.55f, -0.09f, -0.6f, -0.32f)
                curveToRelative(-0.07f, -0.27f, 0.05f, -0.55f, 0.32f, -0.59f)
                curveToRelative(2.27f, -0.7f, 5.09f, -0.35f, 7.05f, 0.86f)
                curveToRelative(0.15f, 0.08f, 0.27f, 0.4f, 0.11f, 0.6f)
                close()
                moveTo(16f, 11.56f)
                curveToRelative(-2f, -1.17f, -5.36f, -1.33f, -7.28f, -0.7f)
                curveToRelative(-0.3f, 0.07f, -0.62f, -0.08f, -0.7f, -0.4f)
                curveToRelative(-0.08f, -0.3f, 0.08f, -0.62f, 0.4f, -0.7f)
                curveToRelative(2.22f, -0.67f, 5.86f, -0.55f, 8.2f, 0.86f)
                curveToRelative(0.28f, 0.16f, 0.4f, 0.55f, 0.24f, 0.82f)
                curveToRelative(-0.2f, 0.2f, -0.54f, 0.28f, -0.86f, 0.12f)
                close()
            }
        }

        return _spotify!!
    }

@Suppress("ObjectPropertyName")
private var _spotify: ImageVector? = null

@Preview
@Composable
private fun SatsIconSpotifyPreview() {
    Icon(SatsIcons.Spotify, contentDescription = null)
}
