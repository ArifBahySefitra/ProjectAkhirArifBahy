package com.example.aplikasimusiknusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var Button_login : Button
    private lateinit var TextRegister : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TextRegister = findViewById(R.id.txtregister)
        Button_login = findViewById(R.id.btn1)

        TextRegister.setOnClickListener{
            val move = Intent(this@MainActivity, Register::class.java)
            startActivity(move)
        }

        Button_login.setOnClickListener {
            val move = Intent(this@MainActivity, kategori::class.java)
            startActivity(move)
        }
    }
}