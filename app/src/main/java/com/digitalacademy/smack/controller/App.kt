package com.digitalacademy.smack.controller

import android.app.Application
import com.digitalacademy.smack.util.SharedPrefs

class App: Application() {

    companion object {
        lateinit var prefs: SharedPrefs
    }

    override fun onCreate() {
        prefs = SharedPrefs(applicationContext)
        super.onCreate()
    }
}