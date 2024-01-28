package com.john.islamiandroid.VersesRecyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.john.islamiandroid.databinding.VerseItemBinding

class VersesRecyclerViewAdapter(private var verses:List<String>) : RecyclerView.Adapter<VersesRecyclerViewViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VersesRecyclerViewViewHolder {
        return VersesRecyclerViewViewHolder(
            VerseItemBinding.inflate(LayoutInflater.from(parent.context), parent , false)
        )
    }

    override fun getItemCount(): Int {
        return verses.size
    }

    override fun onBindViewHolder(holder: VersesRecyclerViewViewHolder, position: Int) {
        holder.bind(verses[position] , position+1)
    }
}