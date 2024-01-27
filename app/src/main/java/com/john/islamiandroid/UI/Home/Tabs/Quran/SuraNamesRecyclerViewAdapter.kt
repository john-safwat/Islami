package com.john.islamiandroid.UI.Home.Tabs.Quran

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.john.islamiandroid.R

class SuraNamesRecyclerViewAdapter(
    private var names: List<String>,
    private var numbers: List<String>,
) : RecyclerView.Adapter<SuraNamesRecyclerViewViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): SuraNamesRecyclerViewViewHolder {
        return SuraNamesRecyclerViewViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.quran_sura_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return names.size
    }

    override fun onBindViewHolder(holder: SuraNamesRecyclerViewViewHolder, position: Int) {
        holder.bind(names[position] , numbers[position])
        onItemClickListener.let { listener ->
            holder.itemView.setOnClickListener {
                listener.onItemClick(names[position], position)
            }
        }
    }

    fun interface OnItemClickListener {
        fun onItemClick(name:String , position: Int)
    }

    lateinit var onItemClickListener:OnItemClickListener

}
