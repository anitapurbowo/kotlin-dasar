fun cetakPesan(pesan: String): Unit {                               
    println(pesan)
}

fun cetakPesanGabung(pesan: String, awalan: String = "Info") {  
    println("[$awalan] $pesan")
}

fun hitungJumlah(x: Int, y: Int): Int {                                          
    return x + y
}

fun hitungKali(x: Int, y: Int) = x * y                                    

fun main() {
    cetakPesan("Halo")   

    cetakPesanGabung("Hello", "Log")                              
    cetakPesanGabung("Hello")   
    cetakPesanGabung(prefix = "Log", message = "Hello")

    println(hitungJumlah(1, 2))                                               
    println(hitungKali(2, 4))                                          
}