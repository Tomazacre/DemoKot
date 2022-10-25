package com.wesk.demokot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val build = AlertDialog.Builder(this)

        build.setTitle("Cuestion taim")
        build.setMessage("Le gusta las pizzas Olis?")

        build.setPositiveButton(android.R.string.ok) {
                dialog, wich -> Toast.makeText(this,"Haces bien muchacho",Toast.LENGTH_LONG).show()
        }

        build.setNegativeButton(android.R.string.cancel) {
                dialog, wich -> Toast.makeText(this,"Muy mal que no te gusten muchacho",Toast.LENGTH_LONG).show()
        }

        var aux = findViewById<Button>(R.id.btnPrec)

        aux.setOnClickListener {
            build.show()
        }

    }
}