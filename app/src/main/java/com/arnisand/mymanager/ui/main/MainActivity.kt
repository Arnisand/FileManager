package com.arnisand.mymanager.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arnisand.mymanager.R
import com.arnisand.mymanager.utility.extension.replaceFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            replaceFragment(MainFragment.newInstance())
        }
    }

}
