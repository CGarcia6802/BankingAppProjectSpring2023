package com.example.bankapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button;
import android.widget.EditText
import android.widget.Toast

class Transfer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transfer)
        var tr = findViewById<Button>(R.id.transferButton)
        var acc1 = findViewById<EditText>(R.id.account1)
        var acc2 = findViewById<EditText>(R.id.account2)
        var amo = findViewById<EditText>(R.id.amount)

        tr.isEnabled = false
        val eT = listOf<EditText>(acc1, acc2, amo)

        for (editText in eT){
            editText.addTextChangedListener(object : TextWatcher {
                override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                    var et1 = acc1.text.toString().trim()
                    var et2 = acc2.text.toString().trim()
                    var et3 = amo.text.toString().trim()

                    if (et1.isNotEmpty() && et2.isNotEmpty() && et3.isNotEmpty()) {
                        tr.isEnabled = true
                    }

                }

                override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                }

                override fun afterTextChanged(s: Editable) {
                    var et1 = acc1.text.toString().trim()
                    var et2 = acc2.text.toString().trim()
                    var et3 = amo.text.toString().trim()

                    if (et1.isEmpty() || et2.isEmpty() || et3.isEmpty()) {
                        tr.isEnabled = false
                    }
                }
            })

        }


        var gbB = findViewById<Button>(R.id.Go_Back_Button)
        gbB.setOnClickListener {
            val Intent = Intent(this, Home_Page::class.java)
            startActivity(Intent)
        }

        tr.setOnClickListener {

            if (tr.isPressed()){
                Toast.makeText(applicationContext, "Transfer Complete", Toast.LENGTH_LONG).show()

                acc1.getText().clear()
                acc2.getText().clear()
                amo.getText().clear()
            }
        }
    }
}