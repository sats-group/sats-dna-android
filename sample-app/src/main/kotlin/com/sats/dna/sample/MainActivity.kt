@file:OptIn(ExperimentalAnimationApi::class)

package com.sats.dna.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentScope.SlideDirection
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.core.view.WindowCompat
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.sats.dna.theme.SatsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            SatsTheme {
                val navController = rememberAnimatedNavController()

                AnimatedNavHost(
                    navController = navController,
                    startDestination = MainRoute,
                    enterTransition = { slideIntoContainer(SlideDirection.Left) },
                    exitTransition = { slideOutOfContainer(SlideDirection.Left) },
                    popEnterTransition = { slideIntoContainer(SlideDirection.Right) },
                    popExitTransition = { slideOutOfContainer(SlideDirection.Right) },
                ) {
                    mainGraph(navController)
                }
            }
        }
    }
}
