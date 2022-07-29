package com.uduak.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    // region Set up methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }
    //end Region Setup Methods
    // end region Tear down methods

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }
    // end region tear down methods
}