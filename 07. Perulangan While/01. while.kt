fun main() {
    val items = listOf("apel", "pisang", "semangka")

    var index = 0
    while (index < items.size) {
        println("item ke $index adalah ${items[index]}")
        index++
    }
}