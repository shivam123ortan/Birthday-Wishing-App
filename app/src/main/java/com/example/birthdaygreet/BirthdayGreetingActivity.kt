package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)


        val bundle : Bundle? = intent.extras
        val greet = findViewById<TextView>(R.id.birthdayGreeting)
        val name = bundle?.get("name")
        val b = "Happy Birthday $name"
        greet.text = b
    }
}