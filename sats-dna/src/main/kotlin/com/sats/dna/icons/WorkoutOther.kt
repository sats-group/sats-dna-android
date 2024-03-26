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
val SatsIcons.WorkoutOther: ImageVector
    get() {
        if (_workoutOther != null) {
            return _workoutOther!!
        }

        _workoutOther = materialIcon(name = "WorkoutOther") {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(0.75f, 16.997f)
                arcToRelative(16.247f, 16.247f, 0f, true, true, 32.493f, 0f)
                arcToRelative(16.247f, 16.247f, 0f, true, true, -32.493f, 0f)
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(24.997f, 15.58f)
                curveToRelative(1.104f, 0f, 2f, -0.895f, 2f, -2f)
                curveToRelative(0f, -1.104f, -0.896f, -2f, -2f, -2f)
                curveToRelative(-1.105f, 0f, -2f, 0.896f, -2f, 2f)
                curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
                close()
            }

            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(20.664f, 11.358f)
                lineToRelative(-2.132f, 0.71f)
                curveToRelative(-0.162f, 0.054f, -0.307f, 0.149f, -0.422f, 0.274f)
                curveToRelative(-0.116f, 0.126f, -0.196f, 0.279f, -0.236f, 0.445f)
                curveToRelative(-0.039f, 0.166f, -0.035f, 0.34f, 0.012f, 0.503f)
                curveToRelative(0.046f, 0.165f, 0.134f, 0.314f, 0.255f, 0.434f)
                lineToRelative(7.535f, 7.535f)
                curveToRelative(0.128f, 0.128f, 0.288f, 0.219f, 0.463f, 0.263f)
                curveToRelative(0.176f, 0.044f, 0.36f, 0.039f, 0.533f, -0.013f)
                curveToRelative(0.173f, -0.053f, 0.329f, -0.151f, 0.45f, -0.285f)
                curveToRelative(0.122f, -0.134f, 0.205f, -0.298f, 0.241f, -0.476f)
                lineToRelative(0.634f, -3.168f)
                moveToRelative(-15f, -1f)
                lineToRelative(-0.553f, -1.106f)
                curveToRelative(-0.119f, -0.237f, -0.327f, -0.417f, -0.578f, -0.501f)
                curveToRelative(-0.252f, -0.084f, -0.526f, -0.064f, -0.763f, 0.054f)
                lineTo(6.997f, 17.08f)
            }

            path(
                fill = SolidColor(Color.Black),
            ) {
                moveTo(20.999f, 16.918f)
                curveToRelative(0.37f, -0.185f, 0.521f, -0.636f, 0.335f, -1.006f)
                curveToRelative(-0.185f, -0.371f, -0.635f, -0.521f, -1.006f, -0.336f)
                lineToRelative(0.671f, 1.342f)
                close()
                moveToRelative(-5.338f, 0.991f)
                lineToRelative(-0.671f, 0.336f)
                lineToRelative(0.671f, 1.341f)
                lineToRelative(0.671f, -0.335f)
                lineToRelative(-0.671f, -1.342f)
                close()
                moveToRelative(4.667f, -2.333f)
                lineToRelative(-4.667f, 2.333f)
                lineToRelative(0.671f, 1.342f)
                lineToRelative(4.667f, -2.333f)
                lineToRelative(-0.671f, -1.342f)
                close()
                moveToRelative(3.337f, 4.008f)
                curveToRelative(0.37f, -0.185f, 0.521f, -0.636f, 0.335f, -1.006f)
                curveToRelative(-0.185f, -0.371f, -0.635f, -0.521f, -1.006f, -0.336f)
                lineToRelative(0.671f, 1.342f)
                close()
                moveToRelative(-7.096f, 2.71f)
                lineToRelative(0.335f, 0.671f)
                lineToRelative(-0.335f, -0.671f)
                close()
                moveToRelative(-1.072f, -0.114f)
                lineToRelative(0.468f, -0.585f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-0.468f, 0.586f)
                close()
                moveToRelative(-3.957f, -3.166f)
                lineToRelative(-0.47f, 0.585f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(0.469f, -0.586f)
                close()
                moveToRelative(-1.143f, -0.076f)
                lineToRelative(0.386f, 0.643f)
                lineToRelative(0.001f, -0.001f)
                lineToRelative(-0.387f, -0.642f)
                close()
                moveTo(5.61f, 20.937f)
                lineToRelative(-0.642f, 0.386f)
                lineToRelative(0.772f, 1.286f)
                lineToRelative(0.643f, -0.386f)
                lineToRelative(-0.773f, -1.286f)
                close()
                moveToRelative(17.384f, -2.695f)
                lineToRelative(-6.761f, 3.381f)
                lineToRelative(0.671f, 1.342f)
                lineToRelative(6.761f, -3.381f)
                lineToRelative(-0.671f, -1.342f)
                close()
                moveToRelative(-6.761f, 3.381f)
                curveToRelative(-0.042f, 0.021f, -0.09f, 0.03f, -0.138f, 0.025f)
                lineToRelative(-0.158f, 1.492f)
                curveToRelative(0.332f, 0.035f, 0.668f, -0.026f, 0.967f, -0.175f)
                lineToRelative(-0.671f, -1.342f)
                close()
                moveToRelative(-0.138f, 0.025f)
                curveToRelative(-0.047f, -0.005f, -0.092f, -0.023f, -0.13f, -0.053f)
                lineToRelative(-0.937f, 1.17f)
                curveToRelative(0.261f, 0.209f, 0.576f, 0.339f, 0.909f, 0.375f)
                lineToRelative(0.158f, -1.492f)
                close()
                moveToRelative(-0.13f, -0.054f)
                lineToRelative(-3.957f, -3.166f)
                lineToRelative(-0.937f, 1.172f)
                lineToRelative(3.957f, 3.166f)
                lineToRelative(0.937f, -1.172f)
                close()
                moveToRelative(-3.956f, -3.165f)
                curveToRelative(-0.28f, -0.224f, -0.621f, -0.357f, -0.979f, -0.381f)
                lineToRelative(-0.1f, 1.497f)
                curveToRelative(0.051f, 0.003f, 0.1f, 0.022f, 0.14f, 0.054f)
                lineToRelative(0.939f, -1.17f)
                close()
                moveToRelative(-0.979f, -0.381f)
                curveToRelative(-0.358f, -0.024f, -0.714f, 0.063f, -1.021f, 0.248f)
                lineToRelative(0.775f, 1.284f)
                curveToRelative(0.044f, -0.027f, 0.095f, -0.039f, 0.146f, -0.035f)
                lineToRelative(0.1f, -1.497f)
                close()
                moveToRelative(-1.02f, 0.247f)
                lineToRelative(-4.4f, 2.642f)
                lineToRelative(0.773f, 1.286f)
                lineToRelative(4.4f, -2.642f)
                lineToRelative(-0.773f, -1.286f)
                close()
            }
        }

        return _workoutOther!!
    }

@Suppress("ObjectPropertyName")
private var _workoutOther: ImageVector? = null

@Preview
@Composable
private fun SatsIconWorkoutOtherPreview() {
    Icon(SatsIcons.WorkoutOther, contentDescription = null)
}
