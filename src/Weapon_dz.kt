/*class Weapon_dz {
    var name: String = "Оружие"
    var damage: Int = 10
    var durability: Int = 100
    var type: String = "Обычное"

    fun showInfo() {
        println("Оружие: $name\nУрон: $damage\nПрочность: $durability\nТип: $type")
    }

    fun use() {
        if (durability > 0){
            durability -= 10
            println("$name - прочность: $durability")
            if (durability <= 0) {
                println("$name - сломано!")
                durability = 0
            }
        }else{
            println("$name - сломано! Ты больше не можешь его использовать, сходи купи новое)")
        }
    }

    fun upgrade(bonus: Int){
        damage += bonus
        println("Улучшение $name! Теперь твой урон - $damage!")
    }
}*/