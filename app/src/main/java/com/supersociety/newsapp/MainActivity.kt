package com.supersociety.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.supersociety.newsapp.fragments.HomeFragment
import com.supersociety.newsapp.fragments.NewsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun changeFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
    }

    fun selectMenu(view: View){

        changeFragment(when(view.id){
            R.id.btnHome -> HomeFragment()
            R.id.btnNews -> NewsFragment()
            else -> HomeFragment()
        })

    }
}
