package com.jastzeonic.koinsample

import com.jastzeonic.koinsample.model.Dog
import org.koin.dsl.module.module

val creatureModule = module {

    factory {

        Dog()
    }


}