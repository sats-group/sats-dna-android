package com.sats.dna.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalInspectionMode
import coil.compose.AsyncImage
import com.sats.dna.components.card.SatsCard
import com.sats.dna.theme.SatsTheme
import com.sats.dna.tooling.LightDarkPreview
import com.sats.dna.tooling.PreviewImagePlaceholder

@Composable
fun SatsCampaignModule(
    imageUrl: String,
    title: String,
    subtitle: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    SatsCard(modifier) {
        Column(Modifier.clickable { onClick() }) {
            HeroImage(imageUrl)

            Column(
                Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.xxs),
            ) {
                Text(title, style = SatsTheme.typography.medium.basic)

                if (subtitle != null) {
                    Text(subtitle, style = SatsTheme.typography.default.small)
                }
            }
        }
    }
}

@Composable
private fun HeroImage(imageUrl: String) {
    if (LocalInspectionMode.current) {
        PreviewImagePlaceholder(
            Modifier
                .fillMaxWidth()
                .aspectRatio(339f / 202f),
        )
    } else {
        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(340f / 202f),
            model = imageUrl,
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )
    }
}

@LightDarkPreview
@Composable
private fun SatsCampaignModulePreview() {
    SatsTheme {
        SatsCampaignModule(
            imageUrl = "https://picsum.photos/1920/1080",
            title = "Happy Training Day",
            subtitle = "Today is a day to learn, grow, and challenge yourself. " +
                "It's a day to step outside of your comfort zone and try new things. " +
                "It's a day to invest in yourself and your future.",
            onClick = {},
        )
    }
}

@LightDarkPreview
@Composable
private fun SatsCampaignWithoutSubtitleModulePreview() {
    SatsTheme {
        SatsCampaignModule(
            imageUrl = "https://picsum.photos/1920/1080",
            title = "Happy Training Day",
            subtitle = null,
            onClick = {},
        )
    }
}
