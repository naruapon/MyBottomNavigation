package com.example.mybottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mybutoomnavigation.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bt_navigation.setOnNavigationItemSelectedListener(){

            when(it.itemId){
                R.id.nav_home -> {
                    supportFragmentManager.beginTransaction().apply {
                        val fragHome =
                            HomeFragment()
                        replace(R.id.fragment_container,fragHome)
                        commit()
                    }
                    it.setIcon(R.drawable.ic_home_black_24dp).isChecked = true
                    true
                }

                R.id.nav_local_cafe -> {
                    supportFragmentManager.beginTransaction().apply {
                        val fragCafe =
                            CafeFragment()
                        replace(R.id.fragment_container,fragCafe)
                        commit()
                    }
                    it.setIcon(R.drawable.ic_local_cafe_black_24dp).isChecked = true
                }

                R.id.nav_my_location -> {
                    supportFragmentManager.beginTransaction().apply {
                        val fragLocation =
                            MyLocationFragment()
                        replace(R.id.fragment_container,fragLocation)
                        commit()
                    }
                    it.setIcon(R.drawable.ic_my_location_black_24dp).isChecked = true
                    true
                }
            }
            false
        }
        supportFragmentManager.beginTransaction().replace(
            R.id.fragment_container,
            HomeFragment()
        ).commit()
    }


}
