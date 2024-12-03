package com.mirzaukail.gotravel

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val BtnProfile = findViewById<ImageView>(R.id.BtnProfile)
        BtnProfile.setOnClickListener {
            val intent = Intent(this@Dashboard, Profil::class.java)
            startActivity(intent)
            finish()
        }
        val BtnPesawat = findViewById<ImageView>(R.id.BtnPesawat)
        BtnPesawat.setOnClickListener {
            val intent = Intent(this@Dashboard, booking_pesawat::class.java)
            startActivity(intent)
            finish()
        }
        val BtnPenginapan= findViewById<ImageView>(R.id.BtnPenginapan)
        BtnPenginapan.setOnClickListener {
            val intent = Intent(this@Dashboard, booking_penginapan::class.java)
            startActivity(intent)
            finish()
        }
        val BtnKereta= findViewById<ImageView>(R.id.BtnKereta)
        BtnKereta.setOnClickListener {
            val intent = Intent(this@Dashboard, booking_kereta::class.java)
            startActivity(intent)
            finish()
        }
        val BtnRiwayat= findViewById<ImageView>(R.id.BtnRiwayat)
        BtnRiwayat.setOnClickListener {
            val intent = Intent(this@Dashboard, riwayat::class.java)
            startActivity(intent)
            finish()
        }

    }
}