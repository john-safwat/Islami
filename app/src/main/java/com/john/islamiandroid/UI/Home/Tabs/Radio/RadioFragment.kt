package com.john.islamiandroid.UI.Home.Tabs.Radio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.john.islamiandroid.databinding.FragmentQuranBinding
import com.john.islamiandroid.databinding.FragmentRadioBinding

class RadioFragment : Fragment() {

    private lateinit var binding:FragmentRadioBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRadioBinding.inflate(inflater , container , false )
        return binding.root
    }

}