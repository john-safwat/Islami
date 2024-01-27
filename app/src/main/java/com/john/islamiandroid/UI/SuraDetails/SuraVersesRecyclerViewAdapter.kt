package com.john.islamiandroid.UI.SuraDetails

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.john.islamiandroid.R

class SuraVersesRecyclerViewAdapter(private var verses:List<String>) : RecyclerView.Adapter<SuraVersesRecyclerViewViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SuraVersesRecyclerViewViewHolder {
        return SuraVersesRecyclerViewViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.sura_verse_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return verses.size
    }

    override fun onBindViewHolder(holder: SuraVersesRecyclerViewViewHolder, position: Int) {
        holder.bind(verses[position] , position+1)
    }
}