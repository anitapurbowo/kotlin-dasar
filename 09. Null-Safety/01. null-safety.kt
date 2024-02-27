fun funny(text: String?) {
	if (text != null)
		println(text.length)
	else
		println("Nothing to print :(")
}

fun funnier(text: String?) {
	val toPrint = text?.length ?: "Nothing to print :("
	println(toPrint)
}

fun main() {
    val kata1: String = "Kata-kata"
    val kata2: String? = "Variabel bisa berisi null"
    val kata3: String? = null
    
    funny(kata1)
    funny(kata2)
	funny(kata3) 
    
    funnier(kata1)
    funnier(kata2)
	funnier(kata3)    
}