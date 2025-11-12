package magic

class Spell(
    name: String = "",
    val w2: Int = 0,
    val h: Int = 0,
    symbol: String = ""
) : MagicEffect(name, symbol, duration = 10){

    constructor(name: String, size: Int, symbol: String) :
            this(name = name, w2 = size, h = size, symbol = symbol)

    fun cast() {
        println("Кастуем $name!")
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
       return "Заклинание $name занимает область ${w2}X${h} и использует символ - $symbol"
    }
}