package com.example.kaizomoveodds.ui.theme

import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

fun typeColor(type:String):Pair<Color,Color>{
    when(type){
        "BUG" -> return Pair(Color(0xFFa8b821),Color.White)
        "DARK" -> return Pair(Color(0xFF01010a),Color.White)
        "DRAGON" -> return Pair(Color(0xFF060080),Color.White)
        "Electric" -> return Pair(Color.Yellow,Color.Black)
        "FIGHT" -> return Pair(Color(0xFF5e1106),Color.White)
        "FIRE" -> return Pair(Color.Red,Color.White)
        "FLYING" -> return Pair(Color(0xFF9aa8ed),Color.White)
        "GHOST" -> return Pair(Color(0xFF312f59),Color.White)
        "GRASS" -> return Pair(Color(0xFF42ed48),Color.Black)
        "GROUND" -> return Pair(Color(0xFFf2e088),Color.Black)
        "ICE" -> return Pair(Color(0xFF88f0f2),Color.Black)
        "NORMAL" -> return Pair(Color(0xFF9c9a87),Color.White)
        "POISON" -> return Pair(Color(0xFF9a12b5),Color.White)
        "PSYCHIC" -> return Pair(Color(0xFFf05696),Color.White)
        "ROCK" -> return Pair(Color(0xFFcf9242),Color.White)
        "STEEL" -> return Pair(Color(0xFF71797E),Color.White)
        "WATER" -> return Pair(Color(0xFF267ebd),Color.White)
        else -> return Pair(Color.White,Color.Black)
    }
}