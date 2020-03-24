package com.sundaydavid.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun setListener(){
        val clickableViews: List<View> =
            listOf(box_one, box_two, box_three, box_four, box_five)

        for (item in clickableViews){
            item.setOnClickListener {  makeCoored(it) }
        }
    }

    private fun makeCoored(it: View?) {
        when(it?.id){
            R.id.box_one -> it.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> it.setBackgroundColor(Color.GRAY)

            R.id.box_three -> it.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four -> it.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five -> it.setBackgroundResource(android.R.color.holo_orange_dark)

            else -> it?.setBackgroundColor(Color.LTGRAY)
        }
    }
}
