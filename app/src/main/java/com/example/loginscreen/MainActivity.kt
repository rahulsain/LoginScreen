package com.example.loginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    internal lateinit var rellay1: RelativeLayout
    internal lateinit var rellay2: RelativeLayout
    internal var handler = Handler()
    internal var runnable: Runnable = Runnable {
        rellay1.visibility = View.VISIBLE
        rellay2.visibility = View.VISIBLE
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rellay1 = findViewById<View>(R.id.rellay1) as RelativeLayout
        rellay2 = findViewById<View>(R.id.rellay2) as RelativeLayout

        handler.postDelayed(runnable,3000)
    }
}