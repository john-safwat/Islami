package com.john.islamiandroid.UI.Home.Tabs.Hadeth

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.john.islamiandroid.databinding.HadethItemBinding
import com.john.islamiandroid.databinding.SuraVerseItemBinding

class HadetItemsListRecyclerViewAdapter(private var hadethNumberList: MutableList<String>) : RecyclerView.Adapter<HadetItemsListRecyclerViewViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): HadetItemsListRecyclerViewViewHolder {
        return HadetItemsListRecyclerViewViewHolder(
            HadethItemBinding.inflate(LayoutInflater.from(parent.context), parent ,false)
        )
    }

    override fun getItemCount(): Int {
        return hadethNumberList.size
    }

    override fun onBindViewHolder(holder: HadetItemsListRecyclerViewViewHolder, position: Int) {
        holder.bind(hadethNumberList[position])
    }
}