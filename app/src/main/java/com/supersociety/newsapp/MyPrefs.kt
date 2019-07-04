package com.supersociety.newsapp

import com.chibatching.kotpref.KotprefModel

object MyPrefs: KotprefModel() {
    var nightMode by booleanPref(default = false)
}

