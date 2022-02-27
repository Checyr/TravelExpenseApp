package com.example.paymentothetrip

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        setContentView(R.layout.activity_main)
        var kmtotal = findViewById<EditText>(R.id.ikmtotal)
        var ilitro = findViewById<EditText>(R.id.ilitro)
        var ikmforlit = findViewById<EditText>(R.id.ikmforlit)
        val btncalcular: TextView = findViewById<Button>(R.id.btncalcular)

        btncalcular.setOnClickListener{
            calcular(kmtotal, ikmforlit, ilitro, )
        }
    }

    @SuppressLint("SetTextI18n")
    private fun calcular(kmtotal: EditText, ikmforlit: EditText, ilitro: EditText) {

        val txtresult = findViewById<TextView>(R.id.txtresult)
        var result: Double = (kmtotal.text.toString().toDouble() / ikmforlit.text.toString().toDouble()) * ilitro.text.toString().toDouble()

        txtresult.text = "R$ $result"

    }
}