package com.sats.dna.sample.components.card

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sats.dna.components.card.SatsCard
import com.sats.dna.sample.components.ComponentScreen
import com.sats.dna.theme.SatsTheme

@Composable
internal fun SatsCardScreen(navigateUp: () -> Unit) {
    ComponentScreen("Cards", navigateUp) { innerPadding ->
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m),
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            SatsCard(useMaterial3 = true) {
                Column(Modifier.clickable { }) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .aspectRatio(16f / 9)
                            .background(SatsTheme.colors.waitingList.primary),
                    ) {
                        Text("Image", Modifier.align(Alignment.Center), color = SatsTheme.colors.onWaitingList.primary)
                    }

                    Column(Modifier.padding(SatsTheme.spacing.m), Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
                        Text("Material 3 Card", style = SatsTheme.typography.medium.large)

                        Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
                    }
                }
            }

            SatsCard(useMaterial3 = false) {
                Column(Modifier.clickable { }) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .aspectRatio(16f / 9)
                            .background(SatsTheme.colors.waitingList.primary),
                    ) {
                        Text("Image", Modifier.align(Alignment.Center), color = SatsTheme.colors.onWaitingList.primary)
                    }

                    Column(Modifier.padding(SatsTheme.spacing.m), Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
                        Text("Material 2 Card", style = SatsTheme.typography.medium.large)

                        Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
                    }
                }
            }
        }
    }
}
