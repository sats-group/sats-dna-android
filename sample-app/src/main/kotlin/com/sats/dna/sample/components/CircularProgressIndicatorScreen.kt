package com.sats.dna.sample.components

import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sats.dna.components.SatsCircularProgressIndicator
import com.sats.dna.theme.SatsTheme

@Composable
internal fun CircularProgressIndicatorScreen(navigateUp: () -> Unit) {
    ComponentScreen("Circular Progress Indicator", navigateUp) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize()
                .wrapContentSize(),
            spacedBy(SatsTheme.spacing.m),
        ) {
            Row(horizontalArrangement = spacedBy(SatsTheme.spacing.m)) {
                SatsCircularProgressIndicator(progress = .2f, Modifier.size(72.dp))
                SatsCircularProgressIndicator(progress = .4f, Modifier.size(72.dp))
                SatsCircularProgressIndicator(progress = .6f, Modifier.size(72.dp))
            }

            Row(horizontalArrangement = spacedBy(SatsTheme.spacing.m)) {
                SatsCircularProgressIndicator(progress = .8f, Modifier.size(72.dp))
                SatsCircularProgressIndicator(progress = 1f, Modifier.size(72.dp))
                SatsCircularProgressIndicator(Modifier.size(72.dp))
            }
        }
    }
}
