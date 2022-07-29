package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val create = findViewById<Button>(R.id.createBirthdayButton)
        val name = findViewById<EditText>(R.id.nameInput)

        create.setOnClickListener{

            val text = name.text
//            Toast.makeText(this, "Name is $text", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtra("name", text)
            startActivity(intent)
        }

    }

//    fun createBirthdayCard(view: View) {}
}