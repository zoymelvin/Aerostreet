package com.example.aerostreet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class KemejaHitam : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kemeja_hitam)

        var btnBack: ImageView
        btnBack = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

    }
}