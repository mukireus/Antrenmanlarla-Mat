package com.mukireus.antrenmanlarlamat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val first = Random.nextInt(0,10)
        val second = Random.nextInt(0,10)
        var operator : String = "+"
        val operatorRandom = Random.nextInt(0, 3)
        var result: Int = 0
        var score: Int = 0
        when(operatorRandom){
            0 -> operator = "+"
            1 -> operator = "-"
            2 -> operator = "*"
            3 -> operator = "/"
        }

        when(operatorRandom){
            0 -> result = first + second
            1 -> result = first - second
            2 -> result = first * second
            3 -> result = first / second
        }


        val txtFirst: TextView = findViewById(R.id.txtFirst) as TextView
            txtFirst.text = first.toString()

        val txtSecond: TextView = findViewById(R.id.txtSecond) as TextView
            txtSecond.text = second.toString()

        val txtOperator: TextView = findViewById(R.id.txtOperator) as TextView
            txtOperator.text = operator.toString()

        val txtScore: TextView = findViewById(R.id.txtScore) as TextView
            txtScore.text = score.toString()

        val edtAnswer: EditText = findViewById(R.id.edtAnswer) as EditText

        val btnSubmit: Button = findViewById(R.id.btnSubmit) as Button
            btnSubmit.setOnClickListener {
                if((edtAnswer.text.toString().toInt()) == result){
                    finish();
                    startActivity(getIntent());
                    score++
                }
                else
                    edtAnswer.hint = "Cevap yanlış"

            }
    }
}
