/*fun main() {
    val quest = Quest()

    println("Введите название квеста: ")
    val title = readln()
    println("Введите время выполнениея (в часах): ")
    val duration = readln().toInt()
    println("Введите награду (в монетах): ")
    val reward = readln().toInt()
    println("Введите уровень сложности: ")
    val difficulty = readln()

    quest.init(title, duration, reward, difficulty)
    quest.printInfo()

    val quests = mutableListOf<Quest>()

    for (i in 1..3) {
        println("Добавим квест #$i")
        val q = Quest()
        print("Название: ")
        val title = readln()
        print("Время (ч): ")
        val duration = readln().toInt()
        print("Награда: ")
        val reward = readln().toInt()
        print("Сложность: ")
        val difficulty = readln()

        q.init(title, duration, reward, difficulty)
        quests.add(q)
        println()

        println("Все доступные квесты: ")
        for (q in quests) {
            q.printInfo()
        }
    }
}*/