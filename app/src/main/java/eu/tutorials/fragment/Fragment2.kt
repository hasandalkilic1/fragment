package eu.tutorials.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment2.view.*

class Fragment2:Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView=inflater.inflate(R.layout.fragment2,container,false)

        rootView.btnDO.setOnClickListener {
            rootView.tvSum.text="deneme"
        }

        return rootView
    }
}