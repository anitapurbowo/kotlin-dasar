fun main() {
    //Simple Array
	val simpleArray = arrayOf(1, 2, 3)
	println(simpleArray.joinToString())    
    
    //Array of Nulls dengan jumlah statis 
    val nullArray: Array<Int?> = arrayOfNulls(3)
	println(nullArray.joinToString())
    
    //Empty Arrays
    var exampleArray = emptyArray<String>()
    
    //nilai spesifik untuk array
    val initArray = Array<Int>(3) { 0 }
	println(initArray.joinToString())

    //membentuk nilai untuk array
	val asc = Array(5) { i -> (i * i).toString() }
	asc.forEach { print(it+" ") }

    val array1 = arrayOf(1, 2, 3)
    println(array1[0].toString()) 
	array1[0] = 10
	println(array1[0].toString()) 
}