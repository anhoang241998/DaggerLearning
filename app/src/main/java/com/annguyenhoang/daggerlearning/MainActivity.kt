package com.annguyenhoang.daggerlearning

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.annguyenhoang.daggerlearning.database.DatabaseAdapter
import com.annguyenhoang.daggerlearning.database.DatabaseService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

const val TAG = "HiltTutorialLogTag"

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseAdapter: DatabaseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "DatabaseAdapter: $databaseAdapter")
        databaseAdapter.log("Hello Hilt")
    }

    @Inject
    fun directToDatabase(databaseService: DatabaseService) {
        databaseService.log("Method injection")
    }
}