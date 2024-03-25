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
val SatsIcons.LetterE: ImageVector
    get() {
        if (_letterE != null) {
            return _letterE!!
        }

        _letterE = materialIcon(name = "LetterE") {
            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(23.738f, 10.778f)
                lineToRelative(-2.487f, 8.771f)
                horizontalLineToRelative(15.753f)
                lineToRelative(-2.968f, 10.735f)
                horizontalLineTo(18.284f)
                lineToRelative(-2.749f, 9.818f)
                horizontalLineToRelative(21.119f)
                lineTo(33.6f, 50.836f)
                horizontalLineTo(0f)
                lineTo(14.313f, 0f)
                horizontalLineTo(48f)
                lineToRelative(-3.055f, 10.734f)
                horizontalLineTo(23.738f)
                verticalLineToRelative(0.044f)
                close()
            }
        }

        return _letterE!!
    }

@Suppress("ObjectPropertyName")
private var _letterE: ImageVector? = null

@Preview
@Composable
private fun SatsIconLetterEPreview() {
    Icon(SatsIcons.LetterE, contentDescription = null)
}
