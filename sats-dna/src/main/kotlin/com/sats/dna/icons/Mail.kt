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
val SatsIcons.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }

        _mail = materialIcon(name = "Mail") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(5.02f, 5.75f)
                lineToRelative(6.82f, 5.9f)
                curveToRelative(0.09f, 0.08f, 0.23f, 0.08f, 0.32f, 0f)
                lineToRelative(6.82f, -5.9f)
                horizontalLineTo(5.02f)
                close()
                moveToRelative(15.23f, 0.89f)
                lineToRelative(-7.1f, 6.14f)
                curveToRelative(-0.66f, 0.57f, -1.64f, 0.57f, -2.3f, 0f)
                lineToRelative(-7.1f, -6.14f)
                verticalLineToRelative(10.8f)
                curveToRelative(0f, 0.41f, 0.36f, 0.81f, 0.89f, 0.81f)
                horizontalLineToRelative(14.72f)
                curveToRelative(0.53f, 0f, 0.89f, -0.4f, 0.89f, -0.8f)
                verticalLineTo(6.63f)
                close()
                moveToRelative(-18f, -0.08f)
                curveToRelative(0f, -1.31f, 1.1f, -2.31f, 2.39f, -2.31f)
                horizontalLineToRelative(14.72f)
                curveToRelative(1.29f, 0f, 2.39f, 1f, 2.39f, 2.3f)
                verticalLineToRelative(10.9f)
                curveToRelative(0f, 1.3f, -1.1f, 2.3f, -2.39f, 2.3f)
                horizontalLineTo(4.64f)
                curveToRelative(-1.29f, 0f, -2.39f, -1f, -2.39f, -2.3f)
                verticalLineTo(6.54f)
                close()
            }
        }

        return _mail!!
    }

@Suppress("ObjectPropertyName")
private var _mail: ImageVector? = null

@Preview
@Composable
private fun SatsIconMailPreview() {
    Icon(SatsIcons.Mail, contentDescription = null)
}
