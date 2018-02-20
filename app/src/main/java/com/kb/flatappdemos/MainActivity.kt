package com.kb.flatappdemos

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupButtonListeners()
    }

    private fun setupButtonListeners() {
        productStateDemo.setOnClickListener {
            val intent = Intent(this, ProductStateDemo::class.java)
            startActivity(intent)
        }
    }
}
