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
val SatsIcons.FolderEmpty: ImageVector
    get() {
        if (_folderEmpty != null) {
            return _folderEmpty!!
        }

        _folderEmpty = materialIcon(name = "FolderEmpty") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2f, 3.49f)
                curveToRelative(0f, -0.35f, 0.29f, -0.64f, 0.64f, -0.64f)
                horizontalLineToRelative(6.8f)
                curveToRelative(0.2f, 0f, 0.4f, 0.1f, 0.52f, 0.26f)
                lineToRelative(2.36f, 3.15f)
                horizontalLineToRelative(9.04f)
                curveToRelative(0.35f, 0f, 0.64f, 0.28f, 0.64f, 0.63f)
                verticalLineToRelative(11.92f)
                curveToRelative(0f, 0.62f, -0.25f, 1.21f, -0.69f, 1.65f)
                curveToRelative(-0.43f, 0.44f, -1.03f, 0.69f, -1.65f, 0.69f)
                horizontalLineToRelative(-1.7f)
                curveToRelative(-0.36f, 0f, -0.64f, -0.29f, -0.64f, -0.64f)
                curveToRelative(0f, -0.35f, 0.28f, -0.64f, 0.64f, -0.64f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0.28f, 0f, 0.55f, -0.1f, 0.75f, -0.3f)
                curveToRelative(0.2f, -0.2f, 0.31f, -0.48f, 0.31f, -0.76f)
                verticalLineTo(7.53f)
                horizontalLineTo(12f)
                curveToRelative(-0.2f, 0f, -0.39f, -0.1f, -0.51f, -0.25f)
                lineTo(9.13f, 4.13f)
                horizontalLineTo(3.28f)
                verticalLineTo(18.8f)
                curveToRelative(0f, 0.28f, 0.1f, 0.55f, 0.3f, 0.75f)
                curveToRelative(0.2f, 0.2f, 0.48f, 0.31f, 0.76f, 0.31f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0.36f, 0f, 0.64f, 0.29f, 0.64f, 0.64f)
                curveToRelative(0f, 0.35f, -0.28f, 0.64f, -0.64f, 0.64f)
                horizontalLineToRelative(-1.7f)
                curveToRelative(-0.62f, 0f, -1.22f, -0.25f, -1.65f, -0.69f)
                curveTo(2.25f, 20.02f, 2f, 19.43f, 2f, 18.81f)
                verticalLineTo(3.49f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(15.46f, 12.8f)
                curveToRelative(0.25f, 0.25f, 0.25f, 0.65f, 0f, 0.9f)
                lineToRelative(-6.02f, 6.02f)
                curveToRelative(-0.25f, 0.25f, -0.65f, 0.25f, -0.9f, 0f)
                reflectiveCurveToRelative(-0.25f, -0.66f, 0f, -0.9f)
                lineToRelative(6.02f, -6.02f)
                curveToRelative(0.25f, -0.25f, 0.65f, -0.25f, 0.9f, 0f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 12.64f)
                curveToRelative(-2f, 0f, -3.62f, 1.62f, -3.62f, 3.61f)
                curveToRelative(0f, 2f, 1.62f, 3.62f, 3.62f, 3.62f)
                reflectiveCurveToRelative(3.62f, -1.62f, 3.62f, -3.62f)
                reflectiveCurveTo(14f, 12.64f, 12f, 12.64f)
                close()
                moveToRelative(-4.9f, 3.61f)
                curveToRelative(0f, -2.7f, 2.2f, -4.89f, 4.9f, -4.89f)
                reflectiveCurveToRelative(4.9f, 2.2f, 4.9f, 4.9f)
                reflectiveCurveToRelative(-2.2f, 4.89f, -4.9f, 4.89f)
                reflectiveCurveToRelative(-4.9f, -2.2f, -4.9f, -4.9f)
                close()
            }
        }

        return _folderEmpty!!
    }

@Suppress("ObjectPropertyName")
private var _folderEmpty: ImageVector? = null

@Preview
@Composable
private fun SatsIconFolderEmptyPreview() {
    Icon(SatsIcons.FolderEmpty, contentDescription = null)
}
