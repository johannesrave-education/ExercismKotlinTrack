import kotlin.math.floor
import kotlin.math.roundToInt

class DndCharacter {

    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = 10 + modifier(constitution)

    companion object {

        fun ability(): Int {
            return (1..4).map{ n -> die(6)}.sorted().drop(1).sum()
        }

        fun modifier(score: Int): Int {
            return floor((score-10)/2.toDouble()).toInt()
        }

        fun die(sides: Int): Int {
            return (1..sides).random()
        }
    }

}
