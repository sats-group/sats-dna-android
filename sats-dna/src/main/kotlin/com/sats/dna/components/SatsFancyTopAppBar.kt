package com.sats.dna.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ListItem
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.mapSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import coil.compose.AsyncImage
import com.sats.dna.R
import com.sats.dna.components.appbar.SatsTopAppBarDefaults
import com.sats.dna.components.button.SatsTopAppBarIconButton
import com.sats.dna.theme.SatsTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.math.roundToInt

@Composable
fun SatsFancyTopAppBar(
    imageUrl: String,
    title: String,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    scrollConnection: SatsFancyTopAppBarNestedScrollConnection? = null,
) {
    val expandPercent = if (scrollConnection != null) {
        (scrollConnection.currentHeightPx - scrollConnection.collapsedHeightPx) /
            (scrollConnection.expandedHeightPx - scrollConnection.collapsedHeightPx)
    } else {
        1f
    }

    val contentColor = lerp(
        start = SatsTheme.colors2.surfaces.primary.fg.default,
        stop = SatsTheme.colors2.backgrounds.fixed.primary.fg.default,
        fraction = expandPercent,
    )

    CompositionLocalProvider(LocalContentColor provides contentColor) {
        val topBarPadding = WindowInsets.statusBars.getTop(LocalDensity.current)
        val spaceBetweenHeaderIconsAndText = SatsTheme.spacing.xs
        val collapsedTextHorizontalPadding = SatsTheme.spacing.m

        var isStateInitializedWithSize by rememberSaveable { mutableStateOf(false) }

        Layout(
            modifier = modifier,
            contents = listOf(
                { HeaderImage(imageUrl, expandPercent) },
                { Box { navigationIcon() } },
                { Row(content = actions) },
                { ExpandedHeaderText(title, expandPercent, Modifier.padding(horizontal = SatsTheme.spacing.xxl)) },
                { CollapsedHeaderText(title, expandPercent) },
            ),
        ) { measurables, constraints: Constraints ->
            val imageMeasurable = measurables[0].first()
            val navIconMeasurable = measurables[1].first()
            val actionsMeasurable = measurables[2].first()
            val expandedTextMeasurable = measurables[3].first()
            val collapsedTextMeasurable = measurables[4].first()

            // Calculate actual width and height
            val actualWidth = constraints.maxWidth
            val expandedHeight = actualWidth / AppBarExpandedAspectRatio + topBarPadding
            val collapsedHeight = (AppBarCollapsedHeight + topBarPadding.toDp()).toPx()
            val actualHeight = lerp(collapsedHeight, expandedHeight, expandPercent).roundToInt()

            // Ensure the scroll connection knows the correct min and max sizes
            if (!isStateInitializedWithSize) {
                scrollConnection?.initialize(collapsedHeight, expandedHeight)
                isStateInitializedWithSize = true
            }

            // Measure image
            val imagePlaceable = imageMeasurable.measure(constraints.copy(maxHeight = actualHeight))

            // Measure navigation icon
            val navIconPlaceable = navIconMeasurable.measure(constraints)

            // Measure top-right actions
            val actionsPlaceable = actionsMeasurable.measure(constraints)

            // Measure text and calculate its placement
            val navIconWidthAndPadding = when (navIconPlaceable.width) {
                0 -> collapsedTextHorizontalPadding.roundToPx()
                else -> navIconPlaceable.width + spaceBetweenHeaderIconsAndText.roundToPx()
            }
            val actionsWidthAndPadding = when (actionsPlaceable.width) {
                0 -> collapsedTextHorizontalPadding.roundToPx()
                else -> actionsPlaceable.width + spaceBetweenHeaderIconsAndText.roundToPx()
            }

            // Only allow the text to be as wide as the space between the nav icon and the actions, incl. padding
            val availableWidthWhenCollapsed = actualWidth - navIconWidthAndPadding - actionsWidthAndPadding

            // Place the text to the right of the icon button when the app bar is collapsed

            val actionBarHeight = maxOf(navIconPlaceable.height, actionsPlaceable.height)
                .coerceAtLeast(AppBarCollapsedHeight.roundToPx())

            val expandedTextPlaceable = expandedTextMeasurable.measure(constraints)

            val collapsedTextPlaceable = collapsedTextMeasurable.measure(
                constraints.copy(maxWidth = availableWidthWhenCollapsed),
            )

            layout(actualWidth, actualHeight) {
                imagePlaceable.place(x = 0, y = 0)

                navIconPlaceable.place(
                    x = 0,
                    y = topBarPadding + (actionBarHeight / 2 - navIconPlaceable.height / 2),
                )

                actionsPlaceable.place(
                    x = actualWidth - actionsPlaceable.width,
                    y = topBarPadding + (actionBarHeight / 2 - actionsPlaceable.height / 2),
                )

                expandedTextPlaceable.place(
                    x = actualWidth / 2 - expandedTextPlaceable.width / 2,
                    y = actualHeight / 2 - expandedTextPlaceable.height / 2,
                )

                collapsedTextPlaceable.place(
                    x = navIconWidthAndPadding,
                    y = topBarPadding + (actionBarHeight / 2 - collapsedTextPlaceable.height / 2),
                )
            }
        }
    }
}

class SatsFancyTopAppBarNestedScrollConnection internal constructor() : NestedScrollConnection {
    internal var collapsedHeightPx: Float = 0f
    internal var expandedHeightPx: Float = 1f

    internal var currentHeightPx: Float by mutableFloatStateOf(expandedHeightPx)

    private constructor(collapsedHeightPx: Float, expandedHeightPx: Float, currentHeightPx: Float) : this() {
        this.collapsedHeightPx = collapsedHeightPx
        this.expandedHeightPx = expandedHeightPx
        this.currentHeightPx = currentHeightPx
    }

    override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
        val delta = available.y

        val previousHeight = currentHeightPx
        val nextHeight = previousHeight + delta
        currentHeightPx = nextHeight.coerceIn(collapsedHeightPx, expandedHeightPx)

        val consumed = currentHeightPx - previousHeight

        return Offset(x = 0f, y = consumed)
    }

    suspend fun collapse() {
        withContext(Dispatchers.Main) {
            Animatable(currentHeightPx).also {
                it.animateTo(collapsedHeightPx, ExpandCollapseAnimationSpec) {
                    currentHeightPx = it.value
                }
            }
        }
    }

    suspend fun expand() {
        withContext(Dispatchers.Main) {
            Animatable(currentHeightPx).also {
                it.animateTo(expandedHeightPx, ExpandCollapseAnimationSpec) {
                    currentHeightPx = it.value
                }
            }
        }
    }

    internal fun initialize(collapsedHeight: Float, expandedHeight: Float) {
        collapsedHeightPx = collapsedHeight
        expandedHeightPx = expandedHeight
        currentHeightPx = expandedHeight
    }

    internal companion object {
        val ExpandCollapseAnimationSpec = tween<Float>(300)

        private const val CollapsedHeightPxKey = "collapsedHeightPx"
        private const val ExpandedHeightPxKey = "expandedHeightPx"
        private const val CurrentHeightPxKey = "currentHeightPx"

        val Saver = mapSaver(
            save = {
                mapOf(
                    CollapsedHeightPxKey to it.collapsedHeightPx,
                    ExpandedHeightPxKey to it.expandedHeightPx,
                    CurrentHeightPxKey to it.currentHeightPx,
                )
            },
            restore = {
                SatsFancyTopAppBarNestedScrollConnection(
                    collapsedHeightPx = it[CollapsedHeightPxKey] as Float,
                    expandedHeightPx = it[ExpandedHeightPxKey] as Float,
                    currentHeightPx = it[CurrentHeightPxKey] as Float,
                )
            },
        )
    }
}

@Composable
fun rememberSatsFancyTopAppBarNestedScrollConnection(): SatsFancyTopAppBarNestedScrollConnection {
    return rememberSaveable(saver = SatsFancyTopAppBarNestedScrollConnection.Saver) {
        SatsFancyTopAppBarNestedScrollConnection()
    }
}

@Composable
private fun HeaderImage(
    imageUrl: String,
    expandPercent: Float,
    modifier: Modifier = Modifier,
) {
    Box(modifier) {
        if (LocalInspectionMode.current) {
            Image(
                painter = painterResource(R.drawable.placeholder_gx),
                contentDescription = null,
                contentScale = ContentScale.Crop,
            )
        } else {
            AsyncImage(
                model = imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
            )
        }

        HeaderImageShade(expandPercent, Modifier.fillMaxSize())
    }
}

@Composable
private fun HeaderImageShade(expandPercent: Float, modifier: Modifier = Modifier) {
    val expandedColor = Color.Black.copy(alpha = .6f)
    val collapsedColor = SatsTopAppBarDefaults.containerColor
    val color = lerp(collapsedColor, expandedColor, expandPercent)

    Box(modifier.background(color))
}

@Composable
private fun ExpandedHeaderText(
    text: String,
    expandPercent: Float,
    modifier: Modifier = Modifier,
) {
    val alpha = animateFloatAsState(expandPercent, label = "expanded header text alpha").value

    Text(
        text = text,
        modifier = modifier,
        style = SatsTheme.typography.satsHeadlineEmphasis.headline1,
        textAlign = TextAlign.Center,
        maxLines = 3,
        overflow = TextOverflow.Ellipsis,
        color = LocalContentColor.current.copy(alpha = alpha),
    )
}

@Composable
private fun CollapsedHeaderText(
    text: String,
    expandPercent: Float,
    modifier: Modifier = Modifier,
) {
    val alpha = animateFloatAsState(1 - expandPercent, label = "collapsed header text alpha").value

    Text(
        text = text,
        modifier = modifier,
        style = SatsTheme.typography.normal.headline3,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        color = SatsTopAppBarDefaults.contentColor.copy(alpha = alpha),
    )
}

private val AppBarCollapsedHeight = 64.dp
private const val AppBarExpandedAspectRatio = 1920f / 1080

@Preview
@Composable
private fun SatsFancyTopAppBarExpandedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val coroutineScope = rememberCoroutineScope()
            val scrollConnection = rememberSatsFancyTopAppBarNestedScrollConnection()
                .also { coroutineScope.launch { it.expand() } }

            SatsFancyTopAppBar(
                imageUrl = "https://picsum.photos/1920/1080",
                title = "Pure Strength",
                scrollConnection = scrollConnection,
                navigationIcon = {
                    SatsTopAppBarIconButton(
                        onClick = {},
                        icon = SatsTheme.icons.back,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )
                },
                actions = {
                    SatsTopAppBarIconButton(
                        onClick = {},
                        icon = SatsTheme.icons.share,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )

                    SatsTopAppBarIconButton(
                        onClick = {},
                        icon = SatsTheme.icons.moreVertical,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )
                },
            )
        }
    }
}

@Preview
@Composable
private fun SatsFancyTopAppBarCollapsedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val coroutineScope = rememberCoroutineScope()
            val scrollConnection = rememberSatsFancyTopAppBarNestedScrollConnection()
                .also { coroutineScope.launch { it.collapse() } }

            SatsFancyTopAppBar(
                imageUrl = "https://picsum.photos/1920/1080",
                title = "Pure Strength like none other before it",
                scrollConnection = scrollConnection,
                navigationIcon = {
                    SatsTopAppBarIconButton(
                        onClick = {},
                        icon = SatsTheme.icons.back,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )
                },
                actions = {
                    SatsTopAppBarIconButton(
                        onClick = {},
                        icon = SatsTheme.icons.share,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )

                    SatsTopAppBarIconButton(
                        onClick = {},
                        icon = SatsTheme.icons.moreVertical,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )
                },
            )
        }
    }
}

@Preview
@Composable
private fun SatsFancyTopAppBarTestPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors2.backgrounds.primary.bg.default, useMaterial3 = true) {
            val scrollConnection = rememberSatsFancyTopAppBarNestedScrollConnection()

            Column(Modifier.nestedScroll(scrollConnection)) {
                SatsFancyTopAppBar(
                    imageUrl = "https://picsum.photos/1920/1080",
                    title = "Pure Strength is very pure",
                    scrollConnection = scrollConnection,
                    navigationIcon = {
                        SatsTopAppBarIconButton(
                            onClick = {},
                            icon = SatsTheme.icons.back,
                            onClickLabel = null,
                            tint = LocalContentColor.current,
                        )
                    },
                    actions = {
                        SatsTopAppBarIconButton(
                            onClick = {},
                            icon = SatsTheme.icons.share,
                            onClickLabel = null,
                            tint = LocalContentColor.current,
                        )

                        SatsTopAppBarIconButton(
                            onClick = {},
                            icon = SatsTheme.icons.moreVertical,
                            onClickLabel = null,
                            tint = LocalContentColor.current,
                        )
                    },
                )

                LazyColumn {
                    items(100) {
                        ListItem(headlineContent = { Text("List Item #$it") })
                    }
                }
            }
        }
    }
}
