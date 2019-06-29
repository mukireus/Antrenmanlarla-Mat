package com.mukireus.antrenmanlarlamat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_select_difficult.*

class SelectDifficultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_difficult)

        btnEasy.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)
        }    }
}
