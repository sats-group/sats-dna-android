package com.sats.dna.components.card

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sats.dna.components.SatsTag
import com.sats.dna.components.SatsTagColor
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.SatsButtonSize
import com.sats.dna.components.button.SatsDismissButton
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.PreviewImagePlaceholder

/**
 * @param imageUrl URL of the background image.
 * @param title The title of the article.
 * @param subtitle The subtitle of the article.
 * @param onClick Click callback function.
 * @param modifier Modifier to apply to the card.
 * @param isFixed If true, gives a fixed background and text color.
 * @param tag Optional tag to display on top of the card.
 * @param dismissButton Optional dismiss button to display on top of the card.
 */
@Composable
fun SatsArticleCard(
    imageUrl: String,
    title: String?,
    subtitle: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isFixed: Boolean = false,
    tag: @Composable (() -> Unit?)? = null,
    dismissButton: @Composable (() -> Unit?)? = null,
) {
    SatsCard(modifier) {
        Box(
            Modifier
                .height(234.dp)
                .clickable { onClick() },
        ) {
            HeroImage(imageUrl, modifier = Modifier.fillMaxSize())
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.TopStart),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                tag?.let {
                    Box(Modifier.padding(SatsTheme.spacing.s)) {
                        tag()
                    }
                }

                Spacer(Modifier.weight(1f))

                dismissButton?.let {
                    Box(Modifier.padding(SatsTheme.spacing.xxs)) {
                        dismissButton()
                    }
                }
            }

            val (backgroundColor, textColor) = if (isFixed) {
                SatsTheme.colors.surfaces.fixed.primary.default.bg to SatsTheme.colors.surfaces.fixed.primary.default.fg
            } else {
                SatsTheme.colors.surfaces.primary.default.bg to SatsTheme.colors.surfaces.primary.default.fg
            }
            Column(
                Modifier
                    .background(backgroundColor)
                    .fillMaxWidth()
                    .align(Alignment.BottomStart)
                    .padding(horizontal = SatsTheme.spacing.m, vertical = SatsTheme.spacing.s),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxs),
            ) {
                if (title != null) {
                    Text(
                        title,
                        color = textColor,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 2,
                        style = SatsTheme.typography.satsHeadlineEmphasis.large,
                    )
                }

                if (subtitle != null) {
                    Text(
                        subtitle,
                        color = textColor,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 3,
                        style = SatsTheme.typography.normal.basic,
                    )
                }
            }
        }
    }
}

@Composable
private fun HeroImage(imageUrl: String, modifier: Modifier = Modifier) {
    if (LocalInspectionMode.current) {
        PreviewImagePlaceholder(modifier = modifier)
    } else {
        AsyncImage(
            model = imageUrl,
            contentDescription = null,
            modifier = modifier,
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
            title = "Plan your workout",
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
            title = "Plan your workout",
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
            title = "Plan your workout",
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

@PreviewLightDark
@Composable
private fun SatsArticleCardFixedPreview() {
    SatsTheme {
        SatsArticleCard(
            imageUrl = "https://picsum.photos/1920/1080",
            title = "Plan your workout",
            subtitle = "Now you can plan workouts ahead of time. " +
                "Try it out and schedule your first workout today. " +
                "There is a maximum number of char...",
            onClick = {},
            isFixed = true,
        )
    }
}

@PreviewLightDark
@Composable
private fun SatsArticleCardNoTitlePreview() {
    SatsTheme {
        SatsArticleCard(
            imageUrl = "https://picsum.photos/1920/1080",
            title = null,
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

@PreviewLightDark
@Composable
private fun SatsArticleCardShortDescriptionPreview() {
    SatsTheme {
        SatsArticleCard(
            imageUrl = "https://picsum.photos/1920/1080",
            title = "Plan your workout",
            subtitle = "This is a short description.",
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

@PreviewLightDark
@Composable
private fun SatsArticleCardEllipsizePreview() {
    SatsTheme {
        SatsArticleCard(
            imageUrl = "https://picsum.photos/1920/1080",
            title = "Plan your workout and more words in the long title lorem ipsum lorem ipsum lorem ipsum lorem",
            subtitle = "This is a long description. Lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem" +
                " ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem",
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
