package com.john.islamiandroid.UI.Home.Tabs.Hadeth

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.john.islamiandroid.Models.Hadeth
import com.john.islamiandroid.databinding.HadethItemBinding

class HadetItemsListRecyclerViewAdapter(private var hadethList: MutableList<Hadeth>) : RecyclerView.Adapter<HadetItemsListRecyclerViewViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): HadetItemsListRecyclerViewViewHolder {
        return HadetItemsListRecyclerViewViewHolder(
            HadethItemBinding.inflate(LayoutInflater.from(parent.context), parent ,false)
        )
    }

    override fun getItemCount(): Int {
        return hadethList.size
    }

    override fun onBindViewHolder(holder: HadetItemsListRecyclerViewViewHolder, position: Int) {
        holder.bind(hadethList[position])
        onItemClickListener.let {
            holder.itemView.setOnClickListener{
                onItemClickListener.onItemClick(hadethList[position])
            }
        }
    }
    lateinit var onItemClickListener:OnItemClickListener
    fun interface OnItemClickListener{
        fun onItemClick(hadeth: Hadeth)
    }

}