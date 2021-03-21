package com.example.introslider

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)
        findViewById<View>(R.id.button1).setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val prefManager = PrefManager(applicationContext)
                prefManager.isFirstTimeLaunch = true
                startActivity(Intent(this@MainActivity, WelcomeActivity::class.java))
                finish()
            }
        })
    }
}