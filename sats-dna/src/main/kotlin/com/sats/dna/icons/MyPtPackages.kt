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
val SatsIcons.MyPtPackages: ImageVector
    get() {
        if (_myPtPackages != null) {
            return _myPtPackages!!
        }

        _myPtPackages = materialIcon(name = "MyPtPackages") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(14.3f, 22.62f)
                horizontalLineTo(9.7f)
                curveToRelative(-1.13f, 0f, -2.04f, -0.92f, -2.04f, -2.05f)
                verticalLineToRelative(-6.54f)
                lineToRelative(-2.4f, 2.02f)
                lineToRelative(1.22f, 1.93f)
                curveToRelative(0.46f, 0.72f, 0.24f, 1.67f, -0.47f, 2.12f)
                curveToRelative(-0.72f, 0.45f, -1.67f, 0.24f, -2.12f, -0.47f)
                lineToRelative(-1.45f, -2.29f)
                curveToRelative(-0.34f, -0.53f, -0.47f, -1.16f, -0.38f, -1.77f)
                curveToRelative(0.1f, -0.61f, 0.4f, -1.18f, 0.89f, -1.6f)
                lineToRelative(3.31f, -2.78f)
                curveToRelative(0.83f, -0.7f, 1.88f, -1.08f, 2.96f, -1.08f)
                horizontalLineToRelative(5.56f)
                curveToRelative(1.08f, 0f, 2.13f, 0.38f, 2.96f, 1.08f)
                lineToRelative(3.31f, 2.79f)
                curveToRelative(0.49f, 0.4f, 0.8f, 0.98f, 0.89f, 1.59f)
                curveToRelative(0.09f, 0.61f, -0.04f, 1.24f, -0.38f, 1.77f)
                lineToRelative(-1.45f, 2.29f)
                curveToRelative(-0.45f, 0.71f, -1.4f, 0.92f, -2.12f, 0.47f)
                curveToRelative(-0.71f, -0.45f, -0.93f, -1.4f, -0.47f, -2.12f)
                lineToRelative(1.23f, -1.93f)
                lineToRelative(-2.41f, -2.03f)
                verticalLineToRelative(6.55f)
                curveToRelative(0f, 1.13f, -0.92f, 2.05f, -2.05f, 2.05f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.2f,
            ) {
                moveTo(12f, 8.88f)
                curveToRelative(2.07f, 0f, 3.75f, -1.68f, 3.75f, -3.75f)
                curveToRelative(0f, -2.07f, -1.68f, -3.75f, -3.75f, -3.75f)
                curveToRelative(-2.07f, 0f, -3.75f, 1.68f, -3.75f, 3.75f)
                curveToRelative(0f, 2.07f, 1.68f, 3.75f, 3.75f, 3.75f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(11.56f, 12.92f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.1f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(0.73f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2.1f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                close()
            }
        }

        return _myPtPackages!!
    }

@Suppress("ObjectPropertyName")
private var _myPtPackages: ImageVector? = null

@Preview
@Composable
private fun SatsIconMyPtPackagesPreview() {
    Icon(SatsIcons.MyPtPackages, contentDescription = null)
}
