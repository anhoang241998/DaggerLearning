package com.annguyenhoang.daggerlearning.dependency_inversion

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class SharedPrefsManager(private val activity: Activity): SharedPrefsAbstraction {

    override fun savePreference(key: String, enabled: Boolean) {
        val sharedPref = activity.getSharedPreferences("AppSharedPrefs", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean(key, enabled)
        editor.apply()
    }

    override fun retrievePreference(key: String): Boolean {
        val sharedPref: SharedPreferences =
            activity.getSharedPreferences("AppSharedPrefs", Context.MODE_PRIVATE)
        return sharedPref.getBoolean(key, false)
    }

}