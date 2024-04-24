package com.sats.dna.icons

import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Percentage: ImageVector
    get() {
        if (_percentage != null) {
            return _percentage!!
        }

        _percentage = materialIcon(name = "Percentage") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(19.23f, 4.77f)
                curveToRelative(0.36f, 0.37f, 0.36f, 0.96f, 0f, 1.33f)
                lineTo(6.1f, 19.23f)
                curveToRelative(-0.09f, 0.08f, -0.19f, 0.15f, -0.3f, 0.2f)
                curveToRelative(-0.12f, 0.05f, -0.24f, 0.07f, -0.36f, 0.07f)
                curveToRelative(-0.13f, 0f, -0.25f, -0.02f, -0.36f, -0.07f)
                curveToRelative(-0.11f, -0.05f, -0.22f, -0.12f, -0.3f, -0.2f)
                curveToRelative(-0.1f, -0.1f, -0.16f, -0.2f, -0.2f, -0.3f)
                curveToRelative(-0.05f, -0.12f, -0.08f, -0.24f, -0.08f, -0.37f)
                curveToRelative(0f, -0.12f, 0.03f, -0.24f, 0.07f, -0.36f)
                curveToRelative(0.05f, -0.11f, 0.12f, -0.21f, 0.2f, -0.3f)
                lineTo(17.9f, 4.77f)
                curveToRelative(0.37f, -0.36f, 0.96f, -0.36f, 1.33f, 0f)
                close()
                moveTo(7.3f, 8.25f)
                curveToRelative(0.25f, 0f, 0.49f, -0.1f, 0.67f, -0.27f)
                curveTo(8.15f, 7.8f, 8.25f, 7.56f, 8.25f, 7.3f)
                curveToRelative(0f, -0.25f, -0.1f, -0.48f, -0.27f, -0.66f)
                curveTo(7.8f, 6.47f, 7.56f, 6.38f, 7.3f, 6.38f)
                curveToRelative(-0.25f, 0f, -0.48f, 0.1f, -0.66f, 0.27f)
                curveToRelative(-0.18f, 0.18f, -0.27f, 0.41f, -0.27f, 0.66f)
                curveToRelative(0f, 0.25f, 0.1f, 0.49f, 0.27f, 0.67f)
                curveToRelative(0.18f, 0.17f, 0.41f, 0.27f, 0.66f, 0.27f)
                close()
                moveToRelative(0f, 1.88f)
                curveToRelative(0.75f, 0f, 1.46f, -0.3f, 2f, -0.83f)
                curveToRelative(0.52f, -0.53f, 0.81f, -1.24f, 0.81f, -1.99f)
                curveToRelative(0f, -0.74f, -0.3f, -1.46f, -0.82f, -1.99f)
                curveTo(8.77f, 4.8f, 8.06f, 4.5f, 7.31f, 4.5f)
                curveToRelative(-0.74f, 0f, -1.46f, 0.3f, -1.99f, 0.82f)
                curveToRelative(-0.52f, 0.53f, -0.82f, 1.25f, -0.82f, 2f)
                curveToRelative(0f, 0.74f, 0.3f, 1.45f, 0.82f, 1.98f)
                curveToRelative(0.53f, 0.53f, 1.25f, 0.82f, 2f, 0.82f)
                close()
                moveToRelative(9.38f, 7.5f)
                curveToRelative(0.25f, 0f, 0.48f, -0.1f, 0.66f, -0.28f)
                curveToRelative(0.18f, -0.18f, 0.28f, -0.41f, 0.28f, -0.66f)
                curveToRelative(0f, -0.25f, -0.1f, -0.49f, -0.28f, -0.67f)
                curveToRelative(-0.18f, -0.17f, -0.41f, -0.27f, -0.66f, -0.27f)
                curveToRelative(-0.25f, 0f, -0.49f, 0.1f, -0.66f, 0.27f)
                curveToRelative(-0.18f, 0.18f, -0.28f, 0.42f, -0.28f, 0.67f)
                curveToRelative(0f, 0.25f, 0.1f, 0.48f, 0.28f, 0.66f)
                curveToRelative(0.17f, 0.18f, 0.4f, 0.27f, 0.66f, 0.27f)
                close()
                moveToRelative(0f, 1.87f)
                curveToRelative(0.74f, 0f, 1.46f, -0.3f, 1.99f, -0.82f)
                curveToRelative(0.52f, -0.53f, 0.82f, -1.25f, 0.82f, -2f)
                curveToRelative(0f, -0.74f, -0.3f, -1.45f, -0.82f, -1.98f)
                curveToRelative(-0.53f, -0.53f, -1.25f, -0.83f, -2f, -0.83f)
                curveToRelative(-0.74f, 0f, -1.45f, 0.3f, -1.98f, 0.83f)
                reflectiveCurveToRelative(-0.82f, 1.24f, -0.82f, 1.99f)
                curveToRelative(0f, 0.74f, 0.3f, 1.46f, 0.82f, 1.99f)
                curveToRelative(0.53f, 0.52f, 1.24f, 0.82f, 1.99f, 0.82f)
                close()
            }
        }

        return _percentage!!
    }

@Suppress("ObjectPropertyName")
private var _percentage: ImageVector? = null

@Preview
@Composable
private fun SatsIconPercentagePreview() {
    Icon(SatsIcons.Percentage, contentDescription = null)
}
