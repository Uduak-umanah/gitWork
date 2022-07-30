package com.uduak.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val forcastRepository = ForcastRepository()

    // region Set up methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val zipCodeEditText = Zipcode.text.toString()

        button.setOnClickListener {
            forcastRepository.loadForcast(zipCodeEditText)
            }
        val weaklyforcastobserver= Observer<List<DailyForcast>>{forcastitems->
            Toast.makeText(this, "Loaded item",
                Toast.LENGTH_SHORT).show()

            /////update list adapter
        }

        forcastRepository.weaklyForcast.observe(this, weaklyforcastobserver)




    }
    
}