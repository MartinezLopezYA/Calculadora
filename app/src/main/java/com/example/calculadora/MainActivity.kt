package com.example.calculadora

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputUno = findViewById<EditText>(R.id.inputUno)
        val inputDos = findViewById<EditText>(R.id.inputDos)
        val btnSumar = findViewById<Button>(R.id.btnSumar)
        val btnRestar = findViewById<Button>(R.id.btnRestar)
        val btnMultiplicar = findViewById<Button>(R.id.btnMultiplicar)
        val btnDividir = findViewById<Button>(R.id.btnDividir)
        val btnNext = findViewById<Button>(R.id.btnNext)

        fun reiniciarValores(){
            inputUno.setText("")
            inputDos.setText("")
            inputUno.requestFocus()
        }

        btnSumar.setOnClickListener(View.OnClickListener {

            val x = inputUno.text.toString()
            val y = inputDos.text.toString()
            Toast.makeText(this, "La suma es: ${x.toInt()+y.toInt()}", Toast.LENGTH_LONG).show()
            reiniciarValores()

        })

        btnRestar.setOnClickListener(View.OnClickListener {

            val a = inputUno.text.toString()
            val b = inputDos.text.toString()
            Toast.makeText(this, "La resta es: ${a.toInt()-b.toInt()}", Toast.LENGTH_LONG).show()
            reiniciarValores()

        })

        btnMultiplicar.setOnClickListener(View.OnClickListener {

            val m = inputUno.text.toString()
            val n = inputDos.text.toString()
            Toast.makeText(this, "El producto es: ${m.toInt()*n.toInt()}", Toast.LENGTH_LONG).show()
            reiniciarValores()

        })

        btnDividir.setOnClickListener(View.OnClickListener {

            val i = inputUno.text.toString()
            val j = inputDos.text.toString()

            val x = i.toDouble()
            val y = j.toDouble()

            if (y == 0.0){
                Toast.makeText(this, "No es posible dividir entre 0", Toast.LENGTH_LONG).show()
                reiniciarValores()
            }else{
                Toast.makeText(this, "La división es: ${x/y}", Toast.LENGTH_LONG).show()
                reiniciarValores()
            }

        })

        btnNext.setOnClickListener(View.OnClickListener {

            val intent: Intent = Intent(this, Trigonometria::class.java)
            startActivity(intent)

        })

    }
}