package com.sats.dna.internal

import android.content.Context
import android.content.ContextWrapper
import androidx.activity.ComponentActivity

internal tailrec fun Context.findActivity(): ComponentActivity? {
    return when (this) {
        is ComponentActivity -> this
        is ContextWrapper -> baseContext.findActivity()
        else -> null
    }
}
