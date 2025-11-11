package world

class Quest(
    var title: String,
    var duration: Int,
    var reward: Int,
    var difficulty: String
) {

    fun printInfo() {
        println("Название квеста: ${this.title} Время выполнения: ${this.duration} Награда: ${this.reward} золотых Уровень сложности: ${this.difficulty}")

    }

    fun isHard(): Boolean {
        return difficulty.lowercase() == "сложный"
    }

    fun goldPerHour(): Int{
        require(duration >= 0 && reward >= 0) {
            "Длительность и награда не могут быть отрицательными!"
        }
        if (duration == 0) return 0
        return reward / duration
    }
}

