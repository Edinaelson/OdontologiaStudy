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
import com.example.odontologia.adapters.AlphaAdapters2
import com.example.odontologia.model.AlphaChar


class MainActivity3 : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var arrayList:ArrayList<AlphaChar> ? = null
    private var alphaAdapters: AlphaAdapters2? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        //logica para povoar os cardview de gridLayout
        recyclerView = findViewById(R.id.my_recycler_view2)
        gridLayoutManager = GridLayoutManager(applicationContext,3, LinearLayoutManager.VERTICAL,false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList()
        alphaAdapters = AlphaAdapters2(applicationContext, arrayList!!)
        recyclerView?.adapter = alphaAdapters


        //botao voltar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.back) // Defina o novo ícone de voltar
        }

    }

    //funcao botao voltar
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    //aqui onde monta o povoamento
    private fun setDataInList() : ArrayList<AlphaChar>{
        var items:ArrayList<AlphaChar> = ArrayList()

        items.add(AlphaChar(R.drawable.img01, "Imagem 01"))
        items.add(AlphaChar(R.drawable.img02, "Imagem 02"))
        items.add(AlphaChar(R.drawable.img03, "Imagem 03"))
        items.add(AlphaChar(R.drawable.img01, "Repetido 01"))
        items.add(AlphaChar(R.drawable.img02, "Repetido 02"))
        items.add(AlphaChar(R.drawable.img03, "Repetido 03"))
        items.add(AlphaChar(R.drawable.img02, "Hello 02"))
        items.add(AlphaChar(R.drawable.img01, "Hello 01"))
        items.add(AlphaChar(R.drawable.img03, "Hello 03"))
        items.add(AlphaChar(R.drawable.img02, "Hello"))
        items.add(AlphaChar(R.drawable.img01, "Hello"))
        items.add(AlphaChar(R.drawable.img03, "Hello"))

        return items
    }

}