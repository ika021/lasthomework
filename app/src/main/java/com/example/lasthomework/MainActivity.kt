package com.example.lasthomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.lasthomework.adapter.page
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var TAB: TabLayout
    private lateinit var view: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TAB = findViewById(R.id.TAB)
        view = findViewById(R.id.view)
        view.adapter = page(this)
        TabLayoutMediator(TAB, view){TAB, position ->
            when (position){
                0 -> {
                    TAB.text = "1"
                }
                1 -> {
                    TAB.text = "2"
                }
                2 -> {
                    TAB.text = "3"
                }
            }
        }.attach()
    }
}