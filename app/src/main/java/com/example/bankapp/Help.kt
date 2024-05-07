package com.example.bankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Help : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        var goBack = findViewById<Button>(R.id.Go_Back_Button)
        goBack.setOnClickListener{
            val Intent = Intent(this, Home_Page::class.java)
            startActivity(Intent)
        }
    }
}