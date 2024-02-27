fun main() {
    var x = 3
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }
    
    when {
        x < 0 -> println("x < 0")
        x > 0 -> println("x > 0")
        else -> {
            println("x == 0")
        }
    }
    
    val value = 11
 
    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }
    
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }
}