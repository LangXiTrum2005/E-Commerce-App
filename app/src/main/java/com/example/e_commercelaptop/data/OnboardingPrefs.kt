package com.example.e_commercelaptop.data

import android.content.Context
import android.content.SharedPreferences

class OnboardingPrefs(context: Context) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("onboarding_prefs", Context.MODE_PRIVATE)

    fun isFirstTime(): Boolean {
        return sharedPreferences.getBoolean("is_first_time", true)
    }

    fun setFirstTimeCompleted() {
        sharedPreferences.edit().putBoolean("is_first_time", false).apply()
    }
}
