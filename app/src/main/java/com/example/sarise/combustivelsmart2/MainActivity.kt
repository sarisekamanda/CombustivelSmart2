package com.example.sarise.combustivelsmart2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular (v: View){

        val resposta = txtGasolina.text.toString().toDouble() * 0.7

        if(txtAlcool.text.toString().toDouble() <= resposta) {
            txtResposta.text = ("Abasteça com Gasolina :) O preço máximo do Álcool é: "); resposta.toString()
        }
        else {
            txtResposta.text = ("Abasteça com Gasolina :)") ; txtAlcool.text.toString()
        }
    }
}
