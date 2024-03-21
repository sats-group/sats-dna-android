package com.sats.dna.sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.sats.dna.components.AdvancedTrailingContent
import com.sats.dna.components.SatsGeneralListItem
import com.sats.dna.components.SatsGeneralListItemDefaults
import com.sats.dna.components.SatsHorizontalDivider
import com.sats.dna.components.SimpleTrailingContent
import com.sats.dna.components.card.SatsCard
import com.sats.dna.icons.SatsIcons
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
                .padding(top = SatsTheme.spacing.m)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
        ) {
            Text(
                modifier = Modifier.padding(horizontal = SatsTheme.spacing.m),
                text = "In list",
                style = SatsTheme.typography.medium.small,
            )
            listItems().forEach {
                SatsHorizontalDivider()
                it()
            }
            Spacer(Modifier.height(SatsTheme.spacing.m))

            Text(
                modifier = Modifier.padding(horizontal = SatsTheme.spacing.m),
                text = "In cards",
                style = SatsTheme.typography.medium.small,
            )
            SatsHorizontalDivider()
            Column(
                Modifier.padding(SatsTheme.spacing.m),
                verticalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
            ) {
                listItems().forEach {
                    SatsCard {
                        it()
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun listItems(): List<@Composable () -> Unit> {
    return listOf(
        {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "General List Item",
                icon = SatsIcons.info,
            )
        },
        {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "General List Item with subtitle",
                subtitle = "Subtitle",
                icon = SatsIcons.info,
            )
        },
        {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "General List Item with trailing content",
                icon = SatsIcons.info,
                trailingContent = { SimpleTrailingContent() },
            )
        },
        {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "General List Item with advanced trailing content",
                icon = SatsIcons.info,
                trailingContent = { AdvancedTrailingContent() },
            )
        },
        {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "General List Item with non-default colors",
                icon = SatsIcons.info,
                colors = SatsGeneralListItemDefaults.generalListItemColors(
                    titleColor = SatsTheme.colors2.buttons.action.default.fg,
                    subtitleColor = SatsTheme.colors2.buttons.action.default.fg,
                    iconColor = SatsTheme.colors2.buttons.action.default.fg,
                ),
            )
        },
        {
            SatsGeneralListItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                title = "General List Item without icon",
                subtitle = "Subtitle",
                trailingContent = { SimpleTrailingContent() },
            )
        },
    )
}

@PreviewLightDark
@Composable
private fun GeneralListItemScreenPreview() {
    SatsTheme {
        GeneralListItemScreen(navigateUp = {})
    }
}
