package com.example.technologiesapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_android)

        val backbtn=findViewById<Button>(R.id.btnAndroid)
        backbtn.setOnClickListener {
            val intent=Intent(applicationContext,ActivityMenu::class.java)
            startActivity(intent)
        }
    }
}