package com.annguyenhoang.daggerlearning.dependency_inversion

class NotificationSettings(private val sharedPrefsAbstraction: SharedPrefsAbstraction) {

    private var areNotificationsEnabled = sharedPrefsAbstraction
        .retrievePreference("notificationsEnabled")

    fun setNotificationsEnabled(enabled: Boolean) {
        areNotificationsEnabled = enabled
        sharedPrefsAbstraction.savePreference("notificationsEnabled", enabled)
    }

}