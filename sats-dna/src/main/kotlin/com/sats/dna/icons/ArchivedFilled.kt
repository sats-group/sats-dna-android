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
val SatsIcons.ArchivedFilled: ImageVector
    get() {
        if (_archivedFilled != null) {
            return _archivedFilled!!
        }

        _archivedFilled = materialIcon(name = "ArchivedFilled") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(4.5f, 10.37f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(14.48f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(10.69f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-14.48f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(1.5f, 3.79f)
                curveTo(1.5f, 3.35f, 1.86f, 3f, 2.3f, 3f)
                horizontalLineToRelative(19.4f)
                curveToRelative(0.44f, 0f, 0.8f, 0.35f, 0.8f, 0.79f)
                verticalLineToRelative(3.79f)
                curveToRelative(0f, 0.44f, -0.36f, 0.79f, -0.8f, 0.79f)
                horizontalLineTo(2.3f)
                curveToRelative(-0.44f, 0f, -0.8f, -0.35f, -0.8f, -0.8f)
                verticalLineTo(3.8f)
                close()
                moveToRelative(1.62f, 0.79f)
                verticalLineToRelative(2.21f)
                horizontalLineToRelative(17.76f)
                verticalLineTo(4.58f)
                horizontalLineTo(3.12f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(2.8f, 4.5f)
                horizontalLineToRelative(18.4f)
                verticalLineToRelative(3f)
                horizontalLineTo(2.8f)
                verticalLineToRelative(-3f)
                close()
            }
        }

        return _archivedFilled!!
    }

@Suppress("ObjectPropertyName")
private var _archivedFilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconArchivedFilledPreview() {
    Icon(SatsIcons.ArchivedFilled, contentDescription = null)
}
