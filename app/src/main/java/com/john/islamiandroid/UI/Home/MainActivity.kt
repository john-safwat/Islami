package com.john.islamiandroid.UI.Home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.john.islamiandroid.R
import com.john.islamiandroid.UI.Home.Tabs.Hadeth.HadethFragment
import com.john.islamiandroid.UI.Home.Tabs.Quran.QuranFragment
import com.john.islamiandroid.UI.Home.Tabs.Radio.RadioFragment
import com.john.islamiandroid.UI.Home.Tabs.Sebha.SebhaFragment
import com.john.islamiandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // function to set the selected fragment in the screen
        setFragment()
    }

    // function to set the selected fragment from the selected id in the bottom navigation bar
    private fun setFragment() {
        // this line is to change the selected fragment by pushing the fragment based on the change in the bottom navigation bar selected item
        binding.homeScreenContent.bottomNavigationBar.setOnItemSelectedListener { item ->
            pushFragment(
                when (item.itemId) {
                    R.id.navigation_radio -> {
                        RadioFragment()
                    }

                    R.id.navigation_quran -> {
                        QuranFragment()
                    }

                    R.id.navigation_hades -> {
                        HadethFragment()
                    }

                    R.id.navigation_sebha -> {
                        SebhaFragment()
                    }

                    else -> QuranFragment()
                }
            )
            true
        }

        binding.homeScreenContent.bottomNavigationBar.selectedItemId = R.id.navigation_quran
    }

    // function to push fragment in the screen
    private fun pushFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment).commit()
    }

}