class Cappuccino(var sugar: Double, var milk: Double, var cinnamon: Boolean){
    fun price(): Double{
       return CoffeMachine.calculate(sugar, milk, cinnamon)
    }



}