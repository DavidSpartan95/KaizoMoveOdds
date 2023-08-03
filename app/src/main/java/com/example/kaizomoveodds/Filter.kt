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

    for (x in types) {
        if (x.first) {
            val movesOfType = arr.filter {
                (it.type == x.second && it.Att >= pow && it.Acc >= acc) ||
                        (it.type == x.second && it.Att >= pow && it.Acc == 0) ||
                        (it.type == x.second && goodMove(it.name))
            }.filterNot {
                it.name == "Explosion" || it.name == "Selfdestruct" || it.name == "Spit Up" ||
                        (!recoil && isRecoil(it.name))||(!reCharge && isRecharge(it.name))||
                        (!twoTurn&& isTwoTurn(it.name))||(!confuse&& isConfuse(it.name))
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