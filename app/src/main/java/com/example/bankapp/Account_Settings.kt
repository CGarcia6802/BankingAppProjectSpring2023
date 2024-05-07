package com.example.bankapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class Account_Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accountsetting)

        var home = findViewById<Button>(R.id.Go_Back_Button)
        home.setOnClickListener{
            val Intent = Intent(this, Home_Page::class.java)
            startActivity(Intent)
        }


        var settings = findViewById<Button>(R.id.Settings)
        settings.setOnClickListener{
            val Intent = Intent(this, Settings::class.java)
            startActivity(Intent)
        }

    }
}