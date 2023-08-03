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

@Composable
fun Test() {
    Column(Modifier.fillMaxSize()) {
        Column(
            Modifier
                .heightIn(100.dp)
                .verticalScroll(rememberScrollState())) {
            Text(text = "Hello")
        }

        LazyVerticalGrid(columns = GridCells.Fixed(3)){
            items(movesArray.size){
                    index ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = false,
                        onClick = {

                        }
                    )
                    Text(text = movesArray[index].name, modifier = Modifier.padding(start = 8.dp))
                }
            }
        }
    }
}