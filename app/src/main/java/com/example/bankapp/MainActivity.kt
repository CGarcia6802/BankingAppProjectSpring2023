package com.example.bankapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var loginButton = findViewById<Button>(R.id.login_button)
        var username = findViewById<EditText>(R.id.username)
        var password = findViewById<EditText>(R.id.password)

        loginButton.isEnabled = false
        val eT = listOf<EditText>(username, password)

        for (editText in eT){
            editText.addTextChangedListener(object : TextWatcher {
                override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                    var et1 = username.text.toString().trim()
                    var et2 = password.text.toString().trim()

                    if (et1.isNotEmpty() && et2.isNotEmpty()) {
                        loginButton.isEnabled = true
                    }

                }

                override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

                }

                override fun afterTextChanged(s: Editable) {
                    var et1 = username.text.toString().trim()
                    var et2 = password.text.toString().trim()

                    if (et1.isEmpty() || et2.isEmpty()) {
                        loginButton.isEnabled = false
                    }
                    }
            })

        }

        loginButton.setOnClickListener {
            val Intent = Intent(this, Verification::class.java)
            startActivity(Intent)
        }

        var createAccount = findViewById<Button>(R.id.Add_Account_Button)
        createAccount.setOnClickListener{
            val Intent = Intent(this, CreateAccount::class.java)
            startActivity(Intent)
        }
    }
}
