package com.example.aplikasimusiknusantara

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class dipukul: AppCompatActivity() {

    private lateinit var Image_talempong: ImageView
    private lateinit var Button_back : Button
    private lateinit var Image_kolintang: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dipukul)

        Image_talempong = findViewById(R.id.talempongdipukul)
        Button_back = findViewById(R.id.backdipukul)
        Image_kolintang = findViewById(R.id.kolintangdipukul)

        Image_talempong.setOnClickListener {
            val move = Intent(this@dipukul, talempongdesk::class.java)
            startActivity(move)
        }

        Button_back.setOnClickListener {
            val move = Intent(this@dipukul, kategori::class.java)
            startActivity(move)
        }

        Image_kolintang.setOnClickListener {
            val move = Intent(this@dipukul, kolintangdesk::class.java)
            startActivity(move)


        }
    }
}

