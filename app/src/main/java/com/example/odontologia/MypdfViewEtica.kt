package com.example.odontologia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class MypdfViewEtica : AppCompatActivity() {

    private lateinit var pdfView: PDFView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypdf_view_etica)

        carregarPdfEtica()

    }

    fun carregarPdfEtica(){
        //logica gridLayout 01 etica odontologica
        val etica1 = intent.getIntExtra("etica",1) // pdf 01
        val etica2 = intent.getIntExtra("etica",2) // pdf 02
        val etica3 = intent.getIntExtra("etica",3) // pdf 03
        val etica4 = intent.getIntExtra("etica",4) // pdf 04
        val etica5 = intent.getIntExtra("etica",5) // pdf 05
        val etica6 = intent.getIntExtra("etica",6) // pdf 06
        val etica7 = intent.getIntExtra("etica",7) // pdf 07
        val etica8 = intent.getIntExtra("etica",8) // pdf 08
        val etica9 = intent.getIntExtra("etica",9) // pdf 09
        val etica10 = intent.getIntExtra("etica",10) // pdf 10
        val etica11 = intent.getIntExtra("etica",10) // pdf 10

        if(etica1 == 1){
            pdfView = findViewById(R.id.pdfView2)
            pdfView.fromAsset("Origem do código de ética odontológico-1.pdf").defaultPage(0).load()
        }

        else if(etica2 == 2){
            pdfView = findViewById(R.id.pdfView2)
            pdfView.fromAsset("Origem do código de ética odontológico-2.pdf").defaultPage(0).load()
        }

        else if(etica3 == 3){
            pdfView = findViewById(R.id.pdfView2)
            pdfView.fromAsset("Origem do código de ética odontológico-3.pdf").defaultPage(0).load()
        }

        else if(etica4 == 4){
            pdfView = findViewById(R.id.pdfView2)
            pdfView.fromAsset("Origem do código de ética odontológico atualizada-4.pdf").defaultPage(0).load()
        }

        else if(etica5 == 5){
            pdfView = findViewById(R.id.pdfView2)
            pdfView.fromAsset("Origem do código de ética odontológico 123-5.pdf").defaultPage(0).load()
        }

        else if(etica6 == 6){
            pdfView = findViewById(R.id.pdfView2)
            pdfView.fromAsset("Origem do código de ética odontológico 123-6.pdf").defaultPage(0).load()
        }

        else if(etica7 == 7){
            pdfView = findViewById(R.id.pdfView2)
            pdfView.fromAsset("Origem do código de ética odontológico 123-7.pdf").defaultPage(0).load()
        }

        else if(etica8 == 8){
            pdfView = findViewById(R.id.pdfView2)
            pdfView.fromAsset("Origem do código de ética odontológico 123-8.pdf").defaultPage(0).load()
        }

        else if(etica9 == 9){
            pdfView = findViewById(R.id.pdfView2)
            pdfView.fromAsset("Origem do código de ética odontológico 123-9-10.pdf").defaultPage(0).load()
        }

        else if(etica10 == 10){
            pdfView = findViewById(R.id.pdfView2)
            pdfView.fromAsset("Origem do código de ética odontológico 123-11.pdf").defaultPage(0).load()
        }

        else if(etica11 == 11){
            pdfView = findViewById(R.id.pdfView2)
            pdfView.fromAsset("codigo_etica12.pdf").defaultPage(0).load()
        }

    }

}