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
val SatsIcons.Delete: ImageVector
    get() {
        if (_delete != null) {
            return _delete!!
        }

        _delete = materialIcon(name = "Delete") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(7.61f, 2f)
                curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(7.28f)
                curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(2.89f)
                horizontalLineTo(22f)
                curveToRelative(0.41f, 0f, 0.75f, 0.33f, 0.75f, 0.75f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(2f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                curveToRelative(0f, -0.42f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(5.61f)
                verticalLineTo(2f)
                close()
                moveToRelative(1.5f, 2.89f)
                horizontalLineToRelative(5.78f)
                verticalLineTo(2.75f)
                horizontalLineTo(9.1f)
                verticalLineToRelative(2.14f)
                close()
                moveTo(4.67f, 8.52f)
                curveToRelative(0.42f, -0.02f, 0.78f, 0.29f, 0.8f, 0.7f)
                lineToRelative(0.8f, 11.04f)
                curveToRelative(0.01f, 0.27f, 0.13f, 0.52f, 0.33f, 0.7f)
                curveToRelative(0.2f, 0.19f, 0.46f, 0.29f, 0.73f, 0.29f)
                horizontalLineToRelative(9.34f)
                curveToRelative(0.27f, 0f, 0.53f, -0.1f, 0.73f, -0.29f)
                curveToRelative(0.2f, -0.18f, 0.32f, -0.43f, 0.34f, -0.7f)
                lineToRelative(0.78f, -11.04f)
                curveToRelative(0.03f, -0.41f, 0.4f, -0.72f, 0.8f, -0.7f)
                curveToRelative(0.42f, 0.03f, 0.73f, 0.4f, 0.7f, 0.8f)
                lineToRelative(-0.79f, 11.04f)
                curveToRelative(-0.04f, 0.65f, -0.33f, 1.26f, -0.8f, 1.7f)
                curveToRelative(-0.48f, 0.44f, -1.11f, 0.69f, -1.76f, 0.69f)
                horizontalLineTo(7.33f)
                curveToRelative(-0.65f, 0f, -1.28f, -0.25f, -1.75f, -0.69f)
                curveToRelative(-0.48f, -0.44f, -0.77f, -1.05f, -0.81f, -1.7f)
                lineTo(3.97f, 9.33f)
                curveToRelative(-0.02f, -0.42f, 0.3f, -0.78f, 0.7f, -0.8f)
                close()
            }
        }

        return _delete!!
    }

@Suppress("ObjectPropertyName")
private var _delete: ImageVector? = null

@Preview
@Composable
private fun SatsIconDeletePreview() {
    Icon(SatsIcons.Delete, contentDescription = null)
}
