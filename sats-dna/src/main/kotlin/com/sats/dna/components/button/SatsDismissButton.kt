package com.sats.dna.components.button

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.internal.SatsBaseButtonLayout
import com.sats.dna.components.button.internal.SatsIconButtonContent
import com.sats.dna.components.button.internal.SatsTextButtonContent
import com.sats.dna.components.button.internal.previewBackgroundColorFor
import com.sats.dna.icons.Close
import com.sats.dna.theme.SatsTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SatsDismissButton(
    dismissLabel: String,
    onDismissClicked: () -> Unit,
    modifier: Modifier = Modifier,
    state: SatsDismissButtonState = rememberSatsDismissButtonState(),
    size: SatsButtonSize = SatsButtonSize.Basic,
    color: SatsButtonColor = SatsButtonColor.Primary,
    isEnabled: Boolean = true,
) {
    val isLoading = state.state is SatsDismissButtonContent.Loading

    SatsBaseButtonLayout(
        onClick = { state.onClick(dismissAction = onDismissClicked) },
        modifier = modifier,
        isEnabled = isEnabled,
        isLoading = isLoading,
        onClickLabel = dismissLabel,
        color = color,
    ) {
        AnimatedContent(state.state, label = "Button Content") { content ->
            when (content) {
                is SatsDismissButtonContent.Initial -> {
                    SatsIconButtonContent(
                        icon = SatsIcons.Close,
                        size = size,
                        isLoading = false,
                    )
                }

                is SatsDismissButtonContent.Confirming -> {
                    SatsTextButtonContent(
                        label = dismissLabel,
                        size = size,
                        isLoading = false,
                        icon = SatsIcons.Close,
                    )
                }

                is SatsDismissButtonContent.Loading -> {
                    SatsTextButtonContent(
                        label = dismissLabel,
                        size = size,
                        isLoading = true,
                        icon = null,
                    )
                }
            }
        }
    }
}

@Stable
class SatsDismissButtonState internal constructor(
    private val coroutineScope: CoroutineScope,
) {
    internal var state: SatsDismissButtonContent by mutableStateOf(SatsDismissButtonContent.Initial)

    private val isConfirmingResetJob = Job()

    internal fun onClick(dismissAction: () -> Unit) {
        when (state) {
            is SatsDismissButtonContent.Initial -> {
                showAsConfirming()
            }

            is SatsDismissButtonContent.Confirming -> {
                dismissAction()
            }

            is SatsDismissButtonContent.Loading -> {
                // no-op, since you can't click on loading buttons
            }
        }
    }

    fun reset() {
        isConfirmingResetJob.cancelChildren()

        state = SatsDismissButtonContent.Initial
    }

    fun showAsLoading() {
        isConfirmingResetJob.cancelChildren()

        state = SatsDismissButtonContent.Loading
    }

    private fun showAsConfirming() {
        isConfirmingResetJob.cancelChildren()

        state = SatsDismissButtonContent.Confirming

        coroutineScope.launch(isConfirmingResetJob) {
            delay(ResetDurationMillis)

            state = SatsDismissButtonContent.Initial
        }
    }

    companion object {
        private const val ResetDurationMillis = 5000L
    }
}

@Composable
fun rememberSatsDismissButtonState(): SatsDismissButtonState {
    val coroutineScope = rememberCoroutineScope()

    return remember(coroutineScope) {
        SatsDismissButtonState(coroutineScope)
    }
}

internal sealed interface SatsDismissButtonContent {
    data object Initial : SatsDismissButtonContent
    data object Confirming : SatsDismissButtonContent
    data object Loading : SatsDismissButtonContent
}

@PreviewLightDark
@Composable
private fun SatsDismissButtonColorPreview(@PreviewParameter(SatsButtonColorProvider::class) color: SatsButtonColor) {
    SatsTheme {
        SatsSurface(color = previewBackgroundColorFor(color), useMaterial3 = true) {
            SatsDismissButton(
                dismissLabel = "Dismiss",
                onDismissClicked = {},
                modifier = Modifier.padding(SatsTheme.spacing.m),
                size = SatsButtonSize.Basic,
                color = color,
            )
        }
    }
}

@Preview("Sizes")
@Composable
private fun SatsDismissButtonSizePreview(@PreviewParameter(SatsButtonSizeProvider::class) size: SatsButtonSize) {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg, useMaterial3 = true) {
            SatsDismissButton(
                modifier = Modifier.padding(SatsTheme.spacing.m),
                dismissLabel = "Dismiss",
                onDismissClicked = {},
                size = size,
            )
        }
    }
}
