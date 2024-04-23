package com.sats.dna.icons

import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import com.sats.dna.SatsIcons

@Suppress("UnusedReceiverParameter") // for convenient access
val SatsIcons.LetterS: ImageVector
    get() {
        if (_letterS != null) {
            return _letterS!!
        }

        _letterS = materialIcon(name = "LetterS") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(31.992f, 23.168f)
                lineToRelative(-3.433f, -2.917f)
                curveToRelative(-2.059f, -1.716f, -3.217f, -3.132f, -3.217f, -5.063f)
                curveToRelative(0f, -2.445f, 1.802f, -4.634f, 5.62f, -4.634f)
                curveToRelative(2.574f, 0f, 4.977f, 0.901f, 7.165f, 3.004f)
                lineToRelative(9.482f, -7.079f)
                curveTo(45.078f, 3.175f, 39.929f, 0f, 32.335f, 0f)
                curveToRelative(-11.198f, 0f, -19.35f, 7.294f, -19.35f, 16.904f)
                curveToRelative(0f, 4.849f, 2.66f, 8.195f, 6.136f, 11.155f)
                lineToRelative(3.432f, 2.918f)
                curveToRelative(2.36f, 2.059f, 3.346f, 3.346f, 3.346f, 5.148f)
                curveToRelative(0f, 2.703f, -1.93f, 5.278f, -6.778f, 5.278f)
                curveToRelative(-3.604f, 0f, -6.822f, -1.416f, -9.225f, -4.119f)
                lineTo(0.5f, 44.32f)
                curveTo(4.018f, 48.653f, 10.025f, 52f, 18.262f, 52f)
                curveToRelative(12.657f, 0f, 19.994f, -7.637f, 19.994f, -17.72f)
                curveToRelative(0.043f, -5.105f, -2.961f, -8.323f, -6.264f, -11.112f)
                close()
            }
        }

        return _letterS!!
    }

@Suppress("ObjectPropertyName")
private var _letterS: ImageVector? = null

@Preview
@Composable
private fun SatsIconLetterSPreview() {
    Icon(SatsIcons.LetterS, contentDescription = null)
}
