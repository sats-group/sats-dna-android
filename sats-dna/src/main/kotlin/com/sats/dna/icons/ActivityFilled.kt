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
val SatsIcons.ActivityFilled: ImageVector
    get() {
        if (_activityFilled != null) {
            return _activityFilled!!
        }

        _activityFilled = materialIcon(name = "ActivityFilled") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12f, 0.67f)
                curveTo(5.74f, 0.67f, 0.67f, 5.74f, 0.67f, 12f)
                reflectiveCurveTo(5.74f, 23.33f, 12f, 23.33f)
                reflectiveCurveTo(23.33f, 18.26f, 23.33f, 12f)
                reflectiveCurveTo(18.26f, 0.67f, 12f, 0.67f)
                close()
                moveToRelative(-1.37f, 8.19f)
                lineTo(9.2f, 12.39f)
                curveToRelative(-0.08f, 0.19f, -0.17f, 0.32f, -0.28f, 0.4f)
                curveToRelative(-0.1f, 0.08f, -0.24f, 0.13f, -0.45f, 0.13f)
                horizontalLineTo(5.82f)
                curveTo(5.66f, 12.66f, 5.6f, 12.47f, 5.6f, 12.3f)
                curveToRelative(0f, -0.17f, 0.05f, -0.35f, 0.23f, -0.61f)
                horizontalLineToRelative(2.24f)
                lineToRelative(1.97f, -4.82f)
                curveToRelative(0.11f, -0.27f, 0.36f, -0.41f, 0.6f, -0.42f)
                curveToRelative(0.26f, 0f, 0.48f, 0.12f, 0.56f, 0.36f)
                lineToRelative(2.56f, 7.82f)
                lineToRelative(0.89f, -2.42f)
                curveToRelative(0.06f, -0.18f, 0.14f, -0.3f, 0.25f, -0.39f)
                curveToRelative(0.1f, -0.08f, 0.24f, -0.13f, 0.46f, -0.13f)
                horizontalLineToRelative(2.84f)
                curveToRelative(0.17f, 0.27f, 0.23f, 0.46f, 0.22f, 0.63f)
                curveToRelative(0f, 0.18f, -0.07f, 0.36f, -0.22f, 0.6f)
                horizontalLineToRelative(-2.51f)
                lineToRelative(-1.33f, 4.23f)
                curveToRelative(-0.08f, 0.25f, -0.32f, 0.39f, -0.59f, 0.4f)
                curveToRelative(-0.27f, 0f, -0.5f, -0.13f, -0.56f, -0.36f)
                lineToRelative(-2.57f, -8.33f)
                close()
            }
        }

        return _activityFilled!!
    }

@Suppress("ObjectPropertyName")
private var _activityFilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconActivityFilledPreview() {
    Icon(SatsIcons.ActivityFilled, contentDescription = null)
}
