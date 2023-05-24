package com.example.odontologia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView

class MyPdfView : AppCompatActivity() {

    private lateinit var pdfView: PDFView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_pdf_view)

        //lista de pdfs a serem abertos
        //carregarPdf()
        carregarPdf2()
        //carregarPdf3()

    }

    //Logica para ler o PDF
    //Fazer logica para pegar outros tipos de livros, usar
    // o putStrings da Intent, passar valor do livro e numero do index

//    private fun carregarPdf() {
//        val pagina = intent.getIntExtra("PDF",1)
//        pdfView = findViewById(R.id.pdfView)
//        pdfView.fromAsset("como vencer o medo.pdf").defaultPage(pagina).load()
//    }


    //val etica1 = intent.getIntExtra("etica",1) // pdf 01
    private fun carregarPdf2() {

        val pagina = intent.getIntExtra("pode", 1) // 01
//        val pagina1 = intent.getIntExtra("PDF",5) // PHP
//        val pagina2 = intent.getIntExtra("PDF",0) // PHP

        //logica funciona para abrir as paginas.
        if (pagina == 1) {
            pdfView = findViewById(R.id.pdfView)
            pdfView.fromAsset("Dentista pode .pdf").defaultPage(0).load()

        }
//
//        else if(pagina == 10){
//            pdfView = findViewById(R.id.pdfView)
//            pdfView.fromAsset("como vencer o medo.pdf").defaultPage(pagina).load()
//        }
//
//        else if (pagina2 == 0){
//            pdfView = findViewById(R.id.pdfView)
//            pdfView.fromAsset("Android para dispositivos moveis.pdf").defaultPage(pagina2).load()
//        }

//        when(pagina){
//            5 -> {
//                pdfView = findViewById(R.id.pdfView)
//                pdfView.fromAsset("como vencer o medo.pdf").defaultPage(pagina).load()
//            }
//            10 -> {
//                pdfView = findViewById(R.id.pdfView)
//                pdfView.fromAsset("como vencer o medo.pdf").defaultPage(pagina).load()
//            }
//        }
            //logica para abrir outra pagina no pdf

            //aqui é aberto o pdf de etica odontologica
    }
}


//    private fun carregarPdf3() {
//        val pagina = intent.getIntExtra("C",0)
//        pdfView = findViewById(R.id.pdfView)
//        pdfView.fromAsset("como vencer o medo.pdf").defaultPage(pagina).load()
//    }
