package com.jastzeonic.koinsample

import com.jastzeonic.koinsample.model.Cat
import com.jastzeonic.koinsample.model.Creature
import com.jastzeonic.koinsample.model.Dog
import com.jastzeonic.koinsample.model.Godzilla
import org.koin.dsl.module.module

val creatureModule = module {

    factory { (creatureType: Int) ->
        when (creatureType) {
            Creature.TYPE_DOG -> Dog()
            Creature.TYPE_CAT -> Cat()
            Creature.TYPE_GODZILLA -> Godzilla()
            else -> {
                Dog()
            }
        }
    }


}