package com.john.islamiandroid.UI.Home.Tabs.Hadeth

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.john.islamiandroid.databinding.HadethItemBinding
import com.john.islamiandroid.databinding.SuraVerseItemBinding

class HadetItemsListRecyclerViewViewHolder(private var hadethItemBinding:HadethItemBinding) : RecyclerView.ViewHolder(hadethItemBinding.root) {

    fun bind(hadethTitle:String){
        hadethItemBinding.hadethName.text = hadethTitle
    }

}