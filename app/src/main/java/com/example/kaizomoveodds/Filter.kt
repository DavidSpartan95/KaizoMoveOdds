package com.example.kaizomoveodds

fun filter(
    types: Array<Triple<Boolean, String, Int>>,
    arr: Array<Move>,
    pow: Int,
    acc: Int,
    boostAtk: Boolean,
    boostSpAtk: Boolean,
    boostSpeed: Boolean,
    recoil: Boolean,
    reCharge:Boolean,
    twoTurn:Boolean,
    lockInMove: Boolean,
    sleep: Boolean,
    confuse:Boolean,
    poison:Boolean,
    burn: Boolean,

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
                        (it.type == x.second && goodMove(it.name))||
                        (sleep&& isSleep(it.name)&& it.Acc >= acc)||
                        (confuse&& isConfuse(it.name)&& it.Acc >= acc)||
                        (poison&& isPoison(it.name)&& it.Acc >= acc)||
                        (burn&& isBurn(it.name)&& it.Acc >= acc)||
                        (it.type == x.second && multiHitAvg(it.name).first&&it.Acc >= acc&&multiHitAvg(it.name).second >= att)
            }.filterNot {
                 isUseless(it.name) ||
                        (!recoil && isRecoil(it.name))||(!reCharge && isRecharge(it.name))||
                        (!twoTurn&& isTwoTurn(it.name))||(!lockInMove&& isLockInMove(it.name))||
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
        }.filterNot { removedMove(it.name) }
        filteredMoves.addAll(boostArr1)
    }

    if (boostSpeed) {
        val boostArr2 = arr.filter {
            it.name == "Agility" || (!boostAtk && it.name == "Dragon Dance")
        }.filterNot { removedMove(it.name) }
        filteredMoves.addAll(boostArr2)
    }

    if (boostSpAtk) {
        val boostArr3 = arr.filter {
            it.name == "Calm Mind" ||
                    it.name == "Growth" ||
                    it.name == "Tail Glow"
        }.filterNot { removedMove(it.name) }
        filteredMoves.addAll(boostArr3)
    }

    val sortedArr = filteredMoves.sortedBy { move ->
        when (move.type) {
            "BUG" -> 0
            "DARK" -> 1
            "DRAGON" -> 2
            "Electric" -> 3
            "FIGHT" -> 4
            "FIRE" -> 5
            "FLYING" -> 6
            "GRASS" -> 7
            "GROUND" -> 8
            "ICE" -> 9
            "NORMAL" -> 10
            "POISON" -> 11
            "PSYCHIC" -> 12
            "ROCK" -> 13
            "STEEL" -> 14
            "WATER" -> 15
            else -> 16 // Any other type not specified in the order, place it last.
        }
    }
     return sortedArr.toTypedArray()
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

fun isLockInMove(move:String):Boolean{
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
fun isSleep(move:String):Boolean{
    return when(move){
        "Grasswhistle"-> true
        "Sleep Powder"-> true
        "Lovely Kiss"-> true
        "Yawn"-> true
        "Hypnosis"-> true
        else -> false
    }
}
fun isConfuse(move:String):Boolean{
    return when(move){
        "Flatter"-> true
        "Confuse Ray"-> true
        "Supersonic"-> true
        "Swagger"-> true
        "Teeter Dance"-> true
        else -> false
    }
}
fun isPoison(move:String):Boolean{
    return when(move){
        "Poisonpowder"-> true
        "Toxic"-> true
        else -> false
    }
}
fun isBurn(move:String):Boolean{
    return when(move){
        "Will-o-wisp"-> true
        else -> false
    }
}

fun multiHitAvg(move:String):Pair<Boolean,Int>{
return when(move){
    "Arm Thrust" -> Pair(true,45)
    "Barrage" -> Pair(true, 45)
    "Bone Rush" -> Pair(true, 75)
    "Bullet Seed" -> Pair(true, 30)
    "Comet Punch" -> Pair(true,54)
    "Double Slap" -> Pair(true, 45)
    "Fury Attack" -> Pair(true, 45)
    "Fury Swipes" -> Pair(true, 54)
    "Icicle Spear" -> Pair(true,30)
    "Pin Missile" -> Pair(true, 42)
    "Rock Blast" -> Pair(true, 75)
    "Spike Cannon" -> Pair(true, 60)
    "Bonemerang" -> Pair(true,100)
    "Double Kick" -> Pair(true, 60)
    "Twineedle" -> Pair(true, 50)
    "Triple Kick" -> Pair(true, 47)
            else -> Pair(false,0)
}
}