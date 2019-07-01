package com.mukireus.antrenmanlarlamat

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val first = Random.nextInt(0, 10)
        val second = Random.nextInt(0, 10)
        var operator: String = "+"
        val operatorRandom = Random.nextInt(0, 3)
        var result: Int = 0
        var score: Int = 0
        var sonuc: Int = 0

        val txtFirst: TextView = findViewById(R.id.txtFirst) as TextView
        val txtSecond: TextView = findViewById(R.id.txtSecond) as TextView
        val txtOperator: TextView = findViewById(R.id.txtOperator) as TextView
        val txtScore: TextView = findViewById(R.id.txtScore) as TextView
        val edtAnswer: EditText = findViewById(R.id.edtAnswer) as EditText
        val btnSubmit: Button = findViewById(R.id.btnSubmit) as Button

        when (operatorRandom) {
            0 -> operator = "+"
            1 -> operator = "-"
            2 -> operator = "*"
            3 -> operator = "/"
        }

        when (operatorRandom) {
            0 -> result = first + second
            1 -> result = first - second
            2 -> result = first * second
            3 -> result = first / second
        }

        txtFirst.text = first.toString()
        txtSecond.text = second.toString()
        txtOperator.text = operator.toString()
        sonuc = result
        txtScore.text = score.toString()
        btnSubmit.setOnClickListener {
            if (edtAnswer.text.toString().toInt() == sonuc) {
                // TODO Skor yapılacak.
                // TODO Zorluk seçimi yapılaacak
                finish();
                startActivity(getIntent());
            } else Toast.makeText(this@MainActivity, "Cevabınız Yanlış. Lütfen kontrol ediniz.", Toast.LENGTH_SHORT).show()
        }
    }

}
