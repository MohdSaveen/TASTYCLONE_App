package com.example.tastycloneapp.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.tastycloneapp.view.fragments.DiscoverFragment
import com.example.tastycloneapp.view.fragments.RecipeFragment
import com.example.tastycloneapp.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private val discoverFragment = DiscoverFragment()
    private val recipeFragment = RecipeFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(discoverFragment)
       bottom_navigation.setOnNavigationItemSelectedListener {
           when(it.itemId){
               R.id.icon_discover -> replaceFragment(discoverFragment)
               R.id.icon_recipe -> replaceFragment(recipeFragment)
           }
           true
       }
    }
    private fun replaceFragment(fragment:Fragment){
        if (fragment!=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainer,fragment)
            transaction.commit()
        }
    }
}