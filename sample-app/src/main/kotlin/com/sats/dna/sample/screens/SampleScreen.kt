package com.sats.dna.sample.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.sats.dna.components.appbar.SatsTopAppBar
import com.sats.dna.components.button.SatsTopAppBarIconButton
import com.sats.dna.components.screen.SatsScreen
import com.sats.dna.theme.SatsTheme

sealed class SampleScreen(
    private val name: String,
    private val route: String,
    private val screen: @Composable (navController: NavController) -> Unit,
) {
    context(NavGraphBuilder)
    fun navScreen(navController: NavController) {
        composable(this@SampleScreen.route) {
            screen(navController)
        }
    }

    private fun navigate(navController: NavController) {
        navController.navigate(route)
    }

    @Composable
    fun HomeListItem(navController: NavController) {
        ListItem(
            headlineContent = { Text(name) },
            colors = ListItemDefaults.colors(containerColor = SatsTheme.colors2.backgrounds.primary.default.bg),
            modifier = Modifier.clickable { navigate(navController) },
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun ComponentScreen(
    title: String,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier,
    bottomBar: @Composable () -> Unit = { Box(Modifier.navigationBarsPadding()) },
    content: @Composable (innerPadding: PaddingValues) -> Unit,
) {
    val topAppBarScrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    SatsScreen(
        modifier = modifier.nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
        topBar = {
            SatsTopAppBar(
                navigationIcon = {
                    SatsTopAppBarIconButton(
                        onClick = navigateUp,
                        icon = SatsTheme.icons.back,
                        onClickLabel = null,
                    )
                },
                title = title,
                scrollBehavior = topAppBarScrollBehavior,
            )
        },
        bottomBar = bottomBar,
        content = content,
    )
}
