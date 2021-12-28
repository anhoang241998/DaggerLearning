package com.annguyenhoang.daggerlearning.dependency_inversion

interface SharedPrefsAbstraction {
    fun savePreference(key: String, enabled: Boolean)
    fun retrievePreference(key: String): Boolean
}