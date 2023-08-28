package com.sats.dna.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.sats.dna.theme.SatsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            SatsTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = MainRoute,
                    enterTransition = { slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Left) },
                    exitTransition = { slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Left) },
                    popEnterTransition = { slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Right) },
                    popExitTransition = { slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Right) },
                ) {
                    mainGraph(navController)
                }
            }
        }
    }
}
