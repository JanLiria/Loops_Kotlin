package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val compra:Array<String> = arrayOf("oli","sal","sucre","pistachos")
        for (Aliments in compra) println(Aliments)
        println("------------")
        val material:Array<String> = arrayOf("llapis","goma","boli")
        for (i in material) println(material[0])
        println("------------")
        for (i in 1..4) println(i)
        println("------------")
        for (x in 1 until 4) println(x)
        println("------------")
        for (y in 0..12 step 3) println(y)
        println("------------")
        for (z in 16 downTo 0 step 4) println(z)
        println("------------")
        var a=5
        while (a>10) {
            println("Educatiu")
            a++
        }
    }
}
        //a l'hora d'executar el programa es veu en l'ordre en el que els loops s'han creat