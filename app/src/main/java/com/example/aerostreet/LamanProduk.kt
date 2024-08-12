package com.example.aerostreet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.button.MaterialButton
import com.google.android.material.bottomsheet.BottomSheetDialog

class LamanProduk : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laman_produk)

        var btnBack: ImageView = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        var addFavorite: ImageView = findViewById(R.id.addFavorite)
        addFavorite.setOnClickListener {
            val intent = Intent(this, Favorite::class.java)
            startActivity(intent)
        }

        val R_btn_2 = findViewById<Button>(R.id.R_btn_2)
        R_btn_2.setOnClickListener {
            val intent = Intent(this, Chart::class.java)
            startActivity(intent)
        }

        var R_btn_1: MaterialButton = findViewById(R.id.R_btn_1)
        R_btn_1.setOnClickListener {
            showBottomSheet()
        }
    }

    private fun showBottomSheet() {
        val bottomSheetDialog = BottomSheetDialog(this)
        val bottomSheetView = layoutInflater.inflate(R.layout.bottomsheet_size, null)
        bottomSheetDialog.setContentView(bottomSheetView)
        bottomSheetDialog.show()
    }
}
