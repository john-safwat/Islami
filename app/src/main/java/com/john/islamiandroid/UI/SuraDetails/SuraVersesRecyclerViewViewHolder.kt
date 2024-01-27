package com.john.islamiandroid.UI.SuraDetails

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.john.islamiandroid.R

class SuraVersesRecyclerViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private var verseContent :TextView = itemView.findViewById(R.id.verse_content)

    @SuppressLint("SetTextI18n")
    fun bind(verse:String, position:Int){
        verseContent.text = "( $position )$verse"
    }

}