package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.ArithmeticException

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun boEventoNumero(view: View) {
        if (NuevaOperacion) {
            Display.setText("")
        }

        NuevaOperacion = false

        val boSeleccion = view as Button
        var boClick: String = Display.text.toString()
        when (boSeleccion.id) {
            btn0.id -> {
                boClick += "0"

            }

            btn1.id -> {
                boClick += "1"
            }
            btn2.id -> {
                boClick += "2"
            }
            btn3.id -> {
                boClick += "3"
            }
            btn4.id -> {
                boClick += "4"
            }
            btn5.id -> {
                boClick += "5"
            }
            btn6.id -> {
                boClick += "6"
            }
            btn7.id -> {
                boClick += "7"
            }
            btn8.id -> {
                boClick += "8"
            }
            btn9.id -> {
                boClick += "9"
            }
            btnPunto.id -> {
                boClick += "."
            }
            btnMasoMenos.id -> {
                boClick = "-" + boClick
            }

        }
        Display.setText(boClick)

    }

    var ope = ""
    var NumeroViejo = ""
    var NuevaOperacion = true
    fun boEventoOperaciones(view: View) {
        val boSeleccion = view as Button
        when (boSeleccion.id) {
            btnMultiplicacion.id -> {
                ope = "*"

            }

            btnDivision.id -> {
                ope = "/"
            }

            btnResta.id -> {
                ope = "-"
            }
            btnSuma.id -> {
                ope = "+"

            }

        }

        NumeroViejo = Display.text.toString()
        NuevaOperacion = true
    }

    fun boIgualEvento(view: View) {
        val NuevoNumero = Display.text.toString()
        var NumeroFinal: Double? = null
        when (ope) {

            "*" -> {
                NumeroFinal = NumeroViejo.toDouble() * NuevoNumero.toDouble()

            }

            "/" -> {
                NumeroFinal = NumeroViejo.toDouble() / NuevoNumero.toDouble()


            }

            "-" -> {
                NumeroFinal = NumeroViejo.toDouble() - NuevoNumero.toDouble()

            }

            "+" -> {
                NumeroFinal = NumeroViejo.toDouble() + NuevoNumero.toDouble()

            }

        }



        Display.setText(NumeroFinal.toString())
        NuevaOperacion = true




    }

    fun boPorcentaje(view: View) {
        val Numero: Double = Display.text.toString().toDouble() / 100
        Display.setText(Numero.toString())
        NuevaOperacion = true

    }

    fun boLimpiar(view: View) {
        Display.setText("0")
        NuevaOperacion = true

    }


}


