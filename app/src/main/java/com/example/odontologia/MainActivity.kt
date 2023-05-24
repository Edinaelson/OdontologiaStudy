package com.example.odontologia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.odontologia.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        val adapter = ViewPageAdapter(supportFragmentManager, lifecycle)
        binding.viewPage.adapter = adapter

        TabLayoutMediator(binding.tabLayout,binding.viewPage){tab,position->
            when(position){
                0->{
                    tab.text="Ética odontológica"
                }
                1->{
                    tab.text="Dúvidas frequentes"
                }
            }
        }.attach()

//        binding.tabLayout.tabMode = TabLayout.MODE_FIXED
//        binding.tabLayout.tabGravity = TabLayout.GRAVITY_CENTER
        //buttonAbout()
    }

    fun buttonFist(view: View) {
        // Ação a ser executada quando o botão for clicado
        // Por exemplo, abrir uma segunda Activity
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

    fun buttonSecond(view: View){
        val intent = Intent(this,MainActivity3::class.java)
        startActivity(intent)
    }


    fun buttonAbout(view: View){
        val intent = Intent(this,About::class.java)
        startActivity(intent)
    }

}
