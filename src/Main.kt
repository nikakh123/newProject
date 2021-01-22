import java.util.*

fun main(){
    val CoffeMachine = CoffeMachine(Scanner(System.`in`))


    val price = CoffeMachine.request()

    println(price)
}