import java.lang.System.`in`
import java.util.*

abstract class CoffeMachine(private val scanner: Scanner){
    fun request(): Double {
        println("Enter coffe either Latte or cappuccino")
        return when (scanner.next()) {
            "latte" -> Latte(requestSugar(), requestMilk()).price()
            "cappuccino" -> Cappuccino(requestSugar(), requestMilk(), hasCinnamon()).price()
            else -> {
                println("unknown coffee type")
                return 0.0
            }
        }
    }

    private fun hasCinnamon(): Boolean {
        print("do you want cinnamon? ")
        return scanner.nextBoolean()
    }


    private fun requestSugar(): Double {
        print("how many sugar do you want? ")
        return scanner.nextDouble()
    }
    private fun requestMilk(): Double {
        print("how much milk do you want")
        return when(val sugar = scanner.nextDouble()) {
        }
    }

    companion object {
        private const val cupPrice: Double = 6.00
        private const val sugarPrice: Double = 1.00
        private const val milkPrice: Double = 1.25
        private const val cinnamon: Double = 1.50

        @JvmStatic
        fun calculate(sugar: Double, milk: Double, cinnamon: Boolean): Double {
            return if (cinnamon) {
                sugar * sugarPrice + milk * milkPrice + cinnamon + cupPrice
            } else {
                sugar * sugarPrice + milk * milkPrice + cupPrice
            }
        }
    }
}
