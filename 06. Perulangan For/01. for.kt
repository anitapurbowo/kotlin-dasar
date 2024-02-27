fun main() {
    val items = listOf("apel", "pisang", "semangka")

    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item ke- $index adalah ${items[index]}")
    }

    for ((index, item) in items.withIndex()) {
        println("item ke- $index adalah $item")
    }

}