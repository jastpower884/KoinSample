package com.jastzeonic.koinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.jastzeonic.koinsample.model.Dog
import kotlinx.android.synthetic.main.activity_creature.*
import org.koin.android.ext.android.inject

class CreatureActivity : AppCompatActivity() {
    companion object {
        const val CREATURE_TYPE = "creature_type"
    }

    private val creature:Dog by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creature)
        val creatureType = intent.getIntExtra(CREATURE_TYPE, 0)


        Glide.with(this).load(creature.image())
                .into(creature_image)

        creature_image.postDelayed({
            Toast.makeText(this.applicationContext, creature.shout(), Toast.LENGTH_LONG).show()
        }, 500)


    }
}
