package com.sats.dna.sample.icons

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.ui.Scaffold
import com.google.accompanist.insets.ui.TopAppBar
import com.sats.dna.icons.SatsIcons
import com.sats.dna.theme.SatsTheme

@Composable
internal fun IconsScreen(navigateUp: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = SatsTheme.colors.surface.primary,
                contentPadding = WindowInsets.statusBars.asPaddingValues(),
                navigationIcon = {
                    IconButton(onClick = navigateUp) {
                        Icon(SatsTheme.icons.back, contentDescription = null)
                    }
                },
                title = { Text("Icons") },
            )
        },
        bottomBar = { Box(Modifier.navigationBarsPadding()) },
        contentPadding = PaddingValues(SatsTheme.spacing.m),
    ) { innerPadding ->
        val icons = SatsTheme.icons.toIconDataList()

        LazyVerticalGrid(
            modifier = Modifier.fillMaxSize(),
            columns = GridCells.Adaptive(iconCellSize),
            contentPadding = innerPadding,
        ) {
            items(icons) { icon ->
                IconCell(icon)
            }
        }
    }
}

@Composable
private fun SatsIcons.toIconDataList() = listOf(
    IconData("back", back),
    IconData("chevronRight", chevronRight),
    IconData("comment", comment),
    IconData("fistBump", fistBump),
    IconData("linkExternal", linkExternal),
    IconData("navActivityFilled", navActivityFilled),
    IconData("navActivityOutlined", navActivityOutlined),
    IconData("navBookFilled", navBookFilled),
    IconData("navBookOutlined", navBookOutlined),
    IconData("navClubsFilled", navClubsFilled),
    IconData("navClubsOutlined", navClubsOutlined),
    IconData("navHomeElixiaFilled", navHomeElixiaFilled),
    IconData("navHomeElixiaOutlined", navHomeElixiaOutlined),
    IconData("navHomeSatsFilled", navHomeSatsFilled),
    IconData("navHomeSatsOutlined", navHomeSatsOutlined),
    IconData("navProfileFilled", navProfileFilled),
    IconData("navProfileOutlined", navProfileOutlined),
    IconData("navQrFilled", navQrFilled),
    IconData("navQrOutlined", navQrOutlined),
    IconData("starFilled", starFilled),
    IconData("starOutlined", starOutlined),
    IconData("users", users),
    IconData("workoutGx", workoutGx),
    IconData("workoutGymFloor", workoutGymFloor),
    IconData("workoutOther", workoutOther),
    IconData("workoutPt", workoutPt),
)

@Composable
private fun IconCell(icon: IconData) {
    Box(Modifier.size(iconCellSize), contentAlignment = Alignment.Center) {
        Icon(icon.painter, contentDescription = null, Modifier.size(24.dp))
    }
}

private data class IconData(val name: String, val painter: Painter)

private val iconCellSize = 56.dp
