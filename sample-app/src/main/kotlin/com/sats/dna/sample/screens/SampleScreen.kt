package com.sats.dna.sample.screens

import androidx.compose.foundation.clickable
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
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
            colors = ListItemDefaults.colors(containerColor = SatsTheme.colors.background.primary),
            modifier = Modifier.clickable { navigate(navController) },
        )
    }
}
