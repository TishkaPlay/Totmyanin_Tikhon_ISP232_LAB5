package world

class Contract(
    title: String,
    val clientNane: String,
    val taskDescription: String,
    reward: Int,
    val isUrgent: Boolean = false
): Mission(title,reward){
    fun printContractInfo() {
        println("Заказчик: $clientNane")
        println("Задача: $taskDescription")
        println("Награда: $reward")
        println("Срочность: ${if (isUrgent) "Срочно!" else "Обчный контракт"}")
    }
}