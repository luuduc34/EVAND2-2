package com.technifutur.evand2_2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.technifutur.evand2_2.databinding.ShoppinglistBinding

class ListAdapter(private var food: List<Food>): RecyclerView.Adapter<ListViewHolder>() {
    private lateinit var binding: ShoppinglistBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        binding = ShoppinglistBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(food[position])
    }

    override fun getItemCount(): Int {
        return food.size
    }
}