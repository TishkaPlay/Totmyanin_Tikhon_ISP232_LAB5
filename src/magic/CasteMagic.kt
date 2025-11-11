package magic

fun main() {
    val fireWall = Spell("Огненная Стена", 3, 4, "\uD83D\uDD25")
    fireWall.cast()

    val iceSheet = Spell("Ледяной щит", 4, "\u2744\uFE0F ")
    iceSheet.cast()

    val spell = Spell()

    println(fireWall.area())
    println(iceSheet.area())
    println(spell.area())
}