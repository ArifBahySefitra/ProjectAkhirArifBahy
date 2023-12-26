package com.example.aplikasimusiknusantara

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class profile : AppCompatActivity() {
    private lateinit var Image_home: ImageView
    private lateinit var Button_logout: Button
    private lateinit var Buttoneditprofile: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        Image_home = findViewById(R.id.image_home)
        Button_logout = findViewById(R.id.logout)
        Buttoneditprofile = findViewById(R.id.editprofile)

        Image_home.setOnClickListener {
            val move = Intent(this@profile, kategori::class.java)
            startActivity(move)
        }

        Button_logout.setOnClickListener {
            val move = Intent(this@profile, login::class.java)
            startActivity(move)
        }

        Buttoneditprofile.setOnClickListener {
            val move = Intent(this@profile, editprofile::class.java)
            startActivity(move)

        }
    }
}