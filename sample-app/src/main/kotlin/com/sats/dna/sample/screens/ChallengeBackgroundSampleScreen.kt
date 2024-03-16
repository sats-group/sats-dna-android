package com.sats.dna.sample.screens

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.SatsChallengeBackground
import com.sats.dna.components.SatsSurface
import com.sats.dna.components.button.SatsTopAppBarIconButton
import com.sats.dna.components.screen.SatsScreen
import com.sats.dna.theme.SatsTheme

data object ChallengeBackgroundSampleScreen : SampleScreen(
    name = "Challenge Background",
    route = "/components/challenge-background",
    screen = { ChallengeBackgroundScreen(it::navigateUp) },
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ChallengeBackgroundScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
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
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent,
                ),
                title = {
                    Text(
                        text = "Challenge Background",
                        style = SatsTheme.typography.normal.headline3,
                        color = SatsTheme.colors2.backgrounds2.fixed.primary.default.fg,
                    )
                },
                navigationIcon = { SatsTopAppBarIconButton(navigateUp, SatsTheme.icons.back, onClickLabel = null) },
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
private fun ChallengeBackgroundScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds2.primary.default.bg, useMaterial3 = true) {
            ChallengeBackgroundScreen(navigateUp = {})
        }
    }
}

private tailrec fun Context.findActivity(): Activity? {
    return when (this) {
        is Activity -> this
        is ContextWrapper -> baseContext.findActivity()
        else -> null
    }
}
