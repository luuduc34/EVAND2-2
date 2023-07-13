package com.technifutur.evand2_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.technifutur.evand2_2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
var shoppingList = mutableListOf<Food>(

)

    companion object {
        const val FRAGMENT_RESULT = "FRAGMENT_RESULT"
        const val INTITULE = "FIRST"
        const val QUANTITE = "SECOND"
        const val TYPE = "THIRD"
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
/*
        if (shoppingList == null){
            binding.noItemText.visibility = View.INVISIBLE
        }*/
        setFragmentResultListener(FRAGMENT_RESULT) { key, bundle ->
            val stringResult = bundle.getString(INTITULE).toString()
            val stringResult2 = bundle.getString(QUANTITE).toString()
            val stringResult3 = bundle.getString(TYPE).toString()
            //shoppingList.add(Food(stringResult, stringResult2, stringResult3))
        }
        binding.ajouterButton.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToAddFragment())
        }
        setupRecyclerView()

    }
    private fun setupRecyclerView() {
        val recyclerView = binding?.shoppingListRecyclerView
        recyclerView?.layoutManager = LinearLayoutManager(
            activity, LinearLayoutManager.VERTICAL, false
        )
        recyclerView?.adapter = ListAdapter(shoppingList)
    }
}