package com.example.calculadora

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import kotlin.math.*

class Trigonometria: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trigonometria)

        val inputDato = findViewById<EditText>(R.id.inputDato)
        val rbSeno = findViewById<RadioButton>(R.id.rbSeno)
        val rbCoseno = findViewById<RadioButton>(R.id.rbCoseno)
        val rbTan = findViewById<RadioButton>(R.id.rbTangente)
        val rbRaiz = findViewById<RadioButton>(R.id.rbRaiz)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val btnBack = findViewById<Button>(R.id.btnBack)

        fun reiniciarValores(){
            inputDato.setText("")
        }

        btnCalcular.setOnClickListener(View.OnClickListener {


            val x = inputDato.text.toString()
            if (x.equals("")){
                Toast.makeText(this, "Faltan campos", Toast.LENGTH_LONG).show()
            }else {
                if(!rbCoseno.isChecked && !rbSeno.isChecked && !rbTan.isChecked && !rbRaiz.isChecked){
                    Toast.makeText(this, "No ha seleccionado ninguna acción", Toast.LENGTH_LONG).show()
                }else {
                    if (rbSeno.isChecked) {
                        Toast.makeText(this, "El seno es: ${sin(x.toDouble())}", Toast.LENGTH_LONG)
                            .show()
                        reiniciarValores()
                    } else if (rbCoseno.isChecked) {
                        Toast.makeText(this, "El seno es: ${cos(x.toDouble())}", Toast.LENGTH_LONG)
                            .show()
                        reiniciarValores()
                    } else if (rbTan.isChecked) {
                        Toast.makeText(this, "El seno es: ${tan(x.toDouble())}", Toast.LENGTH_LONG)
                            .show()
                        reiniciarValores()
                    } else if (rbRaiz.isChecked) {
                        Toast.makeText(this, "El seno es: ${sqrt(x.toDouble())}", Toast.LENGTH_LONG)
                            .show()
                        reiniciarValores()
                    }
                }
            }

        })

        btnBack.setOnClickListener(View.OnClickListener {

            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        })

    }
}