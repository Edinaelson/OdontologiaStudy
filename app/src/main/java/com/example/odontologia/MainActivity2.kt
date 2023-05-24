package com.example.odontologia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.odontologia.adapters.AlphaAdapters
import com.example.odontologia.model.AlphaChar

class MainActivity2 : AppCompatActivity() {

    private var recyclerView:RecyclerView ? = null
    private var gridLayoutManager:GridLayoutManager ? = null
    private var arrayList:ArrayList<AlphaChar> ? = null
    private var alphaAdapters:AlphaAdapters ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //logica para povoar os cardview de gridLayout
        recyclerView = findViewById(R.id.my_recycler_view)
        gridLayoutManager = GridLayoutManager(applicationContext,3,LinearLayoutManager.VERTICAL,false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList()
        alphaAdapters = AlphaAdapters(applicationContext, arrayList!!)
        recyclerView?.adapter = alphaAdapters

        //botao voltar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.back) // Defina o novo ícone de voltar
        }

    }

    //funcao do botao voltar
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }



    private fun setDataInList() : ArrayList<AlphaChar>{
        var items:ArrayList<AlphaChar> = ArrayList()

        //Aqui fica o povoamento do gridÇayout

        items.add(AlphaChar(R.drawable.etica01, "Origem do código de ética")) //01
        items.add(AlphaChar(R.drawable.etica02, "importância do código de ética")) //02
        items.add(AlphaChar(R.drawable.etica03, "Ética em relação a cobrança de honorários profissionais")) //03
        items.add(AlphaChar(R.drawable.etica04, "Pontos considerados como fraude pelo Código de Ética")) //04
        items.add(AlphaChar(R.drawable.etica05, "Ética com relação a presença na internet")) //05
        items.add(AlphaChar(R.drawable.etica06, "Ética em relação ao sigilo profissional")) //06
        items.add(AlphaChar(R.drawable.eticaimg07, "Ética em relação as especialidades odontológicas")) //07
        items.add(AlphaChar(R.drawable.etica08, "Ética na relação com o paciente")) //08
        items.add(AlphaChar(R.drawable.etica10, "Ética em relação as estratégias de marketing")) //09
        items.add(AlphaChar(R.drawable.etica11, "Sanções para quem não cumpre o código de ética")) //10
        items.add(AlphaChar(R.drawable.etica12, "Código de ética -CFO")) //11

        return items
    }

}