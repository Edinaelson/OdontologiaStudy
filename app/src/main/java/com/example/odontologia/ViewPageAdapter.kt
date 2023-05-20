package com.example.odontologia

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.odontologia.fragments.FistFragment
import com.example.odontologia.fragments.SecondFragment

class ViewPageAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0->{
                FistFragment()
            }
            1->{
                SecondFragment()
            }
            else ->{
                Fragment()
            }
        }
    }
}