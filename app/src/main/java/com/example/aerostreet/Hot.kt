package com.example.aerostreet

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.imageview.ShapeableImageView
import com.example.aerostreet.Favorite

class Hot : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var sidebarTrigger: ImageView
    private lateinit var menTextView: TextView
    private lateinit var womenTextView: TextView
    private lateinit var kidsTextView: TextView
    private lateinit var dragonBallImageView: ShapeableImageView
    private lateinit var tShirtUnisexImageView: ShapeableImageView
    private lateinit var settingsLinearLayout: LinearLayout
    private lateinit var favoriteLinearLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hot)
        initViews()

        menTextView = findViewById(R.id.men)
        womenTextView = findViewById(R.id.women)
        kidsTextView = findViewById(R.id.kids)
        dragonBallImageView = findViewById(R.id.dragonBall)
        tShirtUnisexImageView = findViewById(R.id.TShirtUnisex)

        menTextView.setOnClickListener {
            val intent = Intent(this, Men::class.java)
            startActivity(intent)
        }

        womenTextView.setOnClickListener {
            val intent = Intent(this, Women::class.java)
            startActivity(intent)
        }

        kidsTextView.setOnClickListener {
            val intent = Intent(this, Kids::class.java)
            startActivity(intent)
        }

        dragonBallImageView.setOnClickListener {
            val intent = Intent(this, DragonBall::class.java)
            startActivity(intent)
        }

        tShirtUnisexImageView.setOnClickListener {
            val intent = Intent(this, TShirtUnisex::class.java)
            startActivity(intent)
        }

        sidebarTrigger.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        settingsLinearLayout.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

        favoriteLinearLayout.setOnClickListener {
            val intent = Intent(this, Favorite::class.java)
            startActivity(intent)
        }
    }

    private fun initViews() {
        drawerLayout = findViewById(R.id.drawer_layout)
        sidebarTrigger = findViewById(R.id.sidebarTrigger)
        settingsLinearLayout = findViewById(R.id.settings)
        favoriteLinearLayout = findViewById(R.id.favorite)
    }
}
