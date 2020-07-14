package com.pdk.dicoding.kade.ui.fragments

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.pdk.dicoding.kade.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}