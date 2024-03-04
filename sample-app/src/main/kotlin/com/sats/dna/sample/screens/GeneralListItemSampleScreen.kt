package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.AdvancedTrailingContent
import com.sats.dna.components.SatsGeneralListItem
import com.sats.dna.components.SatsGeneralListItemDefaults
import com.sats.dna.components.SimpleTrailingContent
import com.sats.dna.theme.SatsTheme

data object GeneralListItemSampleScreen : SampleScreen(
    name = "General List Item",
    route = "/components/general-list-item",
    screen = { GeneralListItemScreen(it::navigateUp) },
)

@Composable
private fun GeneralListItemScreen(navigateUp: () -> Unit, modifier: Modifier = Modifier) {
    ComponentScreen("General List Item", navigateUp, modifier) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
                .padding(SatsTheme.spacing.m)
                .fillMaxSize()
                .wrapContentSize(),
            Arrangement.spacedBy(SatsTheme.spacing.m),
        ) {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "General List Item",
                icon = SatsTheme.icons.info,
            )
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "General List Item with subtitle",
                subtitle = "Subtitle",
                icon = SatsTheme.icons.info,
            )
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "General List Item with trailing content",
                icon = SatsTheme.icons.info,
                trailingContent = { SimpleTrailingContent() },
            )
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "General List Item with advanced trailing content",
                icon = SatsTheme.icons.info,
                trailingContent = { AdvancedTrailingContent() },
            )
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "General List Item with non-default colors",
                icon = SatsTheme.icons.info,
                colors = SatsGeneralListItemDefaults.generalListItemColors(
                    titleColor = SatsTheme.colors2.buttons.action.default.fg,
                    subtitleColor = SatsTheme.colors2.buttons.action.default.fg,
                    iconColor = SatsTheme.colors2.buttons.action.default.fg,
                ),
            )
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "General List Item without icon",
                subtitle = "Subtitle",
                trailingContent = { SimpleTrailingContent() },
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview() {
    SatsTheme {
        GeneralListItemScreen(navigateUp = {})
    }
}
