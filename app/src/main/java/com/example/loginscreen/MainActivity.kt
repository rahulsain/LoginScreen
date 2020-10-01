package com.example.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var rellay1: RelativeLayout
    private lateinit var rellay2: RelativeLayout
    private var handler = Handler()
    private var runnable: Runnable = Runnable {
        rellay1.visibility = View.VISIBLE
        rellay2.visibility = View.VISIBLE
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rellay1 = findViewById<View>(R.id.rellay1) as RelativeLayout
        rellay2 = findViewById<View>(R.id.rellay2) as RelativeLayout

        handler.postDelayed(runnable,3000)

        btn_forgot_password.setOnClickListener {
            startActivity(Intent(this@MainActivity, ForgotPasswordActivity::class.java))
        }
        btn_register.setOnClickListener {
            startActivity(Intent(this@MainActivity, RegisterActivity::class.java))
        }
    }
}