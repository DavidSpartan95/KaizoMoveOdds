package com.example.kaizomoveodds

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun isPhysical(type:String): Boolean{
    return when(type){
        "BUG" -> true
        "FIGHT" -> true
        "FLYING" -> true
        "GROUND" -> true
        "GHOST" -> true
        "NORMAL" -> true
        "POISON" -> true
        "ROCK" -> true
        "STEEL" -> true
        else -> false
    }

}