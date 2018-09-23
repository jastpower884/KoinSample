package com.jastzeonic.koinsample

import com.jastzeonic.koinsample.model.*
import org.koin.core.scope.Scope
import org.koin.dsl.module.module

val creatureModule = module {


    scope("DogSession") {
        Dog()
    }

    single {
        Cat()
    }


    module("Dog") {
        factory { CreaturePackage(get()) }
        single { Dog() as Creature }

    }

    module("Cat") {
        factory { CreaturePackage(get()) }
        single { Cat() as Creature }

    }

    module("Godzilla") {
        factory { CreaturePackage(get()) }
        single { Godzilla() as Creature }

    }


}