package com.sats.dna.components.button.previews

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
@LightDarkPreview
private fun LabelOnlyDisabledPreview() {
    PreviewContainer {
        SatsButton(
            onClick = {},
            label = "Button",
            colors = SatsButtonColor.Cta,
            isEnabled = false,
        )
    }
}

@Composable
@LightDarkPreview
private fun LabelOnlyEnabledPreview() {
    PreviewContainer {
        SatsButton(
            onClick = {},
            label = "Button",
            colors = SatsButtonColor.Cta,
        )
    }
}

@Composable
@LightDarkPreview
private fun LabelOnlyLargeDisabledPreview() {
    PreviewContainer {
        SatsButton(
            onClick = {},
            label = "Button",
            colors = SatsButtonColor.Cta,
            isEnabled = false,
            isLarge = true,
        )
    }
}

@Composable
@LightDarkPreview
private fun LabelOnlyLargeEnabledPreview() {
    PreviewContainer {
        SatsButton(
            onClick = {},
            label = "Button",
            colors = SatsButtonColor.Cta,
            isLarge = true,
        )
    }
}

@Composable
@LightDarkPreview
private fun LoadingDisabledPreview() {
    PreviewContainer {
        SatsButton(
            onClick = {},
            label = "Button",
            colors = SatsButtonColor.Cta,
            isLoading = true,
            isEnabled = false,
        )
    }
}

@Composable
@LightDarkPreview
private fun LoadingEnabledPreview() {
    PreviewContainer {
        SatsButton(
            onClick = {},
            label = "Button",
            colors = SatsButtonColor.Cta,
            isLoading = true,
        )
    }
}

@Composable
@LightDarkPreview
private fun LoadingLargeDisabledPreview() {
    PreviewContainer {
        SatsButton(
            onClick = {},
            label = "Button",
            colors = SatsButtonColor.Cta,
            isLoading = true,
            isEnabled = false,
            isLarge = true,
        )
    }
}

@Composable
@LightDarkPreview
private fun LoadingLargeEnabledPreview() {
    PreviewContainer {
        SatsButton(
            onClick = {},
            label = "Button",
            colors = SatsButtonColor.Cta,
            isLoading = true,
            isLarge = true,
        )
    }
}

@Composable
private fun PreviewContainer(content: @Composable () -> Unit) {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.secondary) {
            Box(Modifier.padding(SatsTheme.spacing.s), Center) {
                content()
            }
        }
    }
}
