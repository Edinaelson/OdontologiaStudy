package com.example.odontologia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.odontologia.databinding.ActivityRecyclerViewBinding

class RecyclerView : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
    }

    private fun initRecyclerView(){
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = Adapter(getList()){ name ->
            Toast.makeText(this,name,Toast.LENGTH_SHORT).show()
        }
    }

    private fun getList() = listOf(
        "Java",
        "PHP",
        "SQL",
        "C++",
        "CSharp",
        "Kotlin",
        "Python",
        "Object-C",
        "Swift",
        "GO",
        "JavaScript",
        "Mysql",
        "SpringBoot",
        "Maven",
        "Android",
        "IOS",
        "Intellj",
        "Android Studio"
    )

}