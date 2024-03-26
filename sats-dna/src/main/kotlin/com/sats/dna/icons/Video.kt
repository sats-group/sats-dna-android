package com.sats.dna.icons

import androidx.compose.material.Icon
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }

        _video = materialIcon(name = "Video") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(21f, 7.91f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0f, -0.25f, -0.13f, -0.49f, -0.34f, -0.63f)
                curveToRelative(-0.2f, -0.14f, -0.47f, -0.16f, -0.7f, -0.06f)
                lineTo(21f, 7.91f)
                close()
                moveToRelative(0f, 8.18f)
                lineToRelative(-0.3f, 0.7f)
                curveToRelative(0.24f, 0.09f, 0.5f, 0.07f, 0.71f, -0.07f)
                curveToRelative(0.21f, -0.14f, 0.34f, -0.38f, 0.34f, -0.63f)
                horizontalLineTo(21f)
                close()
                moveToRelative(-5.43f, -5.04f)
                lineTo(21.3f, 8.6f)
                lineToRelative(-0.6f, -1.38f)
                lineToRelative(-5.72f, 2.45f)
                lineToRelative(0.59f, 1.38f)
                close()
                moveToRelative(4.68f, -3.14f)
                verticalLineToRelative(8.18f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(7.91f)
                horizontalLineToRelative(-1.5f)
                close()
                moveToRelative(1.05f, 7.5f)
                lineToRelative(-5.73f, -2.46f)
                lineToRelative(-0.6f, 1.38f)
                lineToRelative(5.73f, 2.45f)
                lineToRelative(0.6f, -1.38f)
                close()
                moveTo(4.64f, 6.2f)
                horizontalLineToRelative(9f)
                verticalLineTo(4.7f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(1.5f)
                close()
                moveToRelative(9f, 0f)
                curveToRelative(0.49f, 0f, 0.88f, 0.4f, 0.88f, 0.88f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0f, -1.32f, -1.07f, -2.38f, -2.38f, -2.38f)
                verticalLineToRelative(1.5f)
                close()
                moveToRelative(0.88f, 0.88f)
                verticalLineToRelative(9.82f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(7.09f)
                horizontalLineToRelative(-1.5f)
                close()
                moveToRelative(0f, 9.82f)
                curveToRelative(0f, 0.49f, -0.4f, 0.89f, -0.88f, 0.89f)
                verticalLineToRelative(1.5f)
                curveToRelative(1.31f, 0f, 2.38f, -1.07f, 2.38f, -2.39f)
                horizontalLineToRelative(-1.5f)
                close()
                moveToRelative(-0.88f, 0.89f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1.5f)
                close()
                moveToRelative(-9f, 0f)
                curveToRelative(-0.5f, 0f, -0.89f, -0.4f, -0.89f, -0.89f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(0f, 1.32f, 1.07f, 2.39f, 2.39f, 2.39f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(3.75f, 16.9f)
                verticalLineTo(7.09f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(9.82f)
                horizontalLineToRelative(1.5f)
                close()
                moveToRelative(0f, -9.82f)
                curveToRelative(0f, -0.49f, 0.4f, -0.88f, 0.89f, -0.88f)
                verticalLineTo(4.7f)
                curveToRelative(-1.32f, 0f, -2.39f, 1.06f, -2.39f, 2.38f)
                horizontalLineToRelative(1.5f)
                close()
            }
        }

        return _video!!
    }

@Suppress("ObjectPropertyName")
private var _video: ImageVector? = null

@Preview
@Composable
private fun SatsIconVideoPreview() {
    Icon(SatsIcons.Video, contentDescription = null)
}
