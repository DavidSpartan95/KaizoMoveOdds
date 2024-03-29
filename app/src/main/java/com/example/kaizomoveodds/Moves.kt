package com.example.kaizomoveodds

import androidx.compose.foundation.layout.Row
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.ui.Alignment

data class Move(
    val type: String,
    val name: String,
    val PP: Int,
    val Att: Int,
    val Acc: Int,
    val description: String
    )
val movesArray = arrayOf(
    Move("BUG", "Fury Cutter", 20, 10, 95, "An attack that intensifies on each successive hit."),
    Move("BUG", "Leech Life", 15, 20, 100, "An attack that steals half the damage inflicted."),
    Move("BUG", "Megahorn", 10, 120, 85, "A brutal ramming attack using out-thrust horns."),
    Move("BUG", "Pin Missile", 20, 14, 85, "Sharp pins are fired to strike 2 to 5 times."),
    Move("BUG", "Signal Beam", 15, 75, 100, "A strange beam attack that may confuse the foe."),
    Move("BUG", "Silver Wind", 5, 60, 100, "A powdery attack that may raise abilities."),
    Move("BUG", "Spider Web", 10, 0, 100, "Ensnares the foe to stop it from fleeing or switching."),
    Move("BUG", "String Shot", 40, 0, 95, "Binds the foe with string to reduce its SPEED."),
    Move("BUG", "Tail Glow", 20, 0, 100, "Flashes a light that sharply raises SP. ATK."),
    Move("BUG", "Twineedle", 20, 25, 100, "Stingers on the forelegs jab the foe twice."),

    Move("DARK", "Beat Up", 10, 10, 100, "Summons party POKéMON to join in the attack."),
    Move("DARK", "Bite", 25, 60, 100, "Bites with vicious fangs. May cause flinching."),
    Move("DARK", "Crunch", 15, 80, 100, "Crunches with sharp fangs. May lower SP. DEF."),
    Move("DARK", "Faint Attack", 20, 60, 0, "Draws the foe close, then strikes without fail."),
    Move("DARK", "Fake Tears", 20, 0, 100, "Feigns crying to sharply lower the foe's SP. DEF."),
    Move("DARK", "Flatter", 15, 0, 100, "Confuses the foe, but raises its SP. ATK."),
    Move("DARK", "Knock Off", 20, 20, 100, "Knocks down the foe's held item to prevent its use."),
    Move("DARK", "Memento", 10, 0, 100, "The user faints and lowers the foe's abilities."),
    Move("DARK", "Pursuit", 20, 40, 100, "Inflicts bad damage if used on a foe switching out."),
    Move("DARK", "Snatch", 10, 0, 100, "Steals the effects of the move the foe uses next."),
    Move("DARK", "Taunt", 20, 0, 100, "Taunts the foe into only using attack moves."),
    Move("DARK", "Thief", 10, 40, 100, "While attacking, it may steal the foe's held item."),
    Move("DARK", "Torment", 15, 0, 100, "Torments the foe and stops successive use of a move."),

    Move("DRAGON", "Dragon Claw", 15, 80, 100, "Slashes the foe with sharp claws."),
    Move("DRAGON", "Dragon Dance", 20, 0, 0, "A mystical dance that ups ATTACK and SPEED."),
    Move("DRAGON", "Dragon Rage", 10, 0, 100, "Launches shock waves that always inflict 40 HP damage."),
    Move("DRAGON", "Dragonbreath", 20, 60, 100, "Strikes the foe with an incredible blast of breath."),
    Move("DRAGON", "Outrage", 15, 90, 100, "A rampage of 2 to 3 turns that confuses the user."),
    Move("DRAGON", "Twister", 20, 40, 100, "Whips up a vicious twister to tear at the foe."),

    Move("Electric", "Charge", 20, 0, 100, "Charges power to boost the electric move used next."),
    Move("Electric", "Shock Wave", 20, 60, 0, "A fast and unavoidable electric attack."),
    Move("Electric", "Spark", 20, 65, 100, "An electrified tackle that may paralyze the foe."),
    Move("Electric", "Thunder", 10, 120, 70, "A lightning attack that may cause paralysis."),
    Move("Electric", "Thunder Wave", 20, 0, 100, "A weak jolt of electricity that paralyzes the foe."),
    Move("Electric", "Thunderbolt", 15, 95, 100, "A strong electrical attack that may paralyze the foe."),
    Move("Electric", "Thunderpunch", 15, 75, 100, "An electrified punch that may paralyze the foe."),
    Move("Electric", "Thundershock", 30, 40, 100, "An electrical attack that may paralyze the foe."),
    Move("Electric", "Volt Tackle", 15, 120, 100, "A life-risking tackle that slightly hurts the user."),
    Move("Electric", "Zap Cannon", 5, 100, 50, "Powerful and sure to cause paralysis, but inaccurate."),

    Move("FIGHT", "Arm Thrust", 20, 15, 100, "Straight-arm punches that strike the foe 2 to 5 times."),
    Move("FIGHT", "Brick Break", 15, 75, 100, "Destroys barriers such as REFLECT and causes damage."),
    Move("FIGHT", "Bulk Up", 20, 0, 0, "Bulks up the body to boost both ATTACK and DEFENSE."),
    Move("FIGHT", "Counter", 20, 0, 100, "Retaliates any physical hit with double the power."),
    Move("FIGHT", "Cross Chop", 5, 100, 80, "A double-chopping attack. High critical-hit ratio."),
    Move("FIGHT", "Detect", 5, 0, 0, "Evades attack, but may fail if used in succession."),
    Move("FIGHT", "Double Kick", 30, 30, 100, "A double-kicking attack that strikes the foe twice."),
    Move("FIGHT", "Dynamicpunch", 5, 100, 50, "Powerful and sure to cause confusion, but inaccurate."),
    Move("FIGHT", "Focus Punch", 20, 150, 100, "A powerful loyalty attack. The user flinches if hit."),
    Move("FIGHT", "Hi Jump Kick", 20, 85, 90, "A jumping knee kick. If it misses, the user is hurt."),
    Move("FIGHT", "Jump Kick", 25, 70, 95, "A strong jumping kick. May miss and hurt the kicker."),
    Move("FIGHT", "Karate Chop", 25, 50, 100, "A chopping attack with a high critical-hit ratio."),
    Move("FIGHT", "Low Kick", 20, 0, 100, "A kick that inflicts more damage on heavier foes."),
    Move("FIGHT", "Mach Punch", 30, 40, 100, "A punch is thrown at wicked speed to strike first."),
    Move("FIGHT", "Revenge", 10, 60, 100, "An attack that gains power if injured by the foe."),
    Move("FIGHT", "Reversal", 15, 0, 100, "Inflicts more damage when the user's HP is down."),
    //Move("FIGHT", "Rock Smash", 15, 20, 100, "A rock-crushing attack that may lower DEFENSE."),
    Move("FIGHT", "Rolling Kick", 15, 60, 85, "A fast kick delivered from a rapid spin."),
    Move("FIGHT", "Seismic Toss", 20, 0, 100, "Inflicts damage identical to the user's level."),
    Move("FIGHT", "Sky Uppercut", 15, 85, 90, "An uppercut thrown as if leaping into the sky."),
    Move("FIGHT", "Submission", 25, 80, 80, "A reckless body slam that also hurts the user."),
    Move("FIGHT", "Superpower", 5, 120, 100, "Boosts strength sharply, but lowers abilities."),
    Move("FIGHT", "Triple Kick", 10, 10, 90, "Kicks the foe 3 times in a row with rising intensity."),
    Move("FIGHT", "Vital Throw", 10, 70, 100, "Makes the user's move last, but it never misses."),

    Move("FIRE", "Blast Burn", 5, 150, 90, "Powerful, but leaves the user immobile the next turn."),
    Move("FIRE", "Blaze Kick", 10, 85, 90, "A kick with a high critical-hit ratio. May cause a burn."),
    Move("FIRE", "Ember", 25, 40, 100, "A weak fire attack that may inflict a burn."),
    Move("FIRE", "Eruption", 5, 150, 100, "The higher the user's HP, the more damage caused."),
    Move("FIRE", "Fire Blast", 5, 120, 85, "A fiery blast that scorches all. May cause a burn."),
    Move("FIRE", "Fire Punch", 15, 75, 100, "A fiery punch that may burn the foe."),
    Move("FIRE", "Fire Spin", 15, 15, 70, "Traps the foe in a ring of fire for 2 to 5 turns."),
    Move("FIRE", "Flame Wheel", 25, 60, 100, "A fiery charge attack that may inflict a burn."),
    Move("FIRE", "Flamethrower", 15, 95, 100, "A powerful fire attack that may inflict a burn."),
    Move("FIRE", "Heat Wave", 10, 100, 90, "Exhales a hot breath on the foe. May inflict a burn."),
    Move("FIRE", "Overheat", 5, 140, 90, "Allows a full-power attack, but sharply lowers SP. ATK."),
    Move("FIRE", "Sacred Fire", 5, 100, 95, "A mystical fire attack that may inflict a burn."),
    Move("FIRE", "Sunny Day", 5, 0, 0, "Boosts the power of FIRE-type moves for 5 turns."),
    Move("FIRE", "Will-o-wisp", 15, 0, 75, "Inflicts a burn on the foe with intense fire."),

    Move("FLYING", "Aerial Ace", 20, 60, 0, "An extremely speedy and unavoidable attack."),
    Move("FLYING", "Aeroblast", 5, 100, 95, "Launches a vacuumed blast. High critical-hit ratio."),
    Move("FLYING", "Air Cutter", 25, 55, 95, "Hacks with razorlike wind. High critical-hit ratio."),
    Move("FLYING", "Bounce", 5, 85, 85, "Bounces up, then down the next turn. May paralyze."),
    Move("FLYING", "Drill Peck", 20, 80, 100, "A corkscrewing attack with the beak acting as a drill."),
    Move("FLYING", "Featherdance", 15, 0, 100, "Envelops the foe with down to sharply reduce ATTACK."),
    Move("FLYING", "Fly", 15, 70, 95, "Flies up on the first turn, then strikes the next turn."),
    Move("FLYING", "Gust", 35, 40, 100, "Strikes the foe with a gust of wind whipped up by wings."),
    Move("FLYING", "Mirror Move", 20, 0, 0, "Counters the foe's attack with the same move."),
    Move("FLYING", "Peck", 35, 35, 100, "Attacks the foe with a jabbing beak, etc."),
    Move("FLYING", "Sky Attack", 5, 140, 90, "Searches out weak spots, then strikes the next turn."),
    Move("FLYING", "Wing Attack", 35, 60, 100, "Strikes the foe with wings spread wide."),
    Move("GHOST", "Astonish", 15, 30, 100, "An attack that may shock the foe into flinching."),
    Move("GHOST", "Confuse Ray", 10, 0, 100, "A sinister ray that confuses the foe."),
    Move("GHOST", "Destiny Bond", 5, 0, 0, "If the user faints, the foe is also made to faint."),
    Move("GHOST", "Grudge", 5, 0, 100, "If the user faints, deletes the PP of the final move."),
    Move("GHOST", "Lick", 30, 20, 100, "Licks with a long tongue to injure. May also paralyze."),
    Move("GHOST", "Night Shade", 15, 0, 100, "Inflicts damage identical to the user's level."),
    Move("GHOST", "Nightmare", 15, 0, 100, "Inflicts 1/4 damage on a sleeping foe every turn."),
    Move("GHOST", "Shadow Ball", 15, 80, 100, "Hurls a black blob that may lower the foe's SP. DEF."),
    Move("GHOST", "Shadow Punch", 20, 60, 0, "An unavoidable punch that is thrown from shadows."),
    Move("GHOST", "Spite", 10, 0, 100, "Spitefully cuts the PP of the foe's last move."),

    //Move("GRASS", "Absorb", 20, 20, 100, "An attack that absorbs half the damage inflicted."),
    //Move("GRASS", "Aromatherapy", 5, 0, 0, "Heals all status problems with a soothing scent."),
    Move("GRASS", "Bullet Seed", 30, 10, 100, "Shoots 2 to 5 seeds in a row to strike the foe."),
    Move("GRASS", "Cotton Spore", 40, 0, 85, "Spores cling to the foe, sharply reducing SPEED."),
    Move("GRASS", "Frenzy Plant", 5, 150, 90, "Powerful, but leaves the user immobile the next turn."),
    //Move("GRASS", "Giga Drain", 5, 60, 100, "An attack that steals half the damage inflicted."),
    Move("GRASS", "Grasswhistle", 15, 0, 55, "Lulls the foe into sleep with a pleasant melody."),
    //Move("GRASS", "Ingrain", 20, 0, 100, "Lays roots that restore HP. The user can't switch out."),
    Move("GRASS", "Leaf Blade", 15, 70, 100, "Slashes with a sharp leaf. High critical-hit ratio."),
    //Move("GRASS", "Leech Seed", 10, 0, 90, "Plants a seed on the foe to steal HP on every turn."),
    Move("GRASS", "Magical Leaf", 20, 60, 0, "Attacks with a strange leaf that cannot be evaded."),
    //Move("GRASS", "Mega Drain", 10, 40, 100, "An attack that absorbs half the damage inflicted."),
    Move("GRASS", "Needle Arm", 15, 60, 100, "Attacks with thorny arms. May cause flinching."),
    Move("GRASS", "Petal Dance", 20, 70, 100, "A rampage of 2 to 3 turns that confuses the user."),
    Move("GRASS", "Razor Leaf", 25, 55, 95, "Cuts the enemy with leaves. High critical-hit ratio."),
    Move("GRASS", "Sleep Powder", 15, 0, 75, "Scatters a powder that may cause the foe to sleep."),
    Move("GRASS", "Solarbeam", 10, 120, 100, "Absorbs light in one turn, then attacks next turn."),
    //Move("GRASS", "Spore", 15, 0, 100, "Scatters a cloud of spores that always induce sleep."),
    Move("GRASS", "Stun Spore", 30, 0, 75, "Scatters a powder that may paralyze the foe."),
    //Move("GRASS", "Synthesis", 5, 0, 0, "Restores HP. The amount varies with the weather."),
    Move("GRASS", "Vine Whip", 10, 35, 100, "Strikes the foe with slender, whiplike vines."),

    Move("GROUND", "Bone Club", 20, 65, 85, "Clubs the foe with a bone. May cause flinching."),
    Move("GROUND", "Bone Rush", 10, 25, 80, "Strikes the foe with a bone in hand 2 to 5 times."),
    Move("GROUND", "Bonemerang", 10, 50, 90, "Throws a bone boomerang that strikes twice."),
    Move("GROUND", "Dig", 10, 60, 100, "Digs underground the first turn and strikes next turn."),
    Move("GROUND", "Earthquake", 10, 100, 100, "A powerful quake, but has no effect on flying foes."),
    Move("GROUND", "Fissure", 5, 0, 30, "A one-hit KO move that drops the foe in a fissure."),
    Move("GROUND", "Magnitude", 30, 0, 100, "A ground-shaking attack of random intensity."),
    Move("GROUND", "Mud Shot", 15, 55, 95, "Hurls mud at the foe and reduces SPEED."),
    Move("GROUND", "Mud Sport", 15, 0, 100, "Covers the user in mud to raise electrical resistance."),
    Move("GROUND", "Mud-slap", 10, 20, 100, "Hurls mud in the foe's face to reduce its accuracy."),
    Move("GROUND", "Sand Tomb", 15, 15, 70, "Traps and hurts the foe in quicksand for 2 to 5 turns."),
    Move("GROUND", "Sand-attack", 15, 0, 100, "Reduces the foe's accuracy by hurling sand in its face."),
    Move("GROUND", "Spikes", 20, 0, 0, "Sets spikes that hurt a foe switching out."),

    Move("ICE", "Aurora Beam", 20, 65, 100, "Fires a rainbow-colored beam that may lower ATTACK."),
    Move("ICE", "Blizzard", 5, 120, 70, "Hits the foe with an icy storm that may freeze it."),
    Move("ICE", "Hail", 10, 0, 0, "Summons a hailstorm that strikes every turn."),
    Move("ICE", "Haze", 30, 0, 0, "Creates a black haze that eliminates all stat changes."),
    Move("ICE", "Ice Ball", 20, 30, 90, "A 5-turn attack that gains power on successive hits."),
    Move("ICE", "Ice Beam", 10, 95, 100, "Blasts the foe with an icy beam that may freeze it."),
    Move("ICE", "Ice Punch", 15, 75, 100, "An icy punch that may freeze the foe."),
    Move("ICE", "Icicle Spear", 30, 10, 100, "Attacks the foe by firing 2 to 5 icicles in a row."),
    Move("ICE", "Icy Wind", 15, 55, 95, "A chilling attack that lowers the foe's SPEED."),
    Move("ICE", "Mist", 30, 0, 0, "Creates a mist that stops reduction of abilities."),
    Move("ICE", "Powder Snow", 25, 40, 100, "Blasts the foe with a snowy gust. May cause freezing."),
    Move("ICE", "Sheer Cold", 5, 0, 30, "A chilling attack that causes fainting if it hits."),

    Move("NORMAL", "Assist", 20, 0, 100, "Attacks randomly with one of the partner's moves."),
    Move("NORMAL", "Attract", 15, 0, 100, "Makes the opposite gender less likely to attack."),
    Move("NORMAL", "Barrage", 20, 15, 85, "Hurls round objects at the foe 2 to 5 times."),
    Move("NORMAL", "Baton Pass", 40, 0, 0, "Switches out the user while keeping effects in play."),
    Move("NORMAL", "Belly Drum", 10, 0, 0, "Maximizes ATTACK while sacrificing HP."),
    Move("NORMAL", "Bide", 10, 0, 100, "Endures attack for 2 turns to retaliate double."),
    Move("NORMAL", "Bind", 20, 15, 75, "Binds and squeezes the foe for 2 to 5 turns."),
    Move("NORMAL", "Block", 5, 0, 100, "Blocks the foe's way to prevent escape."),
    Move("NORMAL", "Body Slam", 15, 85, 100, "A full-body slam that may cause paralysis."),
    Move("NORMAL", "Camouflage", 20, 0, 100, "Alters the POKéMON's type depending on the location."),
    Move("NORMAL", "Charm", 20, 0, 100, "Charms the foe and sharply reduces its ATTACK."),
    Move("NORMAL", "Comet Punch", 15, 18, 85, "Repeatedly punches the foe 2 to 5 times."),
    Move("NORMAL", "Constrict", 35, 10, 100, "Constricts to inflict pain. May lower SPEED."),
    Move("NORMAL", "Conversion", 30, 0, 0, "Changes the user's type into an own move's type."),
    Move("NORMAL", "Conversion 2", 30, 0, 100, "Makes the user resistant to the last attack's type."),
    Move("NORMAL", "Covet", 40, 40, 100, "Cutely begs to obtain an item held by the foe."),
    Move("NORMAL", "Crush Claw", 10, 75, 95, "Tears at the foe with sharp claws. May lower DEFENSE."),
    //Move("NORMAL", "Cut", 30, 50, 95, "Cuts the foe with sharp scythes, claws, etc."),
    Move("NORMAL", "Defense Curl", 40, 0, 0, "Curls up to conceal weak spots and raise DEFENSE."),
    Move("NORMAL", "Disable", 20, 0, 55, "Psychically disables one of the foe's moves."),
    Move("NORMAL", "Dizzy Punch", 10, 70, 100, "A rhythmic punch that may confuse the foe."),
    Move("NORMAL", "Double Team", 15, 0, 0, "Creates illusory copies to raise evasiveness."),
    Move("NORMAL", "Double-edge", 15, 120, 100, "A life-risking tackle that also hurts the user."),
    Move("NORMAL", "Doubleslap", 10, 15, 85, "Repeatedly slaps the foe 2 to 5 times."),
    Move("NORMAL", "Egg Bomb", 10, 100, 75, "An egg is forcibly hurled at the foe."),
    Move("NORMAL", "Encore", 5, 0, 100, "Makes the foe repeat its last move over 2 to 6 turns."),
    Move("NORMAL", "Endeavor", 5, 0, 100, "Gains power if the user's HP is lower than the foe's HP."),
    Move("NORMAL", "Endure", 10, 0, 0, "Endures any attack for 1 turn, leaving at least 1HP."),
    Move("NORMAL", "Explosion", 5, 250, 100, "Inflicts severe damage but makes the user faint."),
    Move("NORMAL", "Extremespeed", 5, 80, 100, "An extremely fast and powerful attack."),
    Move("NORMAL", "Facade", 20, 70, 100, "Boosts ATTACK when burned, paralyzed, or poisoned."),
    Move("NORMAL", "Fake Out", 10, 40, 100, "A 1st-turn, 1st-strike move that causes flinching."),
    Move("NORMAL", "False Swipe", 40, 40, 100, "An attack that leaves the foe with at least 1 HP."),
    Move("NORMAL", "Flail", 15, 0, 100, "Inflicts more damage when the user's HP is down."),
    Move("NORMAL", "Flash", 20, 0, 70, "Looses a powerful blast of light that cuts accuracy."),
    Move("NORMAL", "Focus Energy", 30, 0, 0, "Focuses power to raise the critical-hit ratio."),
    Move("NORMAL", "Follow Me", 20, 0, 100, "Draws attention to make foes attack only the user."),
    Move("NORMAL", "Foresight", 40, 0, 100, "Negates the foe's efforts to heighten evasiveness."),
    Move("NORMAL", "Frustration", 20, 0, 100, "An attack that is stronger if the TRAINER is disliked."),
    Move("NORMAL", "Fury Attack", 20, 15, 85, "Jabs the foe 2 to 5 times with sharp horns, etc."),
    Move("NORMAL", "Fury Swipes", 15, 18, 80, "Rakes the foe with sharp claws, etc., 2 to 5 times."),
    Move("NORMAL", "Glare", 30, 0, 75, "Intimidates and frightens the foe into paralysis."),
    Move("NORMAL", "Growl", 40, 0, 100, "Growls cutely to reduce the foe's ATTACK."),
    Move("NORMAL", "Growth", 40, 0, 0, "Forces the body to grow and heightens SP. ATK."),
    Move("NORMAL", "Guillotine", 5, 0, 30, "A powerful pincer attack that may cause fainting."),
    Move("NORMAL", "Harden", 30, 0, 0, "Stiffens the body's muscles to raise DEFENSE."),
    Move("NORMAL", "Headbutt", 15, 70, 100, "A ramming attack that may cause flinching."),
    Move("NORMAL", "Heal Bell", 5, 0, 0, "Chimes soothingly to heal all status abnormalities."),
    Move("NORMAL", "Helping Hand", 20, 0, 100, "Boosts the power of the recipient's moves."),
    Move("NORMAL", "Hidden Power", 15, 0, 100, "The effectiveness varies with the user."),
    Move("NORMAL", "Horn Attack", 25, 65, 100, "Jabs the foe with sharp horns."),
    Move("NORMAL", "Horn Drill", 5, 0, 30, "A one-hit KO attack that uses a horn like a drill."),
    Move("NORMAL", "Howl", 40, 0, 0, "Howls to raise the spirit and boosts ATTACK."),
    Move("NORMAL", "Hyper Beam", 5, 150, 90, "Powerful, but leaves the user immobile the next turn."),
    Move("NORMAL", "Hyper Fang", 15, 80, 90, "Attacks with sharp fangs. May cause flinching."),
    Move("NORMAL", "Hyper Voice", 10, 90, 100, "A loud attack that uses sound waves to injure."),
    Move("NORMAL", "Leer", 30, 0, 100, "Frightens the foe with a leer to lower DEFENSE."),
    Move("NORMAL", "Lock-on", 5, 0, 100, "Locks on to the foe to ensure the next move hits."),
    Move("NORMAL", "Lovely Kiss", 10, 0, 75, "Demands a kiss with a scary face that induces sleep."),
    Move("NORMAL", "Mean Look", 5, 0, 100, "Fixes the foe with a mean look that prevents escape."),
    Move("NORMAL", "Mega Kick", 5, 120, 75, "An extremely powerful kick with intense force."),
    Move("NORMAL", "Mega Punch", 20, 80, 85, "A strong punch thrown with incredible power."),
    Move("NORMAL", "Metronome", 10, 0, 0, "Waggles a finger to use any POKéMON move at random."),
    Move("NORMAL", "Milk Drink", 10, 0, 0, "Recovers up to half the user's maximum HP."),
    Move("NORMAL", "Mimic", 10, 0, 100, "Copies a move used by the foe during one battle."),
    Move("NORMAL", "Mind Reader", 5, 0, 100, "Senses the foe's action to ensure the next move's hit."),
    Move("NORMAL", "Minimize", 20, 0, 0, "Minimizes the user's size to raise evasiveness."),
    Move("NORMAL", "Moonlight", 5, 0, 0, "Restores HP. The amount varies with the weather."),
    Move("NORMAL", "Morning Sun", 5, 0, 0, "Restores HP. The amount varies with the weather."),
    Move("NORMAL", "Nature Power", 20, 60, 95, "The type of attack varies depending on the location."),
    Move("NORMAL", "Odor Sleuth", 40, 0, 100, "Negates the foe's efforts to heighten evasiveness."),
    Move("NORMAL", "Pain Split", 20, 0, 100, "Adds the user and foe's HP, then shares them equally."),
    Move("NORMAL", "Pay Day", 20, 40, 100, "Throws coins at the foe. Money is recovered after."),
    Move("NORMAL", "Perish Song", 5, 0, 0, "Any POKéMON hearing this song faints in 3 turns."),
    Move("NORMAL", "Pound", 35, 40, 100, "Pounds the foe with forelegs or tail."),
    Move("NORMAL", "Present", 15, 0, 90, "A gift in the form of a bomb. May restore HP."),
    Move("NORMAL", "Protect", 10, 0, 0, "Evades attack, but may fail if used in succession."),
    Move("NORMAL", "Psych Up", 10, 0, 0, "Copies the foe's effect(s) and gives to the user."),
    Move("NORMAL", "Quick Attack", 30, 40, 100, "An extremely fast attack that always strikes first."),
    Move("NORMAL", "Rage", 20, 20, 100, "Raises the user's ATTACK every time it is hit."),
    Move("NORMAL", "Rapid Spin", 40, 20, 100, "Spins the body at high speed to strike the foe."),
    Move("NORMAL", "Razor Wind", 10, 80, 100, "A 2-turn move that strikes the foe on the 2nd turn."),
    //Move("NORMAL", "Recover", 20, 0, 0, "Recovers up to half the user's maximum HP."),
    Move("NORMAL", "Recycle", 10, 0, 100, "Recycles a used item for one more use."),
    Move("NORMAL", "Refresh", 20, 0, 100, "Heals poisoning, paralysis, or a burn."),
    Move("NORMAL", "Return", 20, 0, 100, "An attack that increases in power with friendship."),
    Move("NORMAL", "Roar", 20, 0, 100, "Makes the foe flee to end the battle."),
    Move("NORMAL", "Safeguard", 25, 0, 0, "A mystical force prevents all status problems."),
    Move("NORMAL", "Scary Face", 10, 0, 90, "Frightens with a scary face to sharply reduce SPEED."),
    Move("NORMAL", "Scratch", 35, 40, 100, "Scratches the foe with sharp claws."),
    Move("NORMAL", "Screech", 40, 0, 85, "Emits a screech to sharply reduce the foe's DEFENSE."),
    Move("NORMAL", "Secret Power", 20, 70, 100, "An attack with effects that vary by location."),
    Move("NORMAL", "Selfdestruct", 5, 200, 100, "Inflicts severe damage but makes the user faint."),
    Move("NORMAL", "Sharpen", 30, 0, 0, "Reduces the polygon count and raises ATTACK."),
    Move("NORMAL", "Sing", 15, 0, 55, "A soothing song lulls the foe into a deep slumber."),
    Move("NORMAL", "Sketch", 1, 0, 0, "Copies the foe's last move permanently."),
    Move("NORMAL", "Skull Bash", 15, 100, 100, "Tucks in the head, then attacks on the next turn."),
    Move("NORMAL", "Slack Off", 10, 0, 100, "Slacks off and restores half the maximum HP."),
    Move("NORMAL", "Slam", 20, 80, 75, "Slams the foe with a long tail, vine, etc."),
    Move("NORMAL", "Slash", 20, 70, 100, "Slashes with claws, etc. Has a high critical-hit ratio."),
    Move("NORMAL", "Sleep Talk", 10, 0, 0, "Uses an own move randomly while asleep."),
    Move("NORMAL", "Smellingsalt", 10, 60, 100, "Powerful against paralyzed foes, but also heals them."),
    Move("NORMAL", "Smokescreen", 20, 0, 100, "Lowers the foe's accuracy using smoke, ink, etc."),
    Move("NORMAL", "Snore", 15, 40, 100, "A loud attack that can be used only while asleep."),
    Move("NORMAL", "Softboiled", 10, 0, 100, "Recovers up to half the user's maximum HP."),
    Move("NORMAL", "Sonicboom", 20, 0, 90, "Launches shock waves that always inflict 20 HP damage."),
    Move("NORMAL", "Spike Cannon", 15, 20, 100, "Launches sharp spikes that strike 2 to 5 times."),
    Move("NORMAL", "Spit Up", 10, 100, 100, "Releases stockpiled power (the more the better)."),
    Move("NORMAL", "Splash", 40, 0, 0, "It's just a splash... Has no effect whatsoever."),
    Move("NORMAL", "Stockpile", 10, 0, 0, "Charges up power for up to 3 turns."),
    Move("NORMAL", "Stomp", 20, 65, 100, "Stomps the enemy with a big foot. May cause flinching."),
    //Move("NORMAL", "Strength", 15, 80, 100, "Builds enormous power, then slams the foe."),
    Move("NORMAL", "Substitute", 10, 0, 0, "Creates a decoy using 1/4 of the user's maximum HP."),
    Move("NORMAL", "Super Fang", 10, 0, 90, "Attacks with sharp fangs and cuts half the foe's HP."),
    Move("NORMAL", "Supersonic", 20, 0, 55, "Emits bizarre sound waves that may confuse the foe."),
    Move("NORMAL", "Swagger", 15, 0, 90, "Confuses the foe, but also sharply raises ATTACK."),
    Move("NORMAL", "Swallow", 10, 0, 0, "Absorbs stockpiled power and restores HP."),
    Move("NORMAL", "Sweet Kiss", 10, 0, 75, "Demands a kiss with a cute look. May cause confusion."),
    Move("NORMAL", "Sweet Scent", 20, 0, 100, "Allures the foe to reduce evasiveness."),
    Move("NORMAL", "Swift", 20, 60, 0, "Sprays star-shaped rays that never miss."),
    Move("NORMAL", "Swords Dance", 30, 0, 0, "A fighting dance that sharply raises ATTACK."),
    Move("NORMAL", "Tackle", 35, 35, 95, "Charges the foe with a full-body tackle."),
    Move("NORMAL", "Tail Whip", 30, 0, 100, "Wags the tail to lower the foe's DEFENSE."),
    Move("NORMAL", "Take Down", 20, 90, 85, "A reckless charge attack that also hurts the user."),
    Move("NORMAL", "Teeter Dance", 20, 0, 100, "Confuses all POKéMON on the scene."),
    Move("NORMAL", "Thrash", 20, 90, 100, "A rampage of 2 to 3 turns that confuses the user."),
    Move("NORMAL", "Tickle", 20, 0, 100, "Makes the foe laugh to lower ATTACK and DEFENSE."),
    Move("NORMAL", "Transform", 10, 0, 0, "Alters the user's cells to become a copy of the foe."),
    Move("NORMAL", "Tri Attack", 10, 80, 100, "Fires three types of beams at the same time."),
    Move("NORMAL", "Uproar", 10, 50, 100, "Causes an uproar for 2 to 5 turns and prevents sleep."),
    Move("NORMAL", "Vicegrip", 30, 55, 100, "Grips the foe with large and powerful pincers."),
    Move("NORMAL", "Weather Ball", 10, 50, 100, "The move's type and power change with the weather."),
    Move("NORMAL", "Whirlwind", 20, 0, 100, "Blows away the foe with wind and ends the battle."),
    Move("NORMAL", "Wish", 10, 0, 100, "A wish that restores HP. It takes time to work."),
    Move("NORMAL", "Wrap", 20, 15, 85, "Wraps and squeezes the foe 2 to 5 times with vines, etc."),
    Move("NORMAL", "Yawn", 10, 0, 100, "Lulls the foe into yawning, then sleeping next turn."),

    Move("POISON", "Acid", 30, 40, 100, "Sprays a hide-melting acid. May lower DEFENSE."),
    Move("POISON", "Acid Armor", 40, 0, 0, "Liquifies the user's body to sharply raise DEFENSE."),
    Move("POISON", "Poison Fang", 15, 50, 100, "A sharp-fanged attack. May badly poison the foe."),
    Move("POISON", "Poison Gas", 40, 0, 55, "Envelops the foe in a toxic gas that may poison."),
    Move("POISON", "Poison Sting", 35, 15, 100, "A toxic attack with barbs, etc., that may poison."),
    Move("POISON", "Poison Tail", 25, 50, 100, "Has a high critical-hit ratio. May also poison."),
    Move("POISON", "Poisonpowder", 35, 0, 75, "Scatters a toxic powder that may poison the foe."),
    Move("POISON", "Sludge", 20, 65, 100, "Sludge is hurled to inflict damage. May also poison."),
    Move("POISON", "Sludge Bomb", 10, 90, 100, "Sludge is hurled to inflict damage. May also poison."),
    Move("POISON", "Smog", 20, 20, 70, "An exhaust-gas attack that may also poison."),
    Move("POISON", "Toxic", 10, 0, 85, "Poisons the foe with an intensifying toxin."),

    Move("PSYCHIC", "Agility", 30, 0, 0, "Relaxes the body to sharply boost SPEED."),
    Move("PSYCHIC", "Amnesia", 20, 0, 0, "Forgets about something and sharply raises SP. DEF."),
    Move("PSYCHIC", "Barrier", 30, 0, 0, "Creates a barrier that sharply raises DEFENSE."),
    Move("PSYCHIC", "Calm Mind", 20, 0, 0, "Raises SP. ATK and SP. DEF by focusing the mind."),
    Move("PSYCHIC", "Confusion", 25, 50, 100, "A psychic attack that may cause confusion."),
    Move("PSYCHIC", "Cosmic Power", 20, 0, 0, "Raises DEFENSE and SP. DEF with a mystic power."),
    Move("PSYCHIC", "Dream Eater", 15, 100, 100, "Takes one half the damage inflicted on a sleeping foe."),
    Move("PSYCHIC", "Extrasensory", 30, 80, 100, "Attacks with a peculiar power. May cause flinching."),
    Move("PSYCHIC", "Future Sight", 15, 80, 90, "Heightens inner power to strike 2 turns later."),
    Move("PSYCHIC", "Hypnosis", 20, 0, 60, "A hypnotizing move that may induce sleep."),
    Move("PSYCHIC", "Imprison", 10, 0, 100, "Prevents foes from using moves known by the user."),
    Move("PSYCHIC", "Kinesis", 15, 0, 80, "Distracts the foe. May lower accuracy."),
    Move("PSYCHIC", "Light Screen", 30, 0, 0, "Creates a wall of light that lowers SP. ATK damage."),
    Move("PSYCHIC", "Luster Purge", 5, 70, 100, "Attacks with a burst of light. May lower SP. DEF."),
    Move("PSYCHIC", "Magic Coat", 15, 0, 100, "Reflects special effects back to the attacker."),
    Move("PSYCHIC", "Meditate", 40, 0, 0, "Meditates in a peaceful fashion to raise ATTACK."),
    Move("PSYCHIC", "Mirror Coat", 20, 0, 100, "Counters the foe's special attack at double the power."),
    Move("PSYCHIC", "Mist Ball", 5, 70, 100, "Attacks with a flurry of down. May lower SP. ATK."),
    Move("PSYCHIC", "Psybeam", 20, 65, 100, "Fires a peculiar ray that may confuse the foe."),
    Move("PSYCHIC", "Psychic", 10, 90, 100, "A powerful psychic attack that may lower SP. DEF."),
    Move("PSYCHIC", "Psycho Boost", 5, 140, 90, "Allows a full-power attack, but sharply lowers SP. ATK."),
    Move("PSYCHIC", "Psywave", 15, 0, 80, "Attacks with a psychic wave of varying intensity."),
    Move("PSYCHIC", "Reflect", 20, 0, 0, "Creates a wall of light that weakens physical attacks."),
    //Move("PSYCHIC", "Rest", 10, 0, 0, "The user sleeps for 2 turns, restoring HP and status."),
    Move("PSYCHIC", "Role Play", 10, 0, 100, "Mimics the target and copies its special ability."),
    Move("PSYCHIC", "Skill Swap", 10, 0, 100, "The user swaps special abilities with the target."),
    Move("PSYCHIC", "Teleport", 20, 0, 0, "A psychic move for fleeing from battle instantly."),
    Move("PSYCHIC", "Trick", 10, 0, 100, "Tricks the foe into trading held items."),

    Move("ROCK", "Ancientpower", 5, 60, 100, "An attack that may raise all stats."),
    Move("ROCK", "Rock Blast", 10, 25, 80, "Hurls boulders at the foe 2 to 5 times in a row."),
    Move("ROCK", "Rock Slide", 10, 75, 90, "Large boulders are hurled. May cause flinching."),
    Move("ROCK", "Rock Throw", 15, 50, 90, "Throws small rocks to strike the foe."),
    Move("ROCK", "Rock Tomb", 10, 50, 80, "Stops the foe from moving with rocks and cuts SPEED."),
    Move("ROCK", "Rollout", 20, 30, 90, "An attack lasting 5 turns with rising intensity."),
    Move("ROCK", "Sandstorm", 10, 0, 0, "Causes a sandstorm that rages for several turns."),

    Move("STEEL", "Doom Desire", 5, 120, 85, "Summons strong sunlight to attack 2 turns later."),
    Move("STEEL", "Iron Defense", 15, 0, 0, "Hardens the body's surface to sharply raise DEFENSE."),
    Move("STEEL", "Iron Tail", 15, 100, 75, "Attacks with a rock-hard tail. May lower DEFENSE."),
    Move("STEEL", "Metal Claw", 35, 50, 95, "A claw attack that may raise the user's ATTACK."),
    Move("STEEL", "Metal Sound", 40, 0, 85, "Emits a horrible screech that sharply lowers SP. DEF."),
    Move("STEEL", "Meteor Mash", 10, 100, 85, "Fires a meteor-like punch. May raise ATTACK."),
    Move("STEEL", "Steel Wing", 25, 70, 90, "Strikes the foe with hard wings spread wide."),

    Move("WATER", "Bubble", 30, 20, 100, "An attack using bubbles. May lower the foe's SPEED."),
    Move("WATER", "Bubblebeam", 20, 65, 100, "Forcefully sprays bubbles that may lower SPEED."),
    Move("WATER", "Clamp", 10, 35, 75, "Traps and squeezes the foe for 2 to 5 turns."),
    Move("WATER", "Crabhammer", 10, 90, 85, "Hammers with a pincer. Has a high critical-hit ratio."),
    //Move("WATER", "Dive", 10, 60, 100, "Dives underwater the first turn and strikes next turn."),
    Move("WATER", "Hydro Cannon", 5, 150, 90, "Powerful, but leaves the user immobile the next turn."),
    Move("WATER", "Hydro Pump", 5, 120, 80, "Blasts water at high power to strike the foe."),
    Move("WATER", "Muddy Water", 10, 95, 85, "Attacks with muddy water. May lower accuracy."),
    Move("WATER", "Octazooka", 10, 65, 85, "Fires a lump of ink to damage and cut accuracy."),
    Move("WATER", "Rain Dance", 5, 0, 0, "Boosts the power of WATER-type moves for 5 turns."),
    //Move("WATER", "Surf", 15, 95, 100, "Creates a huge wave, then crashes it down on the foe."),
    Move("WATER", "Water Gun", 25, 40, 100, "Squirts water to attack the foe."),
    Move("WATER", "Water Pulse", 20, 60, 100, "Attacks with ultrasonic waves. May confuse the foe."),
    Move("WATER", "Water Sport", 15, 0, 100, "The user becomes soaked to raise resistance to fire."),
    Move("WATER", "Water Spout", 5, 150, 100, "Inflicts more damage if the user's HP is high."),
    //Move("WATER", "Waterfall", 15, 80, 100, "Charges the foe with speed to climb waterfalls."),
    Move("WATER", "Whirlpool", 15, 15, 70, "Traps and hurts the foe in a whirlpool for 2 to 5 turns."),
    Move("WATER", "Withdraw", 40, 0, 0, "Withdraws the body into its hard shell to raise DEFENSE."),
    Move("???", "Curse", 10, 0, 0, "A move that functions differently for GHOSTS..")

)

var removedMoves = arrayListOf<Move>()


