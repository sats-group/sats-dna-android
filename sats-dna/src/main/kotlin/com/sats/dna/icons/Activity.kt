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
val SatsIcons.Activity: ImageVector
    get() {
        if (_activity != null) {
            return _activity!!
        }

        _activity = materialIcon(name = "Activity") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(8.07f, 13.22f)
                lineToRelative(2f, -4.3f)
                lineToRelative(3.6f, 10.15f)
                curveToRelative(0.1f, 0.28f, 0.42f, 0.44f, 0.8f, 0.43f)
                curveToRelative(0.38f, 0f, 0.72f, -0.18f, 0.82f, -0.48f)
                lineToRelative(1.87f, -5.15f)
                horizontalLineToRelative(3.53f)
                curveToRelative(0.21f, -0.3f, 0.3f, -0.51f, 0.31f, -0.72f)
                curveToRelative(0f, -0.21f, -0.08f, -0.45f, -0.31f, -0.78f)
                horizontalLineTo(16.7f)
                curveToRelative(-0.3f, 0f, -0.5f, 0.06f, -0.65f, 0.16f)
                curveToRelative(-0.14f, 0.1f, -0.26f, 0.25f, -0.35f, 0.48f)
                lineToRelative(-1.24f, 2.94f)
                lineToRelative(-3.6f, -9.51f)
                curveTo(10.75f, 6.14f, 10.44f, 5.99f, 10.1f, 6f)
                curveToRelative(-0.35f, 0f, -0.7f, 0.18f, -0.85f, 0.5f)
                lineToRelative(-2.77f, 5.87f)
                horizontalLineTo(3.33f)
                curveTo(3.08f, 12.68f, 2.99f, 12.91f, 3f, 13.11f)
                curveToRelative(0f, 0.21f, 0.1f, 0.44f, 0.33f, 0.76f)
                horizontalLineToRelative(3.71f)
                curveToRelative(0.3f, 0f, 0.5f, -0.06f, 0.64f, -0.16f)
                curveToRelative(0.15f, -0.1f, 0.28f, -0.26f, 0.39f, -0.49f)
                close()
            }
        }

        return _activity!!
    }

@Suppress("ObjectPropertyName")
private var _activity: ImageVector? = null

@Preview
@Composable
private fun SatsIconActivityPreview() {
    Icon(SatsIcons.Activity, contentDescription = null)
}
