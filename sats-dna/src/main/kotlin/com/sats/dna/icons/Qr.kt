package com.sats.dna.icons

import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Qr: ImageVector
    get() {
        if (_qr != null) {
            return _qr!!
        }

        _qr = materialIcon(name = "Qr") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(10.44f, 9.52f)
                curveToRelative(0f, 0.41f, -0.33f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(7.22f)
                curveToRelative(-0.41f, 0f, -0.74f, -0.34f, -0.74f, -0.75f)
                verticalLineTo(6.85f)
                curveToRelative(0f, -0.41f, 0.33f, -0.75f, 0.74f, -0.75f)
                horizontalLineTo(9.7f)
                curveToRelative(0.42f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(2.67f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(17.7f, 9.52f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-2.47f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(6.85f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.47f)
                curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(2.67f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(10.44f, 17.15f)
                curveToRelative(0f, 0.41f, -0.33f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(7.22f)
                curveToRelative(-0.41f, 0f, -0.74f, -0.34f, -0.74f, -0.75f)
                verticalLineToRelative(-2.67f)
                curveToRelative(0f, -0.41f, 0.33f, -0.75f, 0.74f, -0.75f)
                horizontalLineTo(9.7f)
                curveToRelative(0.42f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(2.67f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(17.7f, 17.15f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-2.47f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineToRelative(-2.67f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.47f)
                curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(2.67f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(1.68f, 7.92f)
                verticalLineTo(4.56f)
                curveToRelative(0f, -1.65f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(3.28f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(22.32f, 7.92f)
                verticalLineTo(4.56f)
                curveToRelative(0f, -1.65f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-3.28f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(1.68f, 16.08f)
                verticalLineToRelative(3.36f)
                curveToRelative(0f, 1.65f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(3.28f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(22.32f, 16.08f)
                verticalLineToRelative(3.36f)
                curveToRelative(0f, 1.65f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-3.28f)
            }
        }

        return _qr!!
    }

@Suppress("ObjectPropertyName")
private var _qr: ImageVector? = null

@Preview
@Composable
private fun SatsIconQrPreview() {
    Icon(SatsIcons.Qr, contentDescription = null)
}
