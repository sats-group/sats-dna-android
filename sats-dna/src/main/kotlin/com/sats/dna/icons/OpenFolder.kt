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
val SatsIcons.OpenFolder: ImageVector
    get() {
        if (_openFolder != null) {
            return _openFolder!!
        }

        _openFolder = materialIcon(name = "OpenFolder") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2.41f, 3.75f)
                curveTo(2.41f, 3.34f, 2.75f, 3f, 3.16f, 3f)
                horizontalLineToRelative(4.71f)
                curveToRelative(0.29f, 0f, 0.55f, 0.16f, 0.68f, 0.41f)
                lineToRelative(0.97f, 1.95f)
                horizontalLineToRelative(7.78f)
                curveToRelative(0.42f, 0f, 0.75f, 0.33f, 0.75f, 0.75f)
                verticalLineToRelative(2.35f)
                curveToRelative(0f, 0.42f, -0.33f, 0.75f, -0.75f, 0.75f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.33f, -0.75f, -0.75f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-0.28f, 0f, -0.54f, -0.16f, -0.67f, -0.42f)
                lineTo(7.41f, 4.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(12.21f)
                curveToRelative(0f, 0.42f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.33f, -0.75f, -0.75f)
                verticalLineTo(3.75f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(7.17f, 10.56f)
                curveToRelative(0.11f, -0.3f, 0.4f, -0.49f, 0.7f, -0.49f)
                horizontalLineToRelative(12.97f)
                curveToRelative(0.24f, 0f, 0.47f, 0.12f, 0.61f, 0.32f)
                reflectiveCurveToRelative(0.18f, 0.46f, 0.09f, 0.7f)
                lineTo(18f, 20.5f)
                curveToRelative(-0.1f, 0.3f, -0.39f, 0.49f, -0.7f, 0.49f)
                horizontalLineTo(4.34f)
                curveToRelative(-0.25f, 0f, -0.48f, -0.12f, -0.62f, -0.32f)
                reflectiveCurveToRelative(-0.17f, -0.46f, -0.08f, -0.7f)
                lineToRelative(3.53f, -9.42f)
                close()
                moveToRelative(1.22f, 1.01f)
                lineTo(5.42f, 19.5f)
                horizontalLineToRelative(11.36f)
                lineToRelative(2.98f, -7.93f)
                horizontalLineTo(8.39f)
                close()
            }
        }

        return _openFolder!!
    }

@Suppress("ObjectPropertyName")
private var _openFolder: ImageVector? = null

@Preview
@Composable
private fun SatsIconOpenFolderPreview() {
    Icon(SatsIcons.OpenFolder, contentDescription = null)
}
