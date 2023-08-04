package com.example.kaizomoveodds

fun filter(
    types: Array<Pair<Boolean, String>>,
    arr: Array<Move>,
    pow: Int,
    acc: Int,
    boostAtk: Boolean,
    boostSpAtk: Boolean,
    boostSpeed: Boolean,
    recoil: Boolean,
    reCharge:Boolean,
    twoTurn:Boolean,
    confuse: Boolean,

): Array<Move> {
    val filteredMoves = mutableListOf<Move>()
    val encounteredNames = HashSet<String>()
    val att:Int = if (pow == 0){
        1
    }else{
        pow
    }

    for (x in types) {
        if (x.first) {
            val movesOfType = arr.filter {
                (it.type == x.second && it.Att >= att && it.Acc >= acc) ||
                        (it.type == x.second && it.Att >= att && it.Acc == 0) ||
                        (it.type == x.second && goodMove(it.name))
            }.filterNot {
                 isUseless(it.name) ||
                        (!recoil && isRecoil(it.name))||(!reCharge && isRecharge(it.name))||
                        (!twoTurn&& isTwoTurn(it.name))||(!confuse&& isConfuse(it.name))||
                        removedMove(it.name)
            }

            for (move in movesOfType) {
                if (!encounteredNames.contains(move.name)) {
                    filteredMoves.add(move)
                    encounteredNames.add(move.name)
                }
            }
        }
    }

    if (boostAtk) {
        val boostArr1 = arr.filter {
            it.name == "Swords Dance" ||
                    it.name == "Meditate" ||
                    it.name == "Howl" ||
                    it.name == "Sharpen" ||
                    it.name == "Dragon Dance" ||
                    it.name == "Bulk Up"||
                    it.name == "Belly Drum"
        }
        filteredMoves.addAll(boostArr1)
    }

    if (boostSpeed) {
        val boostArr2 = arr.filter {
            it.name == "Agility" || (!boostAtk && it.name == "Dragon Dance")
        }
        filteredMoves.addAll(boostArr2)
    }

    if (boostSpAtk) {
        val boostArr3 = arr.filter {
            it.name == "Calm Mind" ||
                    it.name == "Growth" ||
                    it.name == "Tail Glow"
        }
        filteredMoves.addAll(boostArr3)
    }

    return filteredMoves.toTypedArray()
}

fun isRecoil(move:String):Boolean{
    return when(move){
        "Double-edge" ->  true
        "Take Down" -> true
        "Volt Tackle" -> true
        "Submission" -> true
        else -> false
    }
}
fun isTwoTurn(move:String):Boolean{
    return when(move){
        "Sky Attack" -> true
        "Solarbeam" -> true
        "Razor Wind" -> true
        "Doom Desire" -> true
        "Future Sight" -> true
        "Focus Punch" -> true
        "Skull Bash" -> true
        else -> false
    }
}
fun isRecharge(move:String):Boolean{
    return when(move){
        "Blast Burn" -> true
        "Frenzy Plant" -> true
        "Hydro Cannon" -> true
        "Hyper Beam" -> true
        else -> false
    }
}

fun isConfuse(move:String):Boolean{
    return when(move){
        "Outrage" -> true
        "Uproar" -> true
        "Thrash" -> true
        "Ice Ball"-> true
        "Petal Dance" -> true
        "Rollout" -> true
        else -> false
    }
}
fun goodMove(move:String):Boolean{
    return when(move){
        "Return" -> true
        "Low Kick"-> true
        else -> false
    }
}
fun isUseless(move:String):Boolean{
    return when(move){
        "Explosion"-> true
        "Selfdestruct" -> true
        "Spit Up" -> true
        "Snore" -> true
        else -> false
    }
}
fun removedMove(move:String):Boolean{
    for (x in removedMoves){
        if (x.name == move){
            return true
        }
    }
    return false
}