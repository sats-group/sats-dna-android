package com.sats.dna.components.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.ui.BottomNavigation
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsBottomNavigation(
    state: SatsBottomNavigationState,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(),
) {
    BottomNavigation(
        modifier = modifier,
        contentPadding = contentPadding,
        backgroundColor = SatsTheme.colors.surface.primary,
        contentColor = SatsTheme.colors.onSurface.primary,
    ) {
        state.items.forEach { item ->
            BottomNavigationItem(
                icon = { BottomNavIcon(if (item == state.selectedItem) item.selectedIcon else item.unselectedIcon) },
                label = { BottomNavLabel(item) },
                selected = item == state.selectedItem,
                selectedContentColor = SatsTheme.colors.navigation,
                unselectedContentColor = SatsTheme.colors.onSurface.secondary,
                onClick = { state.selectedItem = item },
            )
        }
    }
}

@Stable
class SatsBottomNavigationState internal constructor(internal val items: List<SatsBottomNavigationItem>) {
    var selectedItem by mutableStateOf(items.first())
        internal set
}

@Composable
fun rememberSatsBottomNavigationState(items: List<SatsBottomNavigationItem>): SatsBottomNavigationState {
    return remember { SatsBottomNavigationState(items) }
}

@Composable
private fun BottomNavIcon(icon: Painter) {
    Icon(icon, contentDescription = null, Modifier.size(24.dp))
}

@Composable
private fun BottomNavLabel(item: SatsBottomNavigationItem) {
    Text(item.label, maxLines = 1, overflow = TextOverflow.Ellipsis)
}

data class SatsBottomNavigationItem(
    val selectedIcon: Painter,
    val unselectedIcon: Painter,
    val label: String,
)

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        Surface(color = SatsTheme.colors.background.primary) {
            val state = rememberSampleBottomNavigationState()

            Column {
                Text(
                    state.selectedItem.label,
                    Modifier
                        .padding(SatsTheme.spacing.xxl)
                        .align(Alignment.CenterHorizontally),
                    style = SatsTheme.typography.medium.heading1,
                )

                SatsBottomNavigation(state)
            }
        }
    }
}

@Composable
private fun rememberSampleBottomNavigationState() = rememberSatsBottomNavigationState(
    listOf(
        SatsBottomNavigationItem(
            selectedIcon = SatsTheme.icons.navHomeSatsFilled,
            unselectedIcon = SatsTheme.icons.navHomeSatsOutlined,
            label = "Home",
        ),
        SatsBottomNavigationItem(
            selectedIcon = SatsTheme.icons.navBookFilled,
            unselectedIcon = SatsTheme.icons.navBookOutlined,
            label = "Book",
        ),
        SatsBottomNavigationItem(
            selectedIcon = SatsTheme.icons.navQrFilled,
            unselectedIcon = SatsTheme.icons.navQrOutlined,
            label = "Check In",
        ),
        SatsBottomNavigationItem(
            selectedIcon = SatsTheme.icons.navClubsFilled,
            unselectedIcon = SatsTheme.icons.navClubsOutlined,
            label = "Clubs",
        ),
        SatsBottomNavigationItem(
            selectedIcon = SatsTheme.icons.navActivityFilled,
            unselectedIcon = SatsTheme.icons.navActivityOutlined,
            label = "Activity",
        ),
    ),
)
