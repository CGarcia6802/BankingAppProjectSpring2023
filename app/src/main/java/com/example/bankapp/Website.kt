package com.example.bankapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.content.Intent
import android.net.Uri

class
Website : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)

        var weburl = findViewById<Button>(R.id.Website_button)
        weburl.setOnClickListener {

            if (weburl.isPressed()){
                Toast.makeText(applicationContext, "This is an example of what to expect for when a user has their bank connected.", Toast.LENGTH_LONG).show()

                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fsblivingston.bank/"))
                startActivity(intent)
            }
        }

        var goBack = findViewById<Button>(R.id.Go_Back_Button)
        goBack.setOnClickListener {
            val Intent = Intent(this, Home_Page::class.java)
            startActivity(Intent)
        }

    }
}