package com.sats.dna.colors

import androidx.compose.ui.graphics.Color

internal val SatsLightColors = SatsColors(
    primary = SatsColors.Primary(
        default = Color(0xFF14233C),
        disabled = Color(0xFFE8E9EC),
    ),
    onPrimary = SatsColors.OnPrimary(
        default = Color(0xFFFFFFFF),
        disabled = Color(0xFF878F97),
    ),
    secondary = SatsColors.Secondary(
        default = Color(0xFFEDF0F3),
        disabled = Color(0xFFE8E9EC),
    ),
    onSecondary = SatsColors.OnSecondary(
        default = Color(0xFF0E2133),
        disabled = Color(0xFF878F97),
    ),
    cta = SatsColors.Cta(
        default = Color(0xFFD64222),
        disabled = Color(0xFFE8E9EC),
        nonText = Color(0xFFFA5333),
    ),
    onCta = SatsColors.OnCta(
        default = Color(0xFFFFFFFF),
        disabled = Color(0xFF5D6976),
        nonText = Color(0xFFFFFFFF),
    ),
    action = SatsColors.Action(
        default = Color(0xFF026AC2),
        disabled = Color(0xFF9FA6AD),
    ),
    clean = SatsColors.Clean(
        default = Color(0xFFFFFFFF),
        disabled = Color(0x80FFFFFF),
    ),
    onClean = SatsColors.OnClean(
        default = Color(0xFF0E2133),
        disabled = Color(0xFF878F97),
    ),
    cleanSecondary = SatsColors.CleanSecondary(
        default = Color(0x26FFFFFF),
        disabled = Color(0x0DFFFFFF),
    ),
    onCleanSecondary = SatsColors.OnCleanSecondary(
        default = Color(0xFFFFFFFF),
        disabled = Color(0x99FFFFFF),
    ),
    navigation = Color(0xFF0E2133),
    signalBackground = SatsColors.SignalBackground(
        success = Color(0xFFEAF6F2),
        warning = Color(0xFFF0E8DA),
        error = Color(0xFFF5E2E4),
        delete = Color(0xFFF9E0DE),
    ),
    signal = SatsColors.Signal(
        success = Color(0xFF19976D),
        warning = Color(0xFFECA720),
        error = Color(0xFFBF3F4D),
        delete = Color(0xFFDA3B30),
    ),
    signalText = SatsColors.SignalText(
        success = Color(0xFF0A8059),
        warning = Color(0xFF9E6305),
        error = Color(0xFFBF3F4D),
        delete = Color(0xFFD93226),
    ),
    ui = SatsColors.Ui(
        tabs = Color(0xFFF7F7F7),
        shimmer = Color(0xFFEAEAEA),
        border = Color(0xFFE6E6E6),
        graphicalElements1 = Color(0xFF7D92AD),
        graphicalElements2 = Color(0xFF9FB1C9),
        graphicalElements3 = Color(0xFFCFD8E4),
        graphicalElements4 = Color(0xFF7D92AD),
        graphicalElements5 = Color(0xFFFA5333),
        graphicalElements6 = Color(0xFF19976D),
        graphicalElements7 = Color(0xFF484BA2),
    ),
    challenges = SatsColors.Challenges(
        inProgress = Color(0xFFFA5333),
        failed = Color(0xFF66666E),
        success = Color(0xFF19976D),
        notDone = Color(0xFFCFD8E4),
    ),
    background = SatsColors.Background(
        primary = Color(0xFFFAFAFA),
        secondary = Color(0xFFFFFFFF),
    ),
    onBackground = SatsColors.OnBackground(
        primary = Color(0xFF0E2133),
        secondary = Color(0xFF65717D),
        disabled = Color(0xFF9FA6AD),
        controls = SatsColors.OnBackground.Controls(
            enabledOn = Color(0xFFFA5333),
            enabledOff = Color(0xFF7D92AD),
            disabledOn = Color(0xFFFD7459),
            disabledOff = Color(0xFF9FB1C9),
        ),
    ),
    surface = SatsColors.Surface(
        primary = Color(0xFFFFFFFF),
        secondary = Color(0xFFEAEBED),
    ),
    onSurface = SatsColors.OnSurface(
        primary = Color(0xFF0E2133),
        secondary = Color(0xFF65717D),
        disabled = Color(0xFF9FA6AD),
        controls = SatsColors.OnSurface.Controls(
            enabledOn = Color(0xFFFA5333),
            enabledOff = Color(0xFF7D92AD),
            disabledOn = Color(0xFFFD7459),
            disabledOff = Color(0xFF9FB1C9),
        ),
    ),

    waitingList = SatsColors.WaitingList(
        background = Color(0xFFEFEFF7),
        primary = Color(0XFF484BA2),
        text = Color(0XFF484BA2),
        disabled = Color(0XFF686DB9),
    ),

    onWaitingList = SatsColors.OnWaitingList(
        primary = Color(0XFFFFFFFF),
        disabled = Color(0XFFE8E9EC),
    ),

    selection = Color(0xFFFA5333),
    onSignal = Color(0xFFFFFFFF),

    rewards = SatsColors.Rewards(
        blue = Color(0xFF0D2134),
        silver = Color(0xFF767676),
        gold = Color(0xFF996D17),
        platinum = Color(0xFF464E55),
    ),

    onRewards = SatsColors.OnRewards(
        default = Color(0xFFFFFFFF),
    ),

    workout = SatsColors.Workout(
        pt = Color(0xFF428BBF),
        gx = Color(0xFFDB70DD),
        gymFloor = Color(0xFFD6BC38),
        other = Color(0xFF42AE8A),
    ),

    isLightMode = true,
)
