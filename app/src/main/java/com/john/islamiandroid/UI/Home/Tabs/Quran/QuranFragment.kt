package com.john.islamiandroid.UI.Home.Tabs.Quran

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.john.islamiandroid.databinding.FragmentQuranBinding

class QuranFragment : Fragment() {

    private lateinit var binding:FragmentQuranBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuranBinding.inflate(inflater , container , false )
        return binding.root
    }

}