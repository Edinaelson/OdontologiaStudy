package com.example.odontologia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView

class MyPdfView : AppCompatActivity() {

    private lateinit var pdfView: PDFView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_pdf_view)
        carregarPdf()
    }

    //Logica para ler o PDF
    //Fazer logica para pegar outros tipos de livros, usar
    // o putStrings da Intent, passar valor do livro e numero do index

    private fun carregarPdf() {
        val pagina = intent.getIntExtra("PDF",5)
        pdfView = findViewById(R.id.pdfView)
        pdfView.fromAsset("como vencer o medo.pdf").defaultPage(pagina).load()
    }


}