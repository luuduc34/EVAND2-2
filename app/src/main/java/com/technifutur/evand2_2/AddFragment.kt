package com.technifutur.evand2_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResult
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

import com.technifutur.evand2_2.databinding.FragmentAddBinding

class AddFragment : Fragment() {
    private lateinit var binding: FragmentAddBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.enregisterButton.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(HomeFragment.INTITULE, binding.nomText.text.toString())
            bundle.putString(HomeFragment.QUANTITE, binding.numberText.text.toString())
            bundle.putString(HomeFragment.TYPE, binding.typeGroup.toString())
            setFragmentResult(HomeFragment.FRAGMENT_RESULT, bundle)
            findNavController().navigateUp()
        }
        binding.annulerButton.setOnClickListener {
           binding.nomText.text = null
           binding.numberText.text = null
        }

    }
}


