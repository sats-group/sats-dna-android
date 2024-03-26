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
val SatsIcons.AudioClass: ImageVector
    get() {
        if (_audioClass != null) {
            return _audioClass!!
        }

        _audioClass = materialIcon(name = "AudioClass") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(13.85f, 5.98f)
                verticalLineToRelative(11.88f)
                moveTo(9.53f, 8.34f)
                verticalLineToRelative(5.98f)
                moveToRelative(-4.32f, -3.76f)
                verticalLineToRelative(2.8f)
                moveToRelative(12.96f, -2.97f)
                verticalLineToRelative(3.14f)
            }
        }

        return _audioClass!!
    }

@Suppress("ObjectPropertyName")
private var _audioClass: ImageVector? = null

@Preview
@Composable
private fun SatsIconAudioClassPreview() {
    Icon(SatsIcons.AudioClass, contentDescription = null)
}
