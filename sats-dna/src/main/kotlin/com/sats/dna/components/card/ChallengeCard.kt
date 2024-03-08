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
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.LocalUseMaterial3
import com.sats.dna.components.SatsChallengeBackground
import com.sats.dna.components.SatsChallengeBadge
import com.sats.dna.components.SatsTag
import com.sats.dna.components.SatsTagColor
import com.sats.dna.components.SatsTagShape
import com.sats.dna.components.button.SatsButton2
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.SatsButtonSize
import com.sats.dna.components.progressbar.SatsLinearProgressBar
import com.sats.dna.internal.MaterialIcon
import com.sats.dna.theme.SatsTheme

@Composable
fun ChallengeCard(state: ChallengeCardState, modifier: Modifier = Modifier) {
    when (state) {
        is ChallengeCardState.Available -> {
            AvailableChallengeCard(
                imageUrl = state.imageUrl,
                title = state.title,
                subtitle = state.subtitle,
                tagText = state.tagText,
                buttonText = state.buttonText,
                onCardClick = state.onCardClick,
                onJoinClick = state.onJoinClick,
                modifier = modifier,
            )
        }

        is ChallengeCardState.Joined -> {
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

        is ChallengeCardState.Disabled -> {
            DisabledChallengeCard(
                imageUrl = state.imageUrl,
                title = state.title,
                statusText = state.statusText,
                onCardClick = state.onCardClick,
                onDeleteClick = state.onDeleteClick,
                modifier = modifier,
            )
        }
    }
}

sealed interface ChallengeCardState {
    class Available(
        val imageUrl: String?,
        val title: String,
        val subtitle: String,
        val tagText: String,
        val buttonText: String,
        val onCardClick: () -> Unit,
        val onJoinClick: () -> Unit,
        val modifier: Modifier = Modifier,
    ) : ChallengeCardState

    class Joined(
        val imageUrl: String?,
        val title: String,
        val tagText: String,
        val progress: Float,
        val statusText: String,
        val onCardClick: () -> Unit,
        val modifier: Modifier = Modifier,
    ) : ChallengeCardState

    class Disabled(
        val imageUrl: String?,
        val title: String,
        val statusText: String,
        val onCardClick: () -> Unit,
        val onDeleteClick: () -> Unit,
        val modifier: Modifier = Modifier,
    ) : ChallengeCardState
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
    deleteButton: @Composable (() -> Unit?)? = null,
    bottomContent: @Composable (() -> Unit?)? = null,
) {
    CompositionLocalProvider(LocalUseMaterial3 provides true) {
        SatsChallengeBackground(isEnabled = isEnabled, modifier = modifier.height(IntrinsicSize.Min)) {
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

                deleteButton?.let {
                    Box(
                        Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.TopEnd,
                    ) {
                        deleteButton()
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
                    )
                    subtitle?.let {
                        Text(
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
}

@Composable
private fun AvailableChallengeCard(
    imageUrl: String?,
    title: String,
    subtitle: String,
    tagText: String,
    buttonText: String,
    onCardClick: () -> Unit,
    onJoinClick: () -> Unit,
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
                color = SatsTagColor.Featured,
                shape = SatsTagShape.Left,
            )
        },
        bottomContent = {
            SatsButton2(
                onClick = onJoinClick,
                label = buttonText,
                modifier = Modifier.padding(bottom = SatsTheme.spacing.m),
                colors = SatsButtonColor.Clean,
                size = SatsButtonSize.Small,
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
    onCardClick: () -> Unit,
    onDeleteClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    ChallengeCardLayout(
        modifier = modifier,
        imageUrl = imageUrl,
        title = title,
        onCardClick = onCardClick,
        isEnabled = false,
        deleteButton = {
            IconButton(onClick = onDeleteClick) {
                MaterialIcon(
                    painter = SatsTheme.icons.delete,
                    contentDescription = null,
                    tint = SatsTheme.colors2.graphicalElements.icons.fixed,
                )
            }
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
        ChallengeCard(
            ChallengeCardState.Available(
                imageUrl = null,
                title = "STREAK WEEK",
                subtitle = "Workout for 7 consecutive days",
                buttonText = "Join",
                tagText = "23 days left",
                onCardClick = {},
                onJoinClick = {},
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
        ChallengeCard(
            ChallengeCardState.Joined(
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
        ChallengeCard(
            ChallengeCardState.Disabled(
                imageUrl = null,
                title = "STREAK WEEK",
                statusText = "Not completed",
                onCardClick = {},
                onDeleteClick = {},
            ),
            modifier = Modifier
                .height(255.dp)
                .width(176.dp),
        )
    }
}