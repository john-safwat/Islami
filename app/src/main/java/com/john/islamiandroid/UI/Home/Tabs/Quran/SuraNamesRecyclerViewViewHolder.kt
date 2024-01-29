package com.john.islamiandroid.UI.Home.Tabs.Quran

import androidx.recyclerview.widget.RecyclerView
import com.john.islamiandroid.databinding.QuranSuraItemBinding

class SuraNamesRecyclerViewViewHolder(private val itemBinding: QuranSuraItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {


    fun bind(name :String , number:String){

        itemBinding.suraName.text = name
        itemBinding.ayasNumber.text = number

    }

}