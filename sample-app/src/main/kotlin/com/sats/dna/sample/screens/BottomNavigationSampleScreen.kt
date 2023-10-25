package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sats.dna.components.navigation.SatsBottomNavigation
import com.sats.dna.components.navigation.SatsBottomNavigationItem
import com.sats.dna.components.navigation.rememberSatsBottomNavigationState
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview

data object BottomNavigationSampleScreen : SampleScreen(
    name = "Bottom Navigation",
    route = "/components/bottom-navigation",
    screen = { BottomNavigationScreen(it::navigateUp) },
)

@Composable
private fun BottomNavigationScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    val state = rememberSampleBottomNavigationState()

    ComponentScreen(
        title = "Bottom Navigation",
        navigateUp = navigateUp,
        bottomBar = { SatsBottomNavigation(state) },
        modifier = modifier,
    ) { innerPadding ->
        Text(
            state.selectedItem.label,
            Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .wrapContentSize(),
            style = SatsTheme.typography.medium.heading1,
        )
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

@LightDarkPreview
@Composable
private fun Preview() {
    SatsTheme {
        BottomNavigationScreen(navigateUp = {})
    }
}
