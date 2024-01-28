package com.john.islamiandroid.VersesRecyclerView

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import com.john.islamiandroid.databinding.VerseItemBinding

class VersesRecyclerViewViewHolder(private var itemBinding: VerseItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {

    @SuppressLint("SetTextI18n")
    fun bind(verse:String, position:Int){
        itemBinding.verseContent.text = "( $position )$verse"
    }

}