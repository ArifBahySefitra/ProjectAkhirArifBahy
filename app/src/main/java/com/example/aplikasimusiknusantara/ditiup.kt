package com.example.aplikasimusiknusantara

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ditiup : AppCompatActivity() {
    private lateinit var Image_seruling : ImageView
    private lateinit var Button_back : Button
    private lateinit var Image_serunai : ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ditiup)

        Image_seruling = findViewById(R.id.serulingtiup)
        Button_back = findViewById(R.id.backditiup)
        Image_serunai = findViewById(R.id.serunaitiup)

        Image_serunai.setOnClickListener {
            val move = Intent(this@ditiup, serunaidesk::class.java)
            startActivity(move)
        }

        Button_back.setOnClickListener {
            val move = Intent(this@ditiup, kategori::class.java)
            startActivity(move)
        }

        Image_seruling.setOnClickListener {
            val move = Intent(this@ditiup, serulingdesk::class.java)
            startActivity(move)


        }
    }
}

