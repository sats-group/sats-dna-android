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
val SatsIcons.Fullscreen: ImageVector
    get() {
        if (_fullscreen != null) {
            return _fullscreen!!
        }

        _fullscreen = materialIcon(name = "Fullscreen") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(13.13f, 3.56f)
                curveToRelative(0f, -0.3f, 0.25f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(6.75f)
                curveTo(20.74f, 3f, 21f, 3.25f, 21f, 3.56f)
                verticalLineToRelative(6.75f)
                curveToRelative(0f, 0.31f, -0.25f, 0.56f, -0.56f, 0.56f)
                curveToRelative(-0.31f, 0f, -0.57f, -0.25f, -0.57f, -0.56f)
                verticalLineTo(4.12f)
                horizontalLineTo(13.7f)
                curveToRelative(-0.31f, 0f, -0.56f, -0.25f, -0.56f, -0.56f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3.56f, 13.13f)
                curveToRelative(0.31f, 0f, 0.56f, 0.25f, 0.56f, 0.56f)
                verticalLineToRelative(6.19f)
                horizontalLineToRelative(6.2f)
                curveToRelative(0.3f, 0f, 0.55f, 0.25f, 0.55f, 0.56f)
                curveToRelative(0f, 0.3f, -0.25f, 0.56f, -0.56f, 0.56f)
                horizontalLineTo(3.56f)
                curveTo(3.26f, 21f, 3f, 20.75f, 3f, 20.44f)
                verticalLineToRelative(-6.75f)
                curveToRelative(0f, -0.31f, 0.25f, -0.56f, 0.56f, -0.56f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(20.84f, 3.16f)
                curveToRelative(0.21f, 0.22f, 0.21f, 0.58f, 0f, 0.8f)
                lineTo(15.2f, 9.59f)
                curveToRelative(-0.22f, 0.21f, -0.58f, 0.21f, -0.8f, 0f)
                curveToRelative(-0.21f, -0.22f, -0.21f, -0.58f, 0f, -0.8f)
                lineToRelative(5.63f, -5.63f)
                curveToRelative(0.22f, -0.21f, 0.58f, -0.21f, 0.8f, 0f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(9.59f, 14.41f)
                curveToRelative(0.21f, 0.22f, 0.21f, 0.58f, 0f, 0.8f)
                lineToRelative(-5.63f, 5.63f)
                curveToRelative(-0.22f, 0.21f, -0.58f, 0.21f, -0.8f, 0f)
                curveToRelative(-0.21f, -0.22f, -0.21f, -0.58f, 0f, -0.8f)
                lineToRelative(5.63f, -5.63f)
                curveToRelative(0.22f, -0.21f, 0.58f, -0.21f, 0.8f, 0f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3f, 3.56f)
                curveTo(3f, 3.26f, 3.25f, 3f, 3.56f, 3f)
                horizontalLineToRelative(6.75f)
                curveToRelative(0.31f, 0f, 0.56f, 0.25f, 0.56f, 0.56f)
                curveToRelative(0f, 0.31f, -0.25f, 0.56f, -0.56f, 0.56f)
                horizontalLineTo(4.12f)
                verticalLineToRelative(6.2f)
                curveToRelative(0f, 0.3f, -0.25f, 0.55f, -0.56f, 0.55f)
                curveToRelative(-0.3f, 0f, -0.56f, -0.25f, -0.56f, -0.56f)
                verticalLineTo(3.56f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3.16f, 3.16f)
                curveToRelative(0.22f, -0.21f, 0.58f, -0.21f, 0.8f, 0f)
                lineTo(9.59f, 8.8f)
                curveToRelative(0.21f, 0.22f, 0.21f, 0.58f, 0f, 0.8f)
                curveTo(9.37f, 9.8f, 9f, 9.8f, 8.79f, 9.59f)
                lineTo(3.16f, 3.96f)
                curveToRelative(-0.21f, -0.22f, -0.21f, -0.58f, 0f, -0.8f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(20.44f, 13.13f)
                curveToRelative(0.3f, 0f, 0.56f, 0.25f, 0.56f, 0.56f)
                verticalLineToRelative(6.75f)
                curveToRelative(0f, 0.3f, -0.25f, 0.56f, -0.56f, 0.56f)
                horizontalLineToRelative(-6.75f)
                curveToRelative(-0.31f, 0f, -0.56f, -0.25f, -0.56f, -0.56f)
                curveToRelative(0f, -0.31f, 0.25f, -0.57f, 0.56f, -0.57f)
                horizontalLineToRelative(6.19f)
                verticalLineTo(13.7f)
                curveToRelative(0f, -0.31f, 0.25f, -0.56f, 0.56f, -0.56f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(14.41f, 14.41f)
                curveToRelative(0.22f, -0.21f, 0.58f, -0.21f, 0.8f, 0f)
                lineToRelative(5.63f, 5.63f)
                curveToRelative(0.21f, 0.22f, 0.21f, 0.58f, 0f, 0.8f)
                curveToRelative(-0.22f, 0.21f, -0.58f, 0.21f, -0.8f, 0f)
                lineToRelative(-5.63f, -5.63f)
                curveToRelative(-0.21f, -0.22f, -0.21f, -0.58f, 0f, -0.8f)
                close()
            }
        }

        return _fullscreen!!
    }

@Suppress("ObjectPropertyName")
private var _fullscreen: ImageVector? = null

@Preview
@Composable
private fun SatsIconFullscreenPreview() {
    Icon(SatsIcons.Fullscreen, contentDescription = null)
}
