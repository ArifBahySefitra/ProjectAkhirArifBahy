package com.example.aplikasimusiknusantara

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    private lateinit var ButtonSignUp : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        ButtonSignUp = findViewById(R.id.button1)

        ButtonSignUp.setOnClickListener{
            val move = Intent(this@Register, login::class.java)
            startActivity(move)
        }
    }
}