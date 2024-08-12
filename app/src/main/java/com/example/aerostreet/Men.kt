package com.example.aerostreet

import android.content.Intent
import android.os.Bundle
import com.google.android.material.imageview.ShapeableImageView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class Men : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var sidebarTrigger: ImageView
    private lateinit var hotTextView: TextView
    private lateinit var kidsTextView: TextView
    private lateinit var womenTextView: TextView
    private lateinit var btnChart: ImageView
    private lateinit var settingsLinearLayout: LinearLayout
    private lateinit var favoriteLinearLayout: LinearLayout
    private lateinit var riocu6bac2r8: ShapeableImageView
    private lateinit var r1otu6b94fqc: ShapeableImageView
    private lateinit var r659tyvq1mlf: ShapeableImageView
    private lateinit var reapw6fntiyj: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_men)
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

        womenTextView.setOnClickListener {
            val intent = Intent(this, Women::class.java)
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

        riocu6bac2r8.setOnClickListener {
            val intent = Intent(this, TShirtUnisex::class.java)
            startActivity(intent)
        }

        r1otu6b94fqc.setOnClickListener {
            val intent = Intent(this, TShirtUnisex::class.java)
            startActivity(intent)
        }

        r659tyvq1mlf.setOnClickListener {
            val intent = Intent(this, TShirtUnisex::class.java)
            startActivity(intent)
        }

        reapw6fntiyj.setOnClickListener {
            val intent = Intent(this, KemejaHitam::class.java)
            startActivity(intent)
        }
    }

    private fun initViews() {
        drawerLayout = findViewById(R.id.drawer_layout)
        sidebarTrigger = findViewById(R.id.sidebarTrigger)
        hotTextView = findViewById(R.id.hot)
        kidsTextView = findViewById(R.id.kids)
        womenTextView = findViewById(R.id.women)
        btnChart = findViewById(R.id.chart)
        settingsLinearLayout = findViewById(R.id.settings)
        favoriteLinearLayout = findViewById(R.id.favorite)
        riocu6bac2r8 = findViewById(R.id.riocu6bac2r8)
        r1otu6b94fqc = findViewById(R.id.r1otu6b94fqc)
        r659tyvq1mlf = findViewById(R.id.r659tyvq1mlf)
        reapw6fntiyj = findViewById(R.id.reapw6fntiyj)
    }
}
