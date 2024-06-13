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
val SatsIcons.QrScan: ImageVector
    get() {
        if (_qrScan != null) {
            return _qrScan!!
        }

        _qrScan = materialIcon(name = "QrScan") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(10.44f, 17.15f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(7.22f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineToRelative(-2.67f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineTo(9.7f)
                curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
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
                moveTo(1.68f, 14.41f)
                verticalLineToRelative(5.03f)
                curveToRelative(0f, 1.65f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(3.28f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(22.32f, 13.94f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.65f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-3.28f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(23.17f, 8.73f)
                horizontalLineTo(0.83f)
            }
        }

        return _qrScan!!
    }

@Suppress("ObjectPropertyName")
private var _qrScan: ImageVector? = null

@Preview
@Composable
private fun SatsIconQrScanPreview() {
    Icon(SatsIcons.QrScan, contentDescription = null)
}
