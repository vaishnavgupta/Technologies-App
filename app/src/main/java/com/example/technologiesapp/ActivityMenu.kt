package com.example.technologiesapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)


        val androidCard=findViewById<CardView>(R.id.CardAndroid)
        val iosCard=findViewById<CardView>(R.id.CardiOS)
        val webCard=findViewById<CardView>(R.id.CardWebD)
        val mlCard=findViewById<CardView>(R.id.CardML)
        val aiCard=findViewById<CardView>(R.id.CardAI)
        val bcCard=findViewById<CardView>(R.id.CardBC)
        //for contact button
        val btnContact=findViewById<Button>(R.id.contact)

        btnContact.setOnClickListener {
            val phoneNumber = "7266860224"
            val callIntent = Uri.parse("tel:$phoneNumber").let { number ->
                Intent(Intent.ACTION_DIAL, number)
            }
            startActivity(callIntent)

        }
        androidCard.setOnClickListener {
            val intent=Intent(applicationContext,AndroidActivity::class.java)
            startActivity(intent)
        }
        iosCard.setOnClickListener {
            val intent=Intent(applicationContext,ActivityiOS::class.java)
            startActivity(intent)
        }
        webCard.setOnClickListener {
            val intent=Intent(applicationContext,ActivityWeb::class.java)
            startActivity(intent)
        }
        mlCard.setOnClickListener {
            val intent=Intent(applicationContext,ActivityML::class.java)
            startActivity(intent)
        }
        aiCard.setOnClickListener {
            val intent=Intent(applicationContext,ActivityAI::class.java)
            startActivity(intent)
        }
        bcCard.setOnClickListener {
            val intent=Intent(applicationContext,ActivityBlockchain::class.java)
            startActivity(intent)
        }


    }
}