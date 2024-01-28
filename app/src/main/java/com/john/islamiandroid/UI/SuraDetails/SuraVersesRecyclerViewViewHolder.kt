package com.john.islamiandroid.UI.SuraDetails

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.john.islamiandroid.R
import com.john.islamiandroid.databinding.SuraVerseItemBinding

class SuraVersesRecyclerViewViewHolder(private var itemBinding: SuraVerseItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {

    @SuppressLint("SetTextI18n")
    fun bind(verse:String, position:Int){
        itemBinding.verseContent.text = "( $position )$verse"
    }

}