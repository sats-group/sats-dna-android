package com.sats.dna.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.components.TrailingContent.Icon
import com.sats.dna.components.button.SatsButtonColor
import com.sats.dna.components.button.SatsIconButton
import com.sats.dna.components.button.SatsTopAppBarIconButton
import com.sats.dna.theme.SatsTheme

@Composable
fun SatsSearchBar(
    query: String,
    onQueryChange: (query: String) -> Unit,
    onClearClicked: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    placeholder: String? = null,
    onUpClicked: (() -> Unit)? = null,
) {
    BasicTextField(
        value = query,
        onValueChange = onQueryChange,
        enabled = enabled,
        modifier = modifier,
        decorationBox = @Composable { innerTextField ->
            DecorationBox(
                value = query,
                innerTextField = innerTextField,
                placeholder = {
                    if (placeholder != null) {
                        Text(placeholder, color = SatsTheme.colors2.surfaces2.primary.default.fgAlternate)
                    }
                },
                modifier = Modifier,
                leadingIcon = {
                    if (onUpClicked != null) {
                        SatsTopAppBarIconButton(
                            onClick = { onUpClicked() },
                            icon = SatsTheme.icons.back,
                            onClickLabel = null,
                        )
                    } else {
                        Box(modifier = Modifier.size(40.dp), contentAlignment = Alignment.Center) {
                            Icon(
                                icon = SatsTheme.icons.search,
                                tint = SatsTheme.colors2.surfaces2.primary.default.fg,
                            )
                        }
                    }
                },
                trailingIcon = {
                    Box(Modifier.minimumInteractiveComponentSize()) {
                        if (query.isNotBlank()) {
                            SatsIconButton(
                                onClick = { onClearClicked() },
                                icon = SatsTheme.icons.close,
                                onClickLabel = null,
                                colors = SatsButtonColor.Action,
                            )
                        }
                    }
                },
            )
        },
        singleLine = true,
        textStyle = SatsTheme.typography.normal.basic.copy(color = SatsTheme.colors2.backgrounds2.primary.default.fg),
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.Sentences,
            imeAction = ImeAction.Done,
        ),
        keyboardActions = keyboardActions,
        cursorBrush = SolidColor(SatsTheme.colors2.backgrounds2.primary.default.fg),
    )
}

@Composable
private fun DecorationBox(
    value: String,
    innerTextField: @Composable (() -> Unit),
    modifier: Modifier = Modifier,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
) {
    SatsSurface(
        shape = SatsTheme.shapes.circle,
        modifier = modifier.fillMaxWidth(),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(SatsTheme.spacing.xs),
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xs),
            ) {
                leadingIcon?.let {
                    leadingIcon()
                }
                Box {
                    if (value.isEmpty() && placeholder != null) {
                        placeholder()
                    }

                    innerTextField()
                }
            }
            trailingIcon?.let {
                trailingIcon()
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun SatsSearchBarPreview() {
    SatsTheme {
        var query by remember { mutableStateOf("") }

        SatsSearchBar(
            query = query,
            onQueryChange = { query = it },
            onClearClicked = {},
            modifier = Modifier.padding(SatsTheme.spacing.m),
            placeholder = "Search …",
        )
    }
}

@PreviewLightDark
@Composable
private fun WithQueryPreview() {
    SatsTheme {
        var query by remember { mutableStateOf("SATS Carl Berner") }

        SatsSearchBar(
            query = query,
            onQueryChange = { query = it },
            onClearClicked = {},
            modifier = Modifier.padding(SatsTheme.spacing.m),
            placeholder = "Search …",
        )
    }
}

@PreviewLightDark
@Composable
private fun WithBackButtonPreview() {
    SatsTheme {
        var query by remember { mutableStateOf("") }

        SatsSearchBar(
            query = query,
            onQueryChange = { query = it },
            onClearClicked = {},
            modifier = Modifier.padding(SatsTheme.spacing.m),
            placeholder = "Search …",
            onUpClicked = {},
        )
    }
}
