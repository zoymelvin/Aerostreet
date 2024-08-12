package com.example.aerostreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class TShirtUnisex : AppCompatActivity() {
    private lateinit var cardS: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tshirt_unisex)

        cardS = findViewById(R.id.card_s)

        cardS.setOnClickListener {
            val intent = Intent(this, LamanProduk::class.java)
            startActivity(intent)
        }

        var btnBack: ImageView
        btnBack = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
    }
}
