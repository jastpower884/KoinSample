package com.jastzeonic.koinsample.model


import android.net.Uri
import com.jastzeonic.koinsample.BuildConfig
import com.jastzeonic.koinsample.R

class Dog : Creature {
    override fun name(): String {
        return "Dog"
    }

    override fun image(): String {

        return Uri.parse("android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.drawable.dog_pixel_image).toString()
    }

    override fun shout(): String {
        return "Woof"
    }

}