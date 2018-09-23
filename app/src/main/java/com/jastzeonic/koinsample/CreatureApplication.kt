package com.jastzeonic.koinsample

import android.app.Application
import org.koin.android.ext.android.startKoin

class CreatureApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this,listOf(creatureModule))

    }

}