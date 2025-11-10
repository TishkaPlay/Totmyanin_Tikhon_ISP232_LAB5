/*class Hero {
    var name: String = "Неизвестный"
    var gender: String = "Не указан"
    var role: String = "Бродяга"
    var hp: Int = 100
    var mp: Int = 50
    var lvl: Int = 50
    var st: String = "Неизвестно"

    fun sayHello() {
        println("Я - $name, мой путь только начинается!")
    }
    fun showStats() {
        println("Имя: $name | Класс: $role | HP: $hp | MP: $mp | Level: $lvl, | Element: $st")
    }
    fun meditate() {
        println("$name медитирует...")
        mp += 20
        println("Мана восстановлена! Текущая мана: $mp")
    }
    fun takeDamage(amount: Int) {
        println("$name получает $amount урона!")
        hp -= amount
        if (hp < 0) hp = 0
        println("Осталось здоровья: $hp")
    }
    fun castSpell() {
        if (mp >= 10) {
            mp -= 10
            println("$name применил магию и восстановил своё здоровье, маны осталось: $mp")
        } else {
            println("Недостаточны маны! У вас только $mp")
        }
    }
    fun heal(){
        if (mp >= 10){
            hp += 10
            mp -= 10
            println("Лечусь! Восстановлено здоровье, потрачено $mp маны.")
            println("Здоровье: $hp | Мана: $mp")
        } else {
            println("Недостаточны маны! У вас только $mp")
        }
    }
    fun greet(name: String) {
        println("Привет, $name!")
    }
    fun die() {
        println("Герой $name умер!")
    }
    fun attack(enemy: Enemy, damage: Int) {
        println("$name атакует врага ${enemy.name}!")
        enemy.takeDamage(damage)
    }
    fun castSpellOn(enemy: Enemy, spellName: String, damage: Int) {
        println("$name использует заклинание '$spellName' против ${enemy.name}!")

        if (st == enemy.st) {
            println("Стихии совпадают! Урон снижен.")
            val reducedDamage = damage / 2
            enemy.takeDamage(reducedDamage)
        } else {
            enemy.takeDamage(damage)
        }
        mp -= 10
        if (mp < 0) mp = 0
        println("Осталось маны: $mp")
    }
    fun duel(opponent: Hero) {
        println("Дуэль между $name и ${opponent.name} начинается!")

        println("$name атакует первым!")
        opponent.takeDamage(15)

        println("${opponent.name} отвечает!")
        this.takeDamage(15)

        println("Дуэль завершена.")
        println("Состояние героев")
        this.showStats()
        opponent.showStats()
    }
}*/