package com.example.alvaradokevin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button


class MainActivity : AppCompatActivity() {

    private lateinit var btnEjecutar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEjecutar = findViewById(R.id.btn_disparador)
        btnEjecutar.setOnClickListener{
            val intent = Intent(this, Activitysecundario ::class.java)
            startActivity(intent)
        }

    }
}