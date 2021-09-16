package com.example.testtimber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import timber.log.Timber


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.d("onCreate Called");

        Timber.e("onCreate CalledW")

        Log.d("MyLog", "(MainActivity.kt:15)")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("OnResume Called")
    }
    override fun onPause() {
        super.onPause()
        Timber.d("onPause Called")
    }
    override fun onStart() {
        super.onStart()
        Timber.d("onStart Called")
    }
    override fun onStop() {
        super.onStop()
        Timber.d("onStop Called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Timber.d("onDestroy called")
    }
}