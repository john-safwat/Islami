package com.john.islamiandroid.UI.HadethDetails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.john.islamiandroid.Constants
import com.john.islamiandroid.Models.Hadeth
import com.john.islamiandroid.VersesRecyclerView.VersesRecyclerViewAdapter
import com.john.islamiandroid.databinding.ActivityHadethDetailsBinding

class HadethDetailsActivity : AppCompatActivity() {

    private lateinit var viewBinding : ActivityHadethDetailsBinding
    private lateinit var adapter :VersesRecyclerViewAdapter
    lateinit var hadeth:Hadeth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityHadethDetailsBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        initViewData()
        setBackButton()
    }

    private fun initViewData() {
        hadeth = intent.getParcelableExtra(Constants.hadeth)!!
        viewBinding.homeScreenContent.hadethDetailsTitle.text = hadeth.title
        adapter = VersesRecyclerViewAdapter(hadeth.content.trim().split("#"))
        viewBinding.homeScreenContent.hadethVersesRecyclerView.adapter = adapter
    }

    private fun setBackButton() {
        setSupportActionBar(viewBinding.hadethDetailsToolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        viewBinding.hadethDetailsToolBar.setNavigationOnClickListener { finish() }
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }


}