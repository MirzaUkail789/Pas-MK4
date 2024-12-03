package com.mirzaukail.gotravel

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profil)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val BtnExit = findViewById<ImageView>(R.id.BtnExit)
        BtnExit.setOnClickListener {
            val intent = Intent(this@Profil, Dashboard::class.java)
            startActivity(intent)
            finish()
        }

        val BtnSignup = findViewById<ImageView>(R.id.BtnSignup)
        BtnSignup.setOnClickListener {
            val intent = Intent(this@Profil, Signup::class.java)
            startActivity(intent)
            finish()
        }

        val BtnLogin = findViewById<ImageView>(R.id.BtnLogin)
        BtnLogin.setOnClickListener {
            val intent = Intent(this@Profil, Login::class.java)
            startActivity(intent)
            finish()
        }

        val BtnBack = findViewById<ImageView>(R.id.BtnBack)
        BtnBack.setOnClickListener {
            val intent = Intent(this@Profil, Dashboard::class.java)
            startActivity(intent)
            finish()
        }
    }
}