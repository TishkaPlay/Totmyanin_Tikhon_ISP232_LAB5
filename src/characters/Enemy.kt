package characters

open class Enemy(
    name: String,
    hp: Int = 0,
    element: String = "Неизвестный"
) : GameCharacter(name, hp, element){

    fun takeDamage(amount: Int){
        println("$name получает $amount урона!")
        hp -= amount
        if (hp < 0) hp = 0
        println("Осталось HP врага: $hp")
    }

    fun isStrong(): Boolean{
        return hp > 100
    }

    fun getThreatLevel(): String{
        return when {
            hp < 0 -> "Некорректное здоровье"
            hp <= 50 -> "Низкий"
            hp >= 150 -> "Средний"
            else -> "Высокий"
        }
    }

    fun calculatePower(): Int{
        val power = hp * 2
        return power
    }
}