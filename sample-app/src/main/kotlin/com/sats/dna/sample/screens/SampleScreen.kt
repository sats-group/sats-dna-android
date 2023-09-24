@file:OptIn(ExperimentalMaterialApi::class)

package com.sats.dna.sample.screens

import androidx.compose.foundation.clickable
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

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
            modifier = Modifier.clickable { navigate(navController) },
            text = { Text(name) },
        )
    }
}
