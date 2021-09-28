package com.example.activitylifecycleapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var tag = "LifeCycleEvents"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(tag, "In the onCreate() event");
    }
    override fun onStart() {
        super.onStart()
        Log.d(tag, "In the onStart() event")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "In the onRestart() event")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "In the onResume() event")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "In the onPause() event")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "In the onStop() event")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "In the onDestroy() event")
    }
}
