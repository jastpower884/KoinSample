package com.jastzeonic.koinsample.model

import android.net.Uri
import com.jastzeonic.koinsample.BuildConfig
import com.jastzeonic.koinsample.R

class Godzilla : Creature {
    override fun name(): String {
        return "Godzilla"
    }

    override fun image(): String {
        return Uri.parse("android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.drawable.godzilla_pixelart_by_ermagix).toString()
    }

    override fun shout(): String {
        return "RoooooooArrrrrrrr"
    }

}