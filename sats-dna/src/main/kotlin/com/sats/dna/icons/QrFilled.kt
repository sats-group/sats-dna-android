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
val SatsIcons.QrFilled: ImageVector
    get() {
        if (_qrFilled != null) {
            return _qrFilled!!
        }

        _qrFilled = materialIcon(name = "QrFilled") {
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

            path(
                fill = SolidColor(Color.Black),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(10.39f, 9.53f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(7.03f)
                curveToRelative(-0.42f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineTo(6.87f)
                curveToRelative(0f, -0.41f, 0.33f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.6f)
                curveToRelative(0.42f, 0f, 0.76f, 0.34f, 0.76f, 0.75f)
                verticalLineToRelative(2.66f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(17.9f, 9.53f)
                curveToRelative(0f, 0.41f, -0.33f, 0.75f, -0.74f, 0.75f)
                horizontalLineToRelative(-2.62f)
                curveToRelative(-0.4f, 0f, -0.74f, -0.34f, -0.74f, -0.75f)
                verticalLineTo(6.87f)
                curveToRelative(0f, -0.41f, 0.33f, -0.75f, 0.74f, -0.75f)
                horizontalLineToRelative(2.62f)
                curveToRelative(0.4f, 0f, 0.74f, 0.34f, 0.74f, 0.75f)
                verticalLineToRelative(2.66f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(10.39f, 17.13f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(7.03f)
                curveToRelative(-0.42f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineToRelative(-2.66f)
                curveToRelative(0f, -0.41f, 0.33f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.6f)
                curveToRelative(0.42f, 0f, 0.76f, 0.34f, 0.76f, 0.75f)
                verticalLineToRelative(2.66f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(17.9f, 17.13f)
                curveToRelative(0f, 0.41f, -0.33f, 0.75f, -0.74f, 0.75f)
                horizontalLineToRelative(-2.62f)
                curveToRelative(-0.4f, 0f, -0.74f, -0.34f, -0.74f, -0.75f)
                verticalLineToRelative(-2.66f)
                curveToRelative(0f, -0.41f, 0.33f, -0.75f, 0.74f, -0.75f)
                horizontalLineToRelative(2.62f)
                curveToRelative(0.4f, 0f, 0.74f, 0.34f, 0.74f, 0.75f)
                verticalLineToRelative(2.66f)
                close()
            }
        }

        return _qrFilled!!
    }

@Suppress("ObjectPropertyName")
private var _qrFilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconQrFilledPreview() {
    Icon(SatsIcons.QrFilled, contentDescription = null)
}
