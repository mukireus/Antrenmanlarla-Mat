package com.mukireus.antrenmanlarlamat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val first = Random.nextInt(0,10)
        val second = Random.nextInt(0,10)
        var operator : String = ""
        val operatorRandom = Random.nextInt(0, 3)


        when(operatorRandom){
          0 -> operator = "+"
          1 -> operator = "-"
          2 -> operator = "*"
          3 -> operator = "/"
        }

        val txtFirst: TextView = findViewById(R.id.txtFirst) as TextView
            txtFirst.text = first.toString()

        val txtSecond: TextView = findViewById(R.id.txtSecond) as TextView
            txtSecond.text = second.toString()

        val txtOperator: TextView = findViewById(R.id.txtOperator) as TextView
            txtOperator.text = operator.toString()








    }
}
