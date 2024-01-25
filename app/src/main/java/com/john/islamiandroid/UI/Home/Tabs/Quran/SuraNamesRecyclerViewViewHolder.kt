package com.john.islamiandroid.UI.Home.Tabs.Quran

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.john.islamiandroid.R

class SuraNamesRecyclerViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private var name :TextView = itemView.findViewById(R.id.sura_name)
    private var number :TextView = itemView.findViewById(R.id.ayas_number)

    fun bind(name :String , number:String){
        this.name.text = name
        this.number.text = number
    }

}