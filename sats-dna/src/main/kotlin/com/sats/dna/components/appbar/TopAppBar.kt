package com.sats.dna.components.appbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.insets.ui.TopAppBar
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {},
    contentPadding: PaddingValues = PaddingValues(),
) {
    TopAppBar(
        backgroundColor = SatsTheme.colors.surface.primary,
        contentPadding = contentPadding,
        contentColor = SatsTheme.colors.onSurface.primary,
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
    )
}

@LightDarkPreview
@Composable
fun Preview() {
    SatsTheme {
        SatsTopAppBar(
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(SatsTheme.icons.back, contentDescription = null)
                }
            },
            title = { Text("Top App Bar") },
            actions = {
                listOf(
                    SatsTheme.icons.barbell,
                    SatsTheme.icons.addPerson,
                ).forEach { icon ->
                    IconButton(onClick = {}) {
                        Icon(icon, contentDescription = null)
                    }
                }
            },
        )
    }
}
