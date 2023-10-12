package com.sats.dna.components.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

@Composable
fun SatsBottomNavigation(
    state: SatsBottomNavigationState,
    modifier: Modifier = Modifier,
) {
    NavigationBar(modifier, containerColor = SatsTheme.colors.surface.secondary) {
        state.items.forEach { item ->
            val icon = if (item == state.selectedItem) item.selectedIcon else item.unselectedIcon

            NavigationBarItem(
                icon = { BottomNavIcon(icon, item.hasBadge) },
                label = { BottomNavLabel(item) },
                selected = item == state.selectedItem,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = SatsTheme.colors.navigation,
                    selectedTextColor = SatsTheme.colors.navigation,
                    indicatorColor = SatsTheme.colors.surface.secondary,
                    unselectedIconColor = SatsTheme.colors.onSurface.secondary,
                    unselectedTextColor = SatsTheme.colors.onSurface.secondary,
                    disabledIconColor = SatsTheme.colors.onSurface.disabled,
                    disabledTextColor = SatsTheme.colors.onSurface.disabled,
                ),
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
private fun BottomNavIcon(icon: Painter, hasBadge: Boolean) {
    Box {
        Icon(icon, contentDescription = null, Modifier.size(24.dp))

        if (hasBadge) {
            BottomNavIconBadge(Modifier.align(Alignment.TopEnd))
        }
    }
}

@Composable
private fun BottomNavIconBadge(modifier: Modifier = Modifier) {
    Box(
        modifier
            .size(8.dp)
            .background(SatsTheme.colors.cta.default, CircleShape),
    )
}

@Composable
private fun BottomNavLabel(item: SatsBottomNavigationItem) {
    Text(item.label, maxLines = 1, overflow = TextOverflow.Ellipsis)
}

data class SatsBottomNavigationItem(
    val selectedIcon: Painter,
    val unselectedIcon: Painter,
    val label: String,
    val hasBadge: Boolean = false,
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
            hasBadge = true,
        ),
    ),
)
