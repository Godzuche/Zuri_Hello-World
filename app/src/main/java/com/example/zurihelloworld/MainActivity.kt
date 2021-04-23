package com.example.zurihelloworld

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //referencing the Button views
        val button1 = findViewById<Button>(R.id.button)
        val button2 : Button = findViewById(R.id.button2)

        //this defines the button action
        button1.setOnClickListener() {
            increase()
        }

        button2.setOnClickListener() {
            decrease()
        }
    }

    //initializing the display variable
    var num = 0

    //increment function
    private fun increase() {
        num++ //num increases by one

        //referencing the TextView with the variable result
        val result : TextView = findViewById(R.id.number)

        //and then finally updating the TextView
        result.text = num.toString()
    }

    //decrement function
    private fun decrease() {
        num-- //decreases by one

        //referencing the TextView with the variable result
        val result : TextView = findViewById(R.id.number)

        //and then finally updating the TextView
        result.text = num.toString()
    }
}