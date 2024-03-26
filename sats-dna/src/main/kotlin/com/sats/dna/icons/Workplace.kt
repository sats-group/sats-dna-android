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
val SatsIcons.Workplace: ImageVector
    get() {
        if (_workplace != null) {
            return _workplace!!
        }

        _workplace = materialIcon(name = "Workplace") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(19.27f, 16.46f)
                curveToRelative(-0.26f, 0.3f, -0.7f, 0.77f, -1.44f, 0.77f)
                curveToRelative(-1.02f, 0f, -1.35f, -0.73f, -1.66f, -1.5f)
                lineToRelative(-1.53f, -3.76f)
                lineToRelative(-1.54f, 3.76f)
                curveToRelative(-0.26f, 0.64f, -0.54f, 1.5f, -1.66f, 1.5f)
                curveToRelative(-1.12f, 0f, -1.4f, -0.86f, -1.66f, -1.5f)
                lineTo(7.19f, 9.4f)
                horizontalLineToRelative(2.18f)
                lineToRelative(2.07f, 5.2f)
                lineToRelative(1.54f, -3.78f)
                curveToRelative(0.25f, -0.6f, 0.54f, -1.51f, 1.66f, -1.51f)
                curveToRelative(1.1f, 0f, 1.4f, 0.9f, 1.65f, 1.5f)
                lineToRelative(1.68f, 4.1f)
                curveToRelative(0.67f, -1.01f, 1.07f, -2.23f, 1.07f, -3.54f)
                curveToRelative(0f, -3.54f, -2.9f, -6.42f, -6.45f, -6.42f)
                curveToRelative(-2.04f, 0f, -3.95f, 0.8f, -5.39f, 2.22f)
                curveToRelative(-1.44f, 1.44f, -2.23f, 3.34f, -2.23f, 5.36f)
                curveToRelative(0f, 2.03f, 0.8f, 3.93f, 2.23f, 5.36f)
                curveToRelative(1.44f, 1.43f, 3.35f, 2.21f, 5.39f, 2.21f)
                curveToRelative(0.7f, 0f, 1.39f, -0.1f, 2.06f, -0.28f)
                verticalLineToRelative(2.01f)
                curveToRelative(-0.69f, 0.16f, -1.37f, 0.23f, -2.06f, 0.23f)
                curveToRelative(-1.3f, 0f, -2.55f, -0.25f, -3.74f, -0.74f)
                curveToRelative(-1.14f, -0.48f, -2.16f, -1.17f, -3.04f, -2.04f)
                curveToRelative(-0.88f, -0.88f, -1.57f, -1.9f, -2.05f, -3.03f)
                curveTo(3.26f, 15.07f, 3f, 13.82f, 3f, 12.53f)
                curveToRelative(0f, -1.28f, 0.25f, -2.53f, 0.75f, -3.7f)
                curveToRelative(0.49f, -1.14f, 1.18f, -2.16f, 2.05f, -3.04f)
                curveTo(6.7f, 4.9f, 7.71f, 4.22f, 8.85f, 3.75f)
                curveTo(10.03f, 3.25f, 11.29f, 3f, 12.58f, 3f)
                curveTo(17.23f, 3f, 21f, 6.75f, 21f, 11.37f)
                curveToRelative(0f, 1.92f, -0.64f, 3.68f, -1.73f, 5.1f)
                close()
            }
        }

        return _workplace!!
    }

@Suppress("ObjectPropertyName")
private var _workplace: ImageVector? = null

@Preview
@Composable
private fun SatsIconWorkplacePreview() {
    Icon(SatsIcons.Workplace, contentDescription = null)
}
