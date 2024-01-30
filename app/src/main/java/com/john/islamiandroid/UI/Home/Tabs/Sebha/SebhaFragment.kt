package com.john.islamiandroid.UI.Home.Tabs.Sebha

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.john.islamiandroid.R
import com.john.islamiandroid.databinding.FragmentSebhaBinding

class SebhaFragment : Fragment() {

    private lateinit var binding:FragmentSebhaBinding
    private var count:Int = 0
    private var iterator:Int = 0
    private var angle:Float = 0.0F
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSebhaBinding.inflate(inflater , container , false )
        binding.sebhaBodyImage.setOnClickListener{onSebhaClick()}
        binding.buttonSebha.setOnClickListener{onSebhaClick()}
        return binding.root
    }


    private fun onSebhaClick(){
        angle += 12
        binding.sebhaBodyImage.animate().rotation(angle).setDuration(500).start()
        changeButtonTitle()
        binding.tvTasbehCount.text = count.toString()
    }

    private fun changeButtonTitle() {
        if(count>=33){
            count = 0
            iterator ++
        }
        if(iterator %3 == 0){
            binding.buttonSebha.text = "سبحان الله"
        }else if (iterator %3 == 1){
            binding.buttonSebha.text = "الحمد لله"
        }else if(iterator %3 == 2){
            binding.buttonSebha.text = "الله اكبر"
        }
        count++
    }
}