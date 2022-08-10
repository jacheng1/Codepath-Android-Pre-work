package com.example.androidpre_work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // User can tap a button to change the text color of the label
        // 1. Add a button to our layout

        // Get a reference to button
        // 2. Set up logic to know when user has tapped on button
        findViewById<Button>(R.id.button).setOnClickListener {
            // Handles button tap
            // 2. Change the color of the text
            Log.i("Jacky", "Tapped on text button")
            // 1. Get a reference to the text view
            // 2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("Jacky", "Tapped on background button")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.codePathGreen))
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            Log.i("Jacky", "Tapped on text string button")
            findViewById<TextView>(R.id.textView).setText("Android is Awesome!")
        }

        findViewById<ConstraintLayout>(R.id.backgroundView).setOnClickListener {
            Log.i("Jacky", "Tapped on background view")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.defaultBlue))
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.black))
            findViewById<TextView>(R.id.textView).setText("Hello from Jacky!")
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            Log.i("Jacky","Entered user input")
            val simpleEditText = findViewById<EditText>(R.id.editText) as EditText
            val strValue = simpleEditText.text.toString()
            val userInput: String = simpleEditText.text.toString()
            if (userInput.trim().length == 0) { // checks if text field is empty
                findViewById<TextView>(R.id.textView).setText("Android is Awesome!")
            } else {
                findViewById<TextView>(R.id.textView).setText(strValue)
            }
        }
    }
}