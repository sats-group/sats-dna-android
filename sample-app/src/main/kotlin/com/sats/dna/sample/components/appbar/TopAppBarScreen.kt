package com.sats.dna.sample.components.appbar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.SatsSwitch
import com.sats.dna.components.appbar.SatsTopAppBar
import com.sats.dna.components.screen.SatsScreen
import com.sats.dna.theme.SatsTheme

@Composable
@OptIn(ExperimentalMaterial3Api::class)
internal fun SatsTopAppBarScreen(navigateUp: () -> Unit) {
    val screenState = remember { TopAppBarScreenState() }

    val scrollBehavior = when (screenState.scrollBehavior) {
        ScrollBehavior.EnterAlways -> TopAppBarDefaults.enterAlwaysScrollBehavior()
        ScrollBehavior.ExitUntilCollapsed -> TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
        ScrollBehavior.Pinned -> TopAppBarDefaults.pinnedScrollBehavior()
    }

    SatsScreen(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            SatsTopAppBar(
                navigationIcon = {
                    if (screenState.showUpArrow) {
                        UpIconButton(navigateUp)
                    }
                },
                title = "Top App Bar",
                actions = {
                    if (screenState.showActions) {
                        Actions()
                    }
                },
                scrollBehavior = scrollBehavior,
            )
        },
        bottomBar = { ControlPanel(screenState) },
        contentPadding = PaddingValues(SatsTheme.spacing.m),
    ) { innerPadding ->
        LoremIpsumTexts(innerPadding)
    }
}

@Stable
private class TopAppBarScreenState {
    var scrollBehavior: ScrollBehavior by mutableStateOf(ScrollBehavior.EnterAlways)
    var showUpArrow: Boolean by mutableStateOf(true)
    var showActions: Boolean by mutableStateOf(false)
}

private enum class ScrollBehavior {
    EnterAlways, ExitUntilCollapsed, Pinned
}

@Composable
@Suppress("SpellCheckingInspection") // it's  just dummy text, dummy
private fun LoremIpsumTexts(contentPadding: PaddingValues = PaddingValues(0.dp)) {
    LazyColumn(contentPadding = contentPadding, verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s)) {
        items(10) {
            Text(
                """
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam posuere orci a velit fermentum
                    aliquet. Morbi in velit eget felis vulputate laoreet in a nisi. Vestibulum sagittis rhoncus ex,
                    sed malesuada metus consequat non. Ut neque nisl, fringilla quis odio nec, sagittis sodales tortor.
                    Maecenas volutpat eros eu hendrerit sollicitudin. Vivamus commodo ligula vitae nisl rhoncus, in
                    pretium augue congue. Aliquam lectus felis, tristique id venenatis eu, venenatis ac nibh. Nulla
                    commodo fermentum nunc, ut facilisis nisi porttitor eget.
                """.trimIndent(),
            )
        }
    }
}

@Composable
private fun ControlPanel(state: TopAppBarScreenState) {
    SatsSurface(elevation = 2.dp) {
        Column(
            Modifier
                .navigationBarsPadding()
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
        ) {
            ScrollBehaviorControlPanelItem(
                value = state.scrollBehavior,
                items = ScrollBehavior.entries,
                onItemSelected = { state.scrollBehavior = it },
            )

            Divider()

            ToggleableControlPanelItem(
                label = "Show Up Arrow",
                isSelected = state.showUpArrow,
                onSelectChange = { state.showUpArrow = it },
                modifier = Modifier.fillMaxWidth(),
            )

            ToggleableControlPanelItem(
                label = "Show Actions",
                isSelected = state.showActions,
                onSelectChange = { state.showActions = it },
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}

@Composable
private fun <T : Any> ScrollBehaviorControlPanelItem(value: T, items: List<T>, onItemSelected: (T) -> Unit) {
    var isDropdownExpanded by remember { mutableStateOf(false) }

    Row(
        Modifier
            .fillMaxWidth()
            .clip(SatsTheme.shapes.roundedCorners.small)
            .clickable { isDropdownExpanded = !isDropdownExpanded }
            .padding(SatsTheme.spacing.s),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text("Scroll Behavior", style = SatsTheme.typography.medium.basic)

        Box {
            Text(value.toString(), style = SatsTheme.typography.default.basic)

            DropdownMenu(
                expanded = isDropdownExpanded,
                onDismissRequest = { isDropdownExpanded = false },
            ) {
                items.forEach { item ->
                    DropdownMenuItem(
                        text = { Text(item.toString()) },
                        leadingIcon = {
                            if (value == item) {
                                Icon(SatsTheme.icons.check, contentDescription = null)
                            }
                        },
                        onClick = {
                            onItemSelected(item)
                            isDropdownExpanded = false
                        },
                    )
                }
            }
        }
    }
}

@Composable
private fun ToggleableControlPanelItem(
    label: String,
    isSelected: Boolean,
    onSelectChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .clip(SatsTheme.shapes.roundedCorners.small)
            .clickable { onSelectChange(!isSelected) }
            .padding(SatsTheme.spacing.s),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(label)

        SatsSwitch(isSelected, onCheckedChange = null)
    }
}

@Composable
private fun UpIconButton(onClick: () -> Unit) {
    IconButton(onClick) {
        Icon(SatsTheme.icons.back, contentDescription = null)
    }
}

@Composable
private fun Actions() {
    Row {
        IconButton(onClick = { }) {
            Icon(SatsTheme.icons.barbell, contentDescription = null)
        }

        IconButton(onClick = { }) {
            Icon(SatsTheme.icons.addPerson, contentDescription = null)
        }
    }
}
