package com.example.android_mug_pupilica_odev_4_calisma_yapisi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.android_mug_pupilica_odev_4_calisma_yapisi.databinding.FragmentASayfasiBinding
import com.example.android_mug_pupilica_odev_4_calisma_yapisi.databinding.FragmentAnaSayfaBinding

class ASayfasiFragment : Fragment() {
    private lateinit var binding: FragmentASayfasiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentASayfasiBinding.inflate(inflater, container, false)
        binding.button3.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.ASayfasindanBSayfasinaGecis)
        }
        return binding.root
    }

}