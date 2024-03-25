package com.sats.dna.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }

        _headset = materialIcon(name = "Headset") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(20.66f, 15.62f)
                curveToRelative(0.35f, 0f, 0.64f, 0.28f, 0.64f, 0.64f)
                verticalLineToRelative(2.55f)
                curveToRelative(0f, 1.76f, -1.43f, 3.19f, -3.2f, 3.19f)
                horizontalLineToRelative(-4.25f)
                curveToRelative(-0.35f, 0f, -0.64f, -0.29f, -0.64f, -0.64f)
                curveToRelative(0f, -0.35f, 0.29f, -0.64f, 0.64f, -0.64f)
                horizontalLineToRelative(4.26f)
                curveToRelative(1.05f, 0f, 1.91f, -0.85f, 1.91f, -1.91f)
                verticalLineToRelative(-2.55f)
                curveToRelative(0f, -0.36f, 0.29f, -0.64f, 0.64f, -0.64f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3f, 12f)
                curveToRelative(0f, -0.35f, 0.29f, -0.64f, 0.64f, -0.64f)
                horizontalLineToRelative(4.25f)
                curveToRelative(0.36f, 0f, 0.64f, 0.29f, 0.64f, 0.64f)
                verticalLineToRelative(5.96f)
                curveToRelative(0f, 0.35f, -0.28f, 0.64f, -0.64f, 0.64f)
                horizontalLineTo(5.34f)
                curveTo(4.04f, 18.6f, 3f, 17.55f, 3f, 16.25f)
                verticalLineTo(12f)
                close()
                moveToRelative(1.28f, 0.64f)
                verticalLineToRelative(3.61f)
                curveToRelative(0f, 0.6f, 0.47f, 1.07f, 1.06f, 1.07f)
                horizontalLineToRelative(1.92f)
                verticalLineToRelative(-4.68f)
                horizontalLineTo(4.28f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(15.77f, 12f)
                curveToRelative(0f, -0.35f, 0.28f, -0.64f, 0.63f, -0.64f)
                horizontalLineToRelative(4.26f)
                curveToRelative(0.35f, 0f, 0.64f, 0.29f, 0.64f, 0.64f)
                verticalLineToRelative(4.25f)
                curveToRelative(0f, 1.3f, -1.05f, 2.35f, -2.34f, 2.35f)
                horizontalLineTo(16.4f)
                curveToRelative(-0.35f, 0f, -0.63f, -0.29f, -0.63f, -0.64f)
                verticalLineTo(12f)
                close()
                moveToRelative(1.27f, 0.64f)
                verticalLineToRelative(4.68f)
                horizontalLineToRelative(1.92f)
                curveToRelative(0.59f, 0f, 1.06f, -0.48f, 1.06f, -1.07f)
                verticalLineToRelative(-3.61f)
                horizontalLineToRelative(-2.98f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3f, 11.15f)
                curveTo(3f, 6.1f, 7.1f, 2f, 12.15f, 2f)
                curveToRelative(5.05f, 0f, 9.15f, 4.1f, 9.15f, 9.15f)
                verticalLineTo(12f)
                curveToRelative(0f, 0.35f, -0.29f, 0.64f, -0.64f, 0.64f)
                curveToRelative(-0.35f, 0f, -0.64f, -0.29f, -0.64f, -0.64f)
                verticalLineToRelative(-0.85f)
                curveToRelative(0f, -4.35f, -3.52f, -7.87f, -7.87f, -7.87f)
                reflectiveCurveTo(4.28f, 6.8f, 4.28f, 11.15f)
                verticalLineTo(12f)
                curveToRelative(0f, 0.35f, -0.29f, 0.64f, -0.64f, 0.64f)
                curveTo(3.29f, 12.64f, 3f, 12.35f, 3f, 12f)
                verticalLineToRelative(-0.85f)
                close()
            }
        }

        return _headset!!
    }

@Suppress("ObjectPropertyName")
private var _headset: ImageVector? = null

@Preview
@Composable
private fun SatsIconHeadsetPreview() {
    Icon(SatsIcons.Headset, contentDescription = null)
}
