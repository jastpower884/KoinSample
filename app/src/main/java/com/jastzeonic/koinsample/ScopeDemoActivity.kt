package com.jastzeonic.koinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_scope_demo.*
import org.koin.android.scope.ext.android.bindScope
import org.koin.android.scope.ext.android.createScope

class ScopeDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scope_demo)

        bindScope(createScope("DogSession"))

        fragmentButtonA.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, ScopeDemoFragmentA()).commit()
        }

        fragmentButtonB.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, ScopeDemoFragmentB()).commit()
        }


    }
}
