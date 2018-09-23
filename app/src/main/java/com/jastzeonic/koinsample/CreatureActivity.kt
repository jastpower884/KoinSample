package com.jastzeonic.koinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.bumptech.glide.Glide
import com.jastzeonic.koinsample.model.Creature
import kotlinx.android.synthetic.main.activity_creature.*
import org.koin.android.ext.android.get
import org.koin.core.parameter.parametersOf

class CreatureActivity : AppCompatActivity() {
    companion object {
        const val CREATURE_TYPE = "creature_type"
    }

    private lateinit var creature: Creature

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creature)
        val creatureType = intent.getIntExtra(CREATURE_TYPE, 0)

        creature = get { parametersOf(creatureType) }



        Log.v("tag", "CreatureActivity$creature")

        Glide.with(this).load(creature.image())
                .into(creature_image)

        creature_image.postDelayed({
            Toast.makeText(this.applicationContext, creature.shout(), Toast.LENGTH_LONG).show()
        }, 500)


    }
}
