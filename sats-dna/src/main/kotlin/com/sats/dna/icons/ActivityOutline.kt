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
val SatsIcons.ActivityOutline: ImageVector
    get() {
        if (_activityOutline != null) {
            return _activityOutline!!
        }

        _activityOutline = materialIcon(name = "ActivityOutline") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(9.24f, 12.38f)
                lineToRelative(1.41f, -3.47f)
                lineToRelative(2.53f, 8.2f)
                curveToRelative(0.06f, 0.22f, 0.29f, 0.35f, 0.55f, 0.35f)
                curveToRelative(0.27f, 0f, 0.5f, -0.15f, 0.58f, -0.4f)
                lineToRelative(1.3f, -4.15f)
                horizontalLineToRelative(1.93f)
                curveToRelative(0.34f, 0f, 0.72f, -0.17f, 0.77f, -0.51f)
                verticalLineToRelative(-0.08f)
                verticalLineToRelative(-0.11f)
                curveToRelative(-0.05f, -0.35f, -0.43f, -0.52f, -0.78f, -0.52f)
                horizontalLineTo(15.3f)
                curveToRelative(-0.21f, 0f, -0.36f, 0.05f, -0.46f, 0.13f)
                curveToRelative(-0.1f, 0.08f, -0.18f, 0.2f, -0.24f, 0.39f)
                lineToRelative(-0.87f, 2.38f)
                lineToRelative(-2.53f, -7.7f)
                curveToRelative(-0.08f, -0.23f, -0.3f, -0.35f, -0.54f, -0.35f)
                curveToRelative(-0.25f, 0f, -0.49f, 0.14f, -0.6f, 0.4f)
                lineTo(8.12f, 11.7f)
                horizontalLineTo(6.44f)
                curveToRelative(-0.33f, 0f, -0.69f, 0.15f, -0.74f, 0.48f)
                lineTo(5.69f, 12.3f)
                verticalLineToRelative(0.1f)
                curveToRelative(0.07f, 0.34f, 0.44f, 0.5f, 0.79f, 0.5f)
                horizontalLineToRelative(2.04f)
                curveToRelative(0.21f, 0f, 0.35f, -0.04f, 0.45f, -0.12f)
                curveToRelative(0.1f, -0.08f, 0.2f, -0.21f, 0.27f, -0.4f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(1.42f, 12f)
                curveToRelative(0f, -5.84f, 4.74f, -10.58f, 10.58f, -10.58f)
                horizontalLineToRelative(0.01f)
                curveToRelative(5.84f, 0f, 10.58f, 4.74f, 10.58f, 10.58f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 5.84f, -4.74f, 10.58f, -10.58f, 10.58f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-5.84f, 0f, -10.58f, -4.74f, -10.58f, -10.58f)
                close()
            }
        }

        return _activityOutline!!
    }

@Suppress("ObjectPropertyName")
private var _activityOutline: ImageVector? = null

@Preview
@Composable
private fun SatsIconActivityOutlinePreview() {
    Icon(SatsIcons.ActivityOutline, contentDescription = null)
}
