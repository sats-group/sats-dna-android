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
val SatsIcons.Clubs: ImageVector
    get() {
        if (_clubs != null) {
            return _clubs!!
        }

        _clubs = materialIcon(name = "Clubs") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(15.92f, 6.82f)
                horizontalLineToRelative(5.7f)
                curveToRelative(0.48f, 0f, 0.86f, 0.15f, 1.13f, 0.45f)
                curveToRelative(0.27f, 0.3f, 0.4f, 0.7f, 0.4f, 1.22f)
                verticalLineToRelative(12.15f)
                curveToRelative(0f, 0.52f, -0.13f, 0.93f, -0.4f, 1.23f)
                curveToRelative(-0.27f, 0.3f, -0.65f, 0.45f, -1.13f, 0.45f)
                lineToRelative(-6.18f, -0.02f)
                lineTo(2.4f, 22.32f)
                curveToRelative(-0.48f, 0f, -0.86f, -0.15f, -1.14f, -0.45f)
                curveToRelative(-0.27f, -0.3f, -0.4f, -0.7f, -0.4f, -1.23f)
                verticalLineTo(3.56f)
                curveToRelative(0f, -0.51f, 0.13f, -0.92f, 0.4f, -1.22f)
                curveTo(1.53f, 2.04f, 1.91f, 1.9f, 2.4f, 1.9f)
                horizontalLineToRelative(12f)
                curveToRelative(0.47f, 0f, 0.84f, 0.15f, 1.11f, 0.45f)
                curveToRelative(0.28f, 0.3f, 0.42f, 0.7f, 0.42f, 1.22f)
                verticalLineToRelative(3.26f)
                close()
                moveTo(1.97f, 3f)
                curveTo(2.03f, 2.94f, 2.14f, 2.87f, 2.4f, 2.87f)
                horizontalLineToRelative(12f)
                curveToRelative(0.25f, 0f, 0.34f, 0.07f, 0.39f, 0.13f)
                curveToRelative(0.08f, 0.08f, 0.16f, 0.23f, 0.16f, 0.56f)
                lineToRelative(0.01f, 17.76f)
                lineTo(2.4f, 21.34f)
                curveToRelative(-0.25f, 0f, -0.36f, -0.07f, -0.42f, -0.13f)
                curveToRelative(-0.06f, -0.07f, -0.15f, -0.23f, -0.15f, -0.57f)
                verticalLineTo(3.56f)
                curveToRelative(0f, -0.33f, 0.09f, -0.48f, 0.15f, -0.56f)
                close()
                moveToRelative(13.96f, 18.32f)
                lineToRelative(5.69f, 0.02f)
                curveToRelative(0.26f, 0f, 0.35f, -0.07f, 0.4f, -0.13f)
                curveToRelative(0.07f, -0.07f, 0.16f, -0.22f, 0.16f, -0.57f)
                verticalLineTo(8.49f)
                curveToRelative(0f, -0.34f, -0.1f, -0.49f, -0.16f, -0.56f)
                curveToRelative(-0.05f, -0.05f, -0.14f, -0.13f, -0.4f, -0.13f)
                horizontalLineToRelative(-5.69f)
                verticalLineToRelative(7.28f)
                verticalLineToRelative(6.24f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(20.02f, 12.07f)
                horizontalLineToRelative(-1.56f)
                curveToRelative(-0.2f, 0f, -0.3f, -0.1f, -0.3f, -0.32f)
                verticalLineToRelative(-1.51f)
                curveToRelative(0f, -0.2f, 0.1f, -0.31f, 0.3f, -0.31f)
                horizontalLineToRelative(1.56f)
                curveToRelative(0.2f, 0f, 0.3f, 0.1f, 0.3f, 0.3f)
                verticalLineToRelative(1.52f)
                curveToRelative(0f, 0.22f, -0.1f, 0.32f, -0.3f, 0.32f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(20.02f, 15.67f)
                horizontalLineToRelative(-1.56f)
                curveToRelative(-0.2f, 0f, -0.3f, -0.1f, -0.3f, -0.3f)
                verticalLineToRelative(-1.52f)
                curveToRelative(0f, -0.2f, 0.1f, -0.31f, 0.3f, -0.31f)
                horizontalLineToRelative(1.56f)
                curveToRelative(0.2f, 0f, 0.3f, 0.1f, 0.3f, 0.3f)
                verticalLineToRelative(1.52f)
                curveToRelative(0f, 0.2f, -0.1f, 0.31f, -0.3f, 0.31f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(20.02f, 19.27f)
                horizontalLineToRelative(-1.56f)
                curveToRelative(-0.2f, 0f, -0.3f, -0.1f, -0.3f, -0.3f)
                verticalLineToRelative(-1.52f)
                curveToRelative(0f, -0.21f, 0.1f, -0.31f, 0.3f, -0.31f)
                horizontalLineToRelative(1.56f)
                curveToRelative(0.2f, 0f, 0.3f, 0.1f, 0.3f, 0.3f)
                verticalLineToRelative(1.52f)
                curveToRelative(0f, 0.2f, -0.1f, 0.31f, -0.3f, 0.31f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(6.3f, 21.46f)
                horizontalLineTo(5.17f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0f, -0.4f, 0.09f, -0.69f, 0.27f, -0.87f)
                curveTo(5.62f, 17f, 5.9f, 16.9f, 6.28f, 16.9f)
                horizontalLineToRelative(4.32f)
                curveToRelative(0.38f, 0f, 0.66f, 0.1f, 0.84f, 0.28f)
                curveToRelative(0.18f, 0.18f, 0.27f, 0.47f, 0.27f, 0.86f)
                verticalLineToRelative(3.41f)
                horizontalLineToRelative(-1.13f)
                verticalLineToRelative(-3.1f)
                curveToRelative(0f, -0.22f, -0.11f, -0.33f, -0.34f, -0.33f)
                horizontalLineToRelative(-3.6f)
                curveToRelative(-0.23f, 0f, -0.34f, 0.11f, -0.34f, 0.33f)
                verticalLineToRelative(3.1f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(7.2f, 7.78f)
                horizontalLineTo(5.31f)
                curveToRelative(-0.24f, 0f, -0.36f, -0.13f, -0.36f, -0.38f)
                verticalLineTo(5.56f)
                curveToRelative(0f, -0.24f, 0.12f, -0.37f, 0.36f, -0.37f)
                horizontalLineToRelative(1.87f)
                curveToRelative(0.25f, 0f, 0.38f, 0.13f, 0.38f, 0.37f)
                verticalLineTo(7.4f)
                curveToRelative(0f, 0.25f, -0.13f, 0.38f, -0.38f, 0.38f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(11.55f, 7.78f)
                horizontalLineTo(9.66f)
                curveToRelative(-0.23f, 0f, -0.35f, -0.13f, -0.35f, -0.38f)
                verticalLineTo(5.56f)
                curveToRelative(0f, -0.24f, 0.12f, -0.37f, 0.35f, -0.37f)
                horizontalLineToRelative(1.89f)
                curveToRelative(0.24f, 0f, 0.37f, 0.13f, 0.37f, 0.37f)
                verticalLineTo(7.4f)
                curveToRelative(0f, 0.25f, -0.13f, 0.38f, -0.37f, 0.38f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(7.2f, 11.56f)
                horizontalLineTo(5.31f)
                curveToRelative(-0.24f, 0f, -0.36f, -0.12f, -0.36f, -0.36f)
                verticalLineTo(9.37f)
                curveTo(4.96f, 9.12f, 5.08f, 9f, 5.32f, 9f)
                horizontalLineToRelative(1.87f)
                curveToRelative(0.25f, 0f, 0.38f, 0.13f, 0.38f, 0.38f)
                verticalLineToRelative(1.83f)
                curveToRelative(0f, 0.24f, -0.13f, 0.36f, -0.38f, 0.36f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(11.55f, 11.56f)
                horizontalLineTo(9.66f)
                curveToRelative(-0.23f, 0f, -0.35f, -0.12f, -0.35f, -0.36f)
                verticalLineTo(9.37f)
                curveTo(9.31f, 9.12f, 9.43f, 9f, 9.66f, 9f)
                horizontalLineToRelative(1.89f)
                curveToRelative(0.24f, 0f, 0.37f, 0.13f, 0.37f, 0.38f)
                verticalLineToRelative(1.83f)
                curveToRelative(0f, 0.24f, -0.13f, 0.36f, -0.37f, 0.36f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(7.2f, 15.35f)
                horizontalLineTo(5.31f)
                curveToRelative(-0.24f, 0f, -0.36f, -0.12f, -0.36f, -0.37f)
                verticalLineToRelative(-1.82f)
                curveToRelative(0f, -0.25f, 0.12f, -0.37f, 0.36f, -0.37f)
                horizontalLineToRelative(1.87f)
                curveToRelative(0.25f, 0f, 0.38f, 0.12f, 0.38f, 0.37f)
                verticalLineToRelative(1.82f)
                curveToRelative(0f, 0.25f, -0.13f, 0.37f, -0.38f, 0.37f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(11.55f, 15.35f)
                horizontalLineTo(9.66f)
                curveToRelative(-0.23f, 0f, -0.35f, -0.12f, -0.35f, -0.37f)
                verticalLineToRelative(-1.82f)
                curveToRelative(0f, -0.25f, 0.12f, -0.37f, 0.35f, -0.37f)
                horizontalLineToRelative(1.89f)
                curveToRelative(0.24f, 0f, 0.37f, 0.12f, 0.37f, 0.37f)
                verticalLineToRelative(1.82f)
                curveToRelative(0f, 0.25f, -0.13f, 0.37f, -0.37f, 0.37f)
                close()
            }
        }

        return _clubs!!
    }

@Suppress("ObjectPropertyName")
private var _clubs: ImageVector? = null

@Preview
@Composable
private fun SatsIconClubsPreview() {
    Icon(SatsIcons.Clubs, contentDescription = null)
}
