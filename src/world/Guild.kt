package world

fun main() {
/*    val quest = Quest("Поиск артефакта", 3, 800, "Средний")
    val contract = Contract("Защита каравана", "Гильдия купцов", "Охрана груза", 1200)
    val specialOp = SpecialOperation("Операция - 'Тень'",2500, 2, isCovert = true)

    println("Информация о квесте:")
    println("Название: ${quest.title}, Награда: ${quest.reward}")

    println("\nИнформация о контракте:")
    println("Название: ${quest.title}, Награда: ${quest.reward}")

    println("\nИнформация о контракте:")
    println("Название: ${contract.title}, Заказчик: ${quest.reward}")

    println("\nИнформация о спецоперации:")
    println("Название: ${specialOp.title}")
    specialOp.showReward()

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

    val missions: List<Mission> = listOf<Mission>(
        Quest(title = "Охота на монстров", duration = 3, reward = 600, "Средний"),
        SpecialOperation(title = "Ночной рейд", reward = 1500, requiredClearance = 2, isCovert = true),
        Contract(title = "Сопровождение каравана", clientNane = "Гильдия Торговцев", taskDescription = "Доставить груз", reward = 800, isUrgent = true)
    )

    for (mission in missions) {
        mission.describe()
        println("Высокая награда? ${if (mission.isHighReward()) "Да" else "Нет"}")
        println()
    }

    val escortQuest = Quest(
        title = "Сопроводи торговца до деревни",
        4,
        120,
        "Средний",
        questType = QuestType.ESCORT
    )
    escortQuest.printInfo()
    escortQuest.describe()

    val deliveryQuest = Quest(
        title = "Доставить посылку для торговца",
        2,
        80,
        "Лёгкий",
        questType = QuestType.DELIVERY
    )

    deliveryQuest.printInfo()
    deliveryQuest.describe()

    val bossQuest = Quest(
        "Победить дракона и получить его яйцо",
        10,
        1500,
        "Очень сложно",
        questType = QuestType.BOSSFIGHT
    )

    bossQuest.printInfo()
    bossQuest.describe()

    val turismQuest = Quest(
        "Подняться на гору и исследовать её ради клада",
        5,
        500,
        "Сложно",
        questType = QuestType.EXPLORE
    )

    turismQuest.printInfo()
    turismQuest.describe()

    val quest = listOf(Quest(
        "Доставить письмо",
        1,
        50,
        "Легко",
        questType = QuestType.DELIVERY
    ),
        Quest("Исследовать остров",
            4,
            500,
            "Средне",
            questType = QuestType.EXPLORE))

    fun showonlyexplore(quest: List<Quest>) {
        val filt = quest.filter { it.questType == QuestType.EXPLORE }

        if (filt.isEmpty()) {
            println("Нет EXPLORE квестов.")
        } else {
            println("Найдено!")
            filt.forEach { quest -> quest.describe() }
        }
    }

    showonlyexplore(quest)
    */
}