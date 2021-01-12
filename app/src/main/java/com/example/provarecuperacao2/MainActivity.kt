package com.example.provarecuperacao2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var cont: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cont = findViewById(R.id.cont)
    }
    fun zerar(view:View){
        cont.text = 0.toString()
    }
    fun incrementar(view: View){
        cont.text = ((cont.text.toString().toInt() + 1).toString())
    }
    fun decrementar(view: View){
        cont.text = ((cont.text.toString().toInt() - 1).toString())
    }


}