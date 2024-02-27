fun main() {
    
    var number = 3
    
    val registerNumber = when(number){
        in 5..50 -> 50 * number
        in 51..100 -> 100 * number
        else -> number
    }
    
    print(registerNumber)
}