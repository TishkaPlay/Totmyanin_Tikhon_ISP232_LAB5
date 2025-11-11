package characters

class Enemy(
    var nname: String,
    var hp: Int,
    var st: String,
    val aggressionLvL: Int = 2
) {

    fun takeDamage(amount: Int){
        println("$nname получает $amount урона!")
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
        val power = hp * aggressionLvL
        return power
    }
}