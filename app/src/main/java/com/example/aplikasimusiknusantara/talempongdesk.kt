package com.example.aplikasimusiknusantara

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class talempongdesk : AppCompatActivity() {
    private lateinit var Button_back: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_talempongdesk)

        Button_back = findViewById (R.id.backtalempong)

        Button_back.setOnClickListener {
            val move = Intent(this@talempongdesk, dipukul::class.java)
            startActivity(move)
        }
    }
}