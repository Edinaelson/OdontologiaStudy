package com.example.odontologia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.odontologia.databinding.ActivityRecyclerViewBinding

class RecyclerView2 : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()

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

    private fun initRecyclerView(){
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = Adapter(choice()){ name ->
            Toast.makeText(this,name, Toast.LENGTH_SHORT).show()
        }
    }

    private fun choice(): List<String>{
        val pagina = intent.getIntExtra("lista",2)
        if (pagina == 2){
            return listOf(
                "1-Acupuntura",
                "2-Cirurgia e Traumatologia Bucomaxilofaciais",
                "3-Dentística",
                "4-Disfunção Temporomandibular e Dor Orofacial",
                "5-Endodontia",
                "6-Estomatologia",
                "7-Harmonização orofacial",
                "8-Homeopatia",
                "9-Implantodontia",
                "10-Odontogeriatria",
                "11-Odontologia do Esporte",
                "12-Odontologia do Trabalho",
                "13-Odontologia Legal",
                "14-Odontologia para Pacientes com Necessidades Especiais",
                "15-Odontopediatria",
                "16-Ortodontia",
                "17-Ortopedia Funcional dos Maxilares",
                "18-Patologia Oral e Maxilofacial",
                "19-Periodontia",
                "20-Prótese Bucomaxilofacial",
                "21-Prótese Dentária",
                "22-Radiologia Odontológica e Imaginologia",
                "23-Saúde Coletiva"
            )
        }
//        val pagina2 = intent.getIntExtra("Livro4",5)
//        if (pagina2 == 5){
//            return listOf(
//                "Python",
//                "Object-C",
//                "Swift",
//                "pagina 01"
//            )
//        }
        return emptyList() // Se nenhum dos blocos anteriores for executado, retorna uma lista vazia
    }

//    private fun getList() = listOf(
//        "Java",
//        "PHP",
//        "SQL",
//        "C++",
//        "CSharp",
//        "Kotlin",
//        "Python",
//        "Object-C",
//        "Swift"
//    )

}