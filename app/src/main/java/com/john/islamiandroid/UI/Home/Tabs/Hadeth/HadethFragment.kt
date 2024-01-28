package com.john.islamiandroid.UI.Home.Tabs.Hadeth

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.john.islamiandroid.Constants
import com.john.islamiandroid.Models.Hadeth
import com.john.islamiandroid.UI.HadethDetails.HadethDetailsActivity
import com.john.islamiandroid.databinding.FragmentHadethBinding

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
        adapter.onItemClickListener = HadetItemsListRecyclerViewAdapter.OnItemClickListener {
             goToHadethDetails(it)
        }
    }

    private fun goToHadethDetails(hadeth: Hadeth) {
        val intent = Intent(context ,HadethDetailsActivity::class.java )
        intent.putExtra(Constants.hadeth , hadeth)
        startActivity(intent)
    }

    private fun loadHadethNames(): MutableList<Hadeth> {
        val hadethList = mutableListOf<Hadeth>()

        val reader = context?.assets?.open("ahadeeth.txt")?.bufferedReader().use { it?.readText() }
        val hadeths = reader?.trim()?.split("#")
        hadeths?.forEach {
            val lines = it.trim().split("\n")
            val title =  lines [0]
            val newLines = lines.toMutableList().apply { removeAt(0) }
            val content = newLines.joinToString("\n\n")
            hadethList.add(Hadeth(title , content));
        }

        return hadethList

    }

}