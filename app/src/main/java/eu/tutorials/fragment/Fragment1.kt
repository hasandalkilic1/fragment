package eu.tutorials.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment1.view.*

class Fragment1:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView=inflater.inflate(R.layout.fragment1,container,false)

        rootView.btnClick.setOnClickListener {
            Toast.makeText(activity,"deneme",Toast.LENGTH_SHORT).show()
        }

        return rootView
    }
}