package com.sats.dna.colors

import androidx.compose.ui.graphics.Color

internal val SatsDarkColors2 = SatsColors2(
    buttons = SatsColors2.Buttons(
        primary = SatsColors2.Buttons.Primary(
            default = ColorSet(
                bg = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            disabled = ColorSet(
                bg = SatsColorPrimitives.White10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
        ),
        secondary = SatsColors2.Buttons.Secondary(
            default = OutlinedColorSet(
                bg = Color.Transparent,
                outline = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = OutlinedColorSet(
                bg = Color.Transparent,
                outline = SatsColorPrimitives.Black80,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        clean = SatsColors2.Buttons.Clean(
            default = ColorSet(
                bg = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            disabled = ColorSet(
                bg = SatsColorPrimitives.White10,
                fg = SatsColorPrimitives.White50,
            ),
        ),
        cleanSecondary = SatsColors2.Buttons.CleanSecondary(
            default = OutlinedColorSet(
                bg = SatsColorPrimitives.White15,
                outline = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = OutlinedColorSet(
                bg = SatsColorPrimitives.White5,
                outline = SatsColorPrimitives.White40,
                fg = SatsColorPrimitives.White70,
            ),
        ),
        action = SatsColors2.Buttons.Action(
            default = ColorSet(
                bg = Color.Transparent,
                fg = SatsColorPrimitives.SatsCoral100,
            ),
            disabled = ColorSet(
                bg = Color.Transparent,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        waitingListFilled = SatsColors2.Buttons.WaitingListFilled(
            default = ColorSet(
                bg = SatsColorPrimitives.EgyptianPurple80,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = ColorSet(
                bg = SatsColorPrimitives.Black80,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        waitingListOutlined = SatsColors2.Buttons.WaitingListOutlined(
            default = OutlinedColorSet(
                bg = Color.Transparent,
                outline = SatsColorPrimitives.EgyptianPurple80,
                fg = SatsColorPrimitives.EgyptianPurple80,
            ),
            disabled = OutlinedColorSet(
                bg = Color.Transparent,
                outline = SatsColorPrimitives.Black50,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        destructive = SatsColors2.Buttons.Destructive(
            default = SatsColors2.Buttons.Destructive.Default(
                default = ColorSet(
                    bg = SatsColorPrimitives.ChiliRed80,
                    fg = SatsColorPrimitives.White100,
                ),
                disabled = ColorSet(
                    bg = SatsColorPrimitives.Black80,
                    fg = SatsColorPrimitives.Black50,
                ),
            ),
            outlined = SatsColors2.Buttons.Destructive.Outlined(
                default = OutlinedColorSet(
                    bg = Color.Transparent,
                    outline = SatsColorPrimitives.ChiliRed80,
                    fg = SatsColorPrimitives.ChiliRed80,
                ),
                disabled = OutlinedColorSet(
                    bg = Color.Transparent,
                    outline = SatsColorPrimitives.Black50,
                    fg = SatsColorPrimitives.Black50,
                ),
            ),
        ),
    ),
    graphicalElements = SatsColors2.GraphicalElements(
        divider = SatsColors2.GraphicalElements.Divider(
            default = SatsColorPrimitives.Black80,
            alternate = SatsColorPrimitives.White40,
        ),
        border = SatsColors2.GraphicalElements.Border(
            default = SatsColorPrimitives.Black70,
            focused = SatsColorPrimitives.White40,
        ),
        signalBorder = SatsColors2.GraphicalElements.SignalBorder(
            success = SatsColorPrimitives.SpringGreen30,
            warning = SatsColorPrimitives.Gold30,
            error = SatsColorPrimitives.Cardinal30,
            waitingList = SatsColorPrimitives.EgyptianPurple60,
            neutral = SatsColorPrimitives.Black20,
            information = SatsColorPrimitives.BrightBlue20,
            featured = SatsColorPrimitives.SatsCoral40,
        ),
        skeleton = SatsColorPrimitives.Black80,
        navBar = SatsColors2.GraphicalElements.NavBar(
            selected = SatsColorPrimitives.White100,
            notSelected = SatsColorPrimitives.White100,
        ),
        progressBar = SatsColors2.GraphicalElements.ProgressBar(
            default = ColorSet(
                bg = SatsColorPrimitives.Black70,
                fg = SatsColorPrimitives.SatsCoral90,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.Black70,
                fg = SatsColorPrimitives.SatsBlue10,
            ),
        ),
        fixedProgressBar = SatsColors2.GraphicalElements.FixedProgressBar(
            default = ColorSet(
                bg = SatsColorPrimitives.White40,
                fg = SatsColorPrimitives.SatsCoral90,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.White40,
                fg = SatsColorPrimitives.SatsBlue10,
            ),
        ),
        graphs = SatsColors2.GraphicalElements.Graphs(
            bar = SatsColors2.GraphicalElements.Graphs.Bar(
                primary = SatsColors2.GraphicalElements.Graphs.Bar.Primary(
                    default = SatsColorPrimitives.SatsCoral90,
                    bg = SatsColorPrimitives.Black80,
                ),
                secondary = SatsColors2.GraphicalElements.Graphs.Bar.Secondary(
                    default = SatsColorPrimitives.SatsBlue40,
                    bg = SatsColorPrimitives.Black70,
                ),
            ),
            trend = SatsColors2.GraphicalElements.Graphs.Trend(
                upwards = SatsColorPrimitives.SpringGreen80,
                neutral = SatsColorPrimitives.SatsCoral130,
                downwards = SatsColorPrimitives.Cardinal100,
            ),
        ),
        selector = SatsColors2.GraphicalElements.Selector(
            unselected = SatsColors2.GraphicalElements.Selector.Unselected(
                default = SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.White10,
            ),
            selected = SatsColors2.GraphicalElements.Selector.Selected(
                default = SatsColorPrimitives.SatsCoral90,
                disabled = SatsColorPrimitives.SatsCoral130,
            ),
            indicator = SatsColorPrimitives.Black90,
        ),
        selectorFixed = SatsColors2.GraphicalElements.SelectorFixed(
            unselected = SatsColors2.GraphicalElements.SelectorFixed.Unselected(
                default = SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.White50,
            ),
            selected = SatsColors2.GraphicalElements.SelectorFixed.Selected(
                default = SatsColorPrimitives.SatsCoral90,
                disabled = SatsColorPrimitives.SatsCoral130,
            ),
            indicator = SatsColorPrimitives.SatsBlue100,
        ),
        chips = SatsColors2.GraphicalElements.Chips(
            unselected = SatsColors2.GraphicalElements.Chips.Unselected(
                default = ColorSet(
                    bg = SatsColorPrimitives.White85,
                    fg = SatsColorPrimitives.White100,
                ),
                disabled = ColorSet(
                    bg = SatsColorPrimitives.White10,
                    fg = SatsColorPrimitives.White20,
                ),
            ),
            selected = SatsColors2.GraphicalElements.Chips.Selected(
                default = ColorSet(
                    bg = SatsColorPrimitives.White100,
                    fg = SatsColorPrimitives.SatsBlue100,
                ),
                disabled = ColorSet(
                    bg = SatsColorPrimitives.Black80,
                    fg = SatsColorPrimitives.White60,
                ),
            ),
        ),
        toggle = SatsColors2.GraphicalElements.Toggle(
            unselected = SatsColors2.GraphicalElements.Toggle.Unselected(
                default = SatsColorPrimitives.Black70,
                disabled = SatsColorPrimitives.Black80,
            ),
            selected = SatsColors2.GraphicalElements.Toggle.Selected(
                default = SatsColorPrimitives.SatsCoral90,
                disabled = SatsColorPrimitives.SatsCoral130,
            ),
            handle = SatsColorPrimitives.White100,
        ),
        icons = SatsColors2.GraphicalElements.Icons(
            primary = SatsColorPrimitives.White100,
            secondary = SatsColorPrimitives.Black20,
            fixed = SatsColorPrimitives.White100,
            positive = SatsColorPrimitives.SpringGreen80,
            attention = SatsColorPrimitives.Gold100,
            negative = SatsColorPrimitives.Cardinal100,
            waitingList = SatsColorPrimitives.EgyptianPurple80,
            delete = SatsColorPrimitives.ChiliRed80,
        ),
        indicators = SatsColors2.GraphicalElements.Indicators(
            positive = SatsColors2.GraphicalElements.Indicators.Positive(
                default = SatsColorPrimitives.SpringGreen80,
                alternate = SatsColorPrimitives.SpringGreen170,
            ),
            attention = SatsColors2.GraphicalElements.Indicators.Attention(
                default = SatsColorPrimitives.Gold100,
                alternate = SatsColorPrimitives.Gold170,
            ),
            negative = SatsColors2.GraphicalElements.Indicators.Negative(
                default = SatsColorPrimitives.Cardinal100,
                alternate = SatsColorPrimitives.Cardinal170,
            ),
            neutral = SatsColors2.GraphicalElements.Indicators.Neutral(
                default = SatsColorPrimitives.SatsBlue40,
                alternate = SatsColorPrimitives.Black80,
            ),
        ),
        signal = SatsColors2.GraphicalElements.Signal(
            success = SatsColorPrimitives.SpringGreen80,
            warning = SatsColorPrimitives.Gold100,
            error = SatsColorPrimitives.Cardinal100,
            neutral = SatsColorPrimitives.SatsBlue40,
            waitingList = SatsColorPrimitives.EgyptianPurple80,
        ),
        tags = SatsColors2.GraphicalElements.Tags(
            primary = ColorSet(
                bg = SatsColorPrimitives.SatsBlue10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            secondary = ColorSet(
                bg = SatsColorPrimitives.Black80,
                fg = SatsColorPrimitives.White100,
            ),
            featured = ColorSet(
                bg = SatsColorPrimitives.SatsCoral90,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
        ),
        badge = SatsColors2.GraphicalElements.Badge(
            primary = ColorSet(
                bg = SatsColorPrimitives.SatsCoral90,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            secondary = ColorSet(
                bg = SatsColorPrimitives.SatsBlue10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            tertiary = ColorSet(
                bg = SatsColorPrimitives.Black80,
                fg = SatsColorPrimitives.White100,
            ),
        ),
        fixedBadge = SatsColors2.GraphicalElements.FixedBadge(
            primary = ColorSet(
                bg = SatsColorPrimitives.SatsCoral120,
                fg = SatsColorPrimitives.White100,
            ),
            secondary = ColorSet(
                bg = SatsColorPrimitives.BrightBlue10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            tertiary = ColorSet(
                bg = SatsColorPrimitives.SatsBlueGrey80,
                fg = SatsColorPrimitives.White100,
            ),
        ),
        rewards = SatsColors2.GraphicalElements.Rewards(
            blue = ColorSet(
                bg = SatsColorPrimitives.BrightBlue100,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            silver = ColorSet(
                bg = SatsColorPrimitives.SatsBlue20,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            gold = ColorSet(
                bg = SatsColorPrimitives.Gold110,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            platinum = ColorSet(
                bg = SatsColorPrimitives.SatsBlue40,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
        ),
        workouts = SatsColors2.GraphicalElements.Workouts(
            pt = ColorSet(
                bg = SatsColorPrimitives.UranianBlue70,
                fg = SatsColorPrimitives.BrightBlue160,
            ),
            gx = ColorSet(
                bg = SatsColorPrimitives.SalmonPink70,
                fg = SatsColorPrimitives.ChiliRed170,
            ),
            treatments = ColorSet(
                bg = SatsColorPrimitives.CaribbeanCurrent70,
                fg = SatsColorPrimitives.SpringGreen10,
            ),
            gymfloor = ColorSet(
                bg = SatsColorPrimitives.Tangerine70,
                fg = SatsColorPrimitives.Gold170,
            ),
            other = ColorSet(
                bg = SatsColorPrimitives.Celadon70,
                fg = SatsColorPrimitives.SpringGreen170,
            ),
            bootcamp = ColorSet(
                bg = SatsColorPrimitives.TropicalIndigo70,
                fg = SatsColorPrimitives.EgyptianPurple160,
            ),
        ),
    ),
    backgrounds = SatsColors2.Backgrounds(
        primary = SatsColors2.Backgrounds.Primary(
            default = BackgroundColorSet(
                bg = SatsColorPrimitives.Black,
                fgDefault = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
            ),
            selected = BackgroundColorSet(
                bg = SatsColorPrimitives.Black,
                fgDefault = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
            ),
        ),
        secondary = SatsColors2.Backgrounds.Secondary(
            default = BackgroundColorSet(
                bg = SatsColorPrimitives.Black90,
                fgDefault = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
            ),
            selected = BackgroundColorSet(
                bg = SatsColorPrimitives.Black90,
                fgDefault = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
            ),
        ),
        fixed = SatsColors2.Backgrounds.Fixed(
            primary = SatsColors2.Backgrounds.Fixed.Primary(
                default = BackgroundColorSet(
                    bg = SatsColorPrimitives.SatsBlue105,
                    fgDefault = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White60,
                    fgDisabled = SatsColorPrimitives.White40,
                ),
                selected = BackgroundColorSet(
                    bg = SatsColorPrimitives.SatsBlue90,
                    fgDefault = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White60,
                    fgDisabled = SatsColorPrimitives.White40,
                ),
            ),
            secondary = SatsColors2.Backgrounds.Fixed.Secondary(
                default = BackgroundColorSet(
                    bg = SatsColorPrimitives.SatsBlue100,
                    fgDefault = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White60,
                    fgDisabled = SatsColorPrimitives.White40,
                ),
                selected = BackgroundColorSet(
                    bg = SatsColorPrimitives.SatsBlueGrey80,
                    fgDefault = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White60,
                    fgDisabled = SatsColorPrimitives.White40,
                ),
            ),
        ),
    ),
    surfaces = SatsColors2.Surfaces(
        primary = SatsColors2.Surfaces.Primary(
            default = SurfaceColorSet(
                bg = SatsColorPrimitives.Black85,
                fgDefault = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
                fgSuccess = SatsColorPrimitives.SpringGreen80,
                fgWarning = SatsColorPrimitives.Gold80,
                fgError = SatsColorPrimitives.Cardinal60,
                fgWaitingList = SatsColorPrimitives.EgyptianPurple60,
                fgNeutral = SatsColorPrimitives.Black40,
                fgInformation = SatsColorPrimitives.BrightBlue60,
                fgFeatured = SatsColorPrimitives.SatsCoral90,
            ),
            selected = SurfaceColorSet(
                bg = SatsColorPrimitives.BrightBlue160,
                fgDefault = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
                fgSuccess = SatsColorPrimitives.SpringGreen80,
                fgWarning = SatsColorPrimitives.Gold80,
                fgError = SatsColorPrimitives.Cardinal60,
                fgWaitingList = SatsColorPrimitives.EgyptianPurple60,
                fgNeutral = SatsColorPrimitives.Black40,
                fgInformation = SatsColorPrimitives.BrightBlue60,
                fgFeatured = SatsColorPrimitives.SatsCoral90,
            ),
            disabled = SurfaceColorSet(
                bg = SatsColorPrimitives.Black95,
                fgDefault = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
                fgSuccess = SatsColorPrimitives.SpringGreen80,
                fgWarning = SatsColorPrimitives.Gold80,
                fgError = SatsColorPrimitives.Cardinal60,
                fgWaitingList = SatsColorPrimitives.EgyptianPurple60,
                fgNeutral = SatsColorPrimitives.Black40,
                fgInformation = SatsColorPrimitives.BrightBlue60,
                fgFeatured = SatsColorPrimitives.SatsCoral90,
            ),
        ),
        secondary = SatsColors2.Surfaces.Secondary(
            default = SurfaceColorSet(
                bg = SatsColorPrimitives.Black90,
                fgDefault = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
                fgSuccess = SatsColorPrimitives.SpringGreen80,
                fgWarning = SatsColorPrimitives.Gold80,
                fgError = SatsColorPrimitives.Cardinal60,
                fgWaitingList = SatsColorPrimitives.EgyptianPurple60,
                fgNeutral = SatsColorPrimitives.Black40,
                fgInformation = SatsColorPrimitives.BrightBlue60,
                fgFeatured = SatsColorPrimitives.SatsCoral90,
            ),
            selected = SurfaceColorSet(
                bg = SatsColorPrimitives.Black90,
                fgDefault = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
                fgSuccess = SatsColorPrimitives.SpringGreen80,
                fgWarning = SatsColorPrimitives.Gold80,
                fgError = SatsColorPrimitives.Cardinal60,
                fgWaitingList = SatsColorPrimitives.EgyptianPurple60,
                fgNeutral = SatsColorPrimitives.Black40,
                fgInformation = SatsColorPrimitives.BrightBlue60,
                fgFeatured = SatsColorPrimitives.SatsCoral90,
            ),
        ),
        fixed = SatsColors2.Surfaces.Fixed(
            primary = SatsColors2.Surfaces.Fixed.Primary(
                default = SurfaceColorSet(
                    bg = SatsColorPrimitives.SatsBlue100,
                    fgDefault = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White65,
                    fgDisabled = SatsColorPrimitives.White40,
                    fgSuccess = SatsColorPrimitives.SpringGreen60,
                    fgWarning = SatsColorPrimitives.Gold60,
                    fgError = SatsColorPrimitives.Cardinal60,
                    fgWaitingList = SatsColorPrimitives.EgyptianPurple40,
                    fgNeutral = SatsColorPrimitives.White60,
                    fgInformation = SatsColorPrimitives.BrightBlue60,
                    fgFeatured = SatsColorPrimitives.SatsCoral60,
                ),
                selected = SurfaceColorSet(
                    bg = SatsColorPrimitives.SatsBlueGrey80,
                    fgDefault = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White65,
                    fgDisabled = SatsColorPrimitives.White40,
                    fgSuccess = SatsColorPrimitives.SpringGreen60,
                    fgWarning = SatsColorPrimitives.Gold60,
                    fgError = SatsColorPrimitives.Cardinal60,
                    fgWaitingList = SatsColorPrimitives.EgyptianPurple40,
                    fgNeutral = SatsColorPrimitives.White60,
                    fgInformation = SatsColorPrimitives.BrightBlue60,
                    fgFeatured = SatsColorPrimitives.SatsCoral60,
                ),
            ),
            secondary = SatsColors2.Surfaces.Fixed.Secondary(
                default = SurfaceColorSet(
                    bg = SatsColorPrimitives.SatsBlueGrey80,
                    fgDefault = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White65,
                    fgDisabled = SatsColorPrimitives.White40,
                    fgSuccess = SatsColorPrimitives.SpringGreen60,
                    fgWarning = SatsColorPrimitives.Gold60,
                    fgError = SatsColorPrimitives.Cardinal60,
                    fgWaitingList = SatsColorPrimitives.EgyptianPurple40,
                    fgNeutral = SatsColorPrimitives.White60,
                    fgInformation = SatsColorPrimitives.BrightBlue60,
                    fgFeatured = SatsColorPrimitives.SatsCoral60,
                ),
                selected = SurfaceColorSet(
                    bg = SatsColorPrimitives.SatsBlueGrey80,
                    fgDefault = SatsColorPrimitives.White100,
                    fgAlternate = SatsColorPrimitives.White65,
                    fgDisabled = SatsColorPrimitives.White40,
                    fgSuccess = SatsColorPrimitives.SpringGreen60,
                    fgWarning = SatsColorPrimitives.Gold60,
                    fgError = SatsColorPrimitives.Cardinal60,
                    fgWaitingList = SatsColorPrimitives.EgyptianPurple40,
                    fgNeutral = SatsColorPrimitives.White60,
                    fgInformation = SatsColorPrimitives.BrightBlue60,
                    fgFeatured = SatsColorPrimitives.SatsCoral60,
                ),
            ),
        ),
    ),
    signalSurfaces = SatsColors2.SignalSurfaces(
        success = SatsColors2.SignalSurfaces.Success(
            default = ColorSet(
                bg = SatsColorPrimitives.SpringGreen170,
                fg = SatsColorPrimitives.White100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.SpringGreen170,
                fg = SatsColorPrimitives.SpringGreen80,
            ),
        ),
        warning = SatsColors2.SignalSurfaces.Warning(
            default = ColorSet(
                bg = SatsColorPrimitives.Gold170,
                fg = SatsColorPrimitives.White100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.Gold170,
                fg = SatsColorPrimitives.Gold80,
            ),
        ),
        error = SatsColors2.SignalSurfaces.Error(
            default = ColorSet(
                bg = SatsColorPrimitives.Cardinal170,
                fg = SatsColorPrimitives.White100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.Cardinal170,
                fg = SatsColorPrimitives.Cardinal60,
            ),
        ),
        waitingList = SatsColors2.SignalSurfaces.WaitingList(
            default = ColorSet(
                bg = SatsColorPrimitives.EgyptianPurple160,
                fg = SatsColorPrimitives.White100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.EgyptianPurple160,
                fg = SatsColorPrimitives.EgyptianPurple60,
            ),
        ),
        neutral = SatsColors2.SignalSurfaces.Neutral(
            default = ColorSet(
                bg = SatsColorPrimitives.Black90,
                fg = SatsColorPrimitives.White100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.Black90,
                fg = SatsColorPrimitives.Black40,
            ),
        ),
        information = SatsColors2.SignalSurfaces.Information(
            default = ColorSet(
                bg = SatsColorPrimitives.BrightBlue160,
                fg = SatsColorPrimitives.White100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.BrightBlue160,
                fg = SatsColorPrimitives.BrightBlue60,
            ),
        ),
        featured = SatsColors2.SignalSurfaces.Featured(
            default = ColorSet(
                bg = SatsColorPrimitives.SatsCoral190,
                fg = SatsColorPrimitives.White100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.SatsCoral190,
                fg = SatsColorPrimitives.SatsCoral90,
            ),
        ),
    ),

    isLightMode = false,
)
