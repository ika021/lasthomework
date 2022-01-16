package com.example.lasthomework.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.lasthomework.fragments.FirstFragment
import com.example.lasthomework.fragments.SecondFragment
import com.example.lasthomework.fragments.ThirdFragment

class page(activity:AppCompatActivity) :FragmentStateAdapter(activity) {
    override fun getItemCount() = 3



    override fun createFragment(position: Int): Fragment {
        when (position){
            0 -> {
                return FirstFragment()
            }
            1 -> {
                return SecondFragment()
            }
            else -> {
                return ThirdFragment()
            }
        }
    }
}