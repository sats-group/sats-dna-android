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
val SatsIcons.Profilefilled: ImageVector
    get() {
        if (_profilefilled != null) {
            return _profilefilled!!
        }

        _profilefilled = materialIcon(name = "Profilefilled") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(8.17f, 9.75f)
                curveToRelative(0f, 2.4f, 1.68f, 4.16f, 3.82f, 4.2f)
                curveToRelative(2.14f, 0.02f, 3.83f, -1.8f, 3.83f, -4.2f)
                curveToRelative(0f, -2.25f, -1.69f, -4.11f, -3.83f, -4.11f)
                reflectiveCurveTo(8.15f, 7.5f, 8.17f, 9.74f)
                close()
                moveTo(23.44f, 12f)
                curveToRelative(0f, 6.25f, -5.2f, 11.44f, -11.45f, 11.44f)
                curveToRelative(-6.23f, 0f, -11.43f, -5.19f, -11.43f, -11.44f)
                curveToRelative(0f, -6.25f, 5.18f, -11.43f, 11.42f, -11.43f)
                curveToRelative(6.25f, 0f, 11.46f, 5.18f, 11.46f, 11.43f)
                close()
                moveTo(5.02f, 18.88f)
                curveToRelative(1.73f, 1.81f, 4.55f, 2.87f, 6.97f, 2.87f)
                curveToRelative(2.43f, 0f, 5.2f, -1.06f, 6.93f, -2.87f)
                curveToRelative(-1.2f, -1.87f, -4f, -3.07f, -6.93f, -3.07f)
                curveToRelative(-2.97f, 0f, -5.78f, 1.21f, -6.97f, 3.07f)
                close()
            }
        }

        return _profilefilled!!
    }

@Suppress("ObjectPropertyName")
private var _profilefilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconProfilefilledPreview() {
    Icon(SatsIcons.Profilefilled, contentDescription = null)
}
