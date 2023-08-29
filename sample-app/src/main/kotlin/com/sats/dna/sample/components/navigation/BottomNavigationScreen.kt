package com.sats.dna.sample.components.navigation

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.insets.ui.Scaffold
import com.sats.dna.components.appbar.SatsTopAppBar
import com.sats.dna.components.navigation.SatsBottomNavigation
import com.sats.dna.components.navigation.SatsBottomNavigationItem
import com.sats.dna.components.navigation.rememberSatsBottomNavigationState
import com.sats.dna.theme.SatsTheme

@Composable
internal fun BottomNavigationScreen(navigateUp: () -> Unit) {
    val state = rememberSampleBottomNavigationState()

    Scaffold(
        topBar = {
            SatsTopAppBar(
                contentPadding = WindowInsets.statusBars.asPaddingValues(),
                navigationIcon = {
                    IconButton(navigateUp) {
                        Icon(SatsTheme.icons.back, contentDescription = null)
                    }
                },
                title = { Text("Bottom Navigation") },
            )
        },
        bottomBar = { SatsBottomNavigation(state, contentPadding = WindowInsets.navigationBars.asPaddingValues()) },
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
