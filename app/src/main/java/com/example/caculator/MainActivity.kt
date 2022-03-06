package com.example.caculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.caculator.R
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //textview val
        val resulttv = findViewById<TextView>(R.id.resulttv)
        val inputtv = findViewById<TextView>(R.id.inputtv)
        //button val
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
        val btncurve2 = findViewById<Button>(R.id.btncurve2)


        //append function
        fun appendOnexpression(string: String, canClear: Boolean) {
            if(resulttv.text.isNotEmpty()){
                resulttv.text=""
            }
            if(canClear){
                resulttv.text=""
                inputtv.append(string)
            }
            else{
                inputtv.append(resulttv.text)
                inputtv.append(string)
                resulttv.text=""
            }
        }
        //button on click
        //number
        btn0.setOnClickListener{ appendOnexpression("0",true)}
        btn1.setOnClickListener{ appendOnexpression("1",true)}
        btn2.setOnClickListener{ appendOnexpression("2",true)}
        btn3.setOnClickListener{ appendOnexpression("3",true)}
        btn4.setOnClickListener{ appendOnexpression("4",true)}
        btn5.setOnClickListener{ appendOnexpression("5",true)}
        btn6.setOnClickListener{ appendOnexpression("6",true)}
        btn7.setOnClickListener{ appendOnexpression("7",true)}
        btn8.setOnClickListener{ appendOnexpression("8",true)}
        btn9.setOnClickListener{ appendOnexpression("9",true)}
        btndot.setOnClickListener{ appendOnexpression(".",true)}

        //operator
        btnadd.setOnClickListener{ appendOnexpression("+",false)}
        btnsub.setOnClickListener{ appendOnexpression("-",false)}
        btnmul.setOnClickListener{ appendOnexpression("*",false)}
        btndiv.setOnClickListener{ appendOnexpression("÷",false)}
        btncurve.setOnClickListener{ appendOnexpression("(",false)}
        btncurve2.setOnClickListener{ appendOnexpression(")",true)}

        btnequal.setOnClickListener{
            try{
                val expression = ExpressionBuilder(inputtv.text.toString()).build()
                val result = expression.evaluate()
                val longresult = result.toLong()
                if(result==longresult.toDouble()){
                    resulttv.text = longresult.toString()
                }
                else{

                    resulttv.text = result.toString()
                }
            }
            catch (e:Exception){
              Log.d("Exception", "message:"+e.message)
            }
        }

        //clear
        btnac.setOnClickListener{
            inputtv.text=""
            resulttv.text=""
        }
        btnback.setOnClickListener{
            val string = inputtv.text.toString()

            if(string.isNotEmpty()){
                inputtv.text = string.substring(0,string.length-1)
            }
            resulttv.text=""
        }

    }


}

