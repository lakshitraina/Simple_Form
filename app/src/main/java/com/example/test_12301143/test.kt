package com.example.test_12301143

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val total = findViewById<EditText>(R.id.etTotalClasses)
        val attended = findViewById<EditText>(R.id.etAttended)
        val button = findViewById<Button>(R.id.btnCheck)

        button.setOnClickListener {
            val totalC = total.text.toString().toInt()
            val attendedC = attended.text.toString().toInt()

            val percentage = (attendedC * 100) / totalC

            if (percentage >= 75)
                Toast.makeText(this, "Eligible", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "Not Eligible", Toast.LENGTH_LONG).show()
        }
    }
}
