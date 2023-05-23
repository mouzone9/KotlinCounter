package com.example.kotlin_iim_

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var counterTextView: TextView
    private lateinit var incrementButton: Button
    private lateinit var decrementButton: Button

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterTextView = findViewById(R.id.counterTextView)
        incrementButton = findViewById(R.id.incrementButton)
        decrementButton = findViewById(R.id.decrementButton)

        incrementButton.setOnClickListener(this)
        decrementButton.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.incrementButton -> incrementCounter()
            R.id.decrementButton -> decrementCounter()
        }
    }

    private fun incrementCounter() {
        counter++
        counterTextView.text = counter.toString()
    }

    private fun decrementCounter() {
        counter--
        counterTextView.text = counter.toString()
    }
}
