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
val SatsIcons.WarningSign: ImageVector
    get() {
        if (_warningSign != null) {
            return _warningSign!!
        }

        _warningSign = materialIcon(name = "WarningSign") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(12f, 18.53f)
                curveToRelative(0.5f, 0f, 0.9f, -0.43f, 0.9f, -0.95f)
                curveToRelative(0f, -0.53f, -0.4f, -0.96f, -0.9f, -0.96f)
                reflectiveCurveToRelative(-0.9f, 0.43f, -0.9f, 0.96f)
                curveToRelative(0f, 0.52f, 0.4f, 0.95f, 0.9f, 0.95f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12.33f, 8.75f)
                curveToRelative(0.59f, 0f, 1.05f, 0.52f, 0.98f, 1.1f)
                lineToRelative(-0.52f, 5.06f)
                curveToRelative(-0.04f, 0.4f, -0.38f, 0.71f, -0.79f, 0.71f)
                curveToRelative(-0.4f, 0f, -0.75f, -0.3f, -0.79f, -0.7f)
                lineTo(10.7f, 9.84f)
                curveToRelative(-0.06f, -0.59f, 0.4f, -1.1f, 1f, -1.1f)
                horizontalLineToRelative(0.64f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(20.68f, 22.72f)
                curveToRelative(0.35f, 0f, 0.7f, -0.09f, 1f, -0.27f)
                curveToRelative(0.3f, -0.18f, 0.56f, -0.43f, 0.75f, -0.75f)
                curveToRelative(0.18f, -0.31f, 0.28f, -0.67f, 0.3f, -1.03f)
                curveToRelative(0f, -0.37f, -0.08f, -0.73f, -0.24f, -1.06f)
                lineTo(13.8f, 2.41f)
                curveToRelative(-0.17f, -0.34f, -0.43f, -0.62f, -0.75f, -0.82f)
                curveToRelative(-0.32f, -0.2f, -0.68f, -0.31f, -1.05f, -0.31f)
                reflectiveCurveToRelative(-0.73f, 0.1f, -1.05f, 0.3f)
                curveToRelative(-0.32f, 0.2f, -0.58f, 0.5f, -0.75f, 0.84f)
                lineTo(1.5f, 19.62f)
                curveToRelative(-0.16f, 0.32f, -0.24f, 0.68f, -0.23f, 1.04f)
                curveToRelative(0.01f, 0.37f, 0.11f, 0.73f, 0.3f, 1.04f)
                curveToRelative(0.17f, 0.31f, 0.43f, 0.57f, 0.74f, 0.75f)
                curveToRelative(0.3f, 0.18f, 0.64f, 0.27f, 1f, 0.27f)
                horizontalLineToRelative(17.36f)
                close()
                moveTo(2.85f, 20.28f)
                curveToRelative(-0.05f, 0.1f, -0.07f, 0.22f, -0.07f, 0.34f)
                curveToRelative(0f, 0.12f, 0.04f, 0.23f, 0.1f, 0.33f)
                curveToRelative(0.05f, 0.1f, 0.12f, 0.16f, 0.2f, 0.2f)
                curveToRelative(0.07f, 0.05f, 0.15f, 0.07f, 0.23f, 0.07f)
                horizontalLineTo(20.7f)
                curveToRelative(0.08f, 0f, 0.16f, -0.02f, 0.24f, -0.06f)
                curveToRelative(0.07f, -0.05f, 0.14f, -0.12f, 0.2f, -0.21f)
                curveToRelative(0.05f, -0.1f, 0.09f, -0.2f, 0.1f, -0.33f)
                curveToRelative(0f, -0.12f, -0.03f, -0.23f, -0.08f, -0.33f)
                lineToRelative(-8.69f, -17.2f)
                curveToRelative(-0.05f, -0.1f, -0.13f, -0.18f, -0.2f, -0.24f)
                curveTo(12.16f, 2.8f, 12.07f, 2.78f, 12f, 2.78f)
                curveToRelative(-0.08f, 0f, -0.17f, 0.02f, -0.25f, 0.07f)
                curveTo(11.67f, 2.91f, 11.59f, 3f, 11.54f, 3.1f)
                lineTo(2.85f, 20.3f)
                close()
            }
        }

        return _warningSign!!
    }

@Suppress("ObjectPropertyName")
private var _warningSign: ImageVector? = null

@Preview
@Composable
private fun SatsIconWarningSignPreview() {
    Icon(SatsIcons.WarningSign, contentDescription = null)
}
