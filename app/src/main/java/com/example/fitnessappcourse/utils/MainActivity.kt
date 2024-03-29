package com.example.fitnessappcourse.utils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitnessappcourse.fragments.FragmentManager
import com.example.fitnessappcourse.R
import com.example.fitnessappcourse.fragments.DaysFragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FragmentManager.setFragment(DaysFragment.newInstance(), this)
    }
}