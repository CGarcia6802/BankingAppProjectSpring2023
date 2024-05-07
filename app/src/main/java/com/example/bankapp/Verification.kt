package com.example.bankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText

class Verification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)
        var vaddAcc = findViewById<Button>(R.id.Enter_Button)
        var gbb = findViewById<Button>(R.id.gbButton)
        var vSSN = findViewById<EditText>(R.id.vSSN)
        var vpinNum = findViewById<EditText>(R.id.vpin)
        var vaccNum = findViewById<EditText>(R.id.vaccNum)

        vaddAcc.isEnabled = false
        val eT = listOf<EditText>(vSSN, vpinNum, vaccNum)

        for (editText in eT) {
            editText.addTextChangedListener(object : TextWatcher {
                override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                    var et1 = vSSN.text.toString().trim()
                    var et2 = vpinNum.text.toString().trim()
                    var et3 = vaccNum.text.toString().trim()

                    if (et1.isNotEmpty() && et2.isNotEmpty() && et3.isNotEmpty()) {
                        vaddAcc.isEnabled = true
                    }

                }

                override fun beforeTextChanged(
                    s: CharSequence,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun afterTextChanged(s: Editable) {
                    var et1 = vSSN.text.toString().trim()
                    var et2 = vpinNum.text.toString().trim()
                    var et3 = vaccNum.text.toString().trim()

                    if (et1.isEmpty() || et2.isEmpty() || et3.length <= 3) {
                        vaddAcc.isEnabled = false
                    }
                }
            })
        }

        vaddAcc.setOnClickListener{
            val Intent = Intent(this, Home_Page::class.java)
            startActivity(Intent)
        }

        gbb.setOnClickListener{
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }
    }
}