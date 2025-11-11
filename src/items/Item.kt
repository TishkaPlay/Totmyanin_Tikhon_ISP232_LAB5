package items

class Item(
    val n1: String,
    val price: Int
) {

    fun displayInfo() {
        println("Товар: $n1, Цена: $price.")
    }
}