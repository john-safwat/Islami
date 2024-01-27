package com.john.islamiandroid.UI.Home.Tabs.Hadeth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.john.islamiandroid.databinding.FragmentHadethBinding
import com.john.islamiandroid.databinding.FragmentQuranBinding

class HadethFragment : Fragment() {

    private lateinit var binding:FragmentHadethBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHadethBinding.inflate(inflater , container , false )
        return binding.root
    }
}