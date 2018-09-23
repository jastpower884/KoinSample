package com.jastzeonic.koinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jastzeonic.koinsample.model.CreaturePackage
import kotlinx.android.synthetic.main.activity_naming_demo.*
import org.koin.android.ext.android.get

class NamingDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naming_demo)

        creatureDogButton.setOnClickListener {
            val creaturePackage: CreaturePackage = get("Dog.CreaturePackage")
            setText(creaturePackage)
        }

        creatureCatButton.setOnClickListener {
            val creaturePackage: CreaturePackage = get("Cat.CreaturePackage")
            setText(creaturePackage)

        }


        creatureGodzillaButton.setOnClickListener {

            val creaturePackage: CreaturePackage = get("Godzilla.CreaturePackage")
            setText(creaturePackage)

        }
    }

    fun setText(creaturePackage: CreaturePackage) {
        creatureNameTextView.text = "creature name:${creaturePackage.creature.name()}"
    }
}
