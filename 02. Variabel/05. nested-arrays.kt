fun main() {
    val twoDArray = Array(2) { Array<Int>(2) { 0 } }
	println(twoDArray.contentDeepToString())

    val threeDArray = Array(3) { Array(3) { Array<Int>(3) { 0 } } }
	println(threeDArray.contentDeepToString())
    
    println(twoDArray[0][1])
    
    val twoDArray2 = Array(2) { Array<Int>(2) { 0 } }
	twoDArray2[0][0] = 2
	println(twoDArray2[0][0].toString())
}