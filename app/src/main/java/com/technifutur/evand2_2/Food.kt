package com.technifutur.evand2_2

enum class Type {
    drink,
    food,
    health,
    home
}

data class Food(val intitule:String, val quantite: String, val type: String)
