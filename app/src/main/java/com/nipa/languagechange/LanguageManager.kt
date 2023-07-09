package com.nipa.languagechange

import android.content.Context
import android.content.res.Configuration
import android.view.ContextThemeWrapper
import java.util.Locale

class LanguageManager {
    companion object{
        var getLanguage="en"
       val languageList= arrayOf("Select Language","English","Romania","Hindi","Bengali")
        val languageCodeList= arrayOf("","en","ro","hi","bn")

        fun langugaeSet( wrapper: ContextThemeWrapper,languageCode: String) {
            var locale=Locale(languageCode)
            Locale.setDefault(locale)
            val configuration = Configuration()
            configuration.setLocale(locale)
            wrapper.applyOverrideConfiguration(configuration)
        }
    }
}