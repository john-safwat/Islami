package com.john.islamiandroid.UI.SuraDetails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.john.islamiandroid.Constants
import com.john.islamiandroid.databinding.ActivitySuraDetailsBinding

class SuraDetailsActivity : AppCompatActivity() {

    lateinit var name: String
    private var position: Int = 0
    private lateinit var suraDetailsBinding: ActivitySuraDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityData()
        setContentView(suraDetailsBinding.root)
        setBackButton()
    }

    private fun setBackButton() {
        setSupportActionBar(suraDetailsBinding.suraDetailsToolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        suraDetailsBinding.suraDetailsToolBar.setNavigationOnClickListener { finish() }
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    private fun initActivityData() {
        // get the values from the intent
        position = intent.getIntExtra(Constants.chapterPosition, 0)
        name = intent.getStringExtra(Constants.chapterTitle) ?: ""

        suraDetailsBinding = ActivitySuraDetailsBinding.inflate(layoutInflater)
        suraDetailsBinding.title.text = name
    }

}