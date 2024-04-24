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
val SatsIcons.ProgramClass: ImageVector
    get() {
        if (_programClass != null) {
            return _programClass!!
        }

        _programClass = materialIcon(name = "ProgramClass") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3.69f, 11.78f)
                curveToRelative(0f, -0.41f, 0.33f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(15.42f)
                curveToRelative(0.42f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                reflectiveCurveToRelative(-0.33f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(4.44f)
                curveToRelative(-0.42f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3.69f, 7.14f)
                curveToRelative(0f, -0.41f, 0.33f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(15.42f)
                curveToRelative(0.42f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                curveToRelative(0f, 0.42f, -0.33f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(4.44f)
                curveToRelative(-0.42f, 0f, -0.75f, -0.33f, -0.75f, -0.75f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(3.69f, 16.42f)
                curveToRelative(0f, -0.42f, 0.33f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(7.71f)
                curveToRelative(0.41f, 0f, 0.75f, 0.33f, 0.75f, 0.75f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(4.44f)
                curveToRelative(-0.42f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                close()
            }
        }

        return _programClass!!
    }

@Suppress("ObjectPropertyName")
private var _programClass: ImageVector? = null

@Preview
@Composable
private fun SatsIconProgramClassPreview() {
    Icon(SatsIcons.ProgramClass, contentDescription = null)
}
