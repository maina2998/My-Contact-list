
package com.example.mycontacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.contacts.MainActivity
import com.example.contacts.R

class Contact_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var btnContacts=findViewById<Button>(R.id.btnContacts)
//        btnContacts.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)



        }
    }
