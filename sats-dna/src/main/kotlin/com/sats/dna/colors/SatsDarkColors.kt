package com.sats.dna.colors

import androidx.compose.ui.graphics.Color

internal val SatsDarkColors = SatsColors(
    buttons = SatsColors.Buttons(
        primary = SatsColors.Buttons.Primary(
            default = ColorSet(
                bg = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            disabled = ColorSet(
                bg = SatsColorPrimitives.White10,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
        ),
        secondary = SatsColors.Buttons.Secondary(
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
        clean = SatsColors.Buttons.Clean(
            default = ColorSet(
                bg = SatsColorPrimitives.White100,
                fg = SatsColorPrimitives.SatsBlue100,
            ),
            disabled = ColorSet(
                bg = SatsColorPrimitives.White10,
                fg = SatsColorPrimitives.White50,
            ),
        ),
        cleanSecondary = SatsColors.Buttons.CleanSecondary(
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
        action = SatsColors.Buttons.Action(
            default = ColorSet(
                bg = Color.Transparent,
                fg = SatsColorPrimitives.SatsCoral100,
            ),
            disabled = ColorSet(
                bg = Color.Transparent,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        cta = SatsColors.Buttons.Cta(
            default = ColorSet(
                bg = SatsColorPrimitives.SatsCoral100,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = ColorSet(
                bg = SatsColorPrimitives.Black80,
                fg = SatsColorPrimitives.White70,
            ),
        ),
        waitingListFilled = SatsColors.Buttons.WaitingListFilled(
            default = ColorSet(
                bg = SatsColorPrimitives.EgyptianPurple80,
                fg = SatsColorPrimitives.White100,
            ),
            disabled = ColorSet(
                bg = SatsColorPrimitives.Black80,
                fg = SatsColorPrimitives.Black50,
            ),
        ),
        waitingListOutlined = SatsColors.Buttons.WaitingListOutlined(
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
        destructive = SatsColors.Buttons.Destructive(
            default = SatsColors.Buttons.Destructive.Default(
                default = ColorSet(
                    bg = SatsColorPrimitives.ChiliRed80,
                    fg = SatsColorPrimitives.White100,
                ),
                disabled = ColorSet(
                    bg = SatsColorPrimitives.Black80,
                    fg = SatsColorPrimitives.Black50,
                ),
            ),
            outlined = SatsColors.Buttons.Destructive.Outlined(
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
    graphicalElements = SatsColors.GraphicalElements(
        divider = SatsColors.GraphicalElements.Divider(
            default = SatsColorPrimitives.Black80,
            alternate = SatsColorPrimitives.White40,
        ),
        border = SatsColors.GraphicalElements.Border(
            default = SatsColorPrimitives.Black70,
            focused = SatsColorPrimitives.White40,
        ),
        signalBorder = SatsColors.GraphicalElements.SignalBorder(
            success = SatsColorPrimitives.SpringGreen30,
            warning = SatsColorPrimitives.Gold30,
            error = SatsColorPrimitives.Cardinal30,
            waitingList = SatsColorPrimitives.EgyptianPurple60,
            neutral = SatsColorPrimitives.Black20,
            information = SatsColorPrimitives.BrightBlue20,
            featured = SatsColorPrimitives.SatsCoral40,
        ),
        skeleton = SatsColorPrimitives.Black80,
        navBar = SatsColors.GraphicalElements.NavBar(
            selected = SatsColorPrimitives.White100,
            notSelected = SatsColorPrimitives.White100,
        ),
        progressBar = SatsColors.GraphicalElements.ProgressBar(
            default = ColorSet(
                bg = SatsColorPrimitives.Black70,
                fg = SatsColorPrimitives.SatsCoral90,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.Black70,
                fg = SatsColorPrimitives.SatsBlue10,
            ),
        ),
        fixedProgressBar = SatsColors.GraphicalElements.FixedProgressBar(
            default = ColorSet(
                bg = SatsColorPrimitives.White40,
                fg = SatsColorPrimitives.SatsCoral90,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.White40,
                fg = SatsColorPrimitives.SatsBlue10,
            ),
        ),
        graphs = SatsColors.GraphicalElements.Graphs(
            bar = SatsColors.GraphicalElements.Graphs.Bar(
                primary = SatsColors.GraphicalElements.Graphs.Bar.Primary(
                    default = SatsColorPrimitives.SatsCoral90,
                    bg = SatsColorPrimitives.Black80,
                ),
                secondary = SatsColors.GraphicalElements.Graphs.Bar.Secondary(
                    default = SatsColorPrimitives.SatsBlue40,
                    bg = SatsColorPrimitives.Black70,
                ),
            ),
            trend = SatsColors.GraphicalElements.Graphs.Trend(
                upwards = SatsColorPrimitives.SpringGreen80,
                neutral = SatsColorPrimitives.SatsCoral130,
                downwards = SatsColorPrimitives.Cardinal100,
            ),
        ),
        selector = SatsColors.GraphicalElements.Selector(
            primary = SatsColors.GraphicalElements.Selector.Primary(
                unselected = SatsColors.GraphicalElements.Selector.Primary.Unselected(
                    default = SatsColorPrimitives.White100 on SatsColorPrimitives.White100,
                    disabled = SatsColorPrimitives.White20 on SatsColorPrimitives.White10,
                ),
                selected = SatsColors.GraphicalElements.Selector.Primary.Selected(
                    default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SatsCoral90,
                    disabled = SatsColorPrimitives.White60 on SatsColorPrimitives.SatsCoral130,
                ),
                unselectedSurface = SatsColors.GraphicalElements.Selector.Primary.UnselectedSurface(
                    default = SatsColorPrimitives.White0,
                    disabled = SatsColorPrimitives.White0,
                ),
                selectedSurface = SatsColors.GraphicalElements.Selector.Primary.SelectedSurface(
                    default = SatsColorPrimitives.SatsCoral170,
                    disabled = SatsColorPrimitives.SatsCoral190,
                ),
            ),
            secondary = SatsColors.GraphicalElements.Selector.Secondary(
                unselected = SatsColors.GraphicalElements.Selector.Secondary.Unselected(
                    default = SatsColorPrimitives.White100 on SatsColorPrimitives.White100,
                    disabled = SatsColorPrimitives.White20 on SatsColorPrimitives.White10,
                ),
                selected = SatsColors.GraphicalElements.Selector.Secondary.Selected(
                    default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.White100,
                    disabled = SatsColorPrimitives.White60 on SatsColorPrimitives.White20,
                ),
                unselectedSurface = SatsColors.GraphicalElements.Selector.Secondary.UnselectedSurface(
                    default = SatsColorPrimitives.White0,
                    disabled = SatsColorPrimitives.White0,
                ),
                selectedSurface = SatsColors.GraphicalElements.Selector.Secondary.SelectedSurface(
                    default = SatsColorPrimitives.BrightBlue160,
                    disabled = SatsColorPrimitives.BrightBlue170,
                ),
            ),
        ),
        selectorFixed = SatsColors.GraphicalElements.SelectorFixed(
            unselected = SatsColors.GraphicalElements.SelectorFixed.Unselected(
                default = SatsColorPrimitives.White100 on SatsColorPrimitives.White100,
                disabled = SatsColorPrimitives.White50 on SatsColorPrimitives.White50,
            ),
            selected = SatsColors.GraphicalElements.SelectorFixed.Selected(
                default = SatsColorPrimitives.SatsBlue100 on SatsColorPrimitives.SatsCoral90,
                disabled = SatsColorPrimitives.SatsCoral170 on SatsColorPrimitives.SatsCoral130,
            ),
            selectedBackground = SatsColors.GraphicalElements.SelectorFixed.SelectedBackground(
                default = SatsColorPrimitives.SatsCoral170,
                disabled = SatsColorPrimitives.SatsCoral190,
            ),
        ),
        chips = SatsColors.GraphicalElements.Chips(
            unselected = SatsColors.GraphicalElements.Chips.Unselected(
                default = ColorSet(
                    bg = SatsColorPrimitives.White85,
                    fg = SatsColorPrimitives.White100,
                ),
                disabled = ColorSet(
                    bg = SatsColorPrimitives.White10,
                    fg = SatsColorPrimitives.White20,
                ),
            ),
            selected = SatsColors.GraphicalElements.Chips.Selected(
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
        toggle = SatsColors.GraphicalElements.Toggle(
            unselected = SatsColors.GraphicalElements.Toggle.Unselected(
                default = SatsColorPrimitives.Black70,
                disabled = SatsColorPrimitives.Black80,
            ),
            selected = SatsColors.GraphicalElements.Toggle.Selected(
                default = SatsColorPrimitives.SatsCoral90,
                disabled = SatsColorPrimitives.SatsCoral130,
            ),
            handle = SatsColorPrimitives.White100,
        ),
        icons = SatsColors.GraphicalElements.Icons(
            primary = SatsColorPrimitives.White100,
            secondary = SatsColorPrimitives.Black20,
            fixed = SatsColorPrimitives.White100,
            positive = SatsColorPrimitives.SpringGreen80,
            attention = SatsColorPrimitives.Gold100,
            negative = SatsColorPrimitives.Cardinal100,
            waitingList = SatsColorPrimitives.EgyptianPurple80,
            delete = SatsColorPrimitives.ChiliRed80,
        ),
        indicators = SatsColors.GraphicalElements.Indicators(
            positive = SatsColors.GraphicalElements.Indicators.Positive(
                default = SatsColorPrimitives.SpringGreen80,
                alternate = SatsColorPrimitives.SpringGreen170,
            ),
            attention = SatsColors.GraphicalElements.Indicators.Attention(
                default = SatsColorPrimitives.Gold100,
                alternate = SatsColorPrimitives.Gold170,
            ),
            negative = SatsColors.GraphicalElements.Indicators.Negative(
                default = SatsColorPrimitives.Cardinal100,
                alternate = SatsColorPrimitives.Cardinal170,
            ),
            neutral = SatsColors.GraphicalElements.Indicators.Neutral(
                default = SatsColorPrimitives.SatsBlue40,
                alternate = SatsColorPrimitives.Black80,
            ),
        ),
        signal = SatsColors.GraphicalElements.Signal(
            success = SatsColorPrimitives.SpringGreen80,
            warning = SatsColorPrimitives.Gold100,
            error = SatsColorPrimitives.Cardinal100,
            neutral = SatsColorPrimitives.SatsBlue40,
            waitingList = SatsColorPrimitives.EgyptianPurple80,
        ),
        tags = SatsColors.GraphicalElements.Tags(
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
        badge = SatsColors.GraphicalElements.Badge(
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
        fixedBadge = SatsColors.GraphicalElements.FixedBadge(
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
        rewards = SatsColors.GraphicalElements.Rewards(
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
        workouts = SatsColors.GraphicalElements.Workouts(
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
    backgrounds = SatsColors.Backgrounds(
        primary = SatsColors.Backgrounds.Primary(
            default = BackgroundColorSet(
                bg = SatsColorPrimitives.Black100,
                fgDefault = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
            ),
            selected = BackgroundColorSet(
                bg = SatsColorPrimitives.Black100,
                fgDefault = SatsColorPrimitives.White100,
                fgAlternate = SatsColorPrimitives.Black20,
                fgDisabled = SatsColorPrimitives.Black50,
            ),
        ),
        secondary = SatsColors.Backgrounds.Secondary(
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
        fixed = SatsColors.Backgrounds.Fixed(
            primary = SatsColors.Backgrounds.Fixed.Primary(
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
            secondary = SatsColors.Backgrounds.Fixed.Secondary(
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
    surfaces = SatsColors.Surfaces(
        primary = SatsColors.Surfaces.Primary(
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
        secondary = SatsColors.Surfaces.Secondary(
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
        fixed = SatsColors.Surfaces.Fixed(
            primary = SatsColors.Surfaces.Fixed.Primary(
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
            secondary = SatsColors.Surfaces.Fixed.Secondary(
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
    signalSurfaces = SatsColors.SignalSurfaces(
        success = SatsColors.SignalSurfaces.Success(
            default = ColorSet(
                bg = SatsColorPrimitives.SpringGreen170,
                fg = SatsColorPrimitives.White100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.SpringGreen170,
                fg = SatsColorPrimitives.SpringGreen80,
            ),
        ),
        warning = SatsColors.SignalSurfaces.Warning(
            default = ColorSet(
                bg = SatsColorPrimitives.Gold170,
                fg = SatsColorPrimitives.White100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.Gold170,
                fg = SatsColorPrimitives.Gold80,
            ),
        ),
        error = SatsColors.SignalSurfaces.Error(
            default = ColorSet(
                bg = SatsColorPrimitives.Cardinal170,
                fg = SatsColorPrimitives.White100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.Cardinal170,
                fg = SatsColorPrimitives.Cardinal60,
            ),
        ),
        waitingList = SatsColors.SignalSurfaces.WaitingList(
            default = ColorSet(
                bg = SatsColorPrimitives.EgyptianPurple160,
                fg = SatsColorPrimitives.White100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.EgyptianPurple160,
                fg = SatsColorPrimitives.EgyptianPurple60,
            ),
        ),
        neutral = SatsColors.SignalSurfaces.Neutral(
            default = ColorSet(
                bg = SatsColorPrimitives.Black90,
                fg = SatsColorPrimitives.White100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.Black90,
                fg = SatsColorPrimitives.Black40,
            ),
        ),
        information = SatsColors.SignalSurfaces.Information(
            default = ColorSet(
                bg = SatsColorPrimitives.BrightBlue160,
                fg = SatsColorPrimitives.White100,
            ),
            alternate = ColorSet(
                bg = SatsColorPrimitives.BrightBlue160,
                fg = SatsColorPrimitives.BrightBlue60,
            ),
        ),
        featured = SatsColors.SignalSurfaces.Featured(
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
