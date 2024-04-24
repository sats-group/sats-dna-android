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
val SatsIcons.Archived: ImageVector
    get() {
        if (_archived != null) {
            return _archived!!
        }

        _archived = materialIcon(name = "Archived") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2.88f, 4.7f)
                curveToRelative(0f, -0.38f, 0.31f, -0.7f, 0.7f, -0.7f)
                horizontalLineToRelative(16.84f)
                curveToRelative(0.39f, 0f, 0.7f, 0.32f, 0.7f, 0.7f)
                verticalLineToRelative(3.37f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                horizontalLineTo(3.58f)
                curveToRelative(-0.39f, 0f, -0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineTo(4.71f)
                close()
                moveToRelative(1.4f, 0.7f)
                verticalLineToRelative(1.97f)
                horizontalLineToRelative(15.44f)
                verticalLineTo(5.41f)
                horizontalLineTo(4.28f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(5.83f, 9.62f)
                curveToRelative(0.38f, 0f, 0.7f, 0.31f, 0.7f, 0.7f)
                verticalLineToRelative(8.28f)
                horizontalLineToRelative(10.94f)
                verticalLineToRelative(-8.28f)
                curveToRelative(0f, -0.39f, 0.32f, -0.7f, 0.7f, -0.7f)
                curveToRelative(0.4f, 0f, 0.7f, 0.31f, 0.7f, 0.7f)
                verticalLineToRelative(8.98f)
                curveToRelative(0f, 0.39f, -0.3f, 0.7f, -0.7f, 0.7f)
                horizontalLineTo(5.83f)
                curveToRelative(-0.4f, 0f, -0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineToRelative(-8.98f)
                curveToRelative(0f, -0.39f, 0.3f, -0.7f, 0.7f, -0.7f)
                close()
            }
        }

        return _archived!!
    }

@Suppress("ObjectPropertyName")
private var _archived: ImageVector? = null

@Preview
@Composable
private fun SatsIconArchivedPreview() {
    Icon(SatsIcons.Archived, contentDescription = null)
}
