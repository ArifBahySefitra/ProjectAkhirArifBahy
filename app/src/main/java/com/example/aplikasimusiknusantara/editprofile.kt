package com.example.aplikasimusiknusantara

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class editprofile : AppCompatActivity() {
    private lateinit var Button_back : Button
    @SuppressLint("Missing Inflate Id")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editprofile)

        Button_back = findViewById(R.id.back)

        Button_back.setOnClickListener{
            val move = Intent(this@editprofile, profile::class.java)
            startActivity(move)
        }
    }
}