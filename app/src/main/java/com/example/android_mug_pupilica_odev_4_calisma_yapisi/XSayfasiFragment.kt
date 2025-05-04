package com.example.android_mug_pupilica_odev_4_calisma_yapisi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.android_mug_pupilica_odev_4_calisma_yapisi.databinding.FragmentBSayfasiBinding
import com.example.android_mug_pupilica_odev_4_calisma_yapisi.databinding.FragmentXSayfasiBinding

class XSayfasiFragment : Fragment() {
    private lateinit var binding: FragmentXSayfasiBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentXSayfasiBinding.inflate(inflater, container, false)
        binding.button5.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.XSayfasindanYSayfasinaGecis)
        }
        return binding.root
    }

}