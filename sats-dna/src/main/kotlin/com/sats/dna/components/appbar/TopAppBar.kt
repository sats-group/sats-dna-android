@file:OptIn(ExperimentalMaterial3Api::class)

package com.sats.dna.components.appbar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.compositeOver
import com.sats.dna.components.SatsSurface
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsTopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    scrollBehavior: TopAppBarScrollBehavior? = null,
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
) {
    SatsTopAppBar(
        title = { Text(title) },
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        scrollBehavior = scrollBehavior,
        windowInsets = windowInsets,
    )
}

@Composable
fun SatsTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    scrollBehavior: TopAppBarScrollBehavior? = null,
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
) {
    val scrolledContainerColor = SatsTheme.colors.primary.default.copy(alpha = .08f)
        .compositeOver(SatsTheme.colors.surface.primary)

    // If we don't have a scroll behaviour, then we need to always separate the top app bar from the following
    // content, and using the same color as we would when the content was scrolled makes sense here.
    val containerColor = if (scrollBehavior == null) {
        scrolledContainerColor
    } else {
        SatsTheme.colors.background.primary
    }

    TopAppBar(
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
fun Preview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.background.primary) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                SatsTopAppBar(
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(SatsTheme.icons.back, contentDescription = null)
                        }
                    },
                    title = "Top App Bar",
                    actions = {
                        Row {
                            IconButton(onClick = {}) {
                                Icon(SatsTheme.icons.barbell, contentDescription = null)
                            }

                            IconButton(onClick = {}) {
                                Icon(SatsTheme.icons.addPerson, contentDescription = null)
                            }
                        }
                    },
                )

                Text("Page Content", Modifier.padding(SatsTheme.spacing.l))
            }
        }
    }
}
