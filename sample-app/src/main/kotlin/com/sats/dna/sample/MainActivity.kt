package com.sats.dna.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.sats.dna.sample.internal.LocalSharedTransitionScope
import com.sats.dna.sample.routes.HomeRoute
import com.sats.dna.theme.SatsTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalSharedTransitionApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            SatsTheme {
                val navController = rememberNavController()

                SharedTransitionScope { sharedTransitionScopeModifier ->
                    CompositionLocalProvider(LocalSharedTransitionScope provides this) {
                        NavHost(
                            modifier = sharedTransitionScopeModifier,
                            navController = navController,
                            startDestination = HomeRoute,
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
    }
}
