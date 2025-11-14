package world

enum class QuestType(val description: String) {
    DELIVERY("Доставка предмета"),
    ELIMINATION("Устранение противника"),
    ESCORT("Сопровождение персонажа"),
    EXPLORE("Исследование чего-то нового"),
    BOSSFIGHT("Битва с боссом")
}