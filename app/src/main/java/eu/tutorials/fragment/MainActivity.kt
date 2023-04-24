package eu.tutorials.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fm = supportFragmentManager
        val ft =fm.beginTransaction()

        ft.add(R.id.fl_fragment1,Fragment1())
        ft.add(R.id.fl_fragment2,Fragment2())

        ft.commit()
    }
}