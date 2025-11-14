package world

class Contract(
    title: String,
    val clientNane: String,
    val taskDescription: String,
    reward: Int,
    val isUrgent: Boolean = false
): Mission(title,reward){

    override fun describe() {
        println("Контракт от $clientNane: $taskDescription (${if (isUrgent) "СРОЧНО" else "Обычный"}), награда: $reward")
    }
}