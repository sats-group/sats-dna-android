package com.sats.dna.components.appbar

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SatsLargeTopAppBar(
    title: String,
    scrollBehavior: TopAppBarScrollBehavior,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
) {
    SatsLargeTopAppBar(
        title = { Text(title) },
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        scrollBehavior = scrollBehavior,
        windowInsets = windowInsets,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SatsLargeTopAppBar(
    title: @Composable () -> Unit,
    scrollBehavior: TopAppBarScrollBehavior,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
) {
    val scrolledContainerColor = if (SatsTheme.colors2.isLightMode) {
        SatsTheme.colors2.surfaces.fixed.primary.bg.default.copy(alpha = .05f)
    } else {
        SatsTheme.colors2.surfaces.primary.bg.default
    }.compositeOver(SatsTheme.colors2.backgrounds.primary.bg.default)

    LargeTopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = SatsTheme.colors2.backgrounds.primary.bg.default,
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

@OptIn(ExperimentalMaterial3Api::class)
@PreviewLightDark
@Composable
private fun SatsLargeTopAppBarPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            SatsLargeTopAppBar(
                title = "Top App Bar",
                scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(),
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(SatsTheme.icons.back, contentDescription = null)
                    }
                },
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
                modifier = Modifier.padding(SatsTheme.spacing.m),
            )
        }
    }
}
