package com.sats.dna.components.card

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.tooling.preview.PreviewLightDark
import coil.compose.AsyncImage
import com.sats.dna.components.SatsTag
import com.sats.dna.components.SatsTagColor
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.SatsButtonSize
import com.sats.dna.components.button.SatsDismissButton
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.PreviewImagePlaceholder

@Composable
fun SatsArticleCard(
    imageUrl: String,
    title: String,
    subtitle: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    tag: @Composable (() -> Unit?)? = null,
    dismissButton: @Composable (() -> Unit?)? = null,
) {
    SatsCard(modifier) {
        Column(Modifier.clickable { onClick() }) {
            Box {
                HeroImage(imageUrl)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    tag?.let {
                        Box(Modifier.padding(SatsTheme.spacing.s)) {
                            tag()
                        }
                    }

                    Spacer(Modifier.weight(1f))

                    dismissButton?.let {
                        dismissButton()
                    }
                }
            }

            Column(
                Modifier.padding(horizontal = SatsTheme.spacing.m, vertical = SatsTheme.spacing.s),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxs),
            ) {
                Text(title, style = SatsTheme.typography.satsHeadlineEmphasis.large)

                if (subtitle != null) {
                    Text(subtitle, style = SatsTheme.typography.normal.basic)
                }
            }
        }
    }
}

@Composable
private fun HeroImage(imageUrl: String) {
    if (LocalInspectionMode.current) {
        PreviewImagePlaceholder(
            Modifier
                .fillMaxWidth()
                .aspectRatio(339f / 202f),
        )
    } else {
        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(340f / 202f),
            model = imageUrl,
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )
    }
}

@PreviewLightDark
@Composable
private fun SatsArticleCardPreview() {
    SatsTheme {
        SatsArticleCard(
            imageUrl = "https://picsum.photos/1920/1080",
            title = "Happy Training Day",
            subtitle = "Today is a day to learn, grow, and challenge yourself. " +
                "It's a day to step outside of your comfort zone and try new things. " +
                "It's a day to invest in yourself and your future.",
            onClick = {},
        )
    }
}

@PreviewLightDark
@Composable
private fun SatsArticleCardWithTagPreview() {
    SatsTheme {
        SatsArticleCard(
            imageUrl = "https://picsum.photos/1920/1080",
            title = "Plan your workout ",
            subtitle = "Now you can plan workouts ahead of time. " +
                "Try it out and schedule your first workout today. " +
                "There is a maximum number of char...",
            onClick = {},
            tag = { SatsTag(text = "New feature", color = SatsTagColor.Featured) },
        )
    }
}

@PreviewLightDark
@Composable
private fun SatsArticleCardWithTagAndDismissButtonPreview() {
    SatsTheme {
        SatsArticleCard(
            imageUrl = "https://picsum.photos/1920/1080",
            title = "Plan your workout ",
            subtitle = "Now you can plan workouts ahead of time. " +
                "Try it out and schedule your first workout today. " +
                "There is a maximum number of char...",
            onClick = {},
            tag = { SatsTag(text = "New feature", color = SatsTagColor.Featured) },
            dismissButton = {
                SatsDismissButton(
                    dismissLabel = "Dismiss",
                    onDismissClicked = { },
                    color = SatsButtonColor.Clean,
                    size = SatsButtonSize.Small,
                )
            },
        )
    }
}

@PreviewLightDark
@Composable
private fun SatsArticleCardWithNoTagAndDismissButtonPreview() {
    SatsTheme {
        SatsArticleCard(
            imageUrl = "https://picsum.photos/1920/1080",
            title = "Plan your workout ",
            subtitle = "Now you can plan workouts ahead of time. " +
                "Try it out and schedule your first workout today. " +
                "There is a maximum number of char...",
            onClick = {},
            dismissButton = {
                SatsDismissButton(
                    dismissLabel = "Dismiss",
                    onDismissClicked = { },
                    color = SatsButtonColor.Clean,
                    size = SatsButtonSize.Small,
                )
            },
        )
    }
}
