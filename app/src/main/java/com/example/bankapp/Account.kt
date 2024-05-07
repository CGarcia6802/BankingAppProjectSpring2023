package com.example.bankapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Account : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        var addAcc = findViewById<Button>(R.id.Add_Account_Button)
        var SSN = findViewById<EditText>(R.id.SSN)
        var pinNum = findViewById<EditText>(R.id.pin)
        var accNum = findViewById<EditText>(R.id.accNum)
        var cos = findViewById<EditText>(R.id.cos)

        addAcc.isEnabled = false
        val eT = listOf<EditText>(SSN, pinNum, accNum, cos)

        for (editText in eT){
            editText.addTextChangedListener(object : TextWatcher {
                override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                    var et1 = SSN.text.toString().trim()
                    var et2 = pinNum.text.toString().trim()
                    var et3 = accNum.text.toString().trim()
                    var et4 = cos.text. toString().trim()

                    if (et1.isNotEmpty() && et2.isNotEmpty() && et3.isNotEmpty() && et4.isNotEmpty()) {
                        addAcc.isEnabled = true
                    }

                }

                override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                }

                override fun afterTextChanged(s: Editable) {
                    var et1 = SSN.text.toString().trim()
                    var et2 = pinNum.text.toString().trim()
                    var et3 = accNum.text.toString().trim()
                    var et4 = cos.text. toString().trim()

                    if (et1.isEmpty() || et2.isEmpty() || et3.length <= 3) {
                        addAcc.isEnabled = false
                    }
                }
            })

        }



        var transactionHistory = findViewById<Button>(R.id.Transaction_History)
        transactionHistory.setOnClickListener{
            val Intent = Intent(this, Transaction_History::class.java)
            startActivity(Intent)
        }

        var settings = findViewById<Button>(R.id.Settings)
        settings.setOnClickListener{
            val Intent = Intent(this, Settings::class.java)
            startActivity(Intent)
        }


        var goBack = findViewById<Button>(R.id.Go_Back_Button)
        goBack.setOnClickListener {
            val Intent = Intent(this, Home_Page::class.java)
            startActivity(Intent)
        }

        addAcc.setOnClickListener {

            if (addAcc.isPressed()){
                Toast.makeText(applicationContext, "Account Added", Toast.LENGTH_LONG).show()

                SSN.getText().clear()
                pinNum.getText().clear()
                accNum.getText().clear()
                cos.getText().clear()
            }
        }
    }
}