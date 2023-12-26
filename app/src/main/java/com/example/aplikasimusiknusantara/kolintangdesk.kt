package com.example.aplikasimusiknusantara

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class kolintangdesk : AppCompatActivity() {
    private lateinit var Button_back: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kolintangdesk)

        Button_back = findViewById (R.id.backkolintang)

        Button_back.setOnClickListener {
            val move = Intent(this@kolintangdesk, dipukul::class.java)
            startActivity(move)
        }
    }
}