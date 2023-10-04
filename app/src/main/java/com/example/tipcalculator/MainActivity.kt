package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculateTip(view: View) {
        val dollarText: EditText = findViewById(R.id.dollarText)
        val textView: TextView = findViewById(R.id.textView)

        if (dollarText.text.isNotEmpty()) {
            val dollarValue = dollarText.text.toString().toFloat()

            // Calculate tips and update the TextView
            val tip1 = dollarValue * 0.10
            val tip2 = dollarValue * 0.15
            val tip3 = dollarValue * 0.20

            textView.text = "10% = ${("%.2f".format(tip1 + dollarValue))}\n" +
                    "15% = ${("%.2f".format(tip2 + dollarValue))}\n" +
                    "20% = ${("%.2f".format(tip3 + dollarValue))}"
        }
        if (dollarText.text.isEmpty()) {
            textView.text = "YOU MUST ENTER A BILL AMOUNT"
        }
    }
}