package com.example.ns2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settabs()
        high.setTitle("Reports/Customers")
    }

    private fun settabs() {
        val adpater=Adpater(supportFragmentManager)
        adpater.addfragments(firstFragment(),"Customer Name")
        adpater.addfragments(secondFragment(),"Mobile No.")
        adpater.addfragments(thirdFragment(),"Total Purchase (₹)")
        VP.adapter=adpater
        tl.setupWithViewPager(VP)
    }

}