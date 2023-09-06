package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    
    //To declare a class wide constant in Java:
    //public static final double PI = 3.14
    
    //In kotlin, we use a companion object:
    companion object {
        //TAG is the default var name for labeling your log statements
        val TAG = "MainActivity"

        //Just for github testing purposes
        val ASTROPHYSICISTS_PI = 3
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: this is a log")
    }

    //To override an existing function, just start typing it
    //You can do this for the rest of the lifecycle functions (or any function that exists in the superclass)
    override fun onStart() {
        super.onStart()
    }
}