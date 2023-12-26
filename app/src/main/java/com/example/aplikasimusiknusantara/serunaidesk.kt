package com.example.aplikasimusiknusantara

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class serunaidesk : AppCompatActivity() {
    private lateinit var Button_back: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serunaidesk)

        Button_back = findViewById (R.id.backserunai)

        Button_back.setOnClickListener {
            val move = Intent(this@serunaidesk , ditiup::class.java)
            startActivity(move)
        }
    }
}