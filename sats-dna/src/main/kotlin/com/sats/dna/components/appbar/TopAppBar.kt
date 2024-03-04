package com.sats.dna.components.appbar

import androidx.compose.material3.Icon as M3Icon
import androidx.compose.material3.IconButton as M3IconButton
import androidx.compose.material3.Text as M3Text
import androidx.compose.material3.TopAppBar as M3TopAppBar
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme

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
    val scrolledContainerColor = if (SatsTheme.colors2.isLightMode) {
        SatsTheme.colors2.surfaces.fixed.bg.default.copy(alpha = .05f)
    } else {
        SatsTheme.colors2.surfaces.primary.bg.default
    }.compositeOver(SatsTheme.colors2.backgrounds.primary.bg.default)

    // If we don't have a scroll behaviour, then we need to always separate the top app bar from the following
    // content, and using the same color as we would when the content was scrolled makes sense here.
    val containerColor = if (scrollBehavior == null) {
        scrolledContainerColor
    } else {
        SatsTheme.colors2.backgrounds.primary.bg.default
    }

    M3TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = containerColor,
            scrolledContainerColor = scrolledContainerColor,
        ),
        title = {
            ProvideTextStyle(
                value = SatsTheme.typography.normal.headline3.copy(baselineShift = BaselineShift.None),
                content = title,
            )
        },
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = {
            Row(horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
                actions()
            }
        },
        scrollBehavior = scrollBehavior,
        windowInsets = windowInsets,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@PreviewLightDark
@Composable
private fun Material3Preview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            M3SatsTopAppBar(
                modifier = Modifier.padding(SatsTheme.spacing.m),
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
}
