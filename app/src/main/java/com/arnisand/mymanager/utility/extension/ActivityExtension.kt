package com.arnisand.mymanager.utility.extension

import android.app.Activity
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.arnisand.mymanager.R
import com.arnisand.mymanager.ui.main.MainFragment

fun AppCompatActivity.replaceFragment(fragment: Fragment, @IdRes containerId: Int = R.id.container_fragment) {
    supportFragmentManager.beginTransaction()
        .replace(containerId, fragment)
        .commit()
}

fun AppCompatActivity.replaceFragmentWithBackStack(fragment: Fragment, @IdRes containerId: Int = R.id.container_fragment) {
    supportFragmentManager.beginTransaction()
        .replace(containerId, fragment)
        .addToBackStack(fragment::class.qualifiedName)
        .commit()
}