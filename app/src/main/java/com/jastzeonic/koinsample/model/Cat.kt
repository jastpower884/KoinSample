package com.jastzeonic.koinsample.model


import android.net.Uri
import com.jastzeonic.koinsample.BuildConfig
import com.jastzeonic.koinsample.R

class Cat : Creature {
    override fun name(): String {
        return "Cat"
    }

    override fun image(): String {

        return Uri.parse("android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.drawable.cat_pixel_image).toString()
    }

    override fun shout(): String {
        return "Nya"
    }

}