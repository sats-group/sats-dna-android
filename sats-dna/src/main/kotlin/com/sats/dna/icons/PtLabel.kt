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
val SatsIcons.PtLabel: ImageVector
    get() {
        if (_ptLabel != null) {
            return _ptLabel!!
        }

        _ptLabel = materialIcon(name = "PtLabel") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(7.22f, 11.26f)
                horizontalLineToRelative(1.54f)
                curveToRelative(0.95f, 0f, 1.35f, -0.46f, 1.35f, -1.12f)
                curveToRelative(0f, -0.52f, -0.39f, -0.84f, -1.03f, -0.84f)
                horizontalLineToRelative(-1.3f)
                lineToRelative(-0.56f, 1.96f)
                close()
            }

            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 24f)
                curveToRelative(6.63f, 0f, 12f, -5.37f, 12f, -12f)
                reflectiveCurveTo(18.63f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.37f, 0f, 12f)
                reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
                close()
                moveTo(5.86f, 7.2f)
                horizontalLineToRelative(3.51f)
                curveToRelative(2.06f, 0f, 3.14f, 1.12f, 3.14f, 2.67f)
                curveToRelative(0f, 1.95f, -1.39f, 3.49f, -3.9f, 3.49f)
                horizontalLineToRelative(-2f)
                lineTo(5.58f, 17f)
                horizontalLineTo(3.06f)
                lineToRelative(2.8f, -9.8f)
                close()
                moveTo(16.08f, 17f)
                horizontalLineToRelative(-2.52f)
                lineToRelative(2.13f, -7.59f)
                horizontalLineToRelative(-2.6f)
                lineToRelative(0.63f, -2.21f)
                horizontalLineToRelative(7.56f)
                lineToRelative(-0.63f, 2.21f)
                horizontalLineToRelative(-2.42f)
                lineTo(16.08f, 17f)
                close()
            }
        }

        return _ptLabel!!
    }

@Suppress("ObjectPropertyName")
private var _ptLabel: ImageVector? = null

@Preview
@Composable
private fun SatsIconPtLabelPreview() {
    Icon(SatsIcons.PtLabel, contentDescription = null)
}
