package com.jastzeonic.koinsample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jastzeonic.koinsample.model.Creature
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        creatureDogButton.setOnClickListener {
            val intent = Intent(this@MainActivity, CreatureActivity::class.java)
            intent.putExtra(CreatureActivity.CREATURE_TYPE, Creature.TYPE_DOG)
            startActivity(intent)
        }

        creatureCatButton.setOnClickListener {
            val intent = Intent(this@MainActivity, CreatureActivity::class.java)
            intent.putExtra(CreatureActivity.CREATURE_TYPE, Creature.TYPE_CAT)
            startActivity(intent)
        }

        creatureGodzillaButton.setOnClickListener {
            val intent = Intent(this@MainActivity, CreatureActivity::class.java)
            intent.putExtra(CreatureActivity.CREATURE_TYPE, Creature.TYPE_GODZILLA)
            startActivity(intent)
        }


    }
}
