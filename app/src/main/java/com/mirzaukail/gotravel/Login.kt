package com.mirzaukail.gotravel

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val BtnLogin = findViewById<ImageView>(R.id.BtnLogin)
        BtnLogin.setOnClickListener {
            val intent = Intent(this@Login, Dashboard::class.java)
            startActivity(intent)
            finish()
        }

        val BtnDaftar = findViewById<ImageView>(R.id.BtnDaftar)
        BtnDaftar.setOnClickListener {
            val intent = Intent(this@Login, Signup::class.java)
            startActivity(intent)
            finish()
        }

    }
}