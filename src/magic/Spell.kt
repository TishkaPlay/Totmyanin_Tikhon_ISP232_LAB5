package magic

class Spell(
    val namee: String = "",
    val w2: Int = 0,
    val h: Int = 0,
    val symbol: String = ""
) {

    constructor(name: String, size: Int, symbol: String) :
            this(namee = name, w2 = size, h = size, symbol = symbol)

    fun cast() {
        println("Кастуем $namee!")
        repeat(h) {
            repeat(w2) {
                print(symbol)
            }
            println()
        }
    }

    fun area(): Int {
        return w2 * h
    }

    fun description(): String{
       return "Заклинание $namee занимает область ${w2}X${h} и использует символ - $symbol"
    }
}