fun jumlah(a: Int, b: Int): Int {
	return a + b
}

fun kali(a: Int, b: Int) = a * b

fun cetakKali(a: Int, b: Int): Unit {
	println(kali(a, b))
}

fun cetakKali2(a: Int = 2, b: Int) {
	println(kali(a, b))
}

fun cetakKali3(a: Int, b: Int = 1) = println(kali(a, b))

fun main() {
    jumlah(0,3)
    kali(2,3)
    cetakKali(4,5)
    cetakKali2(b=3)
    cetakKali2(b=5,a=3)
    cetakKali3(5)
}