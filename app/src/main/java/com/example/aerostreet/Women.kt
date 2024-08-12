package com.example.aerostreet

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class Women : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var sidebarTrigger: ImageView
    private lateinit var hotTextView: TextView
    private lateinit var kidsTextView: TextView
    private lateinit var menTextView: TextView
    private lateinit var btnChart: ImageView
    private lateinit var settingsLinearLayout: LinearLayout
    private lateinit var favoriteLinearLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_women)
        initViews()
        hotTextView.setOnClickListener {
            val intent = Intent(this, Hot::class.java)
            startActivity(intent)
        }

        btnChart.setOnClickListener {
            val intent = Intent(this, Chart::class.java)
            startActivity(intent)
        }

        kidsTextView.setOnClickListener {
            val intent = Intent(this, Kids::class.java)
            startActivity(intent)
        }

        menTextView.setOnClickListener {
            val intent = Intent(this, Men::class.java)
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
        hotTextView = findViewById(R.id.hotTextView)
        kidsTextView = findViewById(R.id.kidsTextView)
        menTextView = findViewById(R.id.menTextView)
        btnChart = findViewById(R.id.btnChart)
        settingsLinearLayout = findViewById(R.id.settings)
        favoriteLinearLayout = findViewById(R.id.favorite)
    }
}
