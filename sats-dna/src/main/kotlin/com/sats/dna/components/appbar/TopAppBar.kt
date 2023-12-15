package com.sats.dna.components.appbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.compositeOver
import com.google.accompanist.insets.ui.TopAppBar
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview
import androidx.compose.material3.Icon as M3Icon
import androidx.compose.material3.IconButton as M3IconButton
import androidx.compose.material3.Text as M3Text
import androidx.compose.material3.TopAppBar as M3TopAppBar

@Composable
fun SatsTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {},
    contentPadding: PaddingValues = PaddingValues(),
) {
    TopAppBar(
        backgroundColor = SatsTheme.colors2.surfaces.primary.bg.default,
        contentPadding = contentPadding,
        contentColor = SatsTheme.colors2.surfaces.primary.fg.default,
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun M3SatsTopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    scrollBehavior: TopAppBarScrollBehavior? = null,
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
) {
    M3SatsTopAppBar(
        title = { M3Text(title) },
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        scrollBehavior = scrollBehavior,
        windowInsets = windowInsets,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun M3SatsTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    scrollBehavior: TopAppBarScrollBehavior? = null,
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
) {
    val scrolledContainerColor = SatsTheme.colors2.surfaces.fixed.bg.default.copy(alpha = .08f)
        .compositeOver(SatsTheme.colors2.surfaces.primary.bg.default)

    // If we don't have a scroll behaviour, then we need to always separate the top app bar from the following
    // content, and using the same color as we would when the content was scrolled makes sense here.
    val containerColor = if (scrollBehavior == null) {
        scrolledContainerColor
    } else {
        SatsTheme.colors2.surfaces.primary.bg.default
    }

    M3TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = containerColor,
            scrolledContainerColor = scrolledContainerColor,
        ),
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        scrollBehavior = scrollBehavior,
        windowInsets = windowInsets,
    )
}

@LightDarkPreview
@Composable
private fun Preview() {
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

@OptIn(ExperimentalMaterial3Api::class)
@LightDarkPreview
@Composable
private fun M3Preview() {
    SatsTheme {
        M3SatsTopAppBar(
            navigationIcon = {
                M3IconButton(onClick = {}) {
                    M3Icon(SatsTheme.icons.back, contentDescription = null)
                }
            },
            title = "Top App Bar",
            actions = {
                listOf(
                    SatsTheme.icons.barbell,
                    SatsTheme.icons.addPerson,
                ).forEach { icon ->
                    M3IconButton(onClick = {}) {
                        M3Icon(icon, contentDescription = null)
                    }
                }
            },
        )
    }
}
