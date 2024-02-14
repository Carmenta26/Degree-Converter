package com.example.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editTextCelsius: EditText = findViewById(R.id.textCent)
        val editTextFahrenheit: EditText = findViewById(R.id.textFar)

        val buttonCelsiusToFahrenheit: Button = findViewById(R.id.buttonFar)
        val buttonFahrenheitToCelsius: Button = findViewById(R.id.buttonCent)

        buttonCelsiusToFahrenheit.setOnClickListener {
            val celsiusValue = editTextCelsius.text.toString().toDoubleOrNull()
            if (celsiusValue != null) {
                val fahrenheitValue = celsiusValue * 1.8 + 32
                editTextFahrenheit.setText(fahrenheitValue.toString())
            }
        }

        buttonFahrenheitToCelsius.setOnClickListener {
            val fahrenheitValue = editTextFahrenheit.text.toString().toDoubleOrNull()
            if (fahrenheitValue != null) {
                val celsiusValue = (fahrenheitValue - 32) / 1.8
                editTextCelsius.setText(celsiusValue.toString())
            }
        }

    }
}