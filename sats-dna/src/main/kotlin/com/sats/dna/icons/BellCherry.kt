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
val SatsIcons.BellCherry: ImageVector
    get() {
        if (_bellCherry != null) {
            return _bellCherry!!
        }

        _bellCherry = materialIcon(name = "BellCherry") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(11.43f, 4.44f)
                curveTo(11.84f, 4.39f, 12.13f, 4f, 12.1f, 3.6f)
                curveToRelative(-0.05f, -0.41f, -0.42f, -0.7f, -0.84f, -0.65f)
                curveToRelative(-3.03f, 0.36f, -5.39f, 2.9f, -5.39f, 6.01f)
                verticalLineToRelative(2.37f)
                curveToRelative(0f, 1.64f, -0.73f, 3.2f, -2f, 4.26f)
                horizontalLineTo(3.83f)
                curveToRelative(-0.34f, 0.3f, -0.57f, 0.73f, -0.57f, 1.23f)
                curveToRelative(0f, 0.89f, 0.74f, 1.6f, 1.62f, 1.6f)
                horizontalLineToRelative(3.96f)
                curveTo(9.03f, 19.95f, 10.4f, 21.1f, 12f, 21.1f)
                curveToRelative(1.6f, 0f, 2.98f, -1.14f, 3.16f, -2.69f)
                horizontalLineToRelative(3.96f)
                curveToRelative(0.88f, 0f, 1.61f, -0.7f, 1.61f, -1.6f)
                curveToRelative(0f, -0.5f, -0.23f, -0.93f, -0.56f, -1.21f)
                lineToRelative(-0.02f, -0.01f)
                curveToRelative(-1.27f, -1.06f, -2f, -2.62f, -2f, -4.26f)
                verticalLineToRelative(-0.6f)
                curveToRelative(0f, -0.4f, -0.34f, -0.74f, -0.76f, -0.74f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.33f, -0.75f, 0.75f)
                verticalLineToRelative(0.59f)
                curveToRelative(0f, 2.08f, 0.94f, 4.06f, 2.55f, 5.4f)
                verticalLineToRelative(0.01f)
                lineToRelative(0.03f, 0.04f)
                lineToRelative(0.01f, 0.04f)
                curveToRelative(0f, 0.02f, 0f, 0.04f, -0.03f, 0.06f)
                curveToRelative(-0.02f, 0.02f, -0.05f, 0.03f, -0.08f, 0.03f)
                horizontalLineToRelative(-6.9f)
                horizontalLineToRelative(-7.33f)
                curveToRelative(-0.04f, 0f, -0.07f, 0f, -0.09f, -0.03f)
                lineToRelative(-0.03f, -0.06f)
                lineToRelative(0.01f, -0.04f)
                lineToRelative(0.03f, -0.04f)
                curveToRelative(1.62f, -1.35f, 2.55f, -3.33f, 2.55f, -5.41f)
                verticalLineTo(8.96f)
                curveToRelative(0f, -2.32f, 1.77f, -4.25f, 4.07f, -4.52f)
                close()
                moveToRelative(2.2f, 13.97f)
                horizontalLineToRelative(-1.41f)
                horizontalLineToRelative(-1.85f)
                curveToRelative(0.17f, 0.66f, 0.81f, 1.19f, 1.63f, 1.19f)
                curveToRelative(0.83f, 0f, 1.46f, -0.53f, 1.64f, -1.19f)
                close()
            }
        }

        return _bellCherry!!
    }

@Suppress("ObjectPropertyName")
private var _bellCherry: ImageVector? = null

@Preview
@Composable
private fun SatsIconBellCherryPreview() {
    Icon(SatsIcons.BellCherry, contentDescription = null)
}
