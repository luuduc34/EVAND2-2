package com.technifutur.evand2_2

import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.technifutur.evand2_2.databinding.ShoppinglistBinding

class ListViewHolder(private var viewBinding:ShoppinglistBinding) : RecyclerView.ViewHolder(viewBinding.root){
    fun bind(food: Food) {
        viewBinding.intituleText.text = food.intitule
        viewBinding.quantiteText.text = food.quantite
        //viewBinding.imageView.setImageDrawable(R.drawable.food)
    }
}