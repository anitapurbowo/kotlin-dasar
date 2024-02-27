
fun main() {
    println("a \t b"+'\t'+"cd")
    var arr = arrayOf("2", "4", "6", "8")
    arr += "9"
    for (x in arr) print("$x ")
    
    val value = 5
 
    when(value){
        in 0..6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }
    
    val isiWarna : Warna = Warna.Hijau
    println(isiWarna.value)
    
    println("Posisi nya ${isiWarna.ordinal}")
    
    var ch1='a'
    println(ch1 + " " + ++ch1)
}

enum class Warna(val value: Int) {
    Merah(0xFF0000),
    Hijau(0x00FF00),
    Biru(0x0000FF)
}