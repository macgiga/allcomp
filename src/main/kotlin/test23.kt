//Kotlin return Function from Function

enum class Level { STANDARD, VIP }

class ChargeManagement {

    companion object {
        fun getChargeCalculator(level: Level): (Order) -> Double {
            if (level == Level.VIP) {
                return { order -> 3 + 0.8 * order.quantity }
            }
            return { order -> 1.2 * order.quantity }
        }
    }
}

class Order(val quantity: Int) {
}

fun main(args: Array<String>) {

    val order = Order(10)

    val calculator1 = ChargeManagement.getChargeCalculator(Level.STANDARD)
    println("Charge for Standard Member: ${calculator1(order)}")

    val calculator2 = ChargeManagement.getChargeCalculator(Level.VIP)
    println("Charge for VIP Member: ${calculator2(order)}")
}