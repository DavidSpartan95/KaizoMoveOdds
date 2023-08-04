package com.example.kaizomoveodds

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.kaizomoveodds.ui.theme.KaizoMoveOddsTheme
import com.example.kaizomoveodds.ui.theme.typeColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KaizoMoveOddsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Gray
                ) {
                    App()
                    //Test()
                }
            }
        }
    }
}

@Composable
fun App() {

    var withIn by remember { mutableStateOf(1) }
    var delete by remember { mutableStateOf(false) }
    var badge by remember { mutableStateOf(1) }
    var reset  by remember { mutableStateOf(false) }
    var pow  by remember { mutableStateOf(0) }
    var acc  by remember { mutableStateOf(0) }
    var learnedMovesNum by remember { mutableStateOf(4) }
    var speed  by remember { mutableStateOf(false) }
    var atk  by remember { mutableStateOf(false) }
    var spAtk  by remember { mutableStateOf(false) }
    var recoil  by remember { mutableStateOf(false) }
    var reCharge  by remember { mutableStateOf(false) }
    var twoTurn  by remember { mutableStateOf(false) }
    var confuse  by remember { mutableStateOf(false) }

    var filter: Boolean by remember { mutableStateOf(false) }
    var moveArr by remember { mutableStateOf(movesArray) }

    var types: Array<Pair<Boolean,String>> by remember {
        mutableStateOf(
            arrayOf(
                Pair(false, "BUG"),
                Pair(false, "DARK"),
                Pair(false, "DRAGON"),
                Pair(false, "Electric"),
                Pair(false, "FIGHT"),
                Pair(false, "FIRE"),
                Pair(false, "FLYING"),
                Pair(false, "GHOST"),
                Pair(false, "GRASS"),
                Pair(false, "GROUND"),
                Pair(false, "ICE"),
                Pair(false, "NORMAL"),
                Pair(false, "POISON"),
                Pair(false, "PSYCHIC"),
                Pair(false, "ROCK"),
                Pair(false, "STEEL"),
                Pair(false, "WATER")
            )
        )
    }
    LaunchedEffect(reset,){
        if (reset){
            moveArr = movesArray
            reset = false
        }

    }
    Column(Modifier.fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {

        if(!filter){
            Column(
                Modifier
                    .weight(1f)
            ) {
                LazyVerticalGrid(columns = GridCells.Fixed(4)){
                    items(types.size){
                            index ->
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(
                                selected = types[index].first,
                                onClick = {
                                    val updatedTypes = types.toMutableList()
                                    updatedTypes[index] = Pair(!types[index].first, types[index].second)
                                    types = updatedTypes.toTypedArray()
                                }
                            )
                            Text(text = types[index].second, modifier = Modifier.padding(start = 8.dp))
                        }
                    }
                }
                Column(
                    Modifier
                        .verticalScroll(rememberScrollState())) {

                    Row(Modifier.fillMaxWidth(), Arrangement.SpaceEvenly) {
                        Column() {
                            Text(text = "Pow")
                            TextField(
                                value = "$pow",
                                modifier = Modifier
                                    .width(60.dp),
                                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                                onValueChange = {
                                    try {
                                        if (it.isEmpty()){
                                            pow =    0
                                        }else if(it.toInt()<=100){
                                            pow = it.toInt()
                                        }
                                    } catch (e: NumberFormatException) {
                                        println("Conversion failed. The input is not a valid integer.")
                                    }
                                },
                            )
                        }
                        Column() {
                            Text(text = "Acc")
                            TextField(
                                value = "$acc",
                                modifier = Modifier
                                    .width(60.dp),
                                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                                onValueChange = {
                                    try {
                                        if (it.isEmpty()){
                                            acc = 0
                                        }else if(it.toInt()<=100){
                                            acc = it.toInt()
                                        }
                                    } catch (e: NumberFormatException) {
                                        println("Conversion failed. The input is not a valid integer.")
                                    }
                                },
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = "Moves learned")
                            TextField(
                                value = "$learnedMovesNum",
                                modifier = Modifier
                                    .width(60.dp),
                                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                                onValueChange = {
                                    try {
                                        if (it.isEmpty()){
                                            learnedMovesNum =    0
                                        }else if(it.toInt()<=100){
                                            learnedMovesNum = it.toInt()
                                        }
                                    } catch (e: NumberFormatException) {
                                        println("Conversion failed. The input is not a valid integer.")
                                    }
                                },
                            )
                        }
                    }
                    Column(
                        Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "SETUP MOVES")
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(
                                selected = atk,
                                onClick = {atk = !atk}
                            )
                            Text(text = "Atk")
                            RadioButton(
                                selected = speed,
                                onClick = {speed = !speed}
                            )
                            Text(text = "Speed")
                            RadioButton(
                                selected = spAtk,
                                onClick = {spAtk = !spAtk}
                            )
                            Text(text = "SpAtk")
                        }
                    }
                    Column(
                        Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "INCLUDE MOVES")
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Column() {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    RadioButton(
                                        selected = recoil,
                                        onClick = {recoil = !recoil}
                                    )
                                    Text(text = "Recoil")
                                }
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    RadioButton(
                                        selected = twoTurn,
                                        onClick = {twoTurn = !twoTurn}
                                    )
                                    Text(text = "2-Turn")
                                }
                            }
                            Column() {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    RadioButton(
                                        selected = reCharge,
                                        onClick = {reCharge = !reCharge}
                                    )
                                    Text(text = "Recharge")
                                }
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    RadioButton(
                                        selected = confuse,
                                        onClick = {confuse = !confuse}
                                    )
                                    Text(text = "2-3/5 turn lock")
                                }
                            }

                        }
                    }
                    Row(Modifier.fillMaxWidth(), Arrangement.SpaceEvenly) {

                    }
                }
            }
        }

        Row(Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(
                onClick = {
                    moveArr = filter(types, moveArr,pow,acc,atk,spAtk,speed,recoil,reCharge,twoTurn,confuse,)
                    filter = true
                },
            ) {
                Text(text = "Filter")
            }
            Button(
                onClick = {
                    filter = false
                    reset = true
                    moveArr = movesArray
                    removedMoves = arrayListOf()
                },
            ) {
                Text(text = "BACK")
            }
        }
        if (filter) {
            var odds: Double = (moveArr.size.toDouble()/(movesArray.size+10-learnedMovesNum))
            var oddsProcent = odds*100
            var odds2 = String.format("%.2f",oddsWithinX(moveArr.size,learnedMovesNum,withIn))
            var tmOdds = String.format("%.2f",tmOddsWithinX(moveArr.size,badge))
            val formattedNumber = String.format("%.2f", oddsProcent)

            Box() {
                Row(horizontalArrangement = Arrangement.Center,verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "WhitIn lvlUP?")
                    IconButton(onClick = { withIn-- }) {
                        Image(painter = painterResource(id = R.drawable.remove_circle), contentDescription = null)
                    }
                    Text(text = "$withIn")
                    IconButton(onClick = { withIn++ }) {
                        Icon(Icons.Default.AddCircle, contentDescription = "Back")
                    }
                }
                Row(Modifier.padding(top = 20.dp),horizontalArrangement = Arrangement.Center,verticalAlignment = Alignment.CenterVertically,) {
                    Text(text = "WhitIn Badges?")
                    IconButton(onClick = { badge-- }) {
                        Image(painter = painterResource(id = R.drawable.remove_circle), contentDescription = null)
                    }
                    Text(text = "$badge")
                    IconButton(onClick = { badge++ }) {
                        Icon(Icons.Default.AddCircle, contentDescription = "Back")
                    }
                }
            }
            Text(text = "$formattedNumber % of moves match")
            Text(text = "$odds2 % to get at least 1 move within $withIn lvlUP")
            Text(text = "$tmOdds % to get at least 1 move from $badge TMs")
            MoveList(moveArr){
                moveArr = filter(types, moveArr,pow,acc,atk,spAtk,speed,recoil,reCharge,twoTurn,confuse,)
                //delete = true
            }
        }
    }
}

@Composable
fun MoveList(moves:Array<Move>, delete:()-> Unit) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(moves.size) { index ->
            val move = moves[index]
            val typeColor = typeColor(move.type)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "${move.name} Att${move.Att} Acc${accConvert(move.Acc)}",
                    color = typeColor.second,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(1.dp)
                        .background(typeColor.first, shape = RoundedCornerShape(4.dp))
                )
                IconButton(onClick = {
                    removedMoves.add(move)
                    delete.invoke()
                }) {
                    Icon(Icons.Default.Delete, contentDescription = "Back")
                }
            }
        }
    }
}

fun accConvert(acc:Int):String{
    return if (acc == 0){
        "--"
    }else acc.toString()
}

fun oddsWithinX(goodMoves:Int ,movesLearned:Int,withIn:Int):Double{
    var oddsToNotLearnMove = 1.0
    var movesL = 0
    var roll = withIn
    //var odds: Double = (moveArr.size.toDouble()/(movesArray.size+10-4))*100
    while (roll > 0){
        val tossOdds = 1-(goodMoves.toDouble()/(movesArray.size+10-movesL))
        movesL++
        oddsToNotLearnMove *= tossOdds
        roll--
    }
    return (1 - oddsToNotLearnMove)*100
}

fun tmOddsWithinX(goodMoves:Int ,withIn:Int):Double{
    var oddsToNotLearnMove = 1.0
    var movesL = 0
    var roll = withIn
    //var odds: Double = (moveArr.size.toDouble()/(movesArray.size+10-4))*100
    while (roll > 0){
        val tossOdds = 1-(goodMoves.toDouble()/(movesArray.size+10-movesL))
        movesL++
        oddsToNotLearnMove *= tossOdds
        roll--
    }
    println(movesArray.size+10)
    return ((1 - oddsToNotLearnMove)*100)/2
}




