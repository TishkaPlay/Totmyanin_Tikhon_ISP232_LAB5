import world.Quest
import world.QuestType

class dzTrader(
    val name: String,
    private val quests: MutableList<Quest> = mutableListOf()
) {

    fun addQuest(quest: Quest) {
        quests.add(quest)
        println("Квест '${quest.title}' добавлен в список $name.")
    }

    fun showAvailableQuests() {
        println("Доступные квесты:")
        if (quests.isEmpty()) {
            println("Ничего не найдено")
        } else {
            quests.forEachIndexed { index, quest ->
                println("  ${index + 1}. ${quest.title} (${quest.questType.description}) - Награда: ${quest.reward} золотых")
            }
        }
    }

    fun giveQuest(index: Int): Quest? {
        return if (index in 1..quests.size) {
            quests[index - 1]
        } else {
            null
        }
    }

    fun removeQuest(index: Int): Quest? {
        return if (index in 1..quests.size) {
            val removedQuest = quests.removeAt(index - 1)
            removedQuest
        } else {
            null
        }
    }

    fun start() {
        while (true) {
            println("\n=== МЕНЮ ТОРГОВЦА $name ===")
            println("1 - Добавить квест")
            println("2 - Показать все квесты")
            println("3 - Взять квест (удалить из списка)")
            println("0 - Выйти")
            print("Ваш выбор: ")

            when (readln()) {
                "1" -> questFromInput()
                "2" -> showAvailableQuests()
                "3" -> QuestRemove()
                "0" -> {
                    println("Выход из меню")
                    break
                }
                else -> println("Некорректный ввод. Попробуйте снова.")
            }
        }
    }

    private fun questFromInput() {
        print("Введите название квеста: ")
        val title = readln()
        print("Введите длительность (часы): ")
        val duration = readln().toIntOrNull() ?: 0
        print("Введите награду (золото): ")
        val reward = readln().toIntOrNull() ?: 0
        print("Введите сложность: ")
        val difficulty = readln()
        print("Введите тип квеста (DELIVERY, ELIMINATION, ESCORT, EXPLORE, BOSSFIGHT): ")
        val typeInput = readln().uppercase()

        val questType = when (typeInput) {
            "DELIVERY" -> QuestType.DELIVERY
            "ELIMINATION" -> QuestType.ELIMINATION
            "ESCORT" -> QuestType.ESCORT
            "EXPLORE" -> QuestType.EXPLORE
            "BOSSFIGHT" -> QuestType.BOSSFIGHT
            else -> QuestType.DELIVERY
        }

        val quest = Quest(title, duration, reward, difficulty, questType)
        addQuest(quest)
    }

    private fun QuestRemove() {
        if (quests.isEmpty()) {
            println("Здесь пусто :D")
            return
        }

        showAvailableQuests()
        print("Введите номер квеста: ")
        val n = readln().toIntOrNull()

        if (n == null || n !in 1..quests.size) {
            println("Некорректный номер.")
        } else {
            val que = removeQuest(n)
            que?.let { quest ->
                println("Вы взяли квест: '${quest.title}'")
                quest.describe()
            }
        }
    }
}

fun main() {
    val trader = dzTrader(name = "Фриланс")
    trader.start()
}