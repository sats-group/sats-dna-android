package com.sats.dna.components

import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.mapSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import coil.compose.AsyncImage
import com.sats.dna.R
import com.sats.dna.SatsIcons
import com.sats.dna.components.appbar.SatsTopAppBar
import com.sats.dna.components.appbar.SatsTopAppBarDefaults
import com.sats.dna.components.button.SatsTopAppBarIconButton
import com.sats.dna.icons.Back
import com.sats.dna.icons.MoreVertical
import com.sats.dna.icons.Share
import com.sats.dna.internal.findActivity
import com.sats.dna.theme.SatsTheme
import kotlin.math.roundToInt
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@Composable
fun SatsFancyTopAppBar(
    imageUrl: String,
    title: String,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    scrollConnection: SatsFancyTopAppBarNestedScrollConnection? = null,
) {
    val expandFraction = scrollConnection?.expandFraction ?: 1f

    SatsFancyTopAppBar(
        image = { HeaderImage(imageUrl, expandFraction) },
        title = title,
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        scrollConnection = scrollConnection,
    )
}

// Create an api that's more customizable than the current one?
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SatsFancyTopAppBar(
    title: String,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    expandedContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    scrollConnection: SatsFancyTopAppBarNestedScrollConnection? = null,
) {
    val expandFraction = scrollConnection?.expandFraction ?: 1f

    // TODO: Might wanna make these colors dynamic
    val contentColor = lerp(
        start = SatsTheme.colors.surfaces.primary.default.fg,
        stop = SatsTheme.colors.backgrounds.fixed.primary.default.fg,
        fraction = expandFraction,
    )

    EnsureStatusBarContrast(expandFraction)

    CompositionLocalProvider(
        LocalContentColor provides contentColor,
    ) {
        var isStateInitializedWithSize by rememberSaveable { mutableStateOf(false) }

        val draggableModifier = if (scrollConnection != null) {
            Modifier.draggable(
                orientation = Orientation.Vertical,
                state = rememberDraggableState(scrollConnection::consumeScroll),
                onDragStopped = { scrollConnection.settle() },
            )
        } else {
            Modifier
        }

        Layout(
            modifier = modifier then draggableModifier,
            contents = listOf(
                {
                    SatsTopAppBar(
                        title = { AppearingAppbarText(title, expandFraction) },
                        navigationIcon = navigationIcon,
                        actions = actions,
                        colors = TopAppBarDefaults.topAppBarColors().copy(containerColor = Color.Transparent),
                    )
                },
                { DisappearingHeader(expandFraction = expandFraction) { expandedContent() } },
            ),
        ) { measurables, constraints: Constraints ->

            val collapsedContentMeasurable = measurables[0].first()
            val expandedContentMeasurable = measurables[1].first()

            val collapsedContentPlaceable = collapsedContentMeasurable.measure(constraints)
            // Measure expanded composable
            val expandedHeaderPlaceable = expandedContentMeasurable.measure(constraints)
            // Calculate actual width and height
            val actualWidth = constraints.maxWidth
            val collapsedHeight = collapsedContentPlaceable.height.toFloat()

            // Height of the app bar in total when expanded,
            // We need this to make sure expanded.height >= collapsed.height
            // Which it might not be in case the passed expanded composable has zero or smaller content
            val expandedAppBarHeight = expandedHeaderPlaceable.height + collapsedHeight

            val actualHeight = lerp(collapsedHeight, expandedAppBarHeight, expandFraction).roundToInt()

            // Ensure the scroll connection knows the correct min and max sizes
            if (!isStateInitializedWithSize) {
                scrollConnection?.initialize(
                    collapsedHeight,
                    expandedAppBarHeight,
                )
                isStateInitializedWithSize = true
            }

            layout(actualWidth, actualHeight) {
                collapsedContentPlaceable.place(
                    x = 0,
                    y = 0,
                )

                expandedHeaderPlaceable.place(
                    x = 0,
                    y = actualHeight - expandedHeaderPlaceable.height,
                )
            }
        }
    }
}

@Composable
fun SatsFancyTopAppBar(
    image: @Composable (shade: @Composable () -> Unit) -> Unit,
    title: String,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    scrollConnection: SatsFancyTopAppBarNestedScrollConnection? = null,
) {
    val expandFraction = scrollConnection?.expandFraction ?: 1f

    val contentColor = lerp(
        start = SatsTheme.colors.surfaces.primary.default.fg,
        stop = SatsTheme.colors.backgrounds.fixed.primary.default.fg,
        fraction = expandFraction,
    )

    EnsureStatusBarContrast(expandFraction)

    CompositionLocalProvider(LocalContentColor provides contentColor) {
        val topBarPadding = WindowInsets.statusBars.getTop(LocalDensity.current)
        val spaceBetweenHeaderIconsAndText = SatsTheme.spacing.xs
        val collapsedTextHorizontalPadding = SatsTheme.spacing.m

        var isStateInitializedWithSize by rememberSaveable { mutableStateOf(false) }

        val draggableModifier = if (scrollConnection != null) {
            Modifier.draggable(
                orientation = Orientation.Vertical,
                state = rememberDraggableState(scrollConnection::consumeScroll),
                onDragStopped = { scrollConnection.settle() },
            )
        } else {
            Modifier
        }

        Layout(
            modifier = modifier then draggableModifier,
            contents = listOf(
                { Header(expandFraction) { image(it) } },
                { Box { navigationIcon() } },
                { Row(content = actions) },
                { ExpandedHeaderText(title, expandFraction, Modifier.padding(horizontal = SatsTheme.spacing.xxl)) },
                { CollapsedHeaderText(title, expandFraction) },
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
            val actualHeight = lerp(collapsedHeight, expandedHeight, expandFraction).roundToInt()

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

    val expandFraction by derivedStateOf {
        if (expandedHeightPx - collapsedHeightPx == 0f) return@derivedStateOf 0f

        ((currentHeightPx - collapsedHeightPx) / (expandedHeightPx - collapsedHeightPx))
            .coerceIn(minimumValue = 0f, maximumValue = 1f)
    }

    private constructor(collapsedHeightPx: Float, expandedHeightPx: Float, currentHeightPx: Float) : this() {
        this.collapsedHeightPx = collapsedHeightPx
        this.expandedHeightPx = expandedHeightPx
        this.currentHeightPx = currentHeightPx
    }

    override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
        val delta = available.y

        if (delta > 0) return Offset.Zero

        return consumeScroll(delta)
    }

    override suspend fun onPostFling(consumed: Velocity, available: Velocity): Velocity {
        settle()

        return Velocity.Zero
    }

    override fun onPostScroll(consumed: Offset, available: Offset, source: NestedScrollSource): Offset {
        val delta = available.y

        if (delta < 0) return Offset.Zero

        return consumeScroll(delta)
    }

    internal fun consumeScroll(delta: Float): Offset {
        val previousHeight = currentHeightPx
        val nextHeight = previousHeight + delta
        currentHeightPx = nextHeight.coerceIn(collapsedHeightPx, expandedHeightPx)

        val consumed = currentHeightPx - previousHeight

        return Offset(x = 0f, y = consumed)
    }

    suspend fun collapse(animate: Boolean = true) {
        if (!animate) {
            currentHeightPx = collapsedHeightPx
        } else {
            animateCurrentHeight(collapsedHeightPx)
        }
    }

    suspend fun expand(animate: Boolean = true) {
        if (!animate) {
            currentHeightPx = expandedHeightPx
        } else {
            animateCurrentHeight(expandedHeightPx)
        }
    }

    internal suspend fun settle(animate: Boolean = true) {
        val percent = expandFraction

        if (percent > .5f) {
            expand(animate)
        } else {
            collapse(animate)
        }
    }

    private suspend fun animateCurrentHeight(newValue: Float) {
        if (currentHeightPx == newValue) return

        withContext(Dispatchers.Main) {
            Animatable(currentHeightPx).also {
                it.animateTo(newValue, ExpandCollapseAnimationSpec) {
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
    expandFraction: Float,
    modifier: Modifier = Modifier,
) {
    Header(expandFraction, modifier) { shade ->
        if (LocalInspectionMode.current) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(R.drawable.placeholder_gx),
                contentDescription = null,
                contentScale = ContentScale.Crop,
            )
        } else {
            AsyncImage(
                modifier = Modifier.fillMaxSize(),
                model = imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
            )
        }

        shade()
    }
}

@Composable
private fun Header(
    expandFraction: Float,
    modifier: Modifier = Modifier,
    content: @Composable (shade: @Composable () -> Unit) -> Unit,
) {
    Box(modifier) {
        content {
            HeaderImageShade(expandFraction, Modifier.fillMaxSize())
        }
    }
}

@Composable
private fun DisappearingHeader(
    expandFraction: Float,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    val alpha = animateFloatAsState(expandFraction, label = "expanded header text alpha").value

    Box(modifier.alpha(alpha)) {
        content()
    }
}

@Composable
private fun AppearingAppbarText(
    text: String,
    expandFraction: Float,
    modifier: Modifier = Modifier,
) {
    val alpha = animateFloatAsState(1 - expandFraction, label = "expanded header text alpha").value

    Box(modifier.alpha(alpha)) {
        Text(text)
    }
}

@Composable
private fun HeaderImageShade(expandFraction: Float, modifier: Modifier = Modifier) {
    val expandedColor = Color.Black.copy(alpha = .6f)
    val collapsedColor = SatsTopAppBarDefaults.containerColor
    val color = lerp(collapsedColor, expandedColor, expandFraction)

    Box(modifier.background(color))
}

@Composable
private fun ExpandedHeaderText(
    text: String,
    expandFraction: Float,
    modifier: Modifier = Modifier,
) {
    val alpha = animateFloatAsState(expandFraction, label = "expanded header text alpha").value

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
    expandFraction: Float,
    modifier: Modifier = Modifier,
) {
    val alpha = animateFloatAsState(1 - expandFraction, label = "collapsed header text alpha").value

    Text(
        text = text,
        modifier = modifier,
        style = SatsTheme.typography.normal.headline3,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        color = SatsTopAppBarDefaults.contentColor.copy(alpha = alpha),
    )
}

@Composable
private fun EnsureStatusBarContrast(expandFraction: Float) {
    val activity = LocalContext.current.findActivity()

    DisposableEffect(activity, expandFraction) {
        activity?.enableEdgeToEdge(
            statusBarStyle = if (expandFraction > .25f) {
                SystemBarStyle.dark(android.graphics.Color.TRANSPARENT)
            } else {
                SystemBarStyle.auto(android.graphics.Color.TRANSPARENT, android.graphics.Color.TRANSPARENT)
            },
        )

        onDispose {
            activity?.enableEdgeToEdge()
        }
    }
}

private val AppBarCollapsedHeight = 64.dp
private const val AppBarExpandedAspectRatio = 1920f / 1080

@Preview
@Composable
private fun SatsFancyTopAppBarExpandedPreview() {
    SatsTheme {
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            val coroutineScope = rememberCoroutineScope()
            val scrollConnection = rememberSatsFancyTopAppBarNestedScrollConnection()
                .also { coroutineScope.launch { it.expand(animate = false) } }

            SatsFancyTopAppBar(
                imageUrl = "https://picsum.photos/1920/1080",
                title = "Pure Strength",
                scrollConnection = scrollConnection,
                navigationIcon = {
                    SatsTopAppBarIconButton(
                        onClick = {},
                        icon = SatsIcons.Back,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )
                },
                actions = {
                    SatsTopAppBarIconButton(
                        onClick = {},
                        icon = SatsIcons.Share,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )

                    SatsTopAppBarIconButton(
                        onClick = {},
                        icon = SatsIcons.MoreVertical,
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
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            val coroutineScope = rememberCoroutineScope()
            val scrollConnection = rememberSatsFancyTopAppBarNestedScrollConnection()
                .also { coroutineScope.launch(start = CoroutineStart.UNDISPATCHED) { it.collapse(animate = false) } }

            SatsFancyTopAppBar(
                imageUrl = "https://picsum.photos/1920/1080",
                title = "Pure Strength like none other before it",
                scrollConnection = scrollConnection,
                navigationIcon = {
                    SatsTopAppBarIconButton(
                        onClick = {},
                        icon = SatsIcons.Back,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )
                },
                actions = {
                    SatsTopAppBarIconButton(
                        onClick = {},
                        icon = SatsIcons.Share,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )

                    SatsTopAppBarIconButton(
                        onClick = {},
                        icon = SatsIcons.MoreVertical,
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
        SatsSurface(color = SatsTheme.colors.backgrounds.primary.default.bg) {
            val scrollConnection = rememberSatsFancyTopAppBarNestedScrollConnection()

            Column(Modifier.nestedScroll(scrollConnection)) {
                SatsFancyTopAppBar(
                    imageUrl = "https://picsum.photos/1920/1080",
                    title = "Pure Strength is very pure",
                    scrollConnection = scrollConnection,
                    navigationIcon = {
                        SatsTopAppBarIconButton(
                            onClick = {},
                            icon = SatsIcons.Back,
                            onClickLabel = null,
                            tint = LocalContentColor.current,
                        )
                    },
                    actions = {
                        SatsTopAppBarIconButton(
                            onClick = {},
                            icon = SatsIcons.Share,
                            onClickLabel = null,
                            tint = LocalContentColor.current,
                        )

                        SatsTopAppBarIconButton(
                            onClick = {},
                            icon = SatsIcons.MoreVertical,
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

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
private fun SatsCustomFancyAppBarPreview() {

    SatsTheme {
        SatsSurface(
            color = SatsTheme.colors.backgrounds.fixed.primary.default.bg,
        ) {
            val scrollConnection = rememberSatsFancyTopAppBarNestedScrollConnection()

            SatsFancyTopAppBar(
                title = "Challenges",
                navigationIcon = {
                    SatsTopAppBarIconButton(
                        onClick = {},
                        icon = SatsIcons.Back,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )
                },
                actions = {
                    SatsTopAppBarIconButton(
                        onClick = {},
                        icon = SatsIcons.Share,
                        onClickLabel = null,
                        tint = LocalContentColor.current,
                    )
                },
                expandedContent = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(SatsTheme.spacing.s),
                    ) {
                        SatsChallengeBadge(
                            imageUrl = "",
                            contentDescription = null,
                            modifier = Modifier.size(64.dp),
                        )
                        Text(text = "Sats Training day", style = SatsTheme.typography.satsHeadlineEmphasis.headline3)
                    }
                },
                scrollConnection = scrollConnection,
            )
        }
    }
}
