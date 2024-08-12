package com.app.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.aerostreet.Chart
import com.example.aerostreet.Hot
import com.example.aerostreet.Men
import com.example.aerostreet.R
import com.example.aerostreet.Settings
import com.example.aerostreet.Favorite
import com.example.aerostreet.TShirtUnisex
import com.google.android.material.imageview.ShapeableImageView

class Home : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var sidebarTrigger: ImageView
    private lateinit var shopLinearLayout: LinearLayout
    private lateinit var settingsLinearLayout: LinearLayout
    private lateinit var favoriteLinearLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initViews()

        val btnChart: LinearLayout = findViewById(R.id.chart)
        btnChart.setOnClickListener{
            val intent = Intent(this, Chart::class.java)
            startActivity(intent)
        }

        val btnHot: LinearLayout = findViewById(R.id.hot)
        btnHot.setOnClickListener{
            val intent = Intent(this, Hot::class.java)
            startActivity(intent)
        }

        var ruey7qslolm: ShapeableImageView = findViewById(R.id.ruey7qslolm)
        ruey7qslolm.setOnClickListener {
            val intent = Intent(this, TShirtUnisex::class.java)
            startActivity(intent)
        }

        var rlh1pd3yj9ff: ShapeableImageView = findViewById(R.id.rlh1pd3yj9ff)
        rlh1pd3yj9ff.setOnClickListener {
            val intent = Intent(this, TShirtUnisex::class.java)
            startActivity(intent)
        }

        var rqfbpvjrqktb: ShapeableImageView = findViewById(R.id.rqfbpvjrqktb)
        rqfbpvjrqktb.setOnClickListener {
            val intent = Intent(this, Men::class.java)
            startActivity(intent)
        }

        var rxdipw6zoa2e: ShapeableImageView = findViewById(R.id.rxdipw6zoa2e)
        rxdipw6zoa2e.setOnClickListener {
            val intent = Intent(this, Men::class.java)
            startActivity(intent)
        }

        var rf3bl992b35c: ShapeableImageView = findViewById(R.id.rf3bl992b35c)
        rf3bl992b35c.setOnClickListener {
            val intent = Intent(this, TShirtUnisex::class.java)
            startActivity(intent)
        }

        var ro36kxhb7lm: ShapeableImageView = findViewById(R.id.ro36kxhb7lm)
        ro36kxhb7lm.setOnClickListener {
            val intent = Intent(this, TShirtUnisex::class.java)
            startActivity(intent)
        }

        var rayxy45mdojp: ImageView = findViewById(R.id.rayxy45mdojp)
        rayxy45mdojp.setOnClickListener {
            val intent = Intent(this, TShirtUnisex::class.java)
            startActivity(intent)
        }

        sidebarTrigger.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }
        shopLinearLayout.setOnClickListener {
            val intent = Intent(this, Men::class.java)
            startActivity(intent)
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
        sidebarTrigger = findViewById(R.id.sidebarHome)
        shopLinearLayout = findViewById(R.id.shop)
        settingsLinearLayout = findViewById(R.id.settings)
        favoriteLinearLayout = findViewById(R.id.favorite)
    }
}
