package com.jastzeonic.koinsample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jastzeonic.koinsample.model.Dog
import kotlinx.android.synthetic.main.fragment_scope_demo.*
import org.koin.android.ext.android.inject


class ScopeDemoFragmentA : Fragment() {

    private val dog: Dog by inject()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scope_demo, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        fragmentTextView.text = "Fragment A \n$dog"
    }


}
