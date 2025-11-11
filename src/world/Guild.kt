package world

/*fun main() {
    val exit = Quest(title = "Побег из замка", 5, 700, "Сложный")
    println("Квест сложный? - ${exit.isHard()}")
    val quest = Quest(title = "Охота на гоблинов", 2, 3400, "легкий")
    quest.printInfo()
    val gold1 = Quest("Охота", 2, 300, "Средний")
    println(gold1.goldPerHour())
    val gold2 = Quest("Рыбалка", 0, 500, "Лёгкий")
    println(gold2.goldPerHour())

    println("Введите название квеста: ")
    val title = readln()
    println("Введите время выполнениея (в часах): ")
    val duration = readln().toInt()
    println("Введите награду (в монетах): ")
    val reward = readln().toInt()
    println("Введите уровень сложности: ")
    val difficulty = readln()

    val quests = mutableListOf<Quest>()

    for (i in 1..3) {
        println("Добавим квест #$i")
        val q = Quest(title = "Охота на гоблинов", 2, 3400, "легкий")
        print("Название: ")
        val title = readln()
        print("Время (ч): ")
        val duration = readln().toInt()
        print("Награда: ")
        val reward = readln().toInt()
        print("Сложность: ")
        val difficulty = readln()

        quests.add(q)
        println()

        println("Все доступные квесты: ")
        for (q in quests) {
            q.printInfo()
        }
    }
}*/