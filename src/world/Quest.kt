package world

class Quest(
    title: String,
    var duration: Int,
    reward: Int,
    var difficulty: String
) : Mission(title, reward){

    //fun printInfo() {
    //    println("Название квеста: ${this.title} Время выполнения: ${this.duration} Награда: ${this.reward} золотых Уровень сложности: ${this.difficulty}")
    //}

    override fun describe() {
        println("Квест '$title' на $duration часов, сложность: $difficulty, награда: $reward золотых")
    }

    fun goldPerHour(): Int{
        require(duration >= 0) {
            "Длительность не может быть отрицательной!"
        }
        return if (duration == 0) 0 else reward / duration
    }

    fun isHard(): Boolean {
        return difficulty.lowercase() == "сложный"
    }
}