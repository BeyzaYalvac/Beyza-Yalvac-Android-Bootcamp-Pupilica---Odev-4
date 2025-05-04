package com.example.android_mug_pupilica_odev_4_calisma_yapisi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.android_mug_pupilica_odev_4_calisma_yapisi.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {
private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentAnaSayfaBinding.inflate(inflater, container, false)
        binding.buttonAnaSayfadanAya.setOnClickListener{
          Navigation.findNavController(it).navigate(R.id.anasayfadanASayfasinaGecis)
        }

        binding.buttonAnaSayfadanXe.setOnClickListener{
          Navigation.findNavController(it).navigate(R.id.anasayfadanXSayfasinaGecis)
        }
        return binding.root
    }

}