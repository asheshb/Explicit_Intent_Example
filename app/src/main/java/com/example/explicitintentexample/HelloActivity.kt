package com.example.explicitintentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class HelloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        val guestName: String? = intent.getStringExtra("NAME")
        guestName?.let{
            val name = findViewById<TextView>(R.id.name)
            name.text = getString(R.string.guest_name, it)

            Toast.makeText(this,"This activity was launched by: $it",
                Toast.LENGTH_LONG).show()
        }
    }
}
