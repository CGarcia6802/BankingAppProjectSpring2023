package com.example.bankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        var goBack = findViewById<Button>(R.id.Go_Back_Button)
        goBack.setOnClickListener{
            val Intent = Intent(this, Home_Page::class.java)
            startActivity(Intent)
        }

        var colorSettings = findViewById<Button>(R.id.Color_settings)
        colorSettings.setOnClickListener{
            val Intent = Intent(this, Color_Settings::class.java)
            startActivity(Intent)
        }

        var privacySettings = findViewById<Button>(R.id.Privacy_Settings)
        privacySettings.setOnClickListener{
            val Intent = Intent(this, Privacy_Settings::class.java)
            startActivity(Intent)
        }

        var accountSettings = findViewById<Button>(R.id.Account_Settings)
        accountSettings.setOnClickListener{
            val Intent = Intent(this, Account_Settings::class.java)
            startActivity(Intent)
        }
    }
}