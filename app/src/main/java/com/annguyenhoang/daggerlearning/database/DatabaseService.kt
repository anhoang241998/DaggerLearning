package com.annguyenhoang.daggerlearning.database

import android.util.Log
import com.annguyenhoang.daggerlearning.TAG
import javax.inject.Inject

class DatabaseService @Inject constructor() {

    fun log(message: String) {
        Log.d(TAG, "Database Service message: $message")
    }

}