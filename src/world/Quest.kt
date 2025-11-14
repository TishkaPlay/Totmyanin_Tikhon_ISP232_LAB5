package world

class Quest(
    title: String,
    var duration: Int?,
    reward: Int,
    var difficulty: String,
    var questType: QuestType
) : Mission(title, reward){

    override fun describe() {
        println("Квест '$title' на $duration часов, сложность: $difficulty, награда: $reward золотых")
        println("Тип квеста: ${questType.description}")
    }

    fun printInfo() {
        println("Название квеста: $title")
        println("Тип квеста: ${questType.description}")
        println("Время выполнения: $duration ч.")
        println("Награда: $reward золотых")
        println("Уровень сложности: $difficulty")
    }

    fun goldPerHour(): Int{
        require(duration!! >= 0) {
            "Длительность не может быть отрицательной!"
        }
        return if (duration == 0) 0 else reward / duration!!
    }

    fun isHard(): Boolean {
        return difficulty.lowercase() == "сложный"
    }
}