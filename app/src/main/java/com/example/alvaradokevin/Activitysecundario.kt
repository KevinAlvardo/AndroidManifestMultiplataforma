package com.example.alvaradokevin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Activitysecundario : AppCompatActivity() {
    private lateinit var botonAtras: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitysecundario)
        botonAtras= findViewById(R.id.btn_volver)
        botonAtras.setOnClickListener{
            finish()
        }
    }
}