package com.example.geradordefrases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text
import java.lang.Math.random
import java.util.Random

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayOf("Toda conquista começa com a decisão de tentar.",
        "Vai, e se der medo, vai com medo mesmo.",
        "Quando algo ruim acontece você tem três escolhas: deixar isso definir você, deixar isso destruir você ou fazer isso te deixar mais forte.",
        "Você é mais forte do que imagina. Acredite!",
        "Todo esforço tem a sua recompensa.",
        "Por maior que seja, não há obstáculo que não possa ser superado.",
        "Se você quer ser bem-sucedido precisa de dedicação total, buscar seu último limite e dar o melhor de si mesmo",
        "Pessoas vencedoras não são aquelas que não falham, são aquelas que não desistem",
        "O sucesso não tem a ver com o lugar de onde você veio, e sim com a confiança que você tem e o esforço que você está disposto a investir",
        ""

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.tvTexto) as TextView
    }
    fun gerarFrase (view: View){
        val totalItensArray = frases.size
        val numeroAleatorio = Random().nextInt(totalItensArray)

        texto.setText ( frases [numeroAleatorio])
    }
}