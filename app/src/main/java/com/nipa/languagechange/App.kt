package com.nipa.languagechange

import android.app.Application
import android.preference.PreferenceManager
import com.nipa.languagechange.LanguageManager.Companion.getLanguage

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        // here you initiate default language may be it from share preference
        // it basically use for initilize share preference data
        getLanguage="hi"

    }
}