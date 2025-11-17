package com.example.lab_week_11

import android.app.Application
import com.example.lab_week_11.files.SettingsStore

class SettingsApplication : Application() {
    lateinit var settingsStore: SettingsStore
    override fun onCreate() {
        super.onCreate()
        // Initialize the settings store
        // The settings store is used to access the data store
        settingsStore = SettingsStore(this)
    }
}
