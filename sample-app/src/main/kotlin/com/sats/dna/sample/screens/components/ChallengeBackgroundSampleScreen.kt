package com.sats.dna.sample.screens.components

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.SatsIcons
import com.sats.dna.components.SatsChallengeBackground
import com.sats.dna.components.appbar.SatsTopAppBar
import com.sats.dna.components.button.SatsTopAppBarIconButton
import com.sats.dna.components.screen.SatsScreen
import com.sats.dna.icons.Back
import com.sats.dna.theme.SatsTheme

@Composable
fun ChallengeBackgroundSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    val activity = LocalContext.current.findActivity() as? ComponentActivity

    DisposableEffect(activity) {
        activity?.enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(android.graphics.Color.TRANSPARENT),
        )

        onDispose {
            activity?.enableEdgeToEdge()
        }
    }

    SatsScreen(
        modifier = modifier,
        topBar = {
            SatsTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent,
                ),
                title = {
                    Text(
                        text = "Challenge Background",
                        style = SatsTheme.typography.normal.headline3,
                        color = SatsTheme.colors.backgrounds.fixed.primary.default.fg,
                    )
                },
                navigationIcon = {
                    SatsTopAppBarIconButton(
                        navigateUp,
                        SatsIcons.Back,
                        onClickLabel = null,
                    )
                },
            )
        },
        bottomBar = { Box(Modifier.navigationBarsPadding()) },
    ) {
        SatsChallengeBackground(Modifier.fillMaxSize()) {
        }
    }
}

@PreviewLightDark
@Composable
private fun ChallengeBackgroundSampleScreenPreview() {
    SatsTheme {
        ChallengeBackgroundSampleScreen(navigateUp = {})
    }
}

private tailrec fun Context.findActivity(): Activity? {
    return when (this) {
        is Activity -> this
        is ContextWrapper -> baseContext.findActivity()
        else -> null
    }
}
