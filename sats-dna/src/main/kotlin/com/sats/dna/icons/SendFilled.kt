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
val SatsIcons.SendFilled: ImageVector
    get() {
        if (_sendFilled != null) {
            return _sendFilled!!
        }

        _sendFilled = materialIcon(name = "SendFilled") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(2.36f, 10.9f)
                lineToRelative(2.34f, 1.78f)
                lineToRelative(8.19f, -3.63f)
                lineToRelative(-6.35f, 5f)
                verticalLineToRelative(6.13f)
                curveToRelative(0f, 0.19f, 0.06f, 0.37f, 0.17f, 0.52f)
                curveToRelative(0.1f, 0.15f, 0.26f, 0.27f, 0.43f, 0.33f)
                curveToRelative(0.18f, 0.07f, 0.37f, 0.08f, 0.55f, 0.03f)
                curveToRelative(0.18f, -0.05f, 0.34f, -0.15f, 0.46f, -0.3f)
                lineToRelative(2.84f, -3.38f)
                lineToRelative(5.92f, 4.44f)
                curveToRelative(0.12f, 0.09f, 0.26f, 0.15f, 0.42f, 0.17f)
                curveToRelative(0.15f, 0.02f, 0.3f, 0f, 0.45f, -0.05f)
                curveToRelative(0.14f, -0.05f, 0.27f, -0.14f, 0.37f, -0.26f)
                curveToRelative(0.1f, -0.12f, 0.16f, -0.26f, 0.2f, -0.4f)
                lineToRelative(3.63f, -18.2f)
                curveToRelative(0.03f, -0.15f, 0.02f, -0.32f, -0.03f, -0.47f)
                curveToRelative(-0.06f, -0.16f, -0.15f, -0.3f, -0.28f, -0.4f)
                curveToRelative(-0.12f, -0.1f, -0.28f, -0.17f, -0.44f, -0.2f)
                curveToRelative(-0.16f, -0.02f, -0.32f, 0f, -0.48f, 0.06f)
                lineTo(2.57f, 9.34f)
                curveTo(2.42f, 9.4f, 2.29f, 9.5f, 2.19f, 9.62f)
                curveTo(2.1f, 9.75f, 2.03f, 9.9f, 2.01f, 10.06f)
                curveToRelative(-0.02f, 0.16f, 0f, 0.32f, 0.06f, 0.47f)
                curveToRelative(0.06f, 0.15f, 0.16f, 0.28f, 0.3f, 0.38f)
                close()
            }
        }

        return _sendFilled!!
    }

@Suppress("ObjectPropertyName")
private var _sendFilled: ImageVector? = null

@Preview
@Composable
private fun SatsIconSendFilledPreview() {
    Icon(SatsIcons.SendFilled, contentDescription = null)
}
