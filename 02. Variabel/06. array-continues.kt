fun main() {
    val simpleArray = arrayOf(1, 2, 3)
    val anotherArray = arrayOf(1, 2, 3)

    println(simpleArray.contentEquals(anotherArray))

    simpleArray[0] = 10
    println(simpleArray contentEquals anotherArray)

    println(simpleArray.sum())
    
    simpleArray.shuffle()
    println(simpleArray.joinToString())

    simpleArray.shuffle()
    println(simpleArray.joinToString())
}