package com.sats.dna.components.button.internal

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.animatedBorderColor
import com.sats.dna.components.button.animatedContainerColor
import com.sats.dna.components.button.animatedContentColor
import com.sats.dna.theme.SatsTheme

@Composable
internal fun SatsBaseButtonLayout(
    onClick: () -> Unit,
    onClickLabel: String?,
    color: SatsButtonColor,
    isEnabled: Boolean,
    isLoading: Boolean,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    val isActuallyEnabled = isEnabled && !isLoading

    SatsBaseButtonLayout(
        onClick = onClick,
        onClickLabel = onClickLabel,
        modifier = modifier,
        containerColor = color.animatedContainerColor(isActuallyEnabled),
        contentColor = color.animatedContentColor(isActuallyEnabled),
        borderColor = color.animatedBorderColor(isActuallyEnabled),
        isEnabled = isEnabled,
        isLoading = isLoading,
        content = content,
    )
}

@Composable
internal fun SatsBaseButtonLayout(
    onClick: () -> Unit,
    onClickLabel: String?,
    containerColor: Color,
    contentColor: Color,
    borderColor: Color?,
    isEnabled: Boolean,
    isLoading: Boolean,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    val isActuallyEnabled = isEnabled && !isLoading

    Surface(
        onClick = onClick,
        modifier = modifier.semantics {
            this.role = Role.Button
            this.onClick(label = onClickLabel, action = { isActuallyEnabled })
        },
        enabled = isActuallyEnabled,
        shape = SatsTheme.shapes.roundedCorners.small,
        color = containerColor,
        contentColor = contentColor,
        border = borderColor?.let { BorderStroke(1.dp, it) },
        interactionSource = remember { MutableInteractionSource() },
    ) {
        content()
    }
}
