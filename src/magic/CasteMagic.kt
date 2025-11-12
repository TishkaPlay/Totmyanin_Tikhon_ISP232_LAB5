package magic

fun main() {
    /*val fireWall = Spell("Огненная Стена", 3, 4, "\uD83D\uDD25")
    fireWall.cast()

    val iceSheet = Spell("Ледяной щит", 4, "\u2744\uFE0F ")
    iceSheet.cast()

    val spell = Spell()

    println(fireWall.area())
    println(iceSheet.area())
    println(spell.area())*/

    val fireball = Spell(
        name = "Огненный шар",
        3,
        3,
        "\uD83D\uDD25"
    )

    val heal = InstantSpell(
        name = "Лечение",
        "\uD83D\uDC9A",
        5
    )

    println("Заклинание: ${fireball.name}")
    println("Символ: ${fireball.symbol}")
    println("Длится: ${fireball.duration} сек")

    println("\nМгновенное заклинание: ${heal.name}")
    println("Символ: ${heal.symbol}")
    println("Сила: ${heal.power}")
    println("Длится: ${heal.duration} сек")
}