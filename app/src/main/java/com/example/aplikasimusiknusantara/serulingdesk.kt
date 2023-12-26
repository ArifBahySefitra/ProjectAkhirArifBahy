package com.example.aplikasimusiknusantara

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class serulingdesk : AppCompatActivity() {
    private lateinit var Button_back: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serulingdesk)

        Button_back = findViewById (R.id.back7)

        Button_back.setOnClickListener {
            val move = Intent(this@serulingdesk , ditiup::class.java)
            startActivity(move)
        }
    }
}