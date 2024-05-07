package com.example.bankapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class Privacy_Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacysettings)

        var settings = findViewById<Button>(R.id.Settings)
        settings.setOnClickListener{
            val Intent = Intent(this, Settings::class.java)
            startActivity(Intent)
        }

        var goBack = findViewById<Button>(R.id.Go_Back_Button)
        goBack.setOnClickListener{
            val Intent = Intent(this, Home_Page::class.java)
            startActivity(Intent)
        }
    }
}