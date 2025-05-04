package com.example.android_mug_pupilica_odev_4_calisma_yapisi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_mug_pupilica_odev_4_calisma_yapisi.databinding.FragmentXSayfasiBinding
import com.example.android_mug_pupilica_odev_4_calisma_yapisi.databinding.FragmentYSayfasiBinding

class YSayfasiFragment : Fragment() {
    private lateinit var binding: FragmentYSayfasiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentYSayfasiBinding.inflate(inflater, container, false)
        return binding.root
    }

}