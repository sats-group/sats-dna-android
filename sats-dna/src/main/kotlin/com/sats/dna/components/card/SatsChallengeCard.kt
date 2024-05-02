package com.sats.dna.components.card

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsChallengeBackground
import com.sats.dna.components.SatsChallengeBadge
import com.sats.dna.components.SatsTag
import com.sats.dna.components.SatsTagColor
import com.sats.dna.components.SatsTagShape
import com.sats.dna.components.button.SatsButton
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.SatsButtonSize
import com.sats.dna.components.button.SatsDismissButton
import com.sats.dna.components.button.rememberSatsDismissButtonState
import com.sats.dna.components.progressbar.SatsLinearProgressBar
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsChallengeCard(
    state: SatsChallengeCardState,
    modifier: Modifier = Modifier,
) {
    when (state) {
        is SatsChallengeCardState.Available -> {
            AvailableChallengeCard(
                imageUrl = state.imageUrl,
                title = state.title,
                subtitle = state.subtitle,
                tagText = state.tagText,
                buttonText = state.buttonText,
                isNew = state.isNew,
                onCardClick = state.onCardClick,
                onJoinClick = state.onJoinClick,
                isJoinButtonLoading = state.isJoinButtonLoading,
                modifier = modifier,
            )
        }

        is SatsChallengeCardState.Joined -> {
            JoinedChallengeCard(
                imageUrl = state.imageUrl,
                title = state.title,
                tagText = state.tagText,
                progress = state.progress,
                statusText = state.statusText,
                onCardClick = state.onCardClick,
                modifier = modifier,
            )
        }

        is SatsChallengeCardState.Disabled -> {
            DisabledChallengeCard(
                imageUrl = state.imageUrl,
                title = state.title,
                statusText = state.statusText,
                onCardClick = state.onCardClick,
                onDismissClick = state.onDismissClicked,
                dismissLabel = state.dismissLabel,
                isDismissButtonLoading = state.isDismissButtonLoading,
                modifier = modifier,
            )
        }
    }
}

sealed interface SatsChallengeCardState {
    class Available(
        val imageUrl: String?,
        val title: String,
        val subtitle: String,
        val tagText: String,
        val buttonText: String,
        val isNew: Boolean,
        val onCardClick: () -> Unit,
        val onJoinClick: () -> Unit,
        val isJoinButtonLoading: Boolean,
    ) : SatsChallengeCardState

    class Joined(
        val imageUrl: String?,
        val title: String,
        val tagText: String,
        val progress: Float,
        val statusText: String,
        val onCardClick: () -> Unit,
    ) : SatsChallengeCardState

    class Disabled(
        val imageUrl: String?,
        val title: String,
        val statusText: String,
        val dismissLabel: String,
        val onCardClick: () -> Unit,
        val onDismissClicked: () -> Unit,
        val isDismissButtonLoading: Boolean,
    ) : SatsChallengeCardState
}

@Composable
private fun ChallengeCardLayout(
    imageUrl: String?,
    title: String,
    onCardClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    subtitle: String? = null,
    tag: @Composable (() -> Unit?)? = null,
    dismissButton: @Composable (() -> Unit?)? = null,
    bottomContent: @Composable (() -> Unit?)? = null,
) {
    SatsChallengeBackground(
        isEnabled = isEnabled,
        modifier = modifier
            .height(IntrinsicSize.Min)
            .clip(SatsTheme.shapes.roundedCorners.small),
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .clickable(onClick = onCardClick),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            tag?.let {
                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = SatsTheme.spacing.xs),
                    contentAlignment = Alignment.TopStart,
                ) {
                    tag()
                }
            }

            dismissButton?.let {
                Box(
                    Modifier
                        .fillMaxWidth(),
                    contentAlignment = Alignment.TopEnd,
                ) {
                    dismissButton()
                }
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxs, Alignment.CenterVertically),
            ) {
                SatsChallengeBadge(
                    modifier = Modifier
                        .padding(top = SatsTheme.spacing.m, bottom = SatsTheme.spacing.xxs)
                        .size(75.dp)
                        .aspectRatio(1f)
                        .clip(SatsTheme.shapes.circle),
                    imageUrl = imageUrl,
                    contentDescription = null,
                )

                Text(
                    text = title,
                    style = SatsTheme.typography.satsHeadlineEmphasis.large,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = SatsTheme.spacing.xs),
                )
                subtitle?.let {
                    Text(
                        modifier = Modifier.padding(horizontal = SatsTheme.spacing.xxs),
                        text = subtitle,
                        style = SatsTheme.typography.normal.small,
                        textAlign = TextAlign.Center,
                    )
                }
            }
            bottomContent?.let {
                Box(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = SatsTheme.spacing.xs),
                    contentAlignment = Alignment.BottomCenter,
                ) {
                    bottomContent()
                }
            }
        }
    }
}

@Composable
private fun AvailableChallengeCard(
    imageUrl: String?,
    title: String,
    subtitle: String,
    tagText: String,
    buttonText: String,
    isNew: Boolean,
    onCardClick: () -> Unit,
    onJoinClick: () -> Unit,
    isJoinButtonLoading: Boolean,
    modifier: Modifier = Modifier,
) {
    ChallengeCardLayout(
        imageUrl = imageUrl,
        title = title,
        subtitle = subtitle,
        onCardClick = onCardClick,
        modifier = modifier,
        tag = {
            SatsTag(
                text = tagText,
                color = if (isNew) {
                    SatsTagColor.Positive
                } else {
                    SatsTagColor.Featured
                },
                shape = SatsTagShape.Left,
            )
        },
        bottomContent = {
            SatsButton(
                onClick = onJoinClick,
                label = buttonText,
                modifier = Modifier.padding(bottom = SatsTheme.spacing.m),
                colors = SatsButtonColor.Clean,
                size = SatsButtonSize.Small,
                isLoading = isJoinButtonLoading,
            )
        },
    )
}

@Composable
private fun JoinedChallengeCard(
    imageUrl: String?,
    title: String,
    tagText: String,
    progress: Float,
    statusText: String,
    onCardClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    ChallengeCardLayout(
        modifier = modifier,
        imageUrl = imageUrl,
        title = title,
        onCardClick = onCardClick,
        tag = {
            SatsTag(
                text = tagText,
                color = SatsTagColor.Featured,
                shape = SatsTagShape.Left,
            )
        },
        bottomContent = {
            ChallengeCardProgress(
                progress = progress,
                progressText = statusText,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = SatsTheme.spacing.m),
            )
        },
    )
}

@Composable
private fun DisabledChallengeCard(
    imageUrl: String?,
    title: String,
    statusText: String,
    dismissLabel: String,
    onCardClick: () -> Unit,
    onDismissClick: () -> Unit,
    isDismissButtonLoading: Boolean,
    modifier: Modifier = Modifier,
) {
    val dismissButtonState = rememberSatsDismissButtonState()

    LaunchedEffect(isDismissButtonLoading) {
        if (isDismissButtonLoading) {
            dismissButtonState.showAsLoading()
        } else {
            dismissButtonState.reset()
        }
    }

    ChallengeCardLayout(
        modifier = modifier,
        imageUrl = imageUrl,
        title = title,
        onCardClick = onCardClick,
        isEnabled = false,
        dismissButton = {
            SatsDismissButton(
                state = dismissButtonState,
                onDismissClicked = onDismissClick,
                dismissLabel = dismissLabel,
                color = SatsButtonColor.Clean,
                size = SatsButtonSize.Small,
            )
        },
        bottomContent = {
            Text(
                text = statusText,
                style = SatsTheme.typography.normal.small,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = SatsTheme.spacing.l, bottom = SatsTheme.spacing.m),
            )
        },
    )
}

@Composable
private fun ChallengeCardProgress(progress: Float, progressText: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SatsLinearProgressBar(
            progress = progress,
            modifier = Modifier
                .fillMaxWidth()
                .padding(SatsTheme.spacing.s),
        )
        Text(
            text = progressText,
            style = SatsTheme.typography.normal.small,
            textAlign = TextAlign.Center,
        )
    }
}

@PreviewLightDark
@Composable
private fun JoinChallengeCardPreview() {
    SatsTheme {
        SatsChallengeCard(
            SatsChallengeCardState.Available(
                imageUrl = null,
                title = "STREAK WEEK",
                subtitle = "Workout for 7 consecutive days",
                buttonText = "Join",
                tagText = "NEW",
                isNew = true,
                onCardClick = {},
                onJoinClick = {},
                isJoinButtonLoading = false,
            ),
            modifier = Modifier
                .height(255.dp)
                .width(176.dp),
        )
    }
}

@PreviewLightDark
@Composable
private fun JoinedChallengeCardPreview() {
    SatsTheme {
        SatsChallengeCard(
            SatsChallengeCardState.Joined(
                imageUrl = null,
                title = "STREAK WEEK",
                tagText = "23 days left!",
                progress = 0.14f,
                statusText = "1 out of 7 workouts",
                onCardClick = {},
            ),
            modifier = Modifier
                .height(255.dp)
                .width(176.dp),
        )
    }
}

@PreviewLightDark
@Composable
private fun DisabledChallengeCardPreview() {
    SatsTheme {
        SatsChallengeCard(
            state = SatsChallengeCardState.Disabled(
                imageUrl = null,
                title = "STREAK WEEK",
                statusText = "Not completed",
                dismissLabel = "Dismiss",
                onCardClick = {},
                onDismissClicked = {},
                isDismissButtonLoading = false,
            ),
            modifier = Modifier
                .height(255.dp)
                .width(176.dp),
        )
    }
}
