package com.annguyenhoang.daggerlearning.database

import android.util.Log
import com.annguyenhoang.daggerlearning.TAG
import javax.inject.Inject

class DatabaseAdapter @Inject constructor(var databaseService: DatabaseService) {

    fun log(message: String) {
        Log.d(TAG, "Database Adapter message: $message")
        databaseService.log(message)
    }

}