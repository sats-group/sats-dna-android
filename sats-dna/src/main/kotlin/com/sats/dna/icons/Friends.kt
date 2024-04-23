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
val SatsIcons.Friends: ImageVector
    get() {
        if (_friends != null) {
            return _friends!!
        }

        _friends = materialIcon(name = "Friends") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(6.38f, 6.38f)
                curveToRelative(-0.63f, 0f, -1.13f, 0.5f, -1.13f, 1.12f)
                curveToRelative(0f, 0.62f, 0.5f, 1.13f, 1.13f, 1.13f)
                curveTo(7f, 8.63f, 7.5f, 8.13f, 7.5f, 7.5f)
                curveToRelative(0f, -0.62f, -0.5f, -1.13f, -1.13f, -1.13f)
                close()
                moveTo(4.13f, 7.5f)
                curveToRelative(0f, -1.24f, 1f, -2.25f, 2.25f, -2.25f)
                curveToRelative(1.24f, 0f, 2.25f, 1f, 2.25f, 2.25f)
                curveToRelative(0f, 1.24f, -1.01f, 2.25f, -2.26f, 2.25f)
                curveToRelative(-1.24f, 0f, -2.25f, -1f, -2.25f, -2.25f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(4.69f, 12f)
                curveToRelative(-0.15f, 0f, -0.3f, 0.06f, -0.4f, 0.16f)
                curveToRelative(-0.1f, 0.11f, -0.17f, 0.25f, -0.17f, 0.4f)
                verticalLineToRelative(2.81f)
                horizontalLineTo(4.7f)
                curveToRelative(0.3f, 0f, 0.56f, 0.26f, 0.56f, 0.57f)
                verticalLineToRelative(2.81f)
                horizontalLineToRelative(1.69f)
                curveToRelative(0.3f, 0f, 0.56f, 0.25f, 0.56f, 0.56f)
                curveToRelative(0f, 0.31f, -0.25f, 0.57f, -0.56f, 0.57f)
                horizontalLineTo(4.69f)
                curveToRelative(-0.31f, 0f, -0.57f, -0.26f, -0.57f, -0.57f)
                verticalLineTo(16.5f)
                horizontalLineTo(3.56f)
                curveTo(3.26f, 16.5f, 3f, 16.25f, 3f, 15.94f)
                verticalLineToRelative(-3.38f)
                curveToRelative(0f, -0.45f, 0.18f, -0.87f, 0.5f, -1.2f)
                curveToRelative(0.31f, -0.3f, 0.74f, -0.48f, 1.19f, -0.48f)
                horizontalLineTo(5.8f)
                curveToRelative(0.31f, 0f, 0.57f, 0.25f, 0.57f, 0.56f)
                curveToRelative(0f, 0.3f, -0.26f, 0.56f, -0.57f, 0.56f)
                horizontalLineTo(4.7f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(17.63f, 8.63f)
                curveToRelative(0.62f, 0f, 1.12f, -0.5f, 1.12f, -1.13f)
                curveToRelative(0f, -0.62f, -0.5f, -1.13f, -1.13f, -1.13f)
                curveToRelative(-0.62f, 0f, -1.12f, 0.5f, -1.12f, 1.13f)
                curveToRelative(0f, 0.62f, 0.5f, 1.13f, 1.13f, 1.13f)
                close()
                moveToRelative(2.25f, -1.13f)
                curveToRelative(0f, 1.24f, -1.01f, 2.25f, -2.25f, 2.25f)
                curveToRelative(-1.25f, 0f, -2.25f, -1f, -2.25f, -2.25f)
                curveToRelative(0f, -1.24f, 1f, -2.25f, 2.24f, -2.25f)
                curveToRelative(1.25f, 0f, 2.25f, 1f, 2.25f, 2.25f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(17.63f, 11.44f)
                curveToRelative(0f, -0.31f, 0.25f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(1.12f)
                curveToRelative(0.45f, 0f, 0.88f, 0.17f, 1.2f, 0.49f)
                curveToRelative(0.31f, 0.32f, 0.49f, 0.74f, 0.49f, 1.2f)
                verticalLineToRelative(3.37f)
                curveToRelative(0f, 0.3f, -0.25f, 0.56f, -0.56f, 0.56f)
                horizontalLineToRelative(-0.57f)
                verticalLineToRelative(2.81f)
                curveToRelative(0f, 0.31f, -0.25f, 0.57f, -0.56f, 0.57f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(-0.3f, 0f, -0.56f, -0.26f, -0.56f, -0.57f)
                curveToRelative(0f, -0.3f, 0.25f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(1.69f)
                verticalLineToRelative(-2.81f)
                curveToRelative(0f, -0.31f, 0.25f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(0.57f)
                verticalLineToRelative(-2.82f)
                curveToRelative(0f, -0.15f, -0.06f, -0.29f, -0.17f, -0.4f)
                curveToRelative(-0.1f, -0.1f, -0.25f, -0.16f, -0.4f, -0.16f)
                horizontalLineTo(18.2f)
                curveToRelative(-0.31f, 0f, -0.57f, -0.25f, -0.57f, -0.56f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 4.13f)
                curveToRelative(-0.93f, 0f, -1.69f, 0.75f, -1.69f, 1.68f)
                curveToRelative(0f, 0.93f, 0.76f, 1.69f, 1.69f, 1.69f)
                curveToRelative(0.93f, 0f, 1.69f, -0.76f, 1.69f, -1.69f)
                curveToRelative(0f, -0.93f, -0.76f, -1.68f, -1.69f, -1.68f)
                close()
                moveTo(9.19f, 5.8f)
                curveTo(9.19f, 4.26f, 10.45f, 3f, 12f, 3f)
                reflectiveCurveToRelative(2.81f, 1.26f, 2.81f, 2.81f)
                curveToRelative(0f, 1.56f, -1.26f, 2.82f, -2.81f, 2.82f)
                reflectiveCurveTo(9.19f, 7.37f, 9.19f, 5.8f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(10.31f, 10.88f)
                curveToRelative(-0.45f, 0f, -0.87f, 0.17f, -1.2f, 0.49f)
                curveToRelative(-0.3f, 0.32f, -0.48f, 0.74f, -0.48f, 1.2f)
                verticalLineToRelative(2.8f)
                horizontalLineToRelative(0.56f)
                curveToRelative(0.3f, 0f, 0.56f, 0.26f, 0.56f, 0.57f)
                verticalLineToRelative(3.94f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-3.94f)
                curveToRelative(0f, -0.31f, 0.25f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(0.56f)
                verticalLineToRelative(-2.82f)
                curveToRelative(0f, -0.45f, -0.17f, -0.87f, -0.49f, -1.2f)
                curveToRelative(-0.32f, -0.3f, -0.74f, -0.48f, -1.2f, -0.48f)
                horizontalLineToRelative(-3.37f)
                close()
                moveToRelative(5.06f, 5.62f)
                horizontalLineToRelative(0.57f)
                curveToRelative(0.3f, 0f, 0.56f, -0.25f, 0.56f, -0.56f)
                verticalLineToRelative(-3.38f)
                curveToRelative(0f, -0.74f, -0.3f, -1.46f, -0.82f, -1.99f)
                curveToRelative(-0.53f, -0.52f, -1.25f, -0.82f, -2f, -0.82f)
                horizontalLineToRelative(-3.37f)
                curveToRelative(-0.74f, 0f, -1.46f, 0.3f, -1.99f, 0.82f)
                curveToRelative(-0.52f, 0.53f, -0.82f, 1.25f, -0.82f, 2f)
                verticalLineToRelative(3.37f)
                curveToRelative(0f, 0.3f, 0.25f, 0.56f, 0.56f, 0.56f)
                horizontalLineToRelative(0.56f)
                verticalLineToRelative(3.94f)
                curveToRelative(0f, 0.3f, 0.26f, 0.56f, 0.57f, 0.56f)
                horizontalLineToRelative(5.62f)
                curveToRelative(0.31f, 0f, 0.56f, -0.25f, 0.56f, -0.56f)
                verticalLineTo(16.5f)
                close()
            }
        }

        return _friends!!
    }

@Suppress("ObjectPropertyName")
private var _friends: ImageVector? = null

@Preview
@Composable
private fun SatsIconFriendsPreview() {
    Icon(SatsIcons.Friends, contentDescription = null)
}
