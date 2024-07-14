package com.example.technologiesapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashMainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_main2)

        supportActionBar?.hide()   //hides action bar if present otherwise not

        Handler().postDelayed({      //2 parameter--> runnable and the delay millisec
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()  //jab mainactivity par back press krege
                //toh yeh line call ho jayegi aur splash screen nahi dikhegi
        },3000)

    }
}