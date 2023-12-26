package com.example.aplikasimusiknusantara

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class dipetik : AppCompatActivity() {
    private lateinit var Button_back: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dipetik)

        Button_back = findViewById (R.id.back6)

        Button_back.setOnClickListener {
            val move = Intent(this@dipetik, kategori::class.java)
            startActivity(move)
        }
    }
}