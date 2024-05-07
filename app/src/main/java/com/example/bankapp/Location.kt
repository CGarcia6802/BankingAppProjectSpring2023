package com.example.bankapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Location : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)

        var findBank = findViewById<Button>(R.id.findBank)
        var zip = findViewById<EditText>(R.id.Zip_Code)
        findBank.setOnClickListener {

            if (findBank.isPressed()){
                Toast.makeText(applicationContext, "This is an example of what to expect when finding local banks using a zip code:" +
                        "\nLocal Banks and Number: " +
                        "\nFSBLivingstone: 1234" +
                        "\nABCBank: 5678" +
                        "\nXYZBank: 1289", Toast.LENGTH_LONG).show()

                zip.getText().clear()
            }
        }

        var home = findViewById<Button>(R.id.Go_Back_Button)
        home.setOnClickListener{
            val Intent = Intent(this, Home_Page::class.java)
            startActivity(Intent)
        }
    }
}