package com.example.caculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.caculator.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn0 = findViewById<Button>(R.id.btn0)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val btnac = findViewById<Button>(R.id.btnac)
        val btncurve = findViewById<Button>(R.id.btncurve)
        val btnback = findViewById<Button>(R.id.btnback)
        val btndiv = findViewById<Button>(R.id.btndiv)
        val btnmul = findViewById<Button>(R.id.btnmul)
        val btnsub = findViewById<Button>(R.id.btnsub)
        val btnadd = findViewById<Button>(R.id.btnadd)
        val btndot = findViewById<Button>(R.id.btndot)
        val btnequal = findViewById<Button>(R.id.btnequal)
        val btnve = findViewById<Button>(R.id.btnve)
    }
}

