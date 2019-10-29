package com.example.explicitintentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startActivity = findViewById<Button>(R.id.start_activity)

        startActivity.setOnClickListener {
            val intent = Intent(this, HelloActivity::class.java).apply {
                putExtra("NAME", "JOHN")
            }
            startActivity(intent)
        }
    }
}
