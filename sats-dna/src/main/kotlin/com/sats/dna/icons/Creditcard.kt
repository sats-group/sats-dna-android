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
val SatsIcons.Creditcard: ImageVector
    get() {
        if (_creditcard != null) {
            return _creditcard!!
        }

        _creditcard = materialIcon(name = "Creditcard") {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2.25f, 4.31f)
                curveToRelative(-0.52f, 0f, -0.94f, 0.42f, -0.94f, 0.94f)
                verticalLineToRelative(1.69f)
                horizontalLineTo(22.7f)
                verticalLineTo(5.25f)
                curveToRelative(0f, -0.52f, -0.42f, -0.94f, -0.94f, -0.94f)
                horizontalLineTo(2.25f)
                close()
                moveToRelative(20.44f, 3.75f)
                horizontalLineTo(1.3f)
                verticalLineToRelative(2.63f)
                horizontalLineTo(22.7f)
                verticalLineTo(8.06f)
                close()
                moveToRelative(0f, 3.75f)
                horizontalLineTo(1.3f)
                verticalLineToRelative(6.94f)
                curveToRelative(0f, 0.52f, 0.42f, 0.94f, 0.94f, 0.94f)
                horizontalLineToRelative(19.5f)
                curveToRelative(0.52f, 0f, 0.94f, -0.42f, 0.94f, -0.94f)
                verticalLineToRelative(-6.94f)
                close()
                moveTo(0.19f, 5.25f)
                curveToRelative(0f, -1.14f, 0.92f, -2.06f, 2.06f, -2.06f)
                horizontalLineToRelative(19.5f)
                curveToRelative(1.14f, 0f, 2.06f, 0.92f, 2.06f, 2.06f)
                verticalLineToRelative(13.5f)
                curveToRelative(0f, 1.14f, -0.92f, 2.06f, -2.06f, 2.06f)
                horizontalLineTo(2.25f)
                curveToRelative(-1.14f, 0f, -2.06f, -0.92f, -2.06f, -2.06f)
                verticalLineTo(5.25f)
                close()
                moveToRelative(3f, 10.5f)
                curveToRelative(0f, -0.31f, 0.25f, -0.56f, 0.56f, -0.56f)
                horizontalLineTo(9f)
                curveToRelative(0.31f, 0f, 0.56f, 0.25f, 0.56f, 0.56f)
                curveToRelative(0f, 0.31f, -0.25f, 0.56f, -0.56f, 0.56f)
                horizontalLineTo(3.75f)
                curveToRelative(-0.31f, 0f, -0.56f, -0.25f, -0.56f, -0.56f)
                close()
                moveToRelative(15f, 0f)
                curveToRelative(0f, -0.31f, 0.25f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.31f, 0f, 0.56f, 0.25f, 0.56f, 0.56f)
                curveToRelative(0f, 0.31f, -0.25f, 0.56f, -0.56f, 0.56f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.31f, 0f, -0.56f, -0.25f, -0.56f, -0.56f)
                close()
            }
        }

        return _creditcard!!
    }

@Suppress("ObjectPropertyName")
private var _creditcard: ImageVector? = null

@Preview
@Composable
private fun SatsIconCreditcardPreview() {
    Icon(SatsIcons.Creditcard, contentDescription = null)
}
