package com.example.aplikasimusiknusantara

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class kategori : AppCompatActivity() {
    private lateinit var Image_profile: ImageView
    private lateinit var Image_dipukul: ImageView
    private lateinit var Image_ditiup: ImageView
    private lateinit var Image_digoyang: ImageView
    private lateinit var Image_digesek: ImageView
    private lateinit var Image_dipetik: ImageView
    private lateinit var Image_ditepuk: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori)

        Image_profile = findViewById(R.id.profile)
        Image_dipukul = findViewById(R.id.dipukul1)
        Image_ditiup = findViewById(R.id.ditiup1)
        Image_digoyang = findViewById(R.id.digoyang1)
        Image_digesek = findViewById(R.id.digesek1)
        Image_dipetik = findViewById(R.id.dipetik1)
        Image_ditepuk = findViewById(R.id.ditepuk1)

        Image_profile.setOnClickListener {
            val move = Intent(this@kategori, profile::class.java)
            startActivity(move)
        }


        Image_ditiup.setOnClickListener {
            val move = Intent(this@kategori, ditiup::class.java)
            startActivity(move)


        }

        Image_digoyang.setOnClickListener {
            val move = Intent(this@kategori, digoyang::class.java)
            startActivity(move)

        }

        Image_digesek.setOnClickListener {
            val move = Intent(this@kategori, digesek::class.java)
            startActivity(move)

        }

        Image_dipetik.setOnClickListener {
            val move = Intent(this@kategori, dipetik::class.java)
            startActivity(move)

        }

        Image_dipukul.setOnClickListener {
            val move = Intent(this@kategori, dipukul::class.java)
            startActivity(move)

        }

        Image_ditepuk.setOnClickListener {
            val move = Intent(this@kategori, ditepuk::class.java)
            startActivity(move)

        }
    }
}

