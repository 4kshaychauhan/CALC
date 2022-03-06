package com.example.caculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.example.caculator.MainActivity
import com.example.caculator.R

class SplashActivity : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        val iconanimation = AnimationUtils.loadAnimation(this, R.anim.iconanim)
        val textanimation = AnimationUtils.loadAnimation(this, R.anim.textanim)

        val texttt = findViewById<TextView>(R.id.text)
        val icontt = findViewById<ImageView>(R.id.icon)

        texttt.startAnimation(textanimation)
        icontt.startAnimation(iconanimation)

        handler = Handler()
        handler.postDelayed({

            // Delay and Start Activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000) // here we're delaying to startActivity after 3seconds

    }
}