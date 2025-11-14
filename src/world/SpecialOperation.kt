package world

class SpecialOperation (
    title: String,
    reward: Int,
    val requiredClearance: Int,
    val isCovert: Boolean
) : Mission(title, reward) {

    override fun describe() {
        println("Спецоперация '$title'. Уровень допуска: $requiredClearance, режим: ${if (isCovert) "Секретно" else "Открыто"}, награда: $reward")
    }
}
