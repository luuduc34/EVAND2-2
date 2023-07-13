package com.technifutur.evand2_2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

enum class Type {
    drink,
    food,
    health,
    home
}
@Parcelize
data class Food(val intitule:String, val quantite: String, val type: String): Parcelable
