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
val SatsIcons.Profile: ImageVector
    get() {
        if (_profile != null) {
            return _profile!!
        }

        _profile = materialIcon(name = "Profile") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(4.24f, 18.05f)
                lineToRelative(-0.1f, 0.17f)
                lineToRelative(0.43f, 1.5f)
                lineToRelative(0.53f, -0.8f)
                curveToRelative(1.19f, -1.85f, 3.98f, -3.06f, 6.95f, -3.06f)
                curveToRelative(2.92f, 0f, 5.7f, 1.2f, 6.9f, 3.06f)
                lineToRelative(0.3f, 0.41f)
                lineToRelative(0.71f, -1.1f)
                lineToRelative(-0.11f, -0.18f)
                curveToRelative(-1.15f, -1.78f, -3.16f, -2.86f, -5.42f, -3.3f)
                curveToRelative(1.69f, -0.92f, 2.76f, -2.81f, 2.76f, -4.93f)
                curveToRelative(0f, -2.88f, -2.18f, -5.43f, -5.15f, -5.43f)
                curveToRelative(-2.95f, 0f, -5.16f, 2.54f, -5.14f, 5.44f)
                curveToRelative(0f, 2.15f, 1.1f, 4f, 2.8f, 4.91f)
                curveToRelative(-2.3f, 0.43f, -4.31f, 1.53f, -5.46f, 3.31f)
                close()
                moveToRelative(4f, -8.23f)
                curveToRelative(0f, 2.39f, 1.67f, 4.15f, 3.8f, 4.18f)
                curveToRelative(2.14f, 0.03f, 3.82f, -1.8f, 3.82f, -4.18f)
                curveToRelative(0f, -2.24f, -1.68f, -4.1f, -3.81f, -4.1f)
                curveToRelative(-2.14f, 0f, -3.83f, 1.86f, -3.82f, 4.1f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(1.42f, 12f)
                curveToRelative(0f, -5.84f, 4.74f, -10.58f, 10.58f, -10.58f)
                horizontalLineToRelative(0.01f)
                curveToRelative(5.84f, 0f, 10.58f, 4.74f, 10.58f, 10.58f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 5.84f, -4.74f, 10.58f, -10.58f, 10.58f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-5.84f, 0f, -10.58f, -4.74f, -10.58f, -10.58f)
                close()
            }
        }

        return _profile!!
    }

@Suppress("ObjectPropertyName")
private var _profile: ImageVector? = null

@Preview
@Composable
private fun SatsIconProfilePreview() {
    Icon(SatsIcons.Profile, contentDescription = null)
}
