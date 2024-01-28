package com.john.islamiandroid.UI.Home.Tabs.Hadeth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.john.islamiandroid.databinding.FragmentHadethBinding
import com.john.islamiandroid.databinding.FragmentQuranBinding

class HadethFragment : Fragment() {

    private lateinit var binding:FragmentHadethBinding
    private lateinit var adapter: HadetItemsListRecyclerViewAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHadethBinding.inflate(inflater , container , false )
        initRecyclerViewAdapter()
        return binding.root
    }

    private fun initRecyclerViewAdapter() {
        adapter = HadetItemsListRecyclerViewAdapter(loadHadethNames())
        binding.hadethTitleRecyclerView.adapter = adapter
    }

    private fun loadHadethNames(): MutableList<String> {
        var loadStream =

    }

}