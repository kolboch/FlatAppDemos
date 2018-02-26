package com.kb.flatappdemos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.util.Log
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_product_state_demo.*

class ProductStateDemo : AppCompatActivity() {

    private val LOG_TAG = "ProductStateDemo"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_state_demo)
        setupSeekbar()
    }

    private fun setupSeekbar() {
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, progress: Int, fromUser: Boolean) {
                setSeekbarState(progress)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                Log.v(LOG_TAG, "${seekBar.height}")
                //2do
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                //2do
            }

        })
    }

    private fun setSeekbarState(state: Int) {
        when (state) {
            STATE_LOW -> {
                seekBar.progressDrawable = ContextCompat.getDrawable(applicationContext, R.drawable.seekbar_style_low)
            }
            STATE_MEDIUM -> {
                seekBar.progressDrawable = ContextCompat.getDrawable(applicationContext, R.drawable.seekbar_style_medium)
            }
            STATE_HIGH -> {
                seekBar.progressDrawable = ContextCompat.getDrawable(applicationContext, R.drawable.seekbar_style_high)
            }
        }
    }


}
