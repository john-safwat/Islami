package com.john.islamiandroid.UI.Home.Tabs.Hadeth

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.john.islamiandroid.Models.Hadeth
import com.john.islamiandroid.databinding.HadethItemBinding

class HadetItemsListRecyclerViewViewHolder(private var hadethItemBinding:HadethItemBinding) : RecyclerView.ViewHolder(hadethItemBinding.root) {

    fun bind(hadethTitle: Hadeth){
        hadethItemBinding.hadethName.text = hadethTitle.title
    }

}