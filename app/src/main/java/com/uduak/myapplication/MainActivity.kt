package com.uduak.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // region Set up methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val zipCodeEditText = Zipcode.text

        button.setOnClickListener {
            Toast.makeText(this, "you entered ${zipCodeEditText.toString()}", Toast.LENGTH_SHORT).show()
            }



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