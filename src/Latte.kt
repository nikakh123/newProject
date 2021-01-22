class Latte(var sugar: Double, var milk: Double) {
    fun price(): Double{
        return CoffeMachine.calculate(sugar, milk, false)
    }
}