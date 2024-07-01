package com.sats.dna.sample.screens.styles

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sats.dna.colors.SatsColorPrimitives
import com.sats.dna.components.SatsSurface
import com.sats.dna.sample.screens.SampleScreen
import com.sats.dna.sample.screens.styles.NamedColor.Companion.named
import com.sats.dna.theme.SatsTheme

@Composable
fun ColorPrimitivesSampleScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    SampleScreen(
        title = "Color Primitives",
        navigateUp = navigateUp,
        contentPadding = PaddingValues(SatsTheme.spacing.m),
        modifier = modifier,
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = innerPadding,
            verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            items(namedPrimitives) { color ->
                ColorListItem(color)
            }
        }
    }
}

@Composable
private fun ColorListItem(namedColor: NamedColor, modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier.height(IntrinsicSize.Min),
        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.m),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            Modifier
                .size(56.dp)
                .border(1.dp, SatsTheme.colors.backgrounds.primary.default.fg, SatsTheme.shapes.roundedCorners.small)
                .background(namedColor.color, SatsTheme.shapes.roundedCorners.small),
        )

        Column(modifier, verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxs)) {
            Text(namedColor.name, style = SatsTheme.typography.emphasis.basic)
            Text("#${namedColor.hexColorString}")
        }
    }
}

@PreviewLightDark
@Composable
private fun ColorPrimitivesSampleScreenPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            ColorPrimitivesSampleScreen(navigateUp = {})
        }
    }
}

private data class NamedColor(val name: String, val color: Color) {
    val hexColorString: String = color.value.toString(16).uppercase().substring(0, 8)

    companion object {
        infix fun Color.named(name: String) = NamedColor(name, this)
    }
}

private val namedPrimitives = listOf(
    SatsColorPrimitives.SatsBlue110 named "SATS Blue 110",
    SatsColorPrimitives.SatsBlue105 named "SATS Blue 105",
    SatsColorPrimitives.SatsBlue100 named "SATS Blue 100",
    SatsColorPrimitives.SatsBlue90 named "SATS Blue 90",
    SatsColorPrimitives.SatsBlue70 named "SATS Blue 70",
    SatsColorPrimitives.SatsBlue40 named "SATS Blue 40",
    SatsColorPrimitives.SatsBlue20 named "SATS Blue 20",
    SatsColorPrimitives.SatsBlue10 named "SATS Blue 10",
    SatsColorPrimitives.SatsBlue5 named "SATS Blue 5",
    SatsColorPrimitives.SatsBlueGrey80 named "SATS Blue Grey 80",
    SatsColorPrimitives.SatsLightGrey15 named "SATS Light Grey 15",
    SatsColorPrimitives.SatsCoral190 named "SATS Coral 190",
    SatsColorPrimitives.SatsCoral170 named "SATS Coral 170",
    SatsColorPrimitives.SatsCoral130 named "SATS Coral 130",
    SatsColorPrimitives.SatsCoral120 named "SATS Coral 120",
    SatsColorPrimitives.SatsCoral100 named "SATS Coral 100",
    SatsColorPrimitives.SatsCoral90 named "SATS Coral 90",
    SatsColorPrimitives.SatsCoral60 named "SATS Coral 60",
    SatsColorPrimitives.SatsCoral40 named "SATS Coral 40",
    SatsColorPrimitives.SatsCoral10 named "SATS Coral 10",
    SatsColorPrimitives.SatsCoral5 named "SATS Coral 5",
    SatsColorPrimitives.White100 named "White 100",
    SatsColorPrimitives.White90 named "White 90",
    SatsColorPrimitives.White85 named "White 85",
    SatsColorPrimitives.White80 named "White 80",
    SatsColorPrimitives.White70 named "White 70",
    SatsColorPrimitives.White65 named "White 65",
    SatsColorPrimitives.White60 named "White 60",
    SatsColorPrimitives.White50 named "White 50",
    SatsColorPrimitives.White40 named "White 40",
    SatsColorPrimitives.White20 named "White 20",
    SatsColorPrimitives.White15 named "White 15",
    SatsColorPrimitives.White10 named "White 10",
    SatsColorPrimitives.White5 named "White 5",
    SatsColorPrimitives.White0 named "White 0",
    SatsColorPrimitives.Black100 named "Black 100",
    SatsColorPrimitives.Black95 named "Black 95",
    SatsColorPrimitives.Black90 named "Black 90",
    SatsColorPrimitives.Black85 named "Black 85",
    SatsColorPrimitives.Black80 named "Black 80",
    SatsColorPrimitives.Black70 named "Black 70",
    SatsColorPrimitives.Black60 named "Black 60",
    SatsColorPrimitives.Black55 named "Black 55",
    SatsColorPrimitives.Black50 named "Black 50",
    SatsColorPrimitives.Black40 named "Black 40",
    SatsColorPrimitives.Black20 named "Black 20",
    SatsColorPrimitives.Black10 named "Black 10",
    SatsColorPrimitives.Black5 named "Black 5",
    SatsColorPrimitives.Black3 named "Black 3",
    SatsColorPrimitives.BlackO20 named "Black O20",
    SatsColorPrimitives.Cardinal170 named "Cardinal 170",
    SatsColorPrimitives.Cardinal120 named "Cardinal 120",
    SatsColorPrimitives.Cardinal100 named "Cardinal 100",
    SatsColorPrimitives.Cardinal60 named "Cardinal 60",
    SatsColorPrimitives.Cardinal30 named "Cardinal 30",
    SatsColorPrimitives.Cardinal10 named "Cardinal 10",
    SatsColorPrimitives.SpringGreen170 named "Spring Green 170",
    SatsColorPrimitives.SpringGreen120 named "Spring Green 120",
    SatsColorPrimitives.SpringGreen100 named "Spring Green 100",
    SatsColorPrimitives.SpringGreen80 named "Spring Green 80",
    SatsColorPrimitives.SpringGreen60 named "Spring Green 60",
    SatsColorPrimitives.SpringGreen30 named "Spring Green 30",
    SatsColorPrimitives.SpringGreen10 named "Spring Green 10",
    SatsColorPrimitives.Gold170 named "Gold 170",
    SatsColorPrimitives.Gold140 named "Gold 140",
    SatsColorPrimitives.Gold130 named "Gold 130",
    SatsColorPrimitives.Gold110 named "Gold 110",
    SatsColorPrimitives.Gold100 named "Gold 100",
    SatsColorPrimitives.Gold80 named "Gold 80",
    SatsColorPrimitives.Gold60 named "Gold 60",
    SatsColorPrimitives.Gold30 named "Gold 30",
    SatsColorPrimitives.Gold10 named "Gold 10",
    SatsColorPrimitives.ChiliRed170 named "Chili Red 170",
    SatsColorPrimitives.ChiliRed120 named "Chili Red 120",
    SatsColorPrimitives.ChiliRed100 named "Chili Red 100",
    SatsColorPrimitives.ChiliRed80 named "Chili Red 80",
    SatsColorPrimitives.ChiliRed60 named "Chili Red 60",
    SatsColorPrimitives.ChiliRed10 named "Chili Red 10",
    SatsColorPrimitives.EgyptianPurple160 named "Egyptian Purple 160",
    SatsColorPrimitives.EgyptianPurple100 named "Egyptian Purple 100",
    SatsColorPrimitives.EgyptianPurple80 named "Egyptian Purple 80",
    SatsColorPrimitives.EgyptianPurple60 named "Egyptian Purple 60",
    SatsColorPrimitives.EgyptianPurple40 named "Egyptian Purple 40",
    SatsColorPrimitives.EgyptianPurple10 named "Egyptian Purple 10",
    SatsColorPrimitives.BrightBlue170 named "Bright Blue 170",
    SatsColorPrimitives.BrightBlue160 named "Bright Blue 160",
    SatsColorPrimitives.BrightBlue110 named "Bright Blue 110",
    SatsColorPrimitives.BrightBlue100 named "Bright Blue 100",
    SatsColorPrimitives.BrightBlue80 named "Bright Blue 80",
    SatsColorPrimitives.BrightBlue60 named "Bright Blue 60",
    SatsColorPrimitives.BrightBlue20 named "Bright Blue 20",
    SatsColorPrimitives.BrightBlue10 named "Bright Blue 10",
    SatsColorPrimitives.UranianBlue180 named "Uranian Blue 180",
    SatsColorPrimitives.UranianBlue160 named "Uranian Blue 160",
    SatsColorPrimitives.UranianBlue140 named "Uranian Blue 140",
    SatsColorPrimitives.UranianBlue100 named "Uranian Blue 100",
    SatsColorPrimitives.UranianBlue60 named "Uranian Blue 60",
    SatsColorPrimitives.UranianBlue10 named "Uranian Blue 10",
    SatsColorPrimitives.SalmonPink180 named "Salmon Pink 180",
    SatsColorPrimitives.SalmonPink160 named "Salmon Pink 160",
    SatsColorPrimitives.SalmonPink140 named "Salmon Pink 140",
    SatsColorPrimitives.SalmonPink100 named "Salmon Pink 100",
    SatsColorPrimitives.SalmonPink60 named "Salmon Pink 60",
    SatsColorPrimitives.SalmonPink10 named "Salmon Pink 10",
    SatsColorPrimitives.Celadon180 named "Celadon 180",
    SatsColorPrimitives.Celadon160 named "Celadon 160",
    SatsColorPrimitives.Celadon140 named "Celadon 140",
    SatsColorPrimitives.Celadon100 named "Celadon 100",
    SatsColorPrimitives.Celadon60 named "Celadon 60",
    SatsColorPrimitives.Celadon10 named "Celadon 10",
    SatsColorPrimitives.Tangerine180 named "Tangerine 180",
    SatsColorPrimitives.Tangerine160 named "Tangerine 160",
    SatsColorPrimitives.Tangerine140 named "Tangerine 140",
    SatsColorPrimitives.Tangerine100 named "Tangerine 100",
    SatsColorPrimitives.Tangerine60 named "Tangerine 60",
    SatsColorPrimitives.Tangerine10 named "Tangerine 10",
    SatsColorPrimitives.CaribbeanCurrent180 named "Caribbean Current 180",
    SatsColorPrimitives.CaribbeanCurrent160 named "Caribbean Current 160",
    SatsColorPrimitives.CaribbeanCurrent140 named "Caribbean Current 140",
    SatsColorPrimitives.CaribbeanCurrent100 named "Caribbean Current 100",
    SatsColorPrimitives.CaribbeanCurrent60 named "Caribbean Current 60",
    SatsColorPrimitives.CaribbeanCurrent10 named "Caribbean Current 10",
    SatsColorPrimitives.TropicalIndigo180 named "Tropical Indigo 180",
    SatsColorPrimitives.TropicalIndigo160 named "Tropical Indigo 160",
    SatsColorPrimitives.TropicalIndigo140 named "Tropical Indigo 140",
    SatsColorPrimitives.TropicalIndigo100 named "Tropical Indigo 100",
    SatsColorPrimitives.TropicalIndigo60 named "Tropical Indigo 60",
    SatsColorPrimitives.TropicalIndigo10 named "Tropical Indigo 10",
)
