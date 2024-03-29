package com.sats.dna.components.appbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.SatsTopAppBarIconButton
import com.sats.dna.icons.AddPerson
import com.sats.dna.icons.Back
import com.sats.dna.icons.Barbell
import com.sats.dna.theme.SatsTheme

@OptIn(ExperimentalMaterial3Api::class)
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SatsTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    scrollBehavior: TopAppBarScrollBehavior? = null,
    windowInsets: WindowInsets = TopAppBarDefaults.windowInsets,
) {
    // If we don't have a scroll behaviour, then we need to always separate the top app bar from the following
    // content, and using the same color as we would when the content was scrolled makes sense here.
    val containerColor = if (scrollBehavior == null) {
        SatsTopAppBarDefaults.containerColor
    } else {
        SatsTheme.colors2.backgrounds.primary.default.bg
    }

    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = containerColor,
            scrolledContainerColor = SatsTopAppBarDefaults.containerColor,
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

object SatsTopAppBarDefaults {
    val containerColor
        @Composable get() = if (SatsTheme.colors2.isLightMode) {
            SatsTheme.colors2.surfaces.fixed.primary.default.bg.copy(alpha = .05f)
        } else {
            SatsTheme.colors2.surfaces.primary.default.bg
        }.compositeOver(SatsTheme.colors2.backgrounds.primary.default.bg)

    val contentColor
        @Composable get() = SatsTheme.colors2.surfaces.primary.default.fg
}

@OptIn(ExperimentalMaterial3Api::class)
@PreviewLightDark
@Composable
private fun SatsTopAppBarPreview() {
    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors2.backgrounds.primary.default.bg,
            useMaterial3 = true,
        ) {
            SatsTopAppBar(
                modifier = Modifier.padding(SatsTheme.spacing.m),
                navigationIcon = {
                    SatsTopAppBarIconButton(
                        onClick = {},
                        SatsIcons.Back,
                        onClickLabel = null,
                    )
                },
                title = "Top App Bar",
                actions = {
                    listOf(SatsIcons.Barbell, SatsIcons.AddPerson).forEach { icon ->
                        SatsTopAppBarIconButton(onClick = {}, icon, onClickLabel = null)
                    }
                },
            )
        }
    }
}
