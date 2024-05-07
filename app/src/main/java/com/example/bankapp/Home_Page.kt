package com.example.bankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Home_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        var signOut = findViewById<Button>(R.id.Sign_Out)
        signOut.setOnClickListener{
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

        var account = findViewById<Button>(R.id.Account)
        account.setOnClickListener{
            val Intent = Intent(this, Account::class.java)
            startActivity(Intent)
        }

        var transHistory = findViewById<Button>(R.id.Transaction_History)
        transHistory.setOnClickListener{
            val Intent = Intent(this, Transaction_History::class.java)
            startActivity(Intent)
        }

        var settings = findViewById<Button>(R.id.Settings)
        settings.setOnClickListener{
            val Intent = Intent(this, Settings::class.java)
            startActivity(Intent)
        }

        var transfer = findViewById<Button>(R.id.Transfer)
        transfer.setOnClickListener{
            val Intent = Intent(this, Transfer::class.java)
            startActivity(Intent)
        }

        //third layer buttons at bottom(Help,Location,Website Link)

        var help = findViewById<ImageButton>(R.id.Help_Me)
        help.setOnClickListener{
            val Intent = Intent(this, Help::class.java)
            startActivity(Intent)
        }

        var location = findViewById<ImageButton>(R.id.Location)
        location.setOnClickListener{
            val Intent = Intent(this, Location::class.java)
            startActivity(Intent)
        }

        var website = findViewById<ImageButton>(R.id.Website_Link)
        website.setOnClickListener{
            val Intent = Intent(this, Website::class.java)
            startActivity(Intent)
        }
    }
}