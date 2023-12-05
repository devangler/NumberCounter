package com.example.digitcounter

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    private lateinit var buttonIncrement: CardView
    private lateinit var buttonReset: CardView
    private lateinit var textCount: TextView
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonIncrement = findViewById(R.id.addValue)
        buttonReset = findViewById(R.id.reset)
        textCount = findViewById(R.id.textView)

        buttonIncrement.setOnClickListener {
            incrementCounter()
        }
        buttonReset.setOnClickListener {
            resetCounter()
        }
    }
    private fun resetCounter() {
        count = 0
        updateCountTextView()
    }
    private fun incrementCounter() {
        count++
        updateCountTextView()
    }

    private fun updateCountTextView() {
        textCount.text = count.toString()
    }
}
